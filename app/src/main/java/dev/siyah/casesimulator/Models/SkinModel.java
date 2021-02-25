package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Item.ComponentEnum;
import dev.siyah.casesimulator.Enums.Item.ConditionEnum;
import lombok.NonNull;

@Entity(tableName = "skins")
public class SkinModel {
    @ColumnInfo(name = "skinId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "skinName")
    public String name;

    @NonNull
    @ColumnInfo(name = "skinImage")
    public String image;

    @NonNull
    @ColumnInfo(name = "skinCase")
    public CaseModel container;

    @NonNull
    @ColumnInfo(name = "skinItem")
    public ItemModel item;

    @ColumnInfo(name = "skinActive")
    public boolean active = true;

    //region Possibilities

    @NonNull
    @ColumnInfo(name = "skinPossibleComponents")
    public ComponentEnum[] possibleComponents = new ComponentEnum[0];

    @NonNull
    @ColumnInfo(name = "skinPossibleConditions")
    public ConditionEnum[] possibleConditions = new ConditionEnum[0];

    //endregion
}
