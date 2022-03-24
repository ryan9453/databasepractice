package com.ryan.datapractice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ScoreDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(score: Score)

    @Query(value = "select * from score")
    fun getAll() : List<Score>
}