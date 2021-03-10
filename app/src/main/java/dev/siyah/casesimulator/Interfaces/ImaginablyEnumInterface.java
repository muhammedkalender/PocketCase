package dev.siyah.casesimulator.Interfaces;

import androidx.room.Ignore;

import lombok.NonNull;

public interface ImaginablyEnumInterface {
    @Ignore
    @NonNull
    abstract public int getImageId();
}
