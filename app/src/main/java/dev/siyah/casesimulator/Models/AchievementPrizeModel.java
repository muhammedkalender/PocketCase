package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Achievement.AchievementPrizeEnum;
import lombok.NonNull;

@Entity(tableName = "achievementPrizes")
public class AchievementPrizeModel {
    @ColumnInfo(name = "achievementPrizeId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "achievementPrizeName")
    public String name;

    @NonNull
    @ColumnInfo(name = "achievementPrizeDescription")
    public String description;

    @NonNull
    @ColumnInfo(name = "achievementPrizeImage")
    public String image;

    @NonNull
    @ColumnInfo(name = "achievementPrizeType")
    public AchievementPrizeEnum type;

    @ColumnInfo(name = "achievementPrizeActive")
    public boolean active = true;
}
