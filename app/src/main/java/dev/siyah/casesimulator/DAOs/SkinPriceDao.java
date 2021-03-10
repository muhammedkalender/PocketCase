package dev.siyah.casesimulator.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.SkinPriceModel;

@Dao
public interface SkinPriceDao extends DaoInterface<SkinPriceModel> {
    @Query("SELECT * FROM skinPrices WHERE skinPriceId = :id")
    public SkinPriceModel get(long id);

    @Query("SELECT * FROM skinPrices")
    public List<SkinPriceModel> list();
}
