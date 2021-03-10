package dev.siyah.casesimulator.Enums.SkillGroup;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;

public enum SkillGroupEnum implements DatabaseEnumInterface, IdentifiableEnumInterface {
    NO_RANKED{
        @Override
        public int getId() {
            return 0;
        }
    };
}
