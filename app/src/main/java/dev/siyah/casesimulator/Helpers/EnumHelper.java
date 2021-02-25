package dev.siyah.casesimulator.Helpers;

import androidx.annotation.Nullable;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Money.CurrencyEnum;
import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import lombok.NonNull;

public class EnumHelper {
    @Inject
    public EnumHelper() {
    }

    @NonNull
    public <T> T getById(@NonNull T[] enums, int id) {
        for (T enumValue : enums) {
            if (((DatabaseEnumInterface) enumValue).getId() == id) {
                return enumValue;
            }
        }

        return enums[0];
    }

    @NonNull
    public String enumsToString(@Nullable Object[] enums) {
        List<Integer> strings = new ArrayList<>();

        if (enums == null || enums.length == 0) {
            return new Gson()
                    .toJson(strings.toArray());
        }

        for (Object databaseEnumInterface : enums) {
            strings.add(((DatabaseEnumInterface)databaseEnumInterface).getId());
        }

        return new Gson()
                .toJson(strings.toArray());
    }

    @NonNull
    public <T> T[] enumsFromString(@NonNull Object[] enums, @Nullable String enumString) {
        List<T> databaseEnumInterface = new ArrayList<>();

        if (enumString == null || enumString.isEmpty()) {
            return (T[]) databaseEnumInterface
                    .toArray();
        }

        int[] ids = new Gson().fromJson(enumString, int[].class);

        for (int id : ids) {
            for (Object row : enums) {
                if (((DatabaseEnumInterface) row).getId() == id) {
                    databaseEnumInterface.add(
                            (T) this.getById(enums, id)
                    );
                }
            }
        }

        T[] resultArray = (T[]) new DatabaseEnumInterface[databaseEnumInterface.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (T) databaseEnumInterface.get(i);
        }

        return resultArray;
    }
}
