package dev.siyah.casesimulator.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.SkinModel;

@Dao
public interface SkinDao extends DaoInterface<SkinModel> {
    @Query("SELECT * FROM skins WHERE skinId = :id")
    public SkinModel get(long id);

    @Query("SELECT * FROM skins")
    public List<SkinModel> list();
}
