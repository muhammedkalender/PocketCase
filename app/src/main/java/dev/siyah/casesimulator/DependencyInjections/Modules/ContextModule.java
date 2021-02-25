package dev.siyah.casesimulator.DependencyInjections.Modules;

import android.content.Context;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private Context context;

    @Inject
    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return context;
    }
}
