package com.example.chrishsu.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    int defaultVol = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playMusic(View view) {
        mp = MediaPlayer.create(this, R.raw.crazygame);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(MainActivity.this, "I'm done!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void stopMusic(View view) {
        mp.stop();
    }

    public void volUp(View view) {
        defaultVol++;
        mp.setVolume(defaultVol, defaultVol);
    }

    public void volDown(View view) {
        defaultVol--;
        mp.setVolume(defaultVol, defaultVol);
    }
}
