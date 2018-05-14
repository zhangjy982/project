package com.project.zhang.pages;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhang.myapplication.R;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //底部三栏
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //点击登录按钮功能

        NavigationView navigationView = findViewById(R.id.nav_view);
        View headerLayout = navigationView.inflateHeaderView(R.layout.nav_header_main);
        Button button = headerLayout.findViewById(R.id.login);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_login = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent_to_login);
                //Toast.makeText(MainActivity.this, "things happened", Toast.LENGTH_SHORT).show();
                //System.out.println("hello world");
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_introduce) {
            Toast.makeText(MainActivity.this,"get_introduce",
                    Toast.LENGTH_SHORT).show();
            Intent intent_to_introduce = new Intent(MainActivity.this,IntroduceActivity.class);
            startActivity(intent_to_introduce);
        } else if (id == R.id.nav_gallery) {
            Toast.makeText(MainActivity.this,"get_gallery",
                    Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_slideshow) {
            Toast.makeText(MainActivity.this,"get_slideshow",
                    Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    Intent intentTest = new Intent(MainActivity.this,AdminActivity.class);
                    startActivity(intentTest);
                    return true;
                case R.id.navigation_notifications:
                    //mTextMessage.setText(R.string.title_notifications);
                    Toast.makeText(MainActivity.this,"notifications",
                            Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        }
    };

}
