package dev.siyah.casesimulator.Enums.Achievement;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;

public enum  AchievementEnum implements DatabaseEnumInterface {
    NORMAL{
        @Override
        public int getId() {
            return 0;
        }
    },
    HIDDEN{
        @Override
        public int getId() {
            return 1;
        }
    };
}
