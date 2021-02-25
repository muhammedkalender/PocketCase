package dev.siyah.casesimulator.DependencyInjections.Modules;

import android.app.Application;

import androidx.room.Room;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
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
}
