package dev.siyah.casesimulator.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import javax.inject.Singleton;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.ItemModel;

@Dao
public interface ItemDao extends DaoInterface<ItemModel> {
    @Query("SELECT * FROM items WHERE itemId = :id")
    public ItemModel get(long id);

    @Query("SELECT * FROM items")
    public List<ItemModel> list();
}
