package org.mrstm.RetroFitTask;



import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class Main {
   public static void main(String[] args) throws IOException {

       Retrofit retrofit = new Retrofit.Builder()
               .baseUrl("https://api.github.com")
               .addConverterFactory(GsonConverterFactory.create())
               .build();

       FakeStoreService service = retrofit.create(FakeStoreService.class);
       Call<List<Repo>> call = service.listRepos("mrstmcpp");

       List<Repo> response = call.execute().body();

       for (Repo repo : response) {
           System.out.println("Repo: " + repo.name + " URL: " + repo.url);
       }



   }
}
