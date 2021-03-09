package dev.siyah.casesimulator.DAOs;

import androidx.room.Query;

import java.util.List;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.AchievementRequirementModel;

public interface AchievementRequirementDao extends DaoInterface<AchievementRequirementModel> {
    @Query("SELECT * FROM achievementRequirements WHERE achievementRequirementId = :id")
    public AchievementRequirementModel get(long id);

    @Query("SELECT * FROM achievementRequirements")
    public List<AchievementRequirementModel> list();
}
