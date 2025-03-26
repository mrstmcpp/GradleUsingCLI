package org.mrstm;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient();
        String url = "https://fakestoreapi.com/products";

        Request req = new Request.Builder()
                .url(url)
                .build();

        try(Response response = client.newCall(req).execute()){
            if(!response.isSuccessful()){
                System.out.println("Something went wrong" + response.message());
            }

            System.out.println(response.body().string());
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}