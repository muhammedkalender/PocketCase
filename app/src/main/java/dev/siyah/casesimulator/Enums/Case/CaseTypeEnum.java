package dev.siyah.casesimulator.Enums.Case;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;
import dev.siyah.casesimulator.Interfaces.NameableEnumInterface;
import dev.siyah.casesimulator.R;

public enum CaseTypeEnum implements DatabaseEnumInterface, NameableEnumInterface, IdentifiableEnumInterface {
    WEAPON_CASE {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        public int getNameId() {
            return R.string.caseTypeWeaponCase;
        }
    };
}
