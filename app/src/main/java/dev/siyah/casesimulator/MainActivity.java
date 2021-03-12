package dev.siyah.casesimulator;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import dev.siyah.casesimulator.Components.CaseOpen.CaseOpenCardComponent;
import dev.siyah.casesimulator.DAOs.SkinDao;
import dev.siyah.casesimulator.Databases.AppDatabase;
import dev.siyah.casesimulator.DependencyInjections.Modules.AppDatabaseModule;
import dev.siyah.casesimulator.DependencyInjections.Modules.ContextModule;
import dev.siyah.casesimulator.DependencyInjections.DaggerActivityComponent;
import dev.siyah.casesimulator.DependencyInjections.Modules.HelperModule;
import dev.siyah.casesimulator.DependencyInjections.Modules.SharedPreferencesModule;
import dev.siyah.casesimulator.Development.PopulateDb;
import dev.siyah.casesimulator.Enums.Achievement.AchievementDifficultEnum;
import dev.siyah.casesimulator.Models.SkinModel;

public class MainActivity extends AppCompatActivity {
    @Inject
    AppDatabase appDatabase;

    @Inject
    SkinDao skinDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder()
                .contextModule(new ContextModule(this))
                .appDatabaseModule(new AppDatabaseModule(getApplication()))
                .sharedPreferencesModule(new SharedPreferencesModule(this))
                .helperModule(new HelperModule(this))
                .build()
                .inject(this);


//        ((DaggerApplication) getApplication())
//                .getActivityComponent()
//                .inject(this);


        AchievementDifficultEnum p = AchievementDifficultEnum.EASY;

        new PopulateDb(appDatabase).example();
//
        SkinModel skinModel = skinDao.list().get(0);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rootView);

        CaseOpenCardComponent caseOpenCardComponent = new CaseOpenCardComponent();
        View view = caseOpenCardComponent.generateView(skinModel);

        relativeLayout.addView(relativeLayout);
    }
}
