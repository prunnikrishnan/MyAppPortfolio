package com.myudacity.app.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    //On Click handler for Buttons in the Main activity

    public void onClickForSpotifyStreamer(View view)
    {
        openToast("This button will open Spotify Streamer!!");
    }

    public void onClickForLibraryApp(View view)
    {
        openToast("This button will open Library App!!");
    }
    public void onClickForScoresApp(View view)
    {
        openToast("This button will open Scores App!!");
    }
    public void onClickForBuildItBigger(View view)
    {
        openToast("This button will open Build It Bigger App!!");
    }
    public void onClickForXYZReader(View view)
    {
        openToast("This button will open XYZ Reader App!!");
    }
    public void onClickForCapstone(View view)
    {
        openToast("This button will open My Own App!!");
    }

    //Shows the Toast
    public  void openToast(CharSequence textToShow){
        Toast.makeText(getApplicationContext(),textToShow , Toast.LENGTH_SHORT).show();
    }
}
