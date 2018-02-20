package com.example.noor.aiel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvLiterature;
    private TextView tvReadingSection;
    private TextView tvAWSkills;
    private TextView tvExamTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvLiterature = (TextView) findViewById(R.id.tvLiterature);
        this.tvReadingSection = (TextView) findViewById(R.id.tvReadingSection);
        this.tvAWSkills = (TextView) findViewById(R.id.tvAWSkills);
        this.tvExamTips = (TextView) findViewById(R.id.tvExamTips);

        tvLiterature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tvLiterature", Toast.LENGTH_SHORT).show();
            }
        });
        tvReadingSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tvReadingSection", Toast.LENGTH_SHORT).show();
            }
        });
        tvAWSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tvAWSkills", Toast.LENGTH_SHORT).show();
            }
        });
        tvExamTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "tvExamTips", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
