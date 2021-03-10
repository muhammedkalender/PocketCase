package dev.siyah.casesimulator.Helpers;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Variable.VariableEnum;

public class SharedPreferenceHelper {
    private SharedPreferences sharedPreferences;

    @Inject
    public SharedPreferenceHelper(@NonNull Context context) {
        sharedPreferences = context.getSharedPreferences("test", Context.MODE_PRIVATE);
    }

    //region Float

    public float getFloat(@NonNull String key) {
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getFloat(key, (float) VariableEnum.FLOAT.getDefaultValue());
        }

        return (float) VariableEnum.FLOAT.getDefaultValue();
    }

    public float getFloat(@NonNull String key, float defaultValue) {
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getFloat(key, defaultValue);
        }

        return defaultValue;
    }

    public boolean setFloat(@NonNull String key, float value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putFloat(key, value);

        return editor.commit();
    }

    //endregion

    //region Integer

    public int getInteger(@NonNull String key) {
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getInt(key, (int) VariableEnum.INTEGER.getDefaultValue());
        }

        return (int) VariableEnum.INTEGER.getDefaultValue();
    }

    public int getInteger(@NonNull String key, int defaultValue) {
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getInt(key, defaultValue);
        }

        return defaultValue;
    }

    public boolean setInteger(@NonNull String key, int value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(key, value);

        return editor.commit();
    }

    //endregion

    //region Long

    public long getLong(@NonNull String key) {
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getLong(key, (int) VariableEnum.INTEGER.getDefaultValue());
        }

        return (long) VariableEnum.INTEGER.getDefaultValue();
    }

    public long getLong(@NonNull String key, long defaultValue) {
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getLong(key, defaultValue);
        }

        return defaultValue;
    }

    public boolean setLong(@NonNull String key, long value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putLong(key, value);

        return editor.commit();
    }

    //endregion

    //region String

    @NonNull
    public String getString(@NonNull String key) {
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getString(key, (String) VariableEnum.STRING.getDefaultValue());
        }

        return (String) VariableEnum.STRING.getDefaultValue();
    }

    @NonNull
    public String getString(@NonNull String key, @NonNull String defaultValue) {
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getString(key, defaultValue);
        }

        return defaultValue;
    }

    public boolean setString(@NonNull String key, @NonNull String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(key, value);

        return editor.commit();
    }

    //endregion
}
