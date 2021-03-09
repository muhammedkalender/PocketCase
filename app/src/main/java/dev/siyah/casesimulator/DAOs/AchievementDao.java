package dev.siyah.casesimulator.DAOs;

import androidx.room.Query;

import java.util.List;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.AchievementModel;

public interface AchievementDao extends DaoInterface<AchievementModel> {
    @Query("SELECT * FROM achievements WHERE achievementId = :id")
    public AchievementModel get(long id);

    @Query("SELECT * FROM achievements")
    public List<AchievementModel> list();
}
