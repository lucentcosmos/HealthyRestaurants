package com.androidcamp.healthyrestaurants;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SearchRestaurantsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_restaurants);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_restaurants, menu);
        return true;
    }
    
}
