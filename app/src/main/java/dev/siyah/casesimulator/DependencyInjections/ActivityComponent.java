package dev.siyah.casesimulator.DependencyInjections;

import javax.inject.Singleton;

import dagger.Component;
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
}