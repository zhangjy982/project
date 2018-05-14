package com.project.zhang.pages;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.zhang.myapplication.R;
import com.mob.MobSDK;
import com.project.zhang.db.UserInformationDaoOpe;
import com.project.zhang.entity.UserInformation;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;


public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText trueName;
    private RadioGroup sex;
    private RadioButton man;
    private RadioButton women;
    private EditText phoneNumber;
    private EditText verifyNumber;
    private Button verifyGet;
    private Spinner location;
    private EditText idNumber;
    private EditText password;
    private Button registerButton;
    private String strPhoneNumber;

    private List<UserInformation> userList = new ArrayList<>();

    EventHandler eventHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MobSDK.init(RegisterActivity.this);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);
        //注册按钮事件
        MobSDK.init(this);
        init();
        registerButton.setOnClickListener(this);
        verifyGet.setOnClickListener(this);
        eventHandler = new EventHandler(){
            @Override
            public void afterEvent(int i, int i1, Object o) {
                Message message = myHandler.obtainMessage(0x00);
                message.arg1 = i;
                message.arg2 = i1;
                message.obj = o;
                myHandler.sendMessage(message);
            }
        };
        SMSSDK.registerEventHandler(eventHandler);

        //toolbar返回键事件
        Toolbar back_tool = findViewById(R.id.register_toolbar);
        setSupportActionBar(back_tool);
        back_tool.setNavigationOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterActivity.this.finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SMSSDK.unregisterEventHandler(eventHandler);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.register){
            long id = UserInformationDaoOpe.dataNum(RegisterActivity.this) + 1;
            getData(id,id);
            UserInformationDaoOpe.insertData(RegisterActivity.this,userList);
            userList.clear();
        }else if (v.getId() == R.id.register_msg_get){
            strPhoneNumber = phoneNumber.getText().toString();
            if (null == strPhoneNumber || "".equals(strPhoneNumber) || strPhoneNumber.length() != 11) {
                Toast.makeText(this, "电话号码输入有误", Toast.LENGTH_SHORT).show();
                return;
            }
            SMSSDK.getVerificationCode("86", strPhoneNumber);
            verifyGet.setClickable(false);
            //开启线程去更新button的text
            new Thread() {
                @Override
                public void run() {
                    int totalTime = 60;
                    for (int i = 0; i < totalTime; i++) {
                        Message message = myHandler.obtainMessage(0x01);
                        message.arg1 = totalTime - i;
                        myHandler.sendMessage(message);
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    myHandler.sendEmptyMessage(0x02);
                }
            }.start();
        }
    }


    private void init(){

        trueName = findViewById(R.id.contentRegister).findViewById(R.id.register_username);
        sex = findViewById(R.id.contentRegister).findViewById(R.id.register_sex);
        phoneNumber = findViewById(R.id.contentRegister).findViewById(R.id.register_phoneNum);
        verifyNumber = findViewById(R.id.contentRegister).findViewById(R.id.register_msg_ac);
        location = findViewById(R.id.contentRegister).findViewById(R.id.register_location);
        idNumber = findViewById(R.id.contentRegister).findViewById(R.id.register_id_num);
        password = findViewById(R.id.contentRegister).findViewById(R.id.register_password);
        registerButton = findViewById(R.id.contentRegister).findViewById(R.id.register);
        verifyGet = findViewById(R.id.contentRegister).findViewById(R.id.register_msg_get);
    }

    private void getData(long id,long iid){

        String ii = Long.toString(iid);
        String name = trueName.getText().toString();
        int sexId = sex.getCheckedRadioButtonId();
        man = findViewById(sexId);
        String sex_into = man.getText().toString();
        String phone = phoneNumber.getText().toString();
        String verify = verifyNumber.getText().toString();
        String loc = "中关村";
        String id_num = idNumber.getText().toString();
        String pass = password.getText().toString();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(day);
        UserInformation user = new UserInformation(id,ii,name,sex_into,
                phone,id_num,loc,"1",pass,time);
        userList.add(user);
    }

    Handler myHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0x00:
                    int event = msg.arg1;
                    int result = msg.arg2;
                    Object data = msg.obj;
                    if (result == SMSSDK.RESULT_COMPLETE) { //回调  当返回的结果是complete
                        if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) { //获取验证码
                            Toast.makeText(RegisterActivity.this, "发送验证码成功", Toast.LENGTH_SHORT).show();

                        } else if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) { //提交验证码

                            Toast.makeText(RegisterActivity.this, "提交验证码成功", Toast.LENGTH_SHORT).show();

                        } else {

                        }
                    } else { //进行操作出错，通过下面的信息区分析错误原因
                        try {
                            Throwable throwable = (Throwable) data;
                            throwable.printStackTrace();
                            JSONObject object = new JSONObject(throwable.getMessage());
                            String des = object.optString("detail");//错误描述
                            int status = object.optInt("status");//错误代码
                            //错误代码：  http://wiki.mob.com/android-api-%E9%94%99%E8%AF%AF%E7%A0%81%E5%8F%82%E8%80%83/

                            if (status > 0 && !TextUtils.isEmpty(des)) {
                                Toast.makeText(RegisterActivity.this, des, Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 0x01:
                    verifyGet.setText("重新发送(" + msg.arg1 + ")");
                    break;
                case 0x02:
                    verifyGet.setText("获取验证码");
                    verifyGet.setClickable(true);
                    break;
            }
        }
    };

    //// 请求验证码，其中country表示国家代码，如“86”；phone表示手机号码，如“13800138000”
    public void sendCode(String country, String phone) {
        SMSSDK.registerEventHandler(new EventHandler() {
            public void afterEvent(int event, int result, Object data) {
                if (result == SMSSDK.RESULT_COMPLETE) {
                    // TODO 处理成功得到验证码的结果
                    Toast.makeText(RegisterActivity.this,"验证码已发送",Toast.LENGTH_LONG).show();
                } else{
                    // TODO 处理错误的结果
                    Toast.makeText(RegisterActivity.this,"验证码未发送",Toast.LENGTH_LONG).show();
                }

            }
        });
        // 触发操作
        SMSSDK.getVerificationCode(country, phone);
    }

    // 提交验证码，其中的code表示验证码，如“1357”
    public void submitCode(String country, String phone, String code) {
        // 注册一个事件回调，用于处理提交验证码操作的结果
        SMSSDK.registerEventHandler(new EventHandler() {
            public void afterEvent(int event, int result, Object data) {
                if (result == SMSSDK.RESULT_COMPLETE) {
                    // TODO 处理验证成功的结果
                } else{
                    // TODO 处理错误的结果
                }

            }
        });
        // 触发操作
        SMSSDK.submitVerificationCode(country, phone, code);
    }

}
