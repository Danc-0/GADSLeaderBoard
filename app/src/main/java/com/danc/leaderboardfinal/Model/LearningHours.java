package com.danc.leaderboardfinal.Model;

import com.google.gson.annotations.SerializedName;

public class LearningHours {

    private String name;

    @SerializedName("hours")
    private String time;

    private String country;

    @SerializedName("badgeUrl")
    private String imageUrl;

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getCountry() {
        return country;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
