package dev.siyah.casesimulator.Enums.Achievement;

import javax.inject.Inject;

import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.R;

public enum AchievementDifficultEnum implements DatabaseEnumInterface {
    EASY{
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
    NORMAL{
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
    HARD{
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
    EXTREME{
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
    IMPOSSIBLE{
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

    @Inject
    ResourceHelper resourceHelper;

    abstract public int getNameId();

    public String getName() {
        return resourceHelper.getString(getNameId());
    }

    abstract public int getColorId();

    public String getColor() {
        return resourceHelper.getString(getNameId());
    }
}
