package dev.siyah.casesimulator.Helpers;

import org.junit.Test;

import dev.siyah.casesimulator.Enums.Money.CurrencyEnum;

import static org.junit.Assert.*;

public class MoneyHelperTest {
    @Test
    public void getFormattedWithSymbol_isCorrect() {
        MoneyHelper moneyHelper = new MoneyHelper();
        assertEquals("100.25 $", moneyHelper.getFormattedWithSymbol(CurrencyEnum.USD, 10025L));
    }

    @Test
    public void getFormattedWithCode_isCorrect() {
        MoneyHelper moneyHelper = new MoneyHelper();
        assertEquals("100.25 USD", moneyHelper.getFormattedWithCode(CurrencyEnum.USD, 10025L));
    }

    @Test
    public void getMultiplier_isCorrect(){
        MoneyHelper moneyHelper = new MoneyHelper();
        assertEquals(0, moneyHelper.getMultiplier(100L,0L));
        assertEquals(100L, moneyHelper.getMultiplier(100L,1L));
        assertEquals(200L, moneyHelper.getMultiplier(100L,2L));
    }
}
