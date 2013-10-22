package com.androidcamp.healthyrestaurants.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Location {
	JSONObject jsonObject;
	public static Location fromJson(JSONObject jsonObject) {
    	Location location = new Location();
        try {
            location.jsonObject = jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return location;
    }
}
