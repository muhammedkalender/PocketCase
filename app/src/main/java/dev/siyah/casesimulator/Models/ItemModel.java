package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Item.ItemTypeEnum;
import lombok.NonNull;

@Entity(tableName = "items")
public class ItemModel {
    @ColumnInfo(name = "itemId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "itemName")
    public String name;

    @NonNull
    @ColumnInfo(name = "itemImage")
    public String image;

    @NonNull
    @ColumnInfo(name = "itemType")
    public ItemTypeEnum itemType;

    @ColumnInfo(name = "itemActive")
    public boolean active = true;
}
