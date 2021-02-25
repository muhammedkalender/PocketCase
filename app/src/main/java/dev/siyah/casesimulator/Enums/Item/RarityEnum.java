package dev.siyah.casesimulator.Enums.Item;

import android.graphics.drawable.Drawable;

import javax.inject.Inject;

import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.R;

//TODO Load real chances
//TODO GET CHANCE, FROM MODEL ( ID )
public enum RarityEnum {
    COMMON {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        public int getNameId() {
            return R.string.rarityCommonName;
        }

        @Override
        public int getColor() {
            return resourceHelper.getColor(R.color.rarityCommonColor, -1);
        }

        @Override
        public int getChange() {
            return 1000;
        }

        @Override
        public int getDrawableId() {
            return R.drawable.rarity_common_drawable;
        }
    },
    UNCOMMON {
        @Override
        public int getId() {
            return 1;
        }

        @Override
        public int getNameId() {
            return R.string.rarityUncommonName;
        }

        @Override
        public int getColor() {
            return resourceHelper.getColor(R.color.rarityUncommonColor);
        }

        @Override
        public int getChange() {
            return 2000;
        }

        @Override
        public int getDrawableId() {
            return R.drawable.rarity_uncommon_drawable;
        }
    },
    RARE {
        @Override
        public int getId() {
            return 2;
        }

        @Override
        public int getNameId() {
            return R.string.rarityRareName;
        }

        @Override
        public int getColor() {
            return resourceHelper.getColor(R.color.rarityRareColor);
        }

        @Override
        public int getChange() {
            return 5000;
        }

        @Override
        public int getDrawableId() {
            return R.drawable.rarity_rare_drawable;
        }
    },
    MYTHICAL {
        @Override
        public int getId() {
            return 3;
        }

        @Override
        public int getNameId() {
            return R.string.rarityMythicalName;
        }

        @Override
        public int getColor() {
            return resourceHelper.getColor(R.color.rarityMythicalColor);
        }

        @Override
        public int getChange() {
            return 8000;
        }

        @Override
        public int getDrawableId() {
            return R.drawable.rarity_mythical_drawable;
        }
    },
    LEGENDARY {
        @Override
        public int getId() {
            return 4;
        }

        @Override
        public int getNameId() {
            return R.string.rarityLegendaryName;
        }

        @Override
        public int getColor() {
            return resourceHelper.getColor(R.color.rarityLegendaryColor);
        }

        @Override
        public int getChange() {
            return 9000;
        }

        @Override
        public int getDrawableId() {
            return R.drawable.rarity_legendary_drawable;
        }
    },
    ANCIENT {
        @Override
        public int getId() {
            return 5;
        }

        @Override
        public int getNameId() {
            return R.string.rarityAncientName;
        }

        @Override
        public int getColor() {
            return resourceHelper.getColor(R.color.rarityAncientColor);
        }

        @Override
        public int getChange() {
            return 9800;
        }

        @Override
        public int getDrawableId() {
            return R.drawable.rarity_ancient_drawable;
        }
    },
    UNIQUE {
        @Override
        public int getId() {
            return 6;
        }

        @Override
        public int getNameId() {
            return R.string.rarityUniqueName;
        }

        @Override
        public int getColor() {
            return resourceHelper.getColor(R.color.rarityUniqueColor);
        }

        @Override
        public int getChange() {
            return 10000;
        }

        @Override
        public int getDrawableId() {
            return R.drawable.rarity_unique_drawable;
        }
    };

    abstract public int getId();

    abstract public int getNameId();

    abstract public int getColor();

    abstract public int getChange();

    abstract public int getDrawableId();

    public Drawable getDrawable() {
        return resourceHelper.getDrawable(getDrawableId());
    }

    public String getName() {
        return resourceHelper.getString(getNameId(), "");
    }

    @Inject
    ResourceHelper resourceHelper;

    RarityEnum() {

    }
}
