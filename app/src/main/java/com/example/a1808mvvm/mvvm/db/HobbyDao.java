package com.example.a1808mvvm.mvvm.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface HobbyDao {
    @Query("SELECT * FROM HobbyEntity")
    List<HobbyEntity> getAll();
    @Insert
    void insertAll(HobbyEntity... entities);

    @Delete
    void delete(HobbyEntity hobbyEntity);
}
