package dev.siyah.casesimulator.Enums.Case;

import android.graphics.drawable.Drawable;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Item.RarityEnum;
import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.R;

//TODO NAMES
public enum CaseSpecialEnum {
    GLOVE {
        @Override
        public int getId() {
            return 2;
        }

        @Override
        public int getImageId() {
            return R.mipmap.case_special_glove;
        }

        @Override
        public int getNameId() {
            return R.string.caseSpecialGloveName;
        }

        @Override
        public int getRarityId() {
            return RarityEnum.UNIQUE.getId();
        }
    },
    KNIFE {
        @Override
        public int getId() {
            return 1;
        }

        @Override
        public int getImageId() {
            return R.mipmap.case_special_knife;
        }

        @Override
        public int getNameId() {
            return R.string.caseSpecialKnifeName;
        }

        @Override
        public int getRarityId() {
            return RarityEnum.UNIQUE.getId();
        }
    },
    NONE {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        public int getImageId() {
            return 0;
        }

        @Override
        public int getNameId() {
            return 0;
        }

        @Override
        public int getRarityId() {
            return 0;
        }
    };

    abstract public int getId();

    abstract public int getImageId();

    abstract public int getNameId();

    abstract public int getRarityId();

    @Inject
    ResourceHelper resourceHelper;

    public Drawable getImage() {
        return this.resourceHelper.getDrawable(getImageId());
    }

    public String getName() {
        return resourceHelper.getString(getNameId());
    }

    public RarityEnum getRarity() {
        return RarityEnum.values()[getRarityId()];
    }
}
