package dev.siyah.casesimulator.Helpers;

import dev.siyah.casesimulator.Interfaces.StaticEnumInterface;
import lombok.NonNull;

//TODO
public class StaticHelper {
    public float getFloat(@NonNull StaticEnumInterface staticEnumInterface) {
        //todo
        return (float) staticEnumInterface.getType().getDefaultValue();
    }

    public boolean setFloat(@NonNull StaticEnumInterface staticEnumInterface, float value) {
        //TODO

        //TODO Daha düzğün bir yöntemi olmalı
        value = Long.parseLong(
                String.valueOf(value)
                        .replace(",", "")
        );

        return true;
    }
}
