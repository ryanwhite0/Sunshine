package com.example.android.sunshine.app;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 752632 on 6/20/2015.
 */
public class WeatherDataParser {
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException {
        return new JSONObject(weatherJsonStr).getJSONArray("list").getJSONObject(dayIndex).getJSONObject("temp").getDouble("max");
    }
}
