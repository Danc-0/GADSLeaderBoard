package com.danc.leaderboardfinal;

import com.danc.leaderboardfinal.Model.LearningHours;
import com.danc.leaderboardfinal.Model.SkillIQ;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HourAndSkillsApi {

    @GET("api/hours")
    Call<List<LearningHours>> getHours();

    @GET("api/skilliq")
    Call<List<SkillIQ>> getSkill();
}
