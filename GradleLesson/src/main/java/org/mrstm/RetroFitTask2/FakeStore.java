package org.mrstm.RetroFitTask2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface FakeStore {
    @GET("users/{id}")
    Call<Users> getUserById(@Path("id") int id);
}
