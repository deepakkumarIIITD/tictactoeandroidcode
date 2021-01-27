package com.example.tictactoe

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_colorselector.*
const val KEY_1 = "sentcol1"
const val KEY_2 = "sentcol2"
class colorselector : AppCompatActivity(), View.OnClickListener {
    var p1selectedcol = ""
    var p1selected = false
    var p2selectedcol = ""
    var p2selected = false
    lateinit var pallet: Array<ImageButton>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colorselector)
        pallet = arrayOf(p1col1,p1col2,p1col3,p1col4,p1col4,p1col5,p1col6,p2col1,p2col2,p2col3,p2col3,p2col4,p2col5,p2col6)
        for(ImageButton in pallet){
            ImageButton.setOnClickListener(this)
        }
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.p1col1 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p1selected = true
                p1selectedcol = "#FF9800"
                p1col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p1col2 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p1selected = true
                p1selectedcol = "#00BCD4"
                p1col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p1col3 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p1selected = true
                p1selectedcol = "#8BC34A"
                p1col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p1col4 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p1selected = true
                p1selectedcol = "#FFEB3B"
                p1col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p1col5 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p1selected = true
                p1selectedcol = "#E91E63"
                p1col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p1col6 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p1selected = true
                p1selectedcol = "#9C27B0"
                p1col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }

            R.id.p2col1 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p2selected = true
                p2selectedcol = "#9C27B0"
                p2col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p2col2 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p2selected = true
                p2selectedcol = "#E91E63"
                p2col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p2col3 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p2selected = true
                p2selectedcol = "#FFEB3B"
                p2col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p2col4 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p2selected = true
                p2selectedcol = "#8BC34A"
                p2col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p2col5 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p2selected = true
                p2selectedcol = "#00BCD4"
                p2col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col6.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
            R.id.p2col6 -> {
                var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
                mediaPlayer.start()
                p2selected = true
                p2selectedcol = "#FF9800"
                p2col2.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col3.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col4.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col5.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p2col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
                p1col1.apply {
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                    isEnabled = false
                }
            }
        }
        bothselected()
    }

    private fun bothselected(){
        if(p1selected && p2selected){
            val i = Intent(this,MainActivity::class.java)
            i.putExtra(KEY_2,p2selectedcol)
            i.putExtra(KEY_1,p1selectedcol)
            startActivity(i)
        }
    }

    override fun onBackPressed() {
        Toast.makeText(applicationContext, "Disabled Back Press", Toast.LENGTH_SHORT).show()
    }
}