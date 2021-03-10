package dev.siyah.casesimulator.Enums.Item;

import dev.siyah.casesimulator.Interfaces.IconableEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;
import dev.siyah.casesimulator.Interfaces.NameableEnumInterface;
import dev.siyah.casesimulator.R;

//TODO Load real chances
public enum ComponentEnum implements IdentifiableEnumInterface, NameableEnumInterface, IconableEnumInterface {
    NORMAL {
        @Override
        public int getChance() {
            return 9000; //TODO
        }

        @Override
        public int getIconId() {
            return 0; //TODO
        }

        @Override
        public int getId() {
            return 0;
        }

        @Override
        public int getNameId() {
            return R.string.componentNormalName;
        }

        @Override
        public int getSmallIconId() {
            return 0;
        }
    },
    STAT_TRAK {
        @Override
        public int getChance() {
            return 10000;
        }

        @Override
        public int getIconId() {
            return 0; //TODO
        }

        @Override
        public int getId() {
            return 1;
        }

        @Override
        public int getNameId() {
            return R.string.componentStatTrakName;
        }

        @Override
        public int getSmallIconId() {
            return 0; //TODO
        }
    };

    abstract public int getChance();
}
