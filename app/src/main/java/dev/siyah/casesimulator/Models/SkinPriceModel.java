package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
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

    public SkinPriceModel() {
    }

    @Ignore
    public SkinPriceModel(@NonNull SkinModel skin, @NonNull ComponentEnum component, @NonNull ConditionEnum condition, @NonNull CurrencyEnum currency, long price) {
        this.skin = skin;
        this.component = component;
        this.condition = condition;
        this.currency = currency;
        this.price = price;
    }

    @Ignore
    public SkinPriceModel(long id, @NonNull SkinModel skin, @NonNull ComponentEnum component, @NonNull ConditionEnum condition, @NonNull CurrencyEnum currency, long price, boolean active) {
        this.id = id;
        this.skin = skin;
        this.component = component;
        this.condition = condition;
        this.currency = currency;
        this.price = price;
        this.active = active;
    }
}
