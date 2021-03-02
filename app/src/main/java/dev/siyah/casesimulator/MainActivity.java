package dev.siyah.casesimulator;

import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.Reusable;
import dev.siyah.casesimulator.DAOs.KeyDao;
import dev.siyah.casesimulator.DAOs.SkinDao;
import dev.siyah.casesimulator.DAOs.SkinPriceDao;
import dev.siyah.casesimulator.Databases.AppDatabase;
import dev.siyah.casesimulator.DependencyInjections.Modules.AppDatabaseModule;
import dev.siyah.casesimulator.DependencyInjections.Modules.ContextModule;
import dev.siyah.casesimulator.DependencyInjections.DaggerActivityComponent;
import dev.siyah.casesimulator.DependencyInjections.Modules.SharedPreferencesModule;
import dev.siyah.casesimulator.Development.PopulateDb;
import dev.siyah.casesimulator.Helpers.LogHelper;
import dev.siyah.casesimulator.Helpers.MoneyHelper;
import dev.siyah.casesimulator.Helpers.SharedPreferenceHelper;
import dev.siyah.casesimulator.Models.SkinModel;

public class MainActivity extends AppCompatActivity {
    @Inject
    LogHelper logHelper;

    @Inject
    MoneyHelper moneyHelper;

    @Inject
    SharedPreferenceHelper sharedPreferenceHelper;

    @Inject
    @Reusable
    SkinDao skinDao;

    @Inject
    KeyDao keyDao;

    @Inject
    SkinPriceDao skinPriceDao;

    @Inject
    AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        DaggerActivityComponent.builder()
//                .contextModule(new ContextModule(this))
//                .appDatabaseModule(new AppDatabaseModule(getApplication()))
//                .sharedPreferencesModule(new SharedPreferencesModule(this))
//                .build()
//                .inject(this);


        ((DaggerApplication) getApplication())
                .getActivityComponent()
                .inject(this);

        new PopulateDb().example();
//
        SkinModel skinModel = skinDao.list().get(0);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rootView);

        relativeLayout.addView(relativeLayout);
    }
}
