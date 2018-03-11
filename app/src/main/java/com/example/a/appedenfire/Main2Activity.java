package com.example.a.appedenfire;

import android.app.FragmentManager;
import android.os.Bundle;
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

import com.example.a.appedenfire.Fragments.EventosFragment;
import com.example.a.appedenfire.Fragments.HabitacionFragment;
import com.example.a.appedenfire.Fragments.InforFragment;
import com.example.a.appedenfire.Fragments.InicioFragment;
import com.example.a.appedenfire.Fragments.InstalacionesFragment;
import com.example.a.appedenfire.Fragments.LugarFragment;
import com.example.a.appedenfire.Fragments.OfertaFragment;
import com.example.a.appedenfire.Fragments.RestauranteFragment;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.main2, menu);
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
        FragmentManager fragmen = getFragmentManager();
        if (id == R.id.nav_info) {
            fragmen.beginTransaction()
                    .replace(R.id.content_fragment
                            ,new InforFragment())
                    .commit();
        } else if (id == R.id.nav_ini) {
            fragmen.beginTransaction()
                    .replace(R.id.content_fragment
                            ,new InicioFragment())
                    .commit();

        } else if (id == R.id.nav_eventos) {
            fragmen.beginTransaction()
                    .replace(R.id.content_fragment
                            ,new EventosFragment())
                    .commit();

        } else if (id == R.id.nav_restaurante) {
            fragmen.beginTransaction()
                    .replace(R.id.content_fragment
                            ,new RestauranteFragment())
                    .commit();


        } else if (id == R.id.nav_galeria) {
            fragmen.beginTransaction()
                    .replace(R.id.content_fragment
                            ,new InstalacionesFragment())
                    .commit();
        }else if (id == R.id.nav_lugar) {
            fragmen.beginTransaction()
                    .replace(R.id.content_fragment
                            ,new LugarFragment())
                    .commit();
        }
        else if (id == R.id.nav_habitacion) {
            fragmen.beginTransaction()
                    .replace(R.id.content_fragment
                            ,new HabitacionFragment())
                    .commit();
        }
        else if (id == R.id.nav_oferta) {
            fragmen.beginTransaction()
                    .replace(R.id.content_fragment
                            , new OfertaFragment())
                    .commit();
        }


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
