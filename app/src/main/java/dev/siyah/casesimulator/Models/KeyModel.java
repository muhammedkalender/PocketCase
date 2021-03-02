package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
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

    public KeyModel() {
    }

    public KeyModel(@NonNull String name, @NonNull String image, @NonNull CurrencyEnum currency, long price) {
        this.name = name;
        this.image = image;
        this.currency = currency;
        this.price = price;
    }

    public KeyModel(long id, @NonNull String name, @NonNull String image, @NonNull CurrencyEnum currency, long price, boolean active) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.currency = currency;
        this.price = price;
        this.active = active;
    }
}
