package dev.siyah.casesimulator.Enums.Variable;

public enum VariableEnum {
    FLOAT {
        @Override
        public Object getDefaultValue() {
            return 0f;
        }
    },
    INTEGER {
        @Override
        public Object getDefaultValue() {
            return 0;
        }
    },
    LONG {
        @Override
        public Object getDefaultValue() {
            return 0L;
        }
    },
    STRING {
        @Override
        public Object getDefaultValue() {
            return "-";
        }
    };

    abstract public Object getDefaultValue();
}
