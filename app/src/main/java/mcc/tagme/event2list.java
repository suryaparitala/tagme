package mcc.tagme;

/**
 * Created by suryanarayana on 5/4/17.
 */

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class event2list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event2list);
        Intent myIntent = getIntent();
        int position = myIntent.getIntExtra("key", 0);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            NewsFragment newsFragment = (NewsFragment) getSupportFragmentManager().findFragmentById(R.id.news_fragment2);
            newsFragment.updateArticleView(position);
        }
    }
}