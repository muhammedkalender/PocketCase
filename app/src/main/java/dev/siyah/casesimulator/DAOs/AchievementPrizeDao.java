package dev.siyah.casesimulator.DAOs;

import androidx.room.Query;

import java.util.List;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.AchievementPrizeModel;

public interface AchievementPrizeDao extends DaoInterface<AchievementPrizeModel> {
    @Query("SELECT * FROM achievementPrizes WHERE achievementPrizeId = :id")
    public AchievementPrizeModel get(long id);

    @Query("SELECT * FROM achievementPrizes")
    public List<AchievementPrizeModel> list();
}
