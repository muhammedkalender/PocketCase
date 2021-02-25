package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Item.ComponentEnum;
import dev.siyah.casesimulator.Enums.Item.ConditionEnum;
import dev.siyah.casesimulator.Enums.Money.CurrencyEnum;
import lombok.NonNull;

@Entity(tableName = "skinPrices")
public class SkinPriceModel {
    @ColumnInfo(name = "skinPriceId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "skinId")
    public SkinModel skin;

    @NonNull
    @ColumnInfo(name = "skinPriceComponent")
    public ComponentEnum component;

    @NonNull
    @ColumnInfo(name = "skinPriceCondition")
    public ConditionEnum condition;

    @NonNull
    @ColumnInfo(name = "skinPriceCurrency")
    public CurrencyEnum currency;

    @ColumnInfo(name = "skinPrice")
    public long price = 0L;

    @ColumnInfo(name = "skinPriceActive")
    public boolean active = true;
}
