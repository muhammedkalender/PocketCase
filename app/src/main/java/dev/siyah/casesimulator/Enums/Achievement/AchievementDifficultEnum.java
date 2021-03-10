package dev.siyah.casesimulator.Enums.Achievement;

import dev.siyah.casesimulator.Interfaces.ColorableEnumInterface;
import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;
import dev.siyah.casesimulator.Interfaces.NameableEnumInterface;
import dev.siyah.casesimulator.R;

public enum AchievementDifficultEnum implements DatabaseEnumInterface, NameableEnumInterface, ColorableEnumInterface, IdentifiableEnumInterface {
    EASY {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        public int getNameId() {
            return R.string.achievementDifficultNameEasy;
        }

        @Override
        public int getColorId() {
            return R.color.achievementDifficultColorEasy;
        }
    },
    NORMAL {
        @Override
        public int getId() {
            return 1;
        }

        @Override
        public int getNameId() {
            return R.string.achievementDifficultNameNormal;
        }

        @Override
        public int getColorId() {
            return R.color.achievementDifficultColorNormal;
        }
    },
    HARD {
        @Override
        public int getId() {
            return 2;
        }

        @Override
        public int getNameId() {
            return R.string.achievementDifficultNameHard;
        }

        @Override
        public int getColorId() {
            return R.color.achievementDifficultColorHard;
        }
    },
    EXTREME {
        @Override
        public int getId() {
            return 3;
        }

        @Override
        public int getNameId() {
            return R.string.achievementDifficultNameExtreme;
        }

        @Override
        public int getColorId() {
            return R.color.achievementDifficultColorExtreme;
        }
    },
    IMPOSSIBLE {
        @Override
        public int getId() {
            return 4;
        }

        @Override
        public int getNameId() {
            return R.string.achievementDifficultNameImpossible;
        }

        @Override
        public int getColorId() {
            return R.color.achievementDifficultColorImpossible;
        }
    };
}
