package com.androidatc.materialtodolist;

import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ToDoDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_details);
        String text = getIntent().getStringExtra("name");
        TextView title = (TextView) findViewById(R.id.detailsTitleText);
        title.setText(text);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finishAfterTransition();
    }
}
