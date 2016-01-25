package com.jupiterhub.org.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onClickSpotifyStreamer(View view) {
        createToastFromButton(view, R.id.buttonSpotifyStreamer, "Spotify Streamer!");
    }

    public void onClickScoresApp(View view) {
        createToastFromButton(view, R.id.buttonScoresApp, "Scores App!");
    }

    public void onClickLibraryApp(View view) {
        createToastFromButton(view, R.id.libraryApp, "Library App!");
    }

    public void onClickBuildItBigger(View view) {
        createToastFromButton(view, R.id.buttonBuildItBigger, "Build it Bigger!");
    }

    public void onClickXyzReader(View view) {
        createToastFromButton(view, R.id.buttonXyzReader, "XYZ Reader!");
    }

    public void onClickCapstone(View view) {
        createToastFromButton(view, R.id.buttonCapstone, "my capstone project!");
    }

    private void createToastFromButton(View view, int buttonId, String textTitle) {
        Button button = (Button) view.findViewById(buttonId);
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch " + textTitle, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 100);
        toast.show();
    }
}
