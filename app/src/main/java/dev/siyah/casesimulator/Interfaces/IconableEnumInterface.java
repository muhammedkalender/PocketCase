package dev.siyah.casesimulator.Interfaces;

import androidx.room.Ignore;

public interface IconableEnumInterface {
    @Ignore
    public int getIconId();

    @Ignore
    public int getSmallIconId();
}
