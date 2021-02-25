package dev.siyah.casesimulator.Helpers;

import androidx.annotation.NonNull;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Item.RarityEnum;
import dev.siyah.casesimulator.Models.CaseModel;

class CaseHelper {
    @Inject
    CaseHelper caseHelper;

    @Inject
    CaseHelper() {
    }

    boolean isRarityPossible(@NonNull RarityEnum rarityEnum, @NonNull CaseModel caseModel) {
        for (RarityEnum rarityId : caseModel.possibleRarities) {
            if (rarityId.getId() == rarityEnum.getId()) {
                return true;
            }
        }

        return false;
    }
}
