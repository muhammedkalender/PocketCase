package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

import lombok.NonNull;

@Entity(tableName = "inventoryItems")
public class InventoryItemModel {
    @ColumnInfo(name = "inventoryItemId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "inventoryItemSkinPrice")
    public SkinPriceModel skinPrice;

    @NonNull
    @ColumnInfo(name = "inventoryItemCreatedAt")
    public Date createdAt = new Date();

    @NonNull
    @ColumnInfo(name = "inventoryItemDeletedAt")
    public Date deletedAt = new Date();

    @ColumnInfo(name = "inventoryItemActive")
    public boolean active = true;
}
