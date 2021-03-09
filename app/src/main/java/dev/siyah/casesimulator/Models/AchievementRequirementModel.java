package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Achievement.AchievementRequirementEnum;
import lombok.NonNull;

@Entity(tableName = "achievementRequirements")
public class AchievementRequirementModel {
    @ColumnInfo(name = "achievementRequirementId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "achievementRequirementName")
    public String name;

    @NonNull
    @ColumnInfo(name = "achievementRequirementDescription")
    public String description;

    @NonNull
    @ColumnInfo(name = "achievementRequirementImage")
    public String image;

    @ColumnInfo(name = "achievementRequirementStatus")
    public boolean status = false;

    @NonNull
    @ColumnInfo(name = "achievementRequirementStaticId")
    public StaticModel achievementRequirementStatic;

    @ColumnInfo(name = "achievementRequirementStaticTarget")
    public long staticTarget;

    @NonNull
    @ColumnInfo(name = "achievementRequirementType")
    public AchievementRequirementEnum type;

    @ColumnInfo(name = "achievementRequirementActive")
    public boolean active = true;
}
