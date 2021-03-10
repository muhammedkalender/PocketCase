package dev.siyah.casesimulator.Databases;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import dev.siyah.casesimulator.Converters.DefaultConverter;
import dev.siyah.casesimulator.Converters.EnumConverter;
import dev.siyah.casesimulator.Converters.ModalConverter;
import dev.siyah.casesimulator.Converters.RelationConverter;
import dev.siyah.casesimulator.DAOs.CaseDao;
import dev.siyah.casesimulator.DAOs.InventoryItemDao;
import dev.siyah.casesimulator.DAOs.ItemDao;
import dev.siyah.casesimulator.DAOs.KeyDao;
import dev.siyah.casesimulator.DAOs.SkinDao;
import dev.siyah.casesimulator.DAOs.SkinPriceDao;
import dev.siyah.casesimulator.DAOs.StaticDao;
import dev.siyah.casesimulator.DAOs.UserDao;
import dev.siyah.casesimulator.Models.CaseModel;
import dev.siyah.casesimulator.Models.InventoryItemModel;
import dev.siyah.casesimulator.Models.ItemModel;
import dev.siyah.casesimulator.Models.KeyModel;
import dev.siyah.casesimulator.Models.SkinModel;
import dev.siyah.casesimulator.Models.SkinPriceModel;
import dev.siyah.casesimulator.Models.StaticModel;
import dev.siyah.casesimulator.Models.UserModel;

@Database(
        entities = {
                CaseModel.class,
                InventoryItemModel.class,
                ItemModel.class,
                KeyModel.class,
                SkinModel.class,
                SkinPriceModel.class,
                StaticModel.class,
                UserModel.class
        },
        version = 1
)
@TypeConverters(
        {
                DefaultConverter.class,
                EnumConverter.class,
                ModalConverter.class,
                RelationConverter.class
        }
)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CaseDao caseDao();

    public abstract InventoryItemDao inventoryItemDao();

    public abstract ItemDao itemDao();

    public abstract KeyDao keyDao();

    public abstract SkinDao skinDao();

    public abstract SkinPriceDao skinPriceDao();

    public abstract StaticDao staticDao();

    public abstract UserDao userDao();
}
