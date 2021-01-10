package com.moringaschool.backup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_folder3 extends AppCompatActivity {

        private Button mCheckMeOut;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_folder2);

            mCheckMeOut = (Button) findViewById(R.id.button5);
            mCheckMeOut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(activity_folder3.this, "Hello World!", Toast.LENGTH_LONG).show();
                }
            });
        }
    }