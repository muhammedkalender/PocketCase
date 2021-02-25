package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Money.CurrencyEnum;
import lombok.NonNull;

@Entity(tableName = "keys")
public class KeyModel {
    @ColumnInfo(name = "keyId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "name")
    public String name;

    @NonNull
    @ColumnInfo(name = "keyImage")
    public String image;

    @NonNull
    @ColumnInfo(name = "keyCurrency")
    public CurrencyEnum currency;

    @ColumnInfo(name = "keyPrice")
    public long price = 0L;

    @ColumnInfo(name = "keyActive")
    public boolean active = true;
}
