package dev.siyah.casesimulator.Interfaces;

import androidx.room.Ignore;

import lombok.NonNull;

public interface NameableEnumInterface {
    @Ignore
    @NonNull
    abstract public int getNameId();
}
