package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Achievement.AchievementDifficultEnum;
import dev.siyah.casesimulator.Enums.Achievement.AchievementEnum;
import lombok.NonNull;

@Entity(tableName = "achievements")
public class AchievementModel {
    @ColumnInfo(name = "achievementId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "achievementName")
    public String name;

    @NonNull
    @ColumnInfo(name = "achievementDescription")
    public String description;

    @NonNull
    @ColumnInfo(name = "achievementDifficult")
    public AchievementDifficultEnum difficult = AchievementDifficultEnum.NORMAL;

    @NonNull
    @ColumnInfo(name = "achievementImage")
    public String image;

    @ColumnInfo(name = "achievementStatus")
    public boolean status = false;

    @NonNull
    @ColumnInfo(name = "achievementType")
    public AchievementEnum type = AchievementEnum.NORMAL;

    @NonNull
    @ColumnInfo(name = "achievementRequirements")
    public AchievementRequirementModel[] achievementRequirementModels =
            new AchievementRequirementModel[0];

    @NonNull
    @ColumnInfo(name = "achievementPrizes")
    public AchievementPrizeModel[] achievementPrizeModels = new AchievementPrizeModel[0];

    @ColumnInfo(name = "achievementActive")
    public boolean active = true;
}
