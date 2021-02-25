package dev.siyah.casesimulator.Enums.Static;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Variable.VariableEnum;
import dev.siyah.casesimulator.Helpers.ResourceHelper;
import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.Interfaces.StaticEnumInterface;
import dev.siyah.casesimulator.R;

public enum StaticUserEnum implements StaticEnumInterface, DatabaseEnumInterface {
    OPEN_APP {
        @Override
        public int getId() {
            return 0;
        }

        @Override
        public String getCode() {
            return "OPEN_APP";
        }

        @Override
        public int getNameId() {
            return R.string.staticUserOpenAppName;
        }

        @Override
        public int getTypeId() {
            return StaticTypeEnum.INTEGER.ordinal();
        }
    },
    PLAY_MINUTE {
        @Override
        public int getId() {
            return 1;
        }

        @Override
        public String getCode() {
            return "PLAY_MINUTE";
        }

        @Override
        public int getNameId() {
            return R.string.staticUserPlayMinuteName;
        }

        @Override
        public int getTypeId() {
            return StaticTypeEnum.INTEGER.ordinal();
        }
    };

    @Inject
    ResourceHelper resourceHelper;

    @Override
    public String getName() {
        return resourceHelper.getString(getNameId(), (String) VariableEnum.STRING.getDefaultValue());
    }

    @Override
    public StaticTypeEnum getType() {
        return StaticTypeEnum.values()[getTypeId()];
    }
}
