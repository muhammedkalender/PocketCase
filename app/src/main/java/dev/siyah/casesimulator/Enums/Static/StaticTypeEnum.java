package dev.siyah.casesimulator.Enums.Static;

import androidx.annotation.NonNull;
import androidx.room.Ignore;

import dev.siyah.casesimulator.Enums.Variable.VariableEnum;
import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;

public enum StaticTypeEnum implements DatabaseEnumInterface {
    INTEGER {
        @Override
        public int getId() {
            return 0;
        }

        public Object getDefaultValue() {
            return VariableEnum.INTEGER.getDefaultValue();
        }
    },
    FLOAT {
        @Override
        public int getId() {
            return 1;
        }

        public Object getDefaultValue() {
            return VariableEnum.FLOAT.getDefaultValue();
        }
    },
    LONG {
        @Override
        public int getId() {
            return 2;
        }

        public Object getDefaultValue() {
            return VariableEnum.LONG.getDefaultValue();
        }
    },
    STRING {
        @Override
        public int getId() {
            return 3;
        }

        @NonNull
        public Object getDefaultValue() {
            return VariableEnum.STRING.getDefaultValue();
        }
    };

    @Ignore
    abstract public Object getDefaultValue();
}
