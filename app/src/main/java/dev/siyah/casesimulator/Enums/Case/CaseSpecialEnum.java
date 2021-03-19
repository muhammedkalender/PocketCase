package dev.siyah.casesimulator.Enums.Case;

import android.graphics.drawable.Drawable;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Item.RarityEnum;
import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;
import dev.siyah.casesimulator.Interfaces.ImaginablyEnumInterface;
import dev.siyah.casesimulator.Interfaces.NameableEnumInterface;
import dev.siyah.casesimulator.R;

//TODO NAMES
public enum CaseSpecialEnum implements NameableEnumInterface, ImaginablyEnumInterface, IdentifiableEnumInterface {
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
        public int getSkinNameId() {
            return R.string.caseSpecialGloveSkinName;
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
        public int getSkinNameId() {
            return R.string.caseSpecialKnifeSkinName;
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
        public int getSkinNameId() {
            return 0;
        }

        @Override
        public int getRarityId() {
            return 0;
        }
    };

    abstract public int getSkinNameId();
    abstract public int getRarityId();

    public RarityEnum getRarity() {
        return RarityEnum.values()[getRarityId()];
    }
}
