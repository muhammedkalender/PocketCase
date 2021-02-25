package dev.siyah.casesimulator.Helpers;

import androidx.annotation.NonNull;

import javax.inject.Inject;

import dev.siyah.casesimulator.Enums.Money.CurrencyEnum;

public class MoneyHelper {
    @Inject
    public MoneyHelper() {
    }

    //region Format

    @NonNull
    public String getFormattedWithSymbol(@NonNull CurrencyEnum currencyEnum, long amount) {
        String strAmount = String.valueOf(amount);

        return String.format(
                "%1$s.%2$s %3$s",
                strAmount.substring(0, strAmount.length() - currencyEnum.getDigits()),
                strAmount.substring(strAmount.length() - currencyEnum.getDigits()),
                currencyEnum.getSymbol()
        );
    }

    @NonNull
    public String getFormattedWithCode(@NonNull CurrencyEnum currencyEnum, long amount) {
        String strAmount = String.valueOf(amount);

        return String.format(
                "%1$s.%2$s %3$s",
                strAmount.substring(0, strAmount.length() - currencyEnum.getDigits()),
                strAmount.substring(strAmount.length() - currencyEnum.getDigits()),
                currencyEnum.getCode()
        );
    }

    //endregion

    //region Actions

    public long getMultiplier(long amount, float multiplier) {
        if (amount == 0 || multiplier == 0) {
            return 0;
        }

        return (long) (amount * multiplier);
    }

    //endregion
}
