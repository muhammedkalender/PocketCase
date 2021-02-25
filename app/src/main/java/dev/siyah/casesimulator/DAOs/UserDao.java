package dev.siyah.casesimulator.DAOs;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import dev.siyah.casesimulator.Interfaces.DaoInterface;
import dev.siyah.casesimulator.Models.UserModel;

@Dao
public interface UserDao extends DaoInterface<UserModel> {
    @Query("SELECT * FROM users WHERE userId = :id")
    public UserModel get(long id);

    @Query("SELECT * FROM users")
    public List<UserModel> list();
}
