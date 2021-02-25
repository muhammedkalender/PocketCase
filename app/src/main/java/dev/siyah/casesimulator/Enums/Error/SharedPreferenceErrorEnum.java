package dev.siyah.casesimulator.Enums.Error;

import dev.siyah.casesimulator.Interfaces.ErrorEnumInterface;

public enum  SharedPreferenceErrorEnum implements ErrorEnumInterface {
    FLOAT,
    INTEGER,
    STRING;

    @Override
    public String getErrorPrefix() {
        return "SharedPreference";
    }
}
