package com.project.zhang.pages;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhang.myapplication.R;

public class AdminActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.admin_nav_view);
        View headerLayout = navigationView.inflateHeaderView(R.layout.nav_header_main);
        Button button = headerLayout.findViewById(R.id.login);

        //按钮事件
        button.setText(R.string.welcome);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_login = new Intent(AdminActivity.this,LoginActivity.class);
                startActivity(intent_to_login);
                //Toast.makeText(MainActivity.this, "things happened", Toast.LENGTH_SHORT).show();
                //System.out.println("hello world");
            }
        });

        DrawerLayout drawer = findViewById(R.id.admin_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.admin_drawer_layout);
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        //菜单按钮的实现
        int id = item.getItemId();

        if (id == R.id.news_manager) {
            Toast.makeText(AdminActivity.this,"get_introduce",
                    Toast.LENGTH_SHORT).show();
            Intent intent_to_managernews = new Intent(AdminActivity.this,NewsManagerActivity.class);
            startActivity(intent_to_managernews);
            // Handle the camera action
        } else if (id == R.id.power_manager) {
            Toast.makeText(AdminActivity.this,"get_gallery",
                    Toast.LENGTH_SHORT).show();

        } else if (id == R.id.living_manager) {
            Toast.makeText(AdminActivity.this,"get_slideshow",
                    Toast.LENGTH_SHORT).show();

        } else if (id == R.id.organization_manager) {

        } else if (id == R.id.mailbox) {

        }else if (id == R.id.contact_admin) {

        }
        DrawerLayout drawer = findViewById(R.id.admin_drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
