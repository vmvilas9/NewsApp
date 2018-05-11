package com.example.android.newsapp;

public class News {
    private final String mSection;

    private final String mHeadline;

    private final String mUrl;

    private final String DATE = "1";

    private String mDate = DATE;

    private String mAuthor;

    public News(String section, String headline, String url, String date, String author) {
        mSection = section;
        mHeadline = headline;
        mDate = date;
        mUrl = url;
        mAuthor = author;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmHeadline() {
        return mHeadline;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public boolean hasDate() {
        return !mDate.equals(DATE);
    }

    public boolean hasAuthor() {
        return !mAuthor.equals("-1");
    }
}
