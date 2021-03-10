package dev.siyah.casesimulator.DAOs;

import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.KeyModel;

@Dao
public interface KeyDao extends DaoInterface<KeyModel> {
    @Nullable
    @Query("SELECT * FROM keys WHERE keyId = :id")
    public KeyModel get(long id);

    @Query("SELECT * FROM keys")
    public List<KeyModel> list();
}
