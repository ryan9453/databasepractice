package com.ryan.datapractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.ryan.datapractice.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = MainActivity::class.java
    }
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = Room.databaseBuilder(this, ScoreDatabase::class.java, "score.db").build()
        val jackScore = Score("Jack",59, 70)
//        CoroutineScope(Dispatchers.IO)
//        .launcher
        CoroutineScope(Dispatchers.IO)
            .launch {
                database.scoreDao().insert(jackScore)
            }
    }



}