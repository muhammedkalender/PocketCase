package dev.siyah.casesimulator.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import javax.inject.Singleton;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.CaseModel;

@Dao
public interface CaseDao extends DaoInterface<CaseModel> {
    @Query("SELECT * FROM cases WHERE caseId = :id")
    public CaseModel get(long id);

    @Query("SELECT * FROM cases")
    public List<CaseModel> list();
}
