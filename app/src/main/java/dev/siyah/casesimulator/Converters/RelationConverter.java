package dev.siyah.casesimulator.Converters;

import androidx.annotation.Nullable;
import androidx.room.TypeConverter;

import com.google.gson.Gson;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Item.ComponentEnum;
import dev.siyah.casesimulator.Enums.Item.ConditionEnum;
import dev.siyah.casesimulator.Enums.Item.RarityEnum;
import dev.siyah.casesimulator.Helpers.EnumHelper;

public class RelationConverter {
    @Inject
    EnumHelper enumHelper;

    //region Case And Possible Rarities

    @TypeConverter
    public String casePossibleRaritiesToString(@Nullable RarityEnum[] rarityEnums) {
        if (rarityEnums == null) {
            rarityEnums = new RarityEnum[0];
        }

        return new Gson().toJson(rarityEnums);
    }

    @TypeConverter
    public RarityEnum[] casePossibleRaritiesFromString(@Nullable String rarityEnumString) {
        if (rarityEnumString == null || rarityEnumString.isEmpty()) {
            return new RarityEnum[]{};
        }

        return new Gson().fromJson(rarityEnumString, RarityEnum[].class);
    }

    //endregion

    //region Skin And Possible Components

    @TypeConverter
    public String skinPossibleComponentsToString(@Nullable ComponentEnum[] componentEnums) {
        if (componentEnums == null) {
            componentEnums = new ComponentEnum[0];
        }

        return new Gson().toJson(componentEnums);
    }

    @TypeConverter
    public ComponentEnum[] skinPossibleComponentsFromString(@Nullable String componentEnumString) {
        if (componentEnumString == null || componentEnumString.isEmpty()) {
            return new ComponentEnum[0];
        }

        return new Gson().fromJson(componentEnumString, ComponentEnum[].class);
    }

    //endregion

    //region Skin And Possible Conditions

    @TypeConverter
    public String skinPossibleConditionsToString(@Nullable ConditionEnum[] conditionEnums) {
        if (conditionEnums == null) {
            conditionEnums = new ConditionEnum[0];
        }

        return new Gson().toJson(enumHelper.enumsToString(conditionEnums));
    }

    @TypeConverter
    public ConditionEnum[] skinPossibleConditionsFromString(@Nullable String conditionEnumString) {
        if (conditionEnumString == null || conditionEnumString.isEmpty()) {
            return new ConditionEnum[0];
        }

        return enumHelper.enumsFromString(ConditionEnum.values(), conditionEnumString);
    }

    //endregion
}
