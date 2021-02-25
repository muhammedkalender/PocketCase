package dev.siyah.casesimulator.Enums.Case;

import javax.inject.Inject;

import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.R;

public enum CaseTypeEnum implements DatabaseEnumInterface {
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

    abstract public int getId();

    abstract public int getNameId();

    @Inject
    ResourceHelper resourceHelper;

    public String getName() {
        return resourceHelper.getString(getNameId());
    }
}
