package com.hardteam.rg.soundcheckstudio.ui.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.hardteam.rg.soundcheckstudio.R;
import com.hardteam.rg.soundcheckstudio.ui.fragments.ContactsFragment;
import com.hardteam.rg.soundcheckstudio.ui.fragments.EquipmantFragment;
import com.hardteam.rg.soundcheckstudio.ui.fragments.PhotoFragment;
import com.hardteam.rg.soundcheckstudio.ui.fragments.SoundcheckFragment;
import com.hardteam.rg.soundcheckstudio.ui.fragments.VideoFragment;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Fragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupToolbar();
        setupDrawer();
        if(savedInstanceState == null)// Fragment by default
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new SoundcheckFragment()).commit();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    private void setupToolbar()
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar !=null)
        {
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu_white_24dp);//Hamburger in Toolbar
            actionBar.setDisplayHomeAsUpEnabled(true);//Arrow in Toolbar
        }
    }

    private void setupDrawer()
    {
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.drawer_soundcheck:
                        fragment = new SoundcheckFragment();
                        break;
                    case R.id.drawer_equipment:
                        fragment = new EquipmantFragment();
                        break;
                    case R.id.drawer_photo:
                        fragment = new PhotoFragment();
                        break;
                    case R.id.drawer_video:
                        fragment = new VideoFragment();
                        break;
                    case R.id.drawer_contacts:
                        fragment = new ContactsFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.main_container,fragment).addToBackStack(null).commit();
                item.setChecked(true);//Mark the active item menu
                drawerLayout.closeDrawers();//Close the Drawer after click on the item menu
                return false;
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Fragment findingFragment = getSupportFragmentManager().findFragmentById(R.id.main_container);
        if(findingFragment != null && findingFragment instanceof SoundcheckFragment)
        {
            getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //open the Drawer by push the Burger Button in Toolbar
        int id = item.getItemId();
        if(id == android.R.id.home)// burger button in Toolbar
        {
            drawerLayout.openDrawer(GravityCompat.START);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
