package com.example.homepc.redditreader;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.homepc.redditreader.model.Post;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private final static String REDDIT_URL = "https://www.reddit.com/r/funny.json?limit=10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue queue = ConnectionManager.getInstance(this);

        StringRequest request = new StringRequest(Request.Method.GET, REDDIT_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Post myPost = new Gson().fromJson(response, Post.class);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(request);

    }

}
