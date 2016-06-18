package com.rohit.popularmovies;

import android.test.AndroidTestCase;

import com.rohit.popularmovies.network.MovieDatabaseServerConnector;


public class ServerConnectionTest extends AndroidTestCase {

    //TODO: Create a test to test exception thrown when unauthorized (previously was tested by a removed stepping stone test

    public void testRetrievingMoviesDataFromServerReturnsResult() throws Exception {
        MovieDatabaseServerConnector connector = new MovieDatabaseServerConnector(getContext());
        assertNotSame("Data retrieved is not empty", 0, connector.getData().length());
    }

}
