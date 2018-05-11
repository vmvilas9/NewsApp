package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        News currentNews = getItem(position);
        TextView headLine = (TextView) listItemView.findViewById(R.id.headline);
        headLine.setText(currentNews.getmHeadline());
        TextView section = (TextView) listItemView.findViewById(R.id.section);
        section.setText(currentNews.getmSection());
        TextView date = (TextView) listItemView.findViewById(R.id.date);
        if (currentNews.hasDate()) {
            date.setText(currentNews.getmDate());
        } else {
            date.setVisibility(View.GONE);
        }
        TextView author = (TextView) listItemView.findViewById(R.id.author);
        if (currentNews.hasAuthor()) {
            author.setText(currentNews.getmAuthor());
        } else {
            author.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
