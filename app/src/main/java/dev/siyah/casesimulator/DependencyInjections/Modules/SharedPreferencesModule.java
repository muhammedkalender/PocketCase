package dev.siyah.casesimulator.DependencyInjections.Modules;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

//https://medium.com/android-news/dagger-2-the-simplest-approach-3e23502c4cab
@Module
public class SharedPreferencesModule {
    private Context context;

    @Inject
    public SharedPreferencesModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences() {
        return context.getSharedPreferences("PrefName",Context.MODE_PRIVATE);
    }
}
