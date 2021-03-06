package com.example.tabswithanimatedswipe;

import com.google.gson.JsonObject;

public class DashData {

    private String title;
    private String number;
    private String author;
    private String clicks;
    private String contents;

    public DashData(String number, String title, String author, String clicks, String contents) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.clicks = clicks;
        this.contents = contents;
    }
    public String getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getClicks() {
        return clicks;
    }

    public String getContents() {
        return contents;
    }
}




