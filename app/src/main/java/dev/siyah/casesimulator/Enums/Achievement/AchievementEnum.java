package dev.siyah.casesimulator.Enums.Achievement;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;

public enum  AchievementEnum implements DatabaseEnumInterface, IdentifiableEnumInterface {
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
