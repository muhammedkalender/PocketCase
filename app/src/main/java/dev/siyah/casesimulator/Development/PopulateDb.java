package dev.siyah.casesimulator.Development;

import javax.inject.Inject;

import dagger.Binds;
import dev.siyah.casesimulator.DAOs.CaseDao;
import dev.siyah.casesimulator.DAOs.ItemDao;
import dev.siyah.casesimulator.DAOs.KeyDao;
import dev.siyah.casesimulator.DAOs.SkinDao;
import dev.siyah.casesimulator.DAOs.SkinPriceDao;
import dev.siyah.casesimulator.Databases.AppDatabase;
import dev.siyah.casesimulator.DependencyInjections.ActivityComponent;
import dev.siyah.casesimulator.Enums.Case.CaseSpecialEnum;
import dev.siyah.casesimulator.Enums.Case.CaseTypeEnum;
import dev.siyah.casesimulator.Enums.Item.ComponentEnum;
import dev.siyah.casesimulator.Enums.Item.ConditionEnum;
import dev.siyah.casesimulator.Enums.Item.ItemTypeEnum;
import dev.siyah.casesimulator.Enums.Item.RarityEnum;
import dev.siyah.casesimulator.Enums.Money.CurrencyEnum;
import dev.siyah.casesimulator.Models.CaseModel;
import dev.siyah.casesimulator.Models.ItemModel;
import dev.siyah.casesimulator.Models.KeyModel;
import dev.siyah.casesimulator.Models.SkinModel;
import dev.siyah.casesimulator.Models.SkinPriceModel;


public class PopulateDb {
    @Inject
    Randomizer randomizer;

    @Inject
    AppDatabase appDatabase;

    @Inject
    CaseDao caseDao;

    @Inject
    ItemDao itemDao;

    @Inject
    KeyDao keyDao;

    @Inject
    SkinDao skinDao;

    @Inject
    SkinPriceDao skinPriceDao;

    @Inject
    public PopulateDb() {
    }

    public void example() {
        KeyModel newCaseKeyModel = new KeyModel("New Case Key", "", CurrencyEnum.USD, 23);

        CaseModel newCaseModel = new CaseModel(
                "New Case",
                "",
                CurrencyEnum.USD,
                156,
                newCaseKeyModel,
                CaseTypeEnum.WEAPON_CASE,
                CaseSpecialEnum.KNIFE,
                new RarityEnum[]{
                        RarityEnum.RARE,
                        RarityEnum.MYTHICAL,
                        RarityEnum.ANCIENT,
                        RarityEnum.LEGENDARY,
                        RarityEnum.UNIQUE,
                },
                ComponentEnum.STAT_TRAK
        );

        ItemModel akItemModel = new ItemModel("AK-47", "", ItemTypeEnum.RIFLE);

        SkinModel akRedLineSkinModel = new SkinModel(
                "Red Line",
                "",
                newCaseModel,
                akItemModel,
                new ComponentEnum[]{
                        ComponentEnum.NORMAL,
                        ComponentEnum.STAT_TRAK
                },
                new ConditionEnum[]{
                        ConditionEnum.MINIMAL_WEAR,
                        ConditionEnum.FACTORY_NEW,
                        ConditionEnum.FIELD_TESTED,
                        ConditionEnum.MINIMAL_WEAR,
                }
        );

        SkinPriceModel akRedLinePriceModel = new SkinPriceModel(
                akRedLineSkinModel,
                ComponentEnum.NORMAL,
                ConditionEnum.MINIMAL_WEAR,
                CurrencyEnum.USD,
                256
        );

        SkinPriceModel akRedLinePriceModelBS = new SkinPriceModel(
                akRedLineSkinModel,
                ComponentEnum.NORMAL,
                ConditionEnum.BATTLE_SCARRED,
                CurrencyEnum.USD,
                236
        );

        SkinPriceModel akRedLinePriceModelFN = new SkinPriceModel(
                akRedLineSkinModel,
                ComponentEnum.NORMAL,
                ConditionEnum.FACTORY_NEW,
                CurrencyEnum.USD,
                696
        );

        SkinPriceModel akRedLinePriceModelFT = new SkinPriceModel(
                akRedLineSkinModel,
                ComponentEnum.NORMAL,
                ConditionEnum.FIELD_TESTED,
                CurrencyEnum.USD,
                331
        );

        SkinPriceModel akRedLinePriceModelFNST = new SkinPriceModel(
                akRedLineSkinModel,
                ComponentEnum.STAT_TRAK,
                ConditionEnum.FACTORY_NEW,
                CurrencyEnum.USD,
                12345
        );

        SkinPriceModel akRedLinePriceModelFTST = new SkinPriceModel(
                akRedLineSkinModel,
                ComponentEnum.STAT_TRAK,
                ConditionEnum.FIELD_TESTED,
                CurrencyEnum.USD,
                178943
        );

        SkinPriceModel akRedLinePriceModelBSST = new SkinPriceModel(
                akRedLineSkinModel,
                ComponentEnum.STAT_TRAK,
                ConditionEnum.BATTLE_SCARRED,
                CurrencyEnum.USD,
                34256
        );

        SkinPriceModel akRedLinePriceModelMWST = new SkinPriceModel(
                akRedLineSkinModel,
                ComponentEnum.STAT_TRAK,
                ConditionEnum.MINIMAL_WEAR,
                CurrencyEnum.USD,
                12569
        );

        keyDao.insert(newCaseKeyModel);
        caseDao.insert(newCaseModel);
        itemDao.insert(akItemModel);
        skinDao.insert(akRedLineSkinModel);
        skinPriceDao.insertAll(new SkinPriceModel[]{
                akRedLinePriceModelBS,
                akRedLinePriceModel,
                akRedLinePriceModelBSST,
                akRedLinePriceModelFN,
                akRedLinePriceModelFNST,
                akRedLinePriceModelFTST,
                akRedLinePriceModelFT,
                akRedLinePriceModelMWST
        });
    }
}
