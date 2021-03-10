package dev.siyah.casesimulator.Enums.Achievement;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;
import dev.siyah.casesimulator.Interfaces.NameableEnumInterface;
import dev.siyah.casesimulator.R;

public enum AchievementPrizeEnum implements DatabaseEnumInterface, NameableEnumInterface, IdentifiableEnumInterface {
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
}
