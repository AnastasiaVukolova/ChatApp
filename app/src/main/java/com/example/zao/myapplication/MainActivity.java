package com.example.zao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener( this);
    }
    @Override
                public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.button:
                    Intent intent=new Intent(this, Main2Activity.class);
                    startActivity(intent);
                    break;
                    default:
                        break;
            }
        }
    }
