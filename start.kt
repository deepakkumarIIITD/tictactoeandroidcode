package com.example.tictactoe

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_start.*
import java.util.*
import kotlin.concurrent.schedule
class start : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        PLAYBTN.setOnClickListener(this)
        CREDITBTN.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.PLAYBTN -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                val i = Intent(this,colorselector::class.java)
                startActivity(i)
            }
            R.id.CREDITBTN -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                val i = Intent(this,credit::class.java)
                startActivity(i)
            }
        }
    }

    override fun onBackPressed() {
        Toast.makeText(applicationContext, "Disabled Back Press", Toast.LENGTH_SHORT).show()
    }
}