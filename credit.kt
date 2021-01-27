package com.example.tictactoe

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_credit.*

class credit : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)
        BACKBTN.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
        mediaPlayer.start()
        val i = Intent(this,start::class.java)
        startActivity(i)
    }

    override fun onBackPressed() {
        Toast.makeText(applicationContext, "Disabled Back Press", Toast.LENGTH_SHORT).show()
    }
}