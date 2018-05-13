package com.project.zhang.pages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhang.myapplication.R;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);
        //注册按钮事件
        Button button = findViewById(R.id.contentRegister).findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "register",
                        Toast.LENGTH_SHORT).show();
                Intent intent_to_main = new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(intent_to_main);
            }
        });

        //toolbar返回键事件
        Toolbar back_tool = findViewById(R.id.register_toolbar);
        setSupportActionBar(back_tool);
        back_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterActivity.this.finish();
            }
        });
    }
}
