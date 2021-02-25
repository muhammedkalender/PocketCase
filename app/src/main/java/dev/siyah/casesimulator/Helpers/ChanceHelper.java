package dev.siyah.casesimulator.Helpers;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.Collections;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Item.ComponentEnum;
import dev.siyah.casesimulator.Enums.Item.ConditionEnum;
import dev.siyah.casesimulator.Enums.Item.RarityEnum;
import dev.siyah.casesimulator.Models.CaseModel;
import dev.siyah.casesimulator.Models.SkinModel;

public class ChanceHelper {
    @Inject
    CaseHelper caseHelper;

    @Inject
    SkinHelper skinHelper;

    @Inject
    ChanceHelper() {
    }

    //region Rarity

    @NonNull
    public RarityEnum getRarity(int randomResult, @NonNull CaseModel caseModel) {
        RarityEnum[] rarityEnums = RarityEnum.values();

        for (RarityEnum rarityEnum : rarityEnums) {
            if (randomResult < rarityEnum.getChange() && caseHelper.isRarityPossible(rarityEnum, caseModel)) {
                return rarityEnum;
            }
        }

        Collections.reverse(Arrays.asList(rarityEnums));

        for (RarityEnum rarityEnum : rarityEnums) {
            if (caseHelper.isRarityPossible(rarityEnum, caseModel)) {
                return rarityEnum;
            }
        }

        //TODO Is possible ?
        return RarityEnum.COMMON;
    }

    //endregion

    //region Condition

    @NonNull
    public ConditionEnum getCondition(int randomResult, @NonNull SkinModel skinModel) {
        ConditionEnum[] conditionEnums = ConditionEnum.values();

        for (ConditionEnum conditionEnum : conditionEnums) {
            if (randomResult < conditionEnum.getChange() && skinHelper.isConditionPossible(conditionEnum, skinModel)) {
                return conditionEnum;
            }
        }

        Collections.reverse(Arrays.asList(conditionEnums));

        for (ConditionEnum conditionEnum : conditionEnums) {
            if (skinHelper.isConditionPossible(conditionEnum, skinModel)) {
                return conditionEnum;
            }
        }

        //TODO Is possible ?
        return ConditionEnum.FACTORY_NEW;
    }

    //endregion

    //region Component

    @NonNull
    public ComponentEnum getComponent(int randomResult, @NonNull SkinModel skinModel) {
        ComponentEnum[] componentEnums = ComponentEnum.values();

        for (ComponentEnum componentEnum : componentEnums) {
            if (randomResult < componentEnum.getChance() && skinHelper.isComponentPossible(componentEnum, skinModel)) {
                return componentEnum;
            }
        }

        Collections.reverse(Arrays.asList(componentEnums));

        for (ComponentEnum componentEnum : componentEnums) {
            if (skinHelper.isComponentPossible(componentEnum, skinModel)) {
                return componentEnum;
            }
        }

        //TODO Is possible ?
        return ComponentEnum.NORMAL;
    }

    //endregion
}
