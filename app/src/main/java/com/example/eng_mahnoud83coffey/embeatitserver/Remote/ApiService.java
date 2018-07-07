package com.example.eng_mahnoud83coffey.embeatitserver.Remote;

import com.example.eng_mahnoud83coffey.embeatitserver.Model.MyResponse;
import com.example.eng_mahnoud83coffey.embeatitserver.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService
{

    @Headers(
            {
                    "Content-Type: application/json",
                    "Authorization: key=AAAA-HlKvkA:APA91bEsFXhUgBXkKfwHMUQaSx6SVBP6Cqil98MUxE2LgKjG9J27Q9rGnybQ7mee23GlSIy3EbEaleQK0Y52PtT9D92b_O6c5TkgeL05CE_9hJ24dXNTiMJYsfP-KgtnoSUobVtacTSy"
            })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender sender);


}
