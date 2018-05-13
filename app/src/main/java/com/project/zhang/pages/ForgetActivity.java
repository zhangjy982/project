package com.project.zhang.pages;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhang.myapplication.R;

public class ForgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //getSupportActionBar().hide();
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_forget);

        //获取短信验证码按钮
        Button get_ac_button = findViewById(R.id.contentForget).findViewById(R.id.register_msg_get);
        get_ac_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ForgetActivity.this, "getac",
                        Toast.LENGTH_SHORT).show();
            }
        });
        //下一步按钮事件
        Button next_step_button = findViewById(R.id.contentForget).findViewById(R.id.forget_next);
        next_step_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_to_next = new Intent(ForgetActivity.this,PassResetActivity.class);
                startActivity(intent_to_next);
            }
        });
        //toolbar返回键事件
        Toolbar back_tool = findViewById(R.id.forget_toolbar);
        setSupportActionBar(back_tool);
        back_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ForgetActivity.this.finish();
            }
        });

    }
}
