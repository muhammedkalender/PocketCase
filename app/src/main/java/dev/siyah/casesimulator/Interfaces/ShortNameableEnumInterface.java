package dev.siyah.casesimulator.Interfaces;

import androidx.room.Ignore;

import lombok.NonNull;

public interface ShortNameableEnumInterface {
    @Ignore
    @NonNull
    abstract public int getShortNameId();
}
