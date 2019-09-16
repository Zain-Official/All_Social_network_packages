package com.example.mohammadumar.clasprojecttasktabbed;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    fragment_a a = new fragment_a();
    fragment_b b = new fragment_b();
    fragment_c c = new fragment_c();
    Detailsms s = new Detailsms();
    Detailofcalls d = new Detailofcalls();
    detailofinternet i= new detailofinternet();
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    Toolbar toolbar;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);



        setSupportActionBar(toolbar);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        Bundle extra = getIntent().getExtras();
        int color = extra.getInt("key");


        switch(color){

            case 0:
                setTitle("Telenor");
               /* tabLayout.setBackgroundColor(getResources().getColor(R.color.red));*/

                toolbar.setBackgroundColor(getResources().getColor(R.color.lightsky));
                tabLayout.setBackgroundColor(getResources().getColor(R.color.lightsky));


                break;

            case 1:
                setTitle("Ufone");
               /* tabLayout.setBackgroundColor(getResources().getColor(R.color.sky));*/

                toolbar.setBackgroundColor(getResources().getColor(R.color.lightorange));
                tabLayout.setBackgroundColor(getResources().getColor(R.color.lightorange));

                break;

            case 2:
                setTitle("Jazz");
               /* tabLayout.setBackgroundColor(getResources().getColor(R.color.green));*/
             /*    toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.backone));*/
                toolbar.setBackgroundColor(getResources().getColor(R.color.lightred));
                tabLayout.setBackgroundColor(getResources().getColor(R.color.lightred));


                break;

            case 3:
                setTitle("Zong");
             /*   tabLayout.setBackgroundColor(getResources().getColor(R.color.sky));*/

                /*toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.sim));*/
                toolbar.setBackgroundColor(getResources().getColor(R.color.lightgreen));
                tabLayout.setBackgroundColor(getResources().getColor(R.color.lightgreen));




                break;


        }



    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            Fragment fragment= null;

            Bundle ext = getIntent().getExtras();
            int back = ext.getInt("key");


            switch (position){

                case 0:
                    fragment_a a = new fragment_a();


                    fragment = a;


                    break;
                case 1:
                    fragment_b b = new fragment_b();

                    fragment = b;

                    break;

                case 2:
                    fragment_c c = new fragment_c();
                    fragment = c;


            }
            return fragment;
        }
        @Override
        public int getCount() {
            return 3;
        }

        }
    }

