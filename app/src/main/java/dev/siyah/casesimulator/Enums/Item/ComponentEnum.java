package dev.siyah.casesimulator.Enums.Item;

import android.graphics.drawable.Drawable;

import javax.inject.Inject;

import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.R;

//TODO Load real chances
public enum ComponentEnum {
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

    abstract public int getIconId();

    abstract public int getId();

    abstract public int getNameId();

    abstract public int getSmallIconId();

    public Drawable getIcon() {
        return resourceHelper.getDrawable(getIconId());
    }

    public String getName() {
        return resourceHelper.getString(getId(), "");
    }

    public Drawable getSmallIcon() {
        return resourceHelper.getDrawable(getSmallIconId());
    }

    @Inject
    ResourceHelper resourceHelper;
}
