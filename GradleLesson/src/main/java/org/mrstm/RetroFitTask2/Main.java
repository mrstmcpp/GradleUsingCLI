package org.mrstm.RetroFitTask2;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FakeStore fakeStore = retrofit.create(FakeStore.class);

        Users data = fakeStore.getUserById(8).execute().body(); //change id here

        System.out.println(data.toString());


    }
}
