package com.project.zhang.pages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.zhang.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    private Button login_button;
    private EditText login_user;
    private EditText login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        //登录按钮的实现
        loginInit();

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginActivity.this, "login",
                        //Toast.LENGTH_SHORT).show();
                String username = login_user.getText().toString();
                String password = login_password.getText().toString();
                if(username.equals("1")&&password.equals("1")){
                    Intent intent_to_admin = new Intent(LoginActivity.this,AdminActivity.class);
                    startActivity(intent_to_admin);
                }
            }
        });
        //没有账号？登录按钮的实现
        Button register_button = findViewById(R.id.contentLogin).findViewById(R.id.login_register);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_register = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent_to_register);

            }
        });
        //忘记密码按钮的实现
        Button forget_button = findViewById(R.id.contentLogin).findViewById(R.id.login_forget_password);
        forget_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "getac",
                        Toast.LENGTH_SHORT).show();
                Intent intent_to_forget = new Intent(LoginActivity.this,ForgetActivity.class);
                startActivity(intent_to_forget);

            }
        });
        //toolbar返回键事件
        Toolbar back_tool = findViewById(R.id.login_toolbar);
        setSupportActionBar(back_tool);
        back_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginActivity.this.finish();
            }
        });
    }
    private void loginInit(){

        login_button = findViewById(R.id.contentLogin).findViewById(R.id.login);
        login_user = findViewById(R.id.contentLogin).findViewById(R.id.etUsername);
        login_password = findViewById(R.id.contentLogin).findViewById(R.id.etPassword);
    }
}
