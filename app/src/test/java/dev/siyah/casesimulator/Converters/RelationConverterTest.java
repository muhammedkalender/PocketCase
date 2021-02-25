package dev.siyah.casesimulator.Converters;

import org.junit.Before;
import org.junit.Test;

import dev.siyah.casesimulator.Enums.Item.ComponentEnum;
import dev.siyah.casesimulator.Enums.Item.ConditionEnum;
import dev.siyah.casesimulator.Enums.Item.RarityEnum;

import static org.junit.Assert.*;

public class RelationConverterTest {
    private RelationConverter relationConverter;

    @Before
    public void setUp(){
        this.relationConverter = new RelationConverter();
    }

    @Test
    public void casePossibleRaritiesToString() {
        RarityEnum[] rarityEnums = new RarityEnum[]{
                RarityEnum.COMMON,
                RarityEnum.LEGENDARY
        };

        assertArrayEquals(
                rarityEnums,
                relationConverter.casePossibleRaritiesFromString(
                        relationConverter.casePossibleRaritiesToString(rarityEnums)
                )
        );
    }

    @Test
    public void casePossibleRaritiesFromString() {
        assertArrayEquals(new RarityEnum[]{}, relationConverter.casePossibleRaritiesFromString(""));
    }

    @Test
    public void skinPossibleComponentsToString() {
        ComponentEnum[] componentEnums = new ComponentEnum[]{
                ComponentEnum.NORMAL,
                ComponentEnum.STAT_TRAK
        };

        assertArrayEquals(
                componentEnums,
                relationConverter.skinPossibleComponentsFromString(
                        relationConverter.skinPossibleComponentsToString(componentEnums)
                )
        );
    }

    @Test
    public void skinPossibleComponentsFromString() {
        assertArrayEquals(
                new RarityEnum[]{},
                relationConverter.skinPossibleComponentsFromString("")
        );
    }

    @Test
    public void skinPossibleConditionsToString() {
        assertArrayEquals(
                new ComponentEnum[]{},
                relationConverter.skinPossibleComponentsFromString(
                        relationConverter.skinPossibleConditionsToString(null)
                )
        );

        ConditionEnum[] conditionEnums = new ConditionEnum[]{
                ConditionEnum.FACTORY_NEW,
                ConditionEnum.MINIMAL_WEAR
        };

        assertArrayEquals(
                conditionEnums,
                relationConverter.skinPossibleConditionsFromString(
                        relationConverter.skinPossibleConditionsToString(conditionEnums)
                )
        );
    }

    @Test
    public void skinPossibleConditionsFromString() {
        assertArrayEquals(
                new ConditionEnum[0],
                relationConverter.skinPossibleConditionsFromString("")
        );
    }
}