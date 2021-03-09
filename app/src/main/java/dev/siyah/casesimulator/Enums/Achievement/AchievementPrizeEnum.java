package dev.siyah.casesimulator.Enums.Achievement;

import javax.inject.Inject;

import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.R;

public enum AchievementPrizeEnum implements DatabaseEnumInterface {
    MONEY {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        public int getNameId() {
            return R.string.achievementPrizeMoney;
        }
    },
    XP {
        @Override
        public int getId() {
            return 1;
        }

        @Override
        public int getNameId() {
            return R.string.achievementPrizeXP;
        }
    };

    //TODO
    /*BADGE {

    };*/

    @Inject
    ResourceHelper resourceHelper;

    abstract public int getNameId();

    public String getName() {
        return resourceHelper.getString(getNameId());
    }
}
