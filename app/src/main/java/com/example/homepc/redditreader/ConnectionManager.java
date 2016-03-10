package com.example.homepc.redditreader;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by HomePC on 10/3/2016.
 */
public class ConnectionManager {

    private static RequestQueue queue;

    public static RequestQueue getInstance(Context context){

        if (queue == null) {
            queue = Volley.newRequestQueue(context);
        }

        return queue;
    }
}
