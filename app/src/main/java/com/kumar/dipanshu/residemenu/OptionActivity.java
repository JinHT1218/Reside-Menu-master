package com.kumar.dipanshu.residemenu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OptionActivity extends AppCompatActivity implements View.OnClickListener {

    Button horizontalReside;
    Intent intent;
    FloatingActionButton gitHubFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        horizontalReside = (Button) findViewById(R.id.horizontalResideButton);
        horizontalReside.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
                intent = new Intent(OptionActivity.this, MainActivity.class);
                intent.putExtra(Constant.OPTION, Constant.HORIZONTAL_RESIDE);
                startActivity(intent);
        }
    }

