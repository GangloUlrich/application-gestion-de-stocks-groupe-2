package com.example.gstocks.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


import com.example.gstocks.Fragments.CategorieFragment;
import com.example.gstocks.Fragments.InventoryFragment;
import com.example.gstocks.Fragments.OperationFragment;
import com.example.gstocks.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    private  DrawerLayout drawerLayout;

    private MenuItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Toolbar toolbar = (Toolbar) findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.main_drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //vue de navigation
            this.initNavigation();

//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationVue);
//        bottomNavigationView.inflateMenu(R.menu.bottomnavigation_menu);
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.action_category:
//                    case R.id.action_inventory:
//                    case R.id.action_operation:
//                        break;
//
//                }
//                return true;
//            }
//        });
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                // Fragment selectedFragment = null;
//                switch (item.getItemId()){
//                    case R.id.action_category:
//                        //selectedFragment= new CategorieFragment();
//                        Toast.makeText(getApplicationContext(),"some text",Toast.LENGTH_LONG).show();
//                    case R.id.action_inventory:
//                        //selectedFragment=new InventoryFragment();
//                        Toast.makeText(getApplicationContext(),"some text",Toast.LENGTH_LONG).show();
//                    case R.id.action_operation:
//                        Toast.makeText(getApplicationContext(),"some text",Toast.LENGTH_LONG).show();
//                        //   selectedFragment = new OperationFragment();
//
//
//
//                }
//
//                //  getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container)commit();
//                return true;
//            }
//        });
////
         }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ic_account:
                Intent intent=new Intent(getApplicationContext(),ProfilActivity.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onBackPressed() {

        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    private void initNavigation(){
        NavigationView navigationView = (NavigationView) findViewById(R.id.vueNavigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_about:
                        Toast.makeText(HomeActivity.this,"Page a propos", Toast.LENGTH_LONG).show();
                    case R.id.ic_help:
                        Toast.makeText(getApplicationContext(),"Page d'aide",Toast.LENGTH_LONG).show();
                    case R.id.ic_story:
                        Toast.makeText(getApplicationContext(),"Page d'historique",Toast.LENGTH_LONG).show();

                    case R.id.ic_operation:
                        Toast.makeText(getApplicationContext(),"Page des operations de vente ",Toast.LENGTH_LONG).show();

                }

                return true;
            }
        });
    }





}