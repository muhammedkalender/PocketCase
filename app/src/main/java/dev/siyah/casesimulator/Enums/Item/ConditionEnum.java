package dev.siyah.casesimulator.Enums.Item;

import javax.inject.Inject;

import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.R;

//TODO Load real chances
public enum ConditionEnum {
    BATTLE_SCARRED {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        int getNameId() {
            return R.string.conditionBattleScarredName;
        }

        @Override
        int getShortNameId() {
            return R.string.conditionBattleScarredShortName;
        }

        @Override
        public int getChange() {
            return 3000;
        }
    },
    WELL_WORN {
        @Override
        public int getId() {
            return 1;
        }

        @Override
        int getNameId() {
            return R.string.conditionWellWornName;
        }

        @Override
        int getShortNameId() {
            return R.string.conditionWellWornShortName;
        }

        @Override
        public int getChange() {
            return 5000;
        }
    },
    FIELD_TESTED {
        @Override
        public int getId() {
            return 2;
        }

        @Override
        int getNameId() {
            return R.string.conditionFieldTestedName;
        }

        @Override
        int getShortNameId() {
            return R.string.conditionFieldTestedShortName;
        }

        @Override
        public int getChange() {
            return 7500;
        }
    },
    MINIMAL_WEAR {
        @Override
        public int getId() {
            return 3;
        }

        @Override
        int getNameId() {
            return R.string.conditionMinimalWearName;
        }

        @Override
        int getShortNameId() {
            return R.string.conditionMinimalWearShortName;
        }

        @Override
        public int getChange() {
            return 9000;
        }
    },
    FACTORY_NEW {
        @Override
        public int getId() {
            return 3;
        }

        @Override
        int getNameId() {
            return R.string.conditionFactoryNewName;
        }

        @Override
        int getShortNameId() {
            return R.string.conditionFactoryNewShortName;
        }

        @Override
        public int getChange() {
            return 10000;
        }
    };

    public abstract int getId();

    abstract int getNameId();

    abstract int getShortNameId();

    abstract public int getChange();

    public String getName() {
        return resourceHelper.getString(getNameId(), "");
    }

    public String getShortName() {
        return resourceHelper.getString(getShortNameId(), "");
    }

    @Inject
    ResourceHelper resourceHelper;
}
