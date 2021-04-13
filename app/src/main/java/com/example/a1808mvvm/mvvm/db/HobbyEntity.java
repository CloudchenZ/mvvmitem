package com.example.a1808mvvm.mvvm.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class HobbyEntity {
    @PrimaryKey
    public int id;
    @ColumnInfo(name = "love_hobby")
    public String Hobby;
}
