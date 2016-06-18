package com.rohit.popularmovies.list;

import com.rohit.popularmovies.Movie;

import java.util.List;


public interface DataSetUpdateListener {
    void onDataSetUpdated(List<Movie> movies);
}
