package dev.siyah.casesimulator.Enums.Item;

import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;
import dev.siyah.casesimulator.Interfaces.NameableEnumInterface;
import dev.siyah.casesimulator.Interfaces.ShortNameableEnumInterface;
import dev.siyah.casesimulator.R;

//TODO Load real chances
public enum ConditionEnum implements NameableEnumInterface, ShortNameableEnumInterface, IdentifiableEnumInterface {
    BATTLE_SCARRED {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        public int getNameId() {
            return R.string.conditionBattleScarredName;
        }

        @Override
        public int getShortNameId() {
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
        public int getNameId() {
            return R.string.conditionWellWornName;
        }

        @Override
        public int getShortNameId() {
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
        public int getNameId() {
            return R.string.conditionFieldTestedName;
        }

        @Override
        public int getShortNameId() {
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
        public int getNameId() {
            return R.string.conditionMinimalWearName;
        }

        @Override
        public int getShortNameId() {
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
        public int getNameId() {
            return R.string.conditionFactoryNewName;
        }

        @Override
        public int getShortNameId() {
            return R.string.conditionFactoryNewShortName;
        }

        @Override
        public int getChange() {
            return 10000;
        }
    };

    abstract public int getChange();
}
