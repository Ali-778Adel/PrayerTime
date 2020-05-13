package com.example.praytimes.Splash;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.praytimes.MainActivity;
import com.example.praytimes.R;


public class Splash_Screen extends AppCompatActivity {
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
            Thread thread =new  Thread(){
                @Override
                public void run() {
                    try {
                        sleep(18000);
                        Intent intent =new Intent (getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                    }catch (Exception e){
                    }}};
                  thread.start();
        mp = MediaPlayer.create(getBaseContext(), R.raw.splashaudio);
        mp.start();
    }
    protected void onStop() {
        super.onStop();
        if(mp.isPlaying()){
            mp.pause();

        }
    }
}
