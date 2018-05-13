package com.project.zhang.pages;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhang.myapplication.R;

public class PassResetActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_reset_pass);
        //确认重置按钮
        Button button = findViewById(R.id.contentReset).findViewById(R.id.reset_ac);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PassResetActivity.this, "密码重置成功，请重新登录",
                        Toast.LENGTH_SHORT).show();
                //Intent intent_to_main = new Intent(PassResetActivity.this,MainActivity.class);
                //startActivity(intent_to_main);
            }
        });

        //toolbar返回键事件
        Toolbar back_tool = findViewById(R.id.reset_pass_toolbar);
        setSupportActionBar(back_tool);
        back_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PassResetActivity.this.finish();
            }
        });
    }
}
