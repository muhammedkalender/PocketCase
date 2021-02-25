package dev.siyah.casesimulator.Converters;

import androidx.annotation.Nullable;
import androidx.room.TypeConverter;

import javax.inject.Inject;

import dev.siyah.casesimulator.Databases.AppDatabase;
import dev.siyah.casesimulator.Models.CaseModel;
import dev.siyah.casesimulator.Models.ItemModel;
import dev.siyah.casesimulator.Models.KeyModel;
import dev.siyah.casesimulator.Models.SkinModel;
import dev.siyah.casesimulator.Models.SkinPriceModel;

public class ModalConverter {
    @Inject
    AppDatabase appDatabase;

    //region Case Modal

    @Nullable
    @TypeConverter
    public CaseModel casModelFromId(long id) {
        return appDatabase.caseDao().get(id);
    }

    @TypeConverter
    public long caseModelToId(@Nullable CaseModel caseModel) {
        if (caseModel == null) {
            return 0L;
        }

        return caseModel.id;
    }

    //endregion

    //region Item Modal

    @Nullable
    @TypeConverter
    public ItemModel itemModelFromId(long id) {
        return appDatabase.itemDao().get(id);
    }

    @TypeConverter
    public long itemModelToId(@Nullable ItemModel itemModel) {
        if (itemModel == null) {
            return 0L;
        }

        return itemModel.id;
    }

    //endregion

    //region Skin Model

    @Nullable
    @TypeConverter
    public SkinModel skinModelFromId(long id) {
        return appDatabase.skinDao().get(id);
    }

    @TypeConverter
    public long skinModelToId(@Nullable SkinModel skinModel) {
        if (skinModel == null) {
            return 0L;
        }

        return skinModel.id;
    }

    //endregion

    //region Key Modal

    @Nullable
    @TypeConverter
    public KeyModel keyModelFromId(long id) {
        return appDatabase.keyDao().get(id);
    }

    @TypeConverter
    public long keyModelToId(@Nullable KeyModel keyModel) {
        if (keyModel == null) {
            return 0L;
        }

        return keyModel.id;
    }

    //endregion

    //region Skin Price Modal

    @Nullable
    @TypeConverter
    public SkinPriceModel skinPriceModelFromId(long id) {
        return appDatabase.skinPriceDao().get(id);
    }

    @TypeConverter
    public long skinPriceModelToId(@Nullable SkinPriceModel skinPriceModel) {
        if (skinPriceModel == null) {
            return 0L;
        }

        return skinPriceModel.id;
    }

    //endregion
}
