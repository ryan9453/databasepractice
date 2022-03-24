package com.ryan.datapractice

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Score::class], version = 1)
abstract class ScoreDatabase : RoomDatabase() {
    abstract fun scoreDao() : ScoreDao
}