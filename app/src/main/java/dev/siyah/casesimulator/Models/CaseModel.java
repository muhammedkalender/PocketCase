package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Case.CaseSpecialEnum;
import dev.siyah.casesimulator.Enums.Case.CaseTypeEnum;
import dev.siyah.casesimulator.Enums.Item.ComponentEnum;
import dev.siyah.casesimulator.Enums.Item.RarityEnum;
import dev.siyah.casesimulator.Enums.Money.CurrencyEnum;
import lombok.NonNull;

//TODO
@Entity(tableName = "cases")
public class CaseModel{
    @ColumnInfo(name = "caseId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "caseName")
    public String name;

    @NonNull
    @ColumnInfo(name = "caseImage")
    public String image;

    @NonNull
    @ColumnInfo(name = "caseCurrency")
    public CurrencyEnum currency;

    @ColumnInfo(name = "casePrice")
    public long price = 0L;

    @ColumnInfo(name = "caseKey")
    public KeyModel key;

    @NonNull
    @ColumnInfo(name = "caseType")
    public CaseTypeEnum caseType = CaseTypeEnum.WEAPON_CASE;

    @NonNull
    @ColumnInfo(name = "caseSpecial")
    public CaseSpecialEnum caseSpecial = CaseSpecialEnum.KNIFE;

    @NonNull
    @ColumnInfo(name = "casePossibleRarities")
    public RarityEnum[] possibleRarities = new RarityEnum[0];

    @NonNull
    @ColumnInfo(name = "casePossibleComponent")
    public ComponentEnum possibleComponent = ComponentEnum.NORMAL;

    @ColumnInfo(name = "caseActive")
    public boolean active = true;
}
