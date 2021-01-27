package com.example.tictactoe

import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener{
    var PLAYER = true
    var TURN_COUNT = 0
    var p1col = "#C80754"
    var p2col = "#07C8C2"
    var boardStatus = arrayOf(arrayOf(-1, -1, -1), arrayOf(-1, -1, -1), arrayOf(-1, -1, -1))
    lateinit var board: Array<Array<ImageButton>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val color1 = intent.getStringExtra(KEY_1)
        val color2 = intent.getStringExtra(KEY_2)
        if (color1 != null) {
            p1col = color1
        }
        if (color2 != null) {
            p2col = color2
        }
        board = arrayOf(
                arrayOf(box1, box2, box3),
                arrayOf(box4, box5, box6),
                arrayOf(box7, box8, box9)
        )
        for(i in board){
            for(ImageButton in i){
                ImageButton.setOnClickListener(this)
            }
        }
        initializeboardStatus()
        p1reload.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
            mediaPlayer.start()
            PLAYER = true
            TURN_COUNT = 0
            initializeboardStatus()
            player1.text = "its your turn"
            player2.text = " "
        }
        p2reload.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this, R.raw.optionselect)
            mediaPlayer.start()
            PLAYER = true
            TURN_COUNT = 0
            initializeboardStatus()
            player1.text = "its your turn"
            player2.text = " "
        }
    }

    private fun initializeboardStatus(){
        for (i in 0..2){
            for(j in 0..2){
                board[i][j].apply {
                    isEnabled = true
                    setBackgroundColor(Color.parseColor("#BFBEBD"))
                }
            }
        }
        boardStatus = arrayOf(arrayOf(-1, -1, -1), arrayOf(-1, -1, -1), arrayOf(-1, -1, -1))
        for (row in boardStatus) {
            println(row?.contentToString())
        }
        player1.setBackgroundColor(Color.parseColor(p1col))
        p1reload.setBackgroundColor(Color.parseColor(p1col))
        player2.setBackgroundColor(Color.parseColor(p2col))
        p2reload.setBackgroundColor(Color.parseColor(p2col))
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.box1 -> {
                updateValue(row = 0, col = 0, PLAYER)
            }
            R.id.box2 -> {
                updateValue(row = 0, col = 1, PLAYER)
            }
            R.id.box3 -> {
                updateValue(row = 0, col = 2, PLAYER)
            }
            R.id.box4 -> {
                updateValue(row = 1, col = 0, PLAYER)
            }
            R.id.box5 -> {
                updateValue(row = 1, col = 1, PLAYER)
            }
            R.id.box6 -> {
                updateValue(row = 1, col = 2, PLAYER)
            }
            R.id.box7 -> {
                updateValue(row = 2, col = 0, PLAYER)
            }
            R.id.box8 -> {
                updateValue(row = 2, col = 1, PLAYER)
            }
            R.id.box9 -> {
                updateValue(row = 2, col = 2, PLAYER)
            }
        }
        TURN_COUNT++
        PLAYER = !PLAYER
        if(PLAYER){
            player1.text = "its your turn"
            player2.text = " "
        }else{
            player1.text = " "
            player2.text = "its your turn"
        }
        if(TURN_COUNT == 9){
            player1.text = "draw"
            player2.text = "draw"
        }
        checkwinner()
    }

    private fun checkwinner() {
//        HORIZONTAL ROW
        for(i in 0..2){
            if(boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2]){
                if(boardStatus[i][0] == 1){
                    println("1 line")
                    player1.text = "WINNER"
                    player2.text = "LOOSER"
                    board[i][0].setBackgroundColor(Color.parseColor("#FFD700"))
                    board[i][1].setBackgroundColor(Color.parseColor("#FFD700"))
                    board[i][2].setBackgroundColor(Color.parseColor("#FFD700"))
                    disablebutton()
                    break
                }else if(boardStatus[i][0] == 0){
                    println("0 line")
                    player2.text = "WINNER"
                    player1.text = "LOOSER"
                    board[i][0].setBackgroundColor(Color.parseColor("#FFD700"))
                    board[i][1].setBackgroundColor(Color.parseColor("#FFD700"))
                    board[i][2].setBackgroundColor(Color.parseColor("#FFD700"))
                    disablebutton()
                    break
                }
            }
        }
