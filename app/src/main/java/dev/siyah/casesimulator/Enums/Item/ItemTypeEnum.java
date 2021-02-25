package dev.siyah.casesimulator.Enums.Item;

import android.graphics.drawable.Drawable;

import javax.inject.Inject;

import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.R;

//TODO
public enum ItemTypeEnum implements DatabaseEnumInterface {
    PISTOL {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        public int getNameId() {
            return R.string.itemTypePistol;
        }

        @Override
        public int getDrawableId() {
            return R.mipmap.item_type_pistol;
        }
    },
    SMG {
        @Override
        public int getId() {
            return 1;
        }

        @Override
        public int getNameId() {
            return R.string.itemTypeSmg;
        }

        @Override
        public int getDrawableId() {
            return R.mipmap.item_type_smg;
        }
    },
    HEAVY {
        @Override
        public int getId() {
            return 2;
        }

        @Override
        public int getNameId() {
            return R.string.itemTypeHeavy;
        }

        @Override
        public int getDrawableId() {
            return R.mipmap.item_type_heavy;
        }
    },
    KNIFE {
        @Override
        public int getId() {
            return 3;
        }

        @Override
        public int getNameId() {
            return R.string.itemTypeKnife;
        }

        @Override
        public int getDrawableId() {
            return R.mipmap.item_type_knife;
        }
    },
    RIFLE {
        @Override
        public int getId() {
            return 4;
        }

        @Override
        public int getNameId() {
            return R.string.itemTypeRifle;
        }

        @Override
        public int getDrawableId() {
            return R.mipmap.item_type_rifle;
        }
    },
    STICKER {
        @Override
        public int getId() {
            return 5;
        }

        @Override
        public int getNameId() {
            return R.string.itemTypeSticker;
        }

        @Override
        public int getDrawableId() {
            return R.mipmap.item_type_sticker;
        }
    },
    AUTOGRAPH {
        @Override
        public int getId() {
            return 6;
        }

        @Override
        public int getNameId() {
            return R.string.itemTypeAutograph;
        }

        @Override
        public int getDrawableId() {
            return R.mipmap.item_type_autograph;
        }
    },
    GLOVE {
        @Override
        public int getId() {
            return 7;
        }

        @Override
        public int getNameId() {
            return R.string.itemTypeGlove;
        }

        @Override
        public int getDrawableId() {
            return R.mipmap.item_type_glove;
        }
    };

    abstract public int getId();

    abstract public int getNameId();

    abstract public int getDrawableId();

    public Drawable getDrawable() {
        return resourceHelper.getDrawable(getDrawableId());
    }

    public String getName() {
        return resourceHelper.getString(getNameId(), "");
    }

    @Inject
    ResourceHelper resourceHelper;
}
