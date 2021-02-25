package dev.siyah.casesimulator.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.StaticModel;

@Dao
public interface StaticDao extends DaoInterface<StaticModel> {
    @Query("SELECT * FROM statics WHERE staticId = :id")
    public StaticModel get(long id);

    @Query("SELECT * FROM statics")
    public List<StaticModel> list();

    @Query("UPDATE statics SET staticValue = staticValue + :value WHERE staticId = :id")
    public void increment(long id, long value);

    @Query("UPDATE statics SET staticValue = staticValue - :value WHERE staticId = :id")
    public void decrement(long id, long value);
}
