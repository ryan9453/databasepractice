package com.ryan.datapractice

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Score (
    @NonNull
    @ColumnInfo(name = "Name")
    var name: String,
    @NonNull
    @ColumnInfo(name = "Math")
    var eng: Int = 0,
    @NonNull
    @ColumnInfo(name = "English")
    var math: Int = 0) {

    @PrimaryKey(autoGenerate = true)
    var id : Long = 0
    @NonNull
    @ColumnInfo(name = "Total")
    val allScore: Int = eng + math
    @NonNull
    @ColumnInfo(name = "Pass")
    val allPass: String = if (eng >= 60 && math >= 60) "all pass!" else "好課值得一修再修"





//    // List 的泛型若使用 Any 的話，各元素型別就可不同
//    fun getScoreResult(
//        @NonNull
//        name: String,
//        eng: Int,
//        math: Int): List<Any> {
//        val allScore: Int = eng + math
//        val allPass: String = if (eng >= 60 && math >= 60) "all pass!" else "好課值得一修再修"
//        return listOf<Any>(name, eng, math, allScore, allPass)
//    }
}