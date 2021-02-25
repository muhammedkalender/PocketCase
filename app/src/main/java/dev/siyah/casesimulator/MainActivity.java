package dev.siyah.casesimulator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import javax.inject.Inject;

import dev.siyah.casesimulator.Converters.EnumConverter;
import dev.siyah.casesimulator.Databases.AppDatabase;
import dev.siyah.casesimulator.DependencyInjections.ActivityComponent;
import dev.siyah.casesimulator.DependencyInjections.Modules.AppDatabaseModule;
import dev.siyah.casesimulator.DependencyInjections.Modules.ContextModule;
import dev.siyah.casesimulator.DependencyInjections.DaggerActivityComponent;
import dev.siyah.casesimulator.DependencyInjections.Modules.SharedPreferencesModule;
import dev.siyah.casesimulator.Enums.Item.ItemTypeEnum;
import dev.siyah.casesimulator.Helpers.LogHelper;
import dev.siyah.casesimulator.Helpers.MoneyHelper;
import dev.siyah.casesimulator.Helpers.SharedPreferenceHelper;
import dev.siyah.casesimulator.Models.ItemModel;

public class MainActivity extends AppCompatActivity {
    @Inject
    LogHelper logHelper;

    @Inject
    MoneyHelper moneyHelper;

    @Inject
    SharedPreferenceHelper sharedPreferenceHelper;

    @Inject
    AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .appDatabaseModule(new AppDatabaseModule(getApplication()))
                .sharedPreferencesModule(new SharedPreferencesModule(this))
                .contextModule(new ContextModule(this))
                .build();

        activityComponent.inject(this);
    }
}
