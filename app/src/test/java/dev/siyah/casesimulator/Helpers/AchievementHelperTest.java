package dev.siyah.casesimulator.Helpers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import dev.siyah.casesimulator.Enums.Achievement.AchievementRequirementEnum;
import dev.siyah.casesimulator.Models.AchievementModel;
import dev.siyah.casesimulator.Models.AchievementRequirementModel;
import dev.siyah.casesimulator.Models.StaticModel;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AchievementHelperTest {
    private AchievementHelper achievementHelper;

    @Before
    public void setUp() {
        achievementHelper = new AchievementHelper();
    }

    @Test
    public void updateChanges() {
        AchievementModel achievementModel = new AchievementModel();

        //region Level Requirement

        AchievementRequirementModel levelReq = new AchievementRequirementModel();
        levelReq.staticTarget = 1L;
        levelReq.type = AchievementRequirementEnum.STATIC;
        levelReq.id = 10;

        StaticModel levelStatic = new StaticModel();
        levelStatic.value = 2L;
        levelStatic.id = 1010;

        levelReq.achievementRequirementStatic = levelStatic;

        List<StaticModel> staticModels = new ArrayList<>();

        staticModels.add(levelStatic);

        achievementModel.achievementRequirementModels = new AchievementRequirementModel[]{levelReq};
        achievementModel = achievementHelper.updateChanges(achievementModel, staticModels);

        assertTrue(achievementModel.achievementRequirementModels[0].status);

        AchievementRequirementModel pointRequirement = new AchievementRequirementModel();
        pointRequirement.staticTarget = 150L;
        pointRequirement.id = 20;
        pointRequirement.type = AchievementRequirementEnum.DYNAMIC;

        StaticModel pointStatic = new StaticModel();
        pointStatic.value = 205L;
        pointStatic.id = 2020;

        pointRequirement.achievementRequirementStatic = pointStatic;


        staticModels.add(pointStatic);

        achievementModel.achievementRequirementModels = new AchievementRequirementModel[]{levelReq, pointRequirement};

        achievementModel = achievementHelper.updateChanges(achievementModel, staticModels);

        assertFalse(achievementModel.achievementRequirementModels[1].status);
    }

    @Test
    public void isCompleted() {
        AchievementModel achievementModel = new AchievementModel();

        //region Level Requirement

        AchievementRequirementModel levelReq = new AchievementRequirementModel();
        levelReq.staticTarget = 1L;

        StaticModel levelStatic = new StaticModel();
        levelStatic.value = 2L;

        levelReq.achievementRequirementStatic = levelStatic;

        //endregion

        //region Point Requirement

        AchievementRequirementModel pointRequirement = new AchievementRequirementModel();
        pointRequirement.staticTarget = 150L;

        StaticModel pointStatic = new StaticModel();
        pointStatic.value = 205L;

        pointRequirement.achievementRequirementStatic = pointStatic;

        //endregion

        achievementModel.achievementRequirementModels = new AchievementRequirementModel[]{
                pointRequirement,
                levelReq
        };

        assertTrue(achievementHelper.isCompleted(achievementModel));

        levelReq.achievementRequirementStatic.value = 0;

        achievementModel.achievementRequirementModels = new AchievementRequirementModel[]{
                pointRequirement,
                levelReq
        };

        assertFalse(achievementHelper.isCompleted(achievementModel));

        pointRequirement = new AchievementRequirementModel();
        pointRequirement.staticTarget = 500L;
        pointRequirement.status = true;

        pointStatic = new StaticModel();
        pointStatic.value = 205L;

        levelReq.status = true;

        pointRequirement.achievementRequirementStatic = pointStatic;

        achievementModel.achievementRequirementModels = new AchievementRequirementModel[]{
                pointRequirement,
                levelReq
        };

        assertTrue(achievementHelper.isCompleted(achievementModel));

        pointRequirement = new AchievementRequirementModel();
        pointRequirement.staticTarget = 500L;
        pointRequirement.status = false;
        pointRequirement.type = AchievementRequirementEnum.DYNAMIC;

        pointStatic = new StaticModel();
        pointStatic.value = 205L;

        pointRequirement.achievementRequirementStatic = pointStatic;

        levelReq.achievementRequirementStatic = levelStatic;
        levelReq.type = AchievementRequirementEnum.DYNAMIC;

        achievementModel.achievementRequirementModels = new AchievementRequirementModel[]{
                pointRequirement,
                levelReq
        };

        assertFalse(achievementHelper.isCompleted(achievementModel));
    }
}
