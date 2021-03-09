package dev.siyah.casesimulator.Helpers;

import java.util.List;

import javax.inject.Inject;

import dev.siyah.casesimulator.DAOs.AchievementRequirementDao;
import dev.siyah.casesimulator.Enums.Achievement.AchievementRequirementEnum;
import dev.siyah.casesimulator.Models.AchievementModel;
import dev.siyah.casesimulator.Models.AchievementRequirementModel;
import dev.siyah.casesimulator.Models.StaticModel;
import lombok.NonNull;

public class AchievementHelper {
    //TODO

    @Inject
    AchievementRequirementDao achievementRequirementDao;

    @NonNull
    public AchievementModel updateChanges(@NonNull AchievementModel achievement, @NonNull List<StaticModel> statics) {
        for (StaticModel staticModel : statics) {
            for (AchievementRequirementModel achievementRequirement : achievement.achievementRequirementModels) {
                if (achievementRequirement.achievementRequirementStatic.id == staticModel.id) {
                    achievementRequirement.achievementRequirementStatic = staticModel;
                    if (achievementRequirement.type == AchievementRequirementEnum.STATIC) {
                        if (achievementRequirement.staticTarget <= achievementRequirement.achievementRequirementStatic.value) {
                            achievementRequirement.status = true;

                            if (achievementRequirementDao != null) {
                                achievementRequirementDao.update(achievementRequirement);
                            }
                        }
                    }
                }
            }
        }

        return achievement;
    }

    public boolean isCompleted(@NonNull AchievementModel achievement) {
        if (achievement.status) {
            return false;
        }

        for (AchievementRequirementModel achievementRequirement : achievement.achievementRequirementModels) {
            if (achievementRequirement.status) {
                continue;
            }

            if (achievementRequirement.achievementRequirementStatic.value < achievementRequirement.staticTarget) {
                return false;
            }
        }

        return true;
    }
}
