package dev.siyah.casesimulator.Interfaces;

import dev.siyah.casesimulator.Enums.Static.StaticTypeEnum;

public interface StaticEnumInterface {
    abstract public int getId();
    abstract public String getCode();
    abstract public int getNameId();
    public String getName();
    abstract public int getTypeId();
    public StaticTypeEnum getType();
}
