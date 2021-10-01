package com.trivm.demotwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trivm.libraryone.Player

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val player = Player()
        player.name
    }
}