package dev.siyah.casesimulator.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import dev.siyah.casesimulator.Enums.Money.CurrencyEnum;
import dev.siyah.casesimulator.Enums.ProfileRank.ProfileRankEnum;
import dev.siyah.casesimulator.Enums.SkillGroup.SkillGroupEnum;
import lombok.NonNull;

@Entity(tableName = "users")
public class UserModel {
    @ColumnInfo(name = "userId")
    @PrimaryKey(autoGenerate = true)
    public long id;

    @NonNull
    @ColumnInfo(name = "userAvatar")
    public String avatar;

    @NonNull
    @ColumnInfo(name = "userNick")
    public String userName;

    @NonNull
    @ColumnInfo(name = "userFirstName")
    public String firstName;

    @NonNull
    @ColumnInfo(name = "userLastName")
    public String lastName;

    @ColumnInfo(name = "userBalance")
    public long balance = 0L;

    @NonNull
    @ColumnInfo(name = "userCurrency")
    public CurrencyEnum currency = CurrencyEnum.USD;

    @ColumnInfo(name = "userSkillGroupPoint")
    public long skillGroupPoint = 0L;

    @NonNull
    @ColumnInfo(name = "userSkillGroup")
    public SkillGroupEnum skillGroup = SkillGroupEnum.NO_RANKED;

    @ColumnInfo(name = "userProfileRankPoint")
    public long profileRankPoint = 0L;

    @NonNull
    @ColumnInfo(name = "userProfileRank")
    public ProfileRankEnum profileRank = ProfileRankEnum.RECRUIT;

    @ColumnInfo(name = "userActive")
    public boolean active = true;
}
