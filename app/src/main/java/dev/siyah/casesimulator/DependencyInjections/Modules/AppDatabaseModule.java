package dev.siyah.casesimulator.DependencyInjections.Modules;

import android.app.Application;

import androidx.room.Room;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dev.siyah.casesimulator.DAOs.CaseDao;
import dev.siyah.casesimulator.DAOs.InventoryItemDao;
import dev.siyah.casesimulator.DAOs.ItemDao;
import dev.siyah.casesimulator.DAOs.KeyDao;
import dev.siyah.casesimulator.DAOs.SkinDao;
import dev.siyah.casesimulator.DAOs.SkinPriceDao;
import dev.siyah.casesimulator.DAOs.StaticDao;
import dev.siyah.casesimulator.DAOs.UserDao;
import dev.siyah.casesimulator.Databases.AppDatabase;

//https://marco-cattaneo.medium.com/integrate-dagger-2-with-room-persistence-library-in-few-lines-abf48328eaeb
@Module
public class AppDatabaseModule {
    private AppDatabase appDatabase;

    @Inject
    public AppDatabaseModule(Application application) {
        appDatabase = Room.databaseBuilder(
                application,
                AppDatabase.class,
                "case-simulator"
        )
                .allowMainThreadQueries()
                .build();
    }

    @Singleton
    @Provides
    AppDatabase providesAppDatabase() {
        return appDatabase;
    }

    //region DAOs

    @Singleton
    @Provides
    CaseDao providesCaseDao(AppDatabase appDatabase){
        return appDatabase.caseDao();
    }

    @Singleton
    @Provides
    InventoryItemDao providesInventoryItemDao(AppDatabase appDatabase){
        return appDatabase.inventoryItemDao();
    }

    @Singleton
    @Provides
    static ItemDao providesItemDao(AppDatabase appDatabase){
        return appDatabase.itemDao();
    }

    @Singleton
    @Provides
    static KeyDao providesKeyDao(AppDatabase appDatabase){
        return appDatabase.keyDao();
    }

    @Singleton
    @Provides
    SkinDao providesSkinDao(AppDatabase appDatabase){
        return appDatabase.skinDao();
    }

    @Singleton
    @Provides
    SkinPriceDao providesSkinPriceDao(AppDatabase appDatabase){
        return appDatabase.skinPriceDao();
    }

    @Singleton
    @Provides
    StaticDao providesStaticDao(AppDatabase appDatabase){
        return appDatabase.staticDao();
    }

    @Singleton
    @Provides
    UserDao providesUserDao(AppDatabase appDatabase){
        return appDatabase.userDao();
    }

    //endregion
}
