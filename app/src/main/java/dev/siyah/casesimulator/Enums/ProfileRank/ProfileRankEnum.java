package dev.siyah.casesimulator.Enums.ProfileRank;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;

public enum ProfileRankEnum implements DatabaseEnumInterface, IdentifiableEnumInterface {
    RECRUIT() {
        @Override
        public int getId() {
            return 0;
        }
    };
}
