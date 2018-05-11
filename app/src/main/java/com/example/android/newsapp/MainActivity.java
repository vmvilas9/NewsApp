package com.example.android.newsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView businessView = (CardView) findViewById(R.id.business_view);
        businessView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent businessIntent = new Intent(MainActivity.this, NewsActivity.class);
                businessIntent.putExtra(getString(R.string.topic), getString(R.string.business));
                startActivity(businessIntent);
            }
        });
        CardView sportsView = (CardView) findViewById(R.id.sports_view);
        sportsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sportsIntent = new Intent(MainActivity.this, NewsActivity.class);
                sportsIntent.putExtra(getString(R.string.topic), getString(R.string.sports));
                startActivity(sportsIntent);
            }
        });
        CardView environmentView = (CardView) findViewById(R.id.environment_view);
        environmentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent environmentIntent = new Intent(MainActivity.this, NewsActivity.class);
                environmentIntent.putExtra(getString(R.string.topic), getString(R.string.environment));
                startActivity(environmentIntent);
            }
        });
        CardView politicsView = (CardView) findViewById(R.id.politics_view);
        politicsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent politicsIntent = new Intent(MainActivity.this, NewsActivity.class);
                politicsIntent.putExtra(getString(R.string.topic), getString(R.string.politics));
                startActivity(politicsIntent);
            }
        });
    }
}
