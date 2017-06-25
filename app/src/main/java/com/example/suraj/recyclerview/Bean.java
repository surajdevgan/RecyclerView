package com.example.suraj.recyclerview;

/**
 * Created by suraj on 24-06-2017.
 */

public class Bean
{
    String title,body,image;

    public Bean(String title, String body,String image) {
        this.title = title;
        this.body = body;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getImage() {
        return image;
    }
}
