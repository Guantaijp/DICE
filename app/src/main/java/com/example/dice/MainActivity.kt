package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {


        val randomint = Random().nextInt(6)+1
        val drawableResource=when (randomint){
            1 -> R.drawable.lea_a1
            2 -> R.drawable.lea_a2
            3 -> R.drawable.lea_a3
            4 -> R.drawable.lea_a4
            5 -> R.drawable.lea_a5
            else -> R.drawable.lea_a6
        }
         val diceImage:ImageView=findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)

    }
}