package com.example.mapactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SevenWonders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven_wonders)

        var wonderOne : Button = findViewById(R.id.tajmahal)
        var wonderTwo : Button = findViewById(R.id.colosseum)
        var wonderThree : Button = findViewById(R.id.pyramid)
        var wonderFour : Button = findViewById(R.id.machu)
        var wonderFive : Button = findViewById(R.id.redeemer)
        var wonderSix : Button = findViewById(R.id.petra)
        var wonderSeven : Button = findViewById(R.id.greatwall)

        wonderOne.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapActivity::class.java)
            val india : String = "tajmahal"
            intent.putExtra("keyone", india)
            startActivity(intent)
        }
        wonderTwo.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapActivity::class.java)
            val italy : String = "colosseum"
            intent.putExtra("keytwo", italy)
            startActivity(intent)
        }
        wonderThree.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapActivity::class.java)
            val egypt : String = "pyramid"
            intent.putExtra("keythree", egypt)
            startActivity(intent)
        }
        wonderFour.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapActivity::class.java)
            val peru : String = "machupicchu"
            intent.putExtra("keyfour", peru)
            startActivity(intent)
        }
        wonderFive.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapActivity::class.java)
            val brazil : String = "redeemer"
            intent.putExtra("keyfive", brazil)
            startActivity(intent)
        }
        wonderSix.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapActivity::class.java)
            val jordan : String = "petra"
            intent.putExtra("keysix", jordan)
            startActivity(intent)
        }
        wonderSeven.setOnClickListener {
            val intent : Intent = Intent(applicationContext,MapActivity::class.java)
            val china : String = "greatwall"
            intent.putExtra("keyseven", china)
            startActivity(intent)
        }
    }
}