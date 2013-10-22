package com.androidcamp.healthyrestaurants.models;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class Restaurant {
	JSONObject jsonObject;
    ArrayList displayAddress;
    Location location;
	public static Restaurant fromJson(JSONObject jsonObject) {
    	Restaurant restaurant = new Restaurant();
        try {
            restaurant.jsonObject = jsonObject;
            restaurant.location = Location.fromJson(jsonObject.getJSONObject("location.display_address"));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        return restaurant;
    }
    public static ArrayList<Restaurant> fromJson(JSONArray jsonArray) {
        ArrayList<Restaurant> tweets = new ArrayList<Restaurant>(jsonArray.length());

        for (int i=0; i < jsonArray.length(); i++) {
            JSONObject tweetJson = null;
            try {
                tweetJson = jsonArray.getJSONObject(i);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

            Restaurant tweet = Restaurant.fromJson(tweetJson);
            if (tweet != null) {
                tweets.add(tweet);
            }
        }

        return tweets;
    }
}
