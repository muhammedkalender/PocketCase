package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Static.StaticTypeEnum;

@Entity(tableName = "statics")
public class StaticModel {
    @ColumnInfo(name = "staticId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "staticTag")
    public String tag;

    @ColumnInfo(name = "staticValue")
    public long value;

    @ColumnInfo(name = "staticType")
    public StaticTypeEnum type;

    @ColumnInfo(name = "staticActive")
    public boolean active = false;
}
