package dev.siyah.casesimulator.Interfaces;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import lombok.NonNull;

public interface DaoInterface<T> {
    @Insert
    public long insert(@NonNull T model);

    @Update
    public void update(@NonNull T model);

    @Delete
    public void hardDelete(@NonNull T model);
}
