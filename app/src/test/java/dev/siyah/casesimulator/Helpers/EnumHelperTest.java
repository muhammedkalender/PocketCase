package dev.siyah.casesimulator.Helpers;

import org.junit.Before;
import org.junit.Test;

import dev.siyah.casesimulator.Enums.Case.CaseTypeEnum;
import dev.siyah.casesimulator.Interfaces.DatabaseEnumInterface;

import static org.junit.Assert.*;

public class EnumHelperTest {
    private EnumHelper enumHelper;

    @Before
    public void setUp() {
        enumHelper = new EnumHelper();
    }

    @Test
    public void getById() {
    }

    @Test
    public void enumsToString() {
    }

    @Test
    public void enumsFromString() {
        CaseTypeEnum[] caseTypeEnums = new CaseTypeEnum[]{
                CaseTypeEnum.WEAPON_CASE
        };

        String e2s = enumHelper.enumsToString(caseTypeEnums);

        Object[] deserializeArray = enumHelper.enumsFromString(
                CaseTypeEnum.values(),
                e2s
        );

        assertEquals(CaseTypeEnum.WEAPON_CASE, deserializeArray[0]);

        assertArrayEquals(
                deserializeArray,
                caseTypeEnums
        );
    }
}