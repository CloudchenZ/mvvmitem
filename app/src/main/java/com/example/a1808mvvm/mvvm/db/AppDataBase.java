package com.example.a1808mvvm.mvvm.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {HobbyEntity.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract HobbyDao hobbyDao();
}
