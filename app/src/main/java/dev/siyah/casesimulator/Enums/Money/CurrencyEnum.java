package dev.siyah.casesimulator.Enums.Money;

import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;
import dev.siyah.casesimulator.Interfaces.IdentifiableEnumInterface;

public enum CurrencyEnum implements DatabaseEnumInterface, IdentifiableEnumInterface {
    USD{
        @Override
        public int getId(){
            return 0;
        }

        @Override
        public int getDigits() {
            return 2;
        }

        @Override
        public long getAwardedVideoAmount() {
            return 5000L;
        }

        @Override
        public String getCode() {
            return "USD";
        }

        @Override
        public String getSymbol() {
            return "$";
        }
    };

    abstract public int getDigits();
    abstract public long getAwardedVideoAmount();
    abstract public String getCode();
    abstract public String getSymbol();
}
