package dev.siyah.casesimulator.Converters;

import androidx.annotation.Nullable;
import androidx.room.TypeConverter;

import java.util.Date;

//https://developer.android.com/training/data-storage/room/referencing-data
public class DefaultConverter {
    //region Date

    @TypeConverter
    public static Date fromTimestamp(long value) {
        return new Date(value);
    }

    @TypeConverter
    public static long dateToTimestamp(@Nullable Date date) {
        if (date == null) {
            return 0L;
        }

        return date.getTime();
    }

    //endregion
}
