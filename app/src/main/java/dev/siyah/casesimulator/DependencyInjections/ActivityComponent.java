package dev.siyah.casesimulator.DependencyInjections;

import javax.inject.Singleton;

import dagger.Component;
import dev.siyah.casesimulator.DAOs.CaseDao;
import dev.siyah.casesimulator.DAOs.InventoryItemDao;
import dev.siyah.casesimulator.DAOs.ItemDao;
import dev.siyah.casesimulator.DAOs.KeyDao;
import dev.siyah.casesimulator.DAOs.SkinDao;
import dev.siyah.casesimulator.DAOs.SkinPriceDao;
import dev.siyah.casesimulator.DAOs.StaticDao;
import dev.siyah.casesimulator.DAOs.UserDao;
import dev.siyah.casesimulator.DependencyInjections.Modules.AppDatabaseModule;
import dev.siyah.casesimulator.DependencyInjections.Modules.ContextModule;
import dev.siyah.casesimulator.DependencyInjections.Modules.SharedPreferencesModule;
import dev.siyah.casesimulator.MainActivity;

//https://medium.com/@abhinav.s0612/introduction-to-dagger-2-for-beginners-a7da4c09053c
@Component(modules = {
        AppDatabaseModule.class,
        ContextModule.class,
        SharedPreferencesModule.class
})
@Singleton
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

    CaseDao caseDao();
    InventoryItemDao inventoryItemDao();
    ItemDao itemDao();
    KeyDao keyDao();
    SkinDao skinDao();
    SkinPriceDao skinPriceDao();
    StaticDao staticDao();
    UserDao userDao();
}