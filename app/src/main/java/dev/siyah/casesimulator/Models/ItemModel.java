package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
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

    public ItemModel() {
    }

    public ItemModel(@NonNull String name, @NonNull String image, @NonNull ItemTypeEnum itemType) {
        this.name = name;
        this.image = image;
        this.itemType = itemType;
    }

    public ItemModel(long id, @NonNull String name, @NonNull String image, @NonNull ItemTypeEnum itemType, boolean active) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.itemType = itemType;
        this.active = active;
    }
}
