package dev.siyah.casesimulator.Helpers;

import android.util.Log;

import androidx.annotation.NonNull;

import javax.inject.Inject;

import dagger.Module;

//TODO RECORD
@Module
public class LogHelper {
    @Inject
    public LogHelper(){

    }

    //region Name

    public void error(@NonNull String name, @NonNull Exception e){
        error(name, e.getMessage() == null ? "" : e.getMessage());
    }

    public void error(@NonNull String name, @NonNull String message) {
        Log.e("ERR" + name, message);
    }

    //endregion
}
