package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    public static String apiKey = BuildConfig.API_KEY;

    @GET("movie?token="+apiKey+"&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=40")
    Single<MovieResponse> loadMovies(@Query("page") int page);
}
