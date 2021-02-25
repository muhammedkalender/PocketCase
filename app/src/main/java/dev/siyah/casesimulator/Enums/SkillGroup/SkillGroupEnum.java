package dev.siyah.casesimulator.Enums.SkillGroup;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;

public enum SkillGroupEnum implements DatabaseEnumInterface {
    NO_RANKED{
        @Override
        public int getId() {
            return 0;
        }
    };
}