//        VERTICAL ROW
        for(i in 0..2){
            if(boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i]){
                if(boardStatus[0][i] == 1){
                    println("1 line")
                    player1.text = "WINNER"
                    player2.text = "LOOSER"
                    board[0][i].setBackgroundColor(Color.parseColor("#FFD700"))
                    board[1][i].setBackgroundColor(Color.parseColor("#FFD700"))
                    board[2][i].setBackgroundColor(Color.parseColor("#FFD700"))
                    disablebutton()
                    break
                }else if(boardStatus[0][i] == 0){
                    println("0 line")
                    player2.text = "WINNER"
                    player1.text = "LOOSER"
                    board[0][i].setBackgroundColor(Color.parseColor("#FFD700"))
                    board[1][i].setBackgroundColor(Color.parseColor("#FFD700"))
                    board[2][i].setBackgroundColor(Color.parseColor("#FFD700"))
                    disablebutton()
                    break
                }
            }
        }
//        DIAGONAL
        if(boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2]){
            if(boardStatus[0][0] == 1){
                println("1 line")
                player1.text = "WINNER"
                player2.text = "LOOSER"
                board[0][0].setBackgroundColor(Color.parseColor("#FFD700"))
                board[1][1].setBackgroundColor(Color.parseColor("#FFD700"))
                board[2][2].setBackgroundColor(Color.parseColor("#FFD700"))
                disablebutton()
            }else if(boardStatus[0][0] == 0){
                println("0 line")
                player2.text = "WINNER"
                player1.text = "LOOSER"
                board[0][0].setBackgroundColor(Color.parseColor("#FFD700"))
                board[1][1].setBackgroundColor(Color.parseColor("#FFD700"))
                board[2][2].setBackgroundColor(Color.parseColor("#FFD700"))
                disablebutton()
            }
        }
        if(boardStatus[0][2] == boardStatus[1][1] && boardStatus[0][2] == boardStatus[2][0]){
            if(boardStatus[0][2] == 1){
                println("1 line")
                player1.text = "WINNER"
                player2.text = "LOOSER"
                board[0][2].setBackgroundColor(Color.parseColor("#FFD700"))
                board[1][1].setBackgroundColor(Color.parseColor("#FFD700"))
                board[2][0].setBackgroundColor(Color.parseColor("#FFD700"))
                disablebutton()
            }else if(boardStatus[0][2] == 0){
                println("0 line")
                player2.text = "WINNER"
                player1.text = "LOOSER"
                board[0][2].setBackgroundColor(Color.parseColor("#FFD700"))
                board[1][1].setBackgroundColor(Color.parseColor("#FFD700"))
                board[2][0].setBackgroundColor(Color.parseColor("#FFD700"))
                disablebutton()
            }
        }
    }

    private fun disablebutton(){
        for (i in 0..2){
            for(j in 0..2){
                board[i][j].apply {
                    isEnabled = false
                }
            }
        }
        var mediaPlayer = MediaPlayer.create(this, R.raw.winner)
        mediaPlayer.start()
    }

    private fun updateValue(row: Int, col: Int, player: Boolean) {
        var mediaPlayer = MediaPlayer.create(this, R.raw.boxselect)
        mediaPlayer.start()
        val value = if (PLAYER) 1 else 0
        board[row][col].apply {
            isEnabled = false
            if(PLAYER){
                setBackgroundColor(Color.parseColor(p1col))
            }else{
                setBackgroundColor(Color.parseColor(p2col))
            }
        }
        boardStatus[row][col] = value
    }

    override fun onBackPressed() {
        Toast.makeText(applicationContext, "Disabled Back Press", Toast.LENGTH_SHORT).show()
    }
}