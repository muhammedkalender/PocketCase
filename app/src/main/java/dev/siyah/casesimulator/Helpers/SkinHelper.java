package dev.siyah.casesimulator.Helpers;

import androidx.annotation.NonNull;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Item.ComponentEnum;
import dev.siyah.casesimulator.Enums.Item.ConditionEnum;
import dev.siyah.casesimulator.Models.SkinModel;

public class SkinHelper {
    @Inject
    public SkinHelper(){}

    public boolean isComponentPossible(@NonNull ComponentEnum componentEnum, @NonNull SkinModel skinModel) {
        for (ComponentEnum component : skinModel.possibleComponents) {
            if (component.getId() == componentEnum.getId()) {
                return true;
            }
        }

        return false;
    }

    public boolean isConditionPossible(@NonNull ConditionEnum conditionsEnum, @NonNull SkinModel skinModel) {
        for (ConditionEnum condition : skinModel.possibleConditions) {
            if (condition.getId() == conditionsEnum.getId()) {
                return true;
            }
        }

        return false;
    }
}
