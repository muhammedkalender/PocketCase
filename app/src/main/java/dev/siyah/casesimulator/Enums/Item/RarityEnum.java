package dev.siyah.casesimulator.Enums.Item;

import dev.siyah.casesimulator.Interfaces.ColorableEnumInterface;
import dev.siyah.casesimulator.Interfaces.DrawableEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;
import dev.siyah.casesimulator.Interfaces.NameableEnumInterface;
import dev.siyah.casesimulator.R;

//TODO Load real chances
//TODO GET CHANCE, FROM MODEL ( ID )
public enum RarityEnum implements IdentifiableEnumInterface, NameableEnumInterface, ColorableEnumInterface, DrawableEnumInterface {
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
        public int getColorId() {
            return R.color.rarityCommonColor;
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
        public int getColorId() {
            return R.color.rarityUncommonColor;
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
        public int getColorId() {
            return R.color.rarityRareColor;
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
        public int getColorId() {
            return R.color.rarityMythicalColor;
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
        public int getColorId() {
            return R.color.rarityLegendaryColor;
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
        public int getColorId() {
            return R.color.rarityAncientColor;
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
        public int getColorId() {
            return R.color.rarityUniqueColor;
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

    abstract public int getChange();
}
