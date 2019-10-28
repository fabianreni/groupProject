package com.example.planningpoker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button joinBtn;
    private Button scrumJoinBtn;
    private EditText userNameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Components();
        JoinToQuestions();
        JoinToScrumPanel();
    }

    private void Components()
    {
        userNameET = findViewById(R.id.et_userName);
        joinBtn = findViewById(R.id.b_join);
        scrumJoinBtn = findViewById(R.id.b_scrum);
    }


    private void JoinToQuestions()
    {
        joinBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, QuestionsActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

    private void JoinToScrumPanel()
    {
        scrumJoinBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ScrumPanelActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

}
