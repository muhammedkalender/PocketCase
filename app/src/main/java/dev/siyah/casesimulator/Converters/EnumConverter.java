package dev.siyah.casesimulator.Converters;

import androidx.room.TypeConverter;

import dev.siyah.casesimulator.Enums.Case.CaseSpecialEnum;
import dev.siyah.casesimulator.Enums.Case.CaseTypeEnum;
import dev.siyah.casesimulator.Enums.Item.ComponentEnum;
import dev.siyah.casesimulator.Enums.Item.ConditionEnum;
import dev.siyah.casesimulator.Enums.Item.ItemTypeEnum;
import dev.siyah.casesimulator.Enums.Money.CurrencyEnum;
import dev.siyah.casesimulator.Enums.ProfileRank.ProfileRankEnum;
import dev.siyah.casesimulator.Enums.SkillGroup.SkillGroupEnum;
import dev.siyah.casesimulator.Enums.Static.StaticTypeEnum;
import dev.siyah.casesimulator.Helpers.EnumHelper;
import lombok.NonNull;

public  class  EnumConverter {
    EnumHelper enumHelper;

    public EnumConverter() {
        String a = "asdas";
    }

    //region Condition Enum

    @TypeConverter
    public ConditionEnum conditionEnumFromId(int id) {
        return enumHelper.getById(ConditionEnum.values(), id);
    }

    @TypeConverter
    public int conditionEnumToId(ConditionEnum conditionEnum) {
        return conditionEnum.getId();
    }

    //endregion

    //region Case Type Enum

    @TypeConverter
    public CaseTypeEnum caseTypeEnumFromId(int id) {
        return enumHelper.getById(CaseTypeEnum.values(), id);
    }

    @TypeConverter
    public int caseTypeEnumToId(CaseTypeEnum caseTypeEnum) {
        return caseTypeEnum.getId();
    }

    //endregion

    //region Case Special Enum

    @TypeConverter
    public CaseSpecialEnum caseSpecialEnumFromId(int id) {
        return enumHelper.getById(CaseSpecialEnum.values(), id);
    }

    @TypeConverter
    public int caseSpecialEnumToId(CaseSpecialEnum caseSpecialEnum) {
        return caseSpecialEnum.getId();
    }

    //endregion

    //region Component Enum

    @TypeConverter
    public ComponentEnum componentEnumFromId(int id) {
        return enumHelper.getById(ComponentEnum.values(), id);
    }

    @TypeConverter
    public int caseSpecialEnumToId(@NonNull ComponentEnum componentEnum) {
        return componentEnum.getId();
    }

    //endregion

    //region Item Type Enum

    @TypeConverter
    public ItemTypeEnum itemTypeEnumFromId(int id) {
        return enumHelper.getById(ItemTypeEnum.values(), id);
    }

    @TypeConverter
    public int itemTypeEnumToId(@NonNull ItemTypeEnum itemTypeEnum) {
        return itemTypeEnum.getId();
    }

    //endregion

    //region Profile Rank Enum

    @TypeConverter
    public ProfileRankEnum profileRankEnumFromId(int id) {
        return enumHelper.getById(ProfileRankEnum.values(), id);
    }

    @TypeConverter
    public int profileRankEnumToId(ProfileRankEnum profileRankEnum) {
        return profileRankEnum.getId();
    }

    //endregion

    //region Currency Enum

    @TypeConverter
    public CurrencyEnum currencyEnumFromId(int id) {
        return enumHelper.getById(CurrencyEnum.values(), id);
    }

    @TypeConverter
    public int currencyEnumToId(CurrencyEnum currencyEnum) {
        return currencyEnum.getId();
    }
    //endregion


    //region Skill Group Enum

    @TypeConverter
    public int skillGroupEnumToId(SkillGroupEnum skillGroupEnum) {
        return skillGroupEnum.getId();
    }

    @TypeConverter
    public SkillGroupEnum skillGroupEnumFromId(int id) {
        return enumHelper.getById(SkillGroupEnum.values(), id);
    }

    //endregion

    //region Static Type Enum

    @TypeConverter
    public StaticTypeEnum staticTypeEnumFromId(int id) {
        return enumHelper.getById(StaticTypeEnum.values(), id);
    }

    @TypeConverter
    public int staticTypeEnumToId(StaticTypeEnum staticTypeEnum) {
        return staticTypeEnum.getId();
    }

    //endregion
}
