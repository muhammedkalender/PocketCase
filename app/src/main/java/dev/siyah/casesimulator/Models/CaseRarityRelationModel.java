package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Item.RarityEnum;

//TODO
@Entity(tableName = "caseRarityRelations")
public class CaseRarityRelationModel {
    @ColumnInfo(name = "caseRarityRelationId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "caseRarityRelationCase")
    public CaseModel container;

    @ColumnInfo(name = "caseRarityRelationRarity")
    public RarityEnum rarity;
}
