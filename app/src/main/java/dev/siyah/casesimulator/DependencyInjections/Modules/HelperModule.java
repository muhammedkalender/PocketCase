package dev.siyah.casesimulator.DependencyInjections.Modules;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dev.siyah.casesimulator.Helpers.EnumHelper;
import dev.siyah.casesimulator.Helpers.ResourceHelper;

//https://medium.com/android-news/dagger-2-the-simplest-approach-3e23502c4cab
@Module
public class HelperModule {
    private Context context;

    @Inject
    public HelperModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    ResourceHelper provideResourceHelper() {
        return new ResourceHelper(this.context);
    }

    @Provides
    EnumHelper provideEnumHelper() {
        return new EnumHelper(provideResourceHelper());
    }
}
