package com.example.homepc.redditreader.model;

import com.google.gson.annotations.SerializedName;
/**
 * Created by HomePC on 10/3/2016.
 */
public class Post {
    @SerializedName("permalink")
    private String permalink;

    @SerializedName("thumbnail")
    private String thumbnail;

    @SerializedName("title")
    private String title;
}
