package edu.weber.rhilton.cs3270.lifecycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("test","MainActivty onCreate()");
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1,new FragmentA(),"FA")
                .addToBackStack(null)
                .commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test","MainActivty onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test","MainActivty onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test","MainActivty onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test","MainActivty onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test","MainActivty onDestroy()");
    }
}
