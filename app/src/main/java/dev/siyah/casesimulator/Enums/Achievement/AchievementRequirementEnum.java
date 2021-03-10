package dev.siyah.casesimulator.Enums.Achievement;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;
import dev.siyah.casesimulator.Interfaces.NameableEnumInterface;
import dev.siyah.casesimulator.R;

public enum AchievementRequirementEnum implements DatabaseEnumInterface, NameableEnumInterface, IdentifiableEnumInterface {
    DYNAMIC {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        public int getNameId() {
            return R.string.achievementRequirementDynamicName;
        }
    },
    STATIC {
        @Override
        public int getId() {
            return 1;
        }

        @Override
        public int getNameId() {
            return R.string.achievementRequirementStaticName;
        }
    };
}
