package com.barisy.ezanplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.media.MediaPlayer
import android.provider.MediaStore

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun play_sabah(view: View) {
        mediaPlayer?.stop()
        mediaPlayer = MediaPlayer.create(this, R.raw.sabah_ezan)
        mediaPlayer?.start()

    }
    fun play_oglen(view: View) {
        mediaPlayer?.stop()
        mediaPlayer = MediaPlayer.create(this, R.raw.ezan_oglen)
        mediaPlayer?.start()
    }
    fun play_ikindi(view: View) {
        mediaPlayer?.stop()
        mediaPlayer = MediaPlayer.create(this, R.raw.ezan_ikindi)
        mediaPlayer?.start()
    }
    fun play_aksam(view: View) {
        mediaPlayer?.stop()
        mediaPlayer = MediaPlayer.create(this, R.raw.ezan_aksam)
        mediaPlayer?.start()
    }
    fun play_yatsi(view: View) {
        mediaPlayer?.stop()
        mediaPlayer = MediaPlayer.create(this, R.raw.ezan_yatsi)
        mediaPlayer?.start()
    }
    fun stop_playing(view: View) {
        mediaPlayer?.stop()
    }
}