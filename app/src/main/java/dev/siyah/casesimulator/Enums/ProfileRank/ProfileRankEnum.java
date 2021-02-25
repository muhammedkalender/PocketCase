package dev.siyah.casesimulator.Enums.ProfileRank;

import androidx.room.Ignore;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;

public enum ProfileRankEnum implements DatabaseEnumInterface {
    RECRUIT() {
        @Override
        public int getId() {
            return 0;
        }
    };

    ProfileRankEnum() {
    }
}
