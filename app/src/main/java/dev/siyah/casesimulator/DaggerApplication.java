package dev.siyah.casesimulator;

import android.app.Application;

import dev.siyah.casesimulator.DependencyInjections.ActivityComponent;
import dev.siyah.casesimulator.DependencyInjections.DaggerActivityComponent;
import dev.siyah.casesimulator.DependencyInjections.Modules.AppDatabaseModule;
import dev.siyah.casesimulator.DependencyInjections.Modules.ContextModule;
import dev.siyah.casesimulator.DependencyInjections.Modules.HelperModule;
import dev.siyah.casesimulator.DependencyInjections.Modules.SharedPreferencesModule;

public class DaggerApplication extends Application {
    private ActivityComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        activityComponent = DaggerActivityComponent
                .builder()
                .contextModule(new ContextModule(this))
                .appDatabaseModule(new AppDatabaseModule(this))
                .sharedPreferencesModule(new SharedPreferencesModule(this))
                .helperModule(new HelperModule(this))
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
