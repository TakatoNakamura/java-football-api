package com.football.api.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.football.api.entity.PlayerInfo;
import com.football.api.util.doma.ComponentAndAutowiredDomaConfig;



/**
 */
@Dao
@ComponentAndAutowiredDomaConfig
public interface PlayerInfoDao {

    /**
     * @param playerInfoId
     * @return the PlayerInfo entity
     */
    @Select
    PlayerInfo selectById(Integer playerInfoId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(PlayerInfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(PlayerInfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(PlayerInfo entity);

    @Insert(sqlFile = true)
    int insertPlayerInfo(PlayerInfo playerInfo);

    @Select
    PlayerInfo selectPlayerInfoByName(String playerName);

    @Update(sqlFile = true)
    int updatePlayerInfoByName(String playerName, String transferClubTeam);

    @Delete(sqlFile = true)
    int deletePlayerInfo(String playerName);
}