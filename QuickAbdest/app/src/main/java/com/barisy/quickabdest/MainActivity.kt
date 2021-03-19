package com.barisy.quickabdest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import android.media.MediaPlayer as MediaPlayer1

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: android.media.MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayer=android.media.MediaPlayer.create(this, R.raw.holy)
        mediaPlayer?.setOnPreparedListener{
            println("ready boi")
        }
    }

    fun btn_click(view: View) {
        foto1.visibility = View.VISIBLE
        textView2.visibility=View.VISIBLE
        mediaPlayer?.start()
    }
}