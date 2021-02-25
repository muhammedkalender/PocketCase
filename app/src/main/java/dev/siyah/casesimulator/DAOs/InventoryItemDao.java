package dev.siyah.casesimulator.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.InventoryItemModel;

@Dao
public interface InventoryItemDao extends DaoInterface<InventoryItemModel> {
    @Query("SELECT * FROM inventoryItems WHERE inventoryItemId = :id")
    public InventoryItemModel get(long id);

    @Query("SELECT * FROM inventoryItems")
    public List<InventoryItemModel> list();
}
