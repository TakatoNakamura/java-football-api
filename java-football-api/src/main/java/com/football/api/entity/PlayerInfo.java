package com.football.api.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 選手情報テーブル
 */
@Entity
@Table(name = "player_info")
public class PlayerInfo {

    /** 選手情報ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_info_id")
    Integer playerInfoId;

    /** 選手名 */
    @Column(name = "player_name")
    String playerName;

    /** 年齢 */
    @Column(name = "age")
    Integer age;

    /** 国 */
    @Column(name = "country")
    String country;

    /** 所属チーム */
    @Column(name = "current_club_team")
    String currentClubTeam;

    /** 生年月日(年) */
    @Column(name = "date_of_birth_year")
    String dateOfBirthYear;

    /** 生年月日(月) */
    @Column(name = "date_of_birth_month")
    String dateOfBirthMonth;

    /** 生年月日(日) */
    @Column(name = "date_of_birth_day")
    String dateOfBirthDay;

    /** 登録日時 */
    @Column(name = "current_timestamp")
    LocalDateTime currentTimestamp;

    /** 更新日時 */
    @Column(name = "update_timestamp")
    LocalDateTime updateTimestamp;

    /** 
     * Returns the playerInfoId.
     * 
     * @return the playerInfoId
     */
    public Integer getPlayerInfoId() {
        return playerInfoId;
    }

    /** 
     * Sets the playerInfoId.
     * 
     * @param playerInfoId the playerInfoId
     */
    public void setPlayerInfoId(Integer playerInfoId) {
        this.playerInfoId = playerInfoId;
    }

    /** 
     * Returns the playerName.
     * 
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /** 
     * Sets the playerName.
     * 
     * @param playerName the playerName
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /** 
     * Returns the age.
     * 
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /** 
     * Sets the age.
     * 
     * @param age the age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /** 
     * Returns the country.
     * 
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /** 
     * Sets the country.
     * 
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** 
     * Returns the currentClubTeam.
     * 
     * @return the currentClubTeam
     */
    public String getCurrentClubTeam() {
        return currentClubTeam;
    }

    /** 
     * Sets the currentClubTeam.
     * 
     * @param currentClubTeam the currentClubTeam
     */
    public void setCurrentClubTeam(String currentClubTeam) {
        this.currentClubTeam = currentClubTeam;
    }

    /** 
     * Returns the dateOfBirthYear.
     * 
     * @return the dateOfBirthYear
     */
    public String getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    /** 
     * Sets the dateOfBirthYear.
     * 
     * @param dateOfBirthYear the dateOfBirthYear
     */
    public void setDateOfBirthYear(String dateOfBirthYear) {
        this.dateOfBirthYear = dateOfBirthYear;
    }

    /** 
     * Returns the dateOfBirthMonth.
     * 
     * @return the dateOfBirthMonth
     */
    public String getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    /** 
     * Sets the dateOfBirthMonth.
     * 
     * @param dateOfBirthMonth the dateOfBirthMonth
     */
    public void setDateOfBirthMonth(String dateOfBirthMonth) {
        this.dateOfBirthMonth = dateOfBirthMonth;
    }

    /** 
     * Returns the dateOfBirthDay.
     * 
     * @return the dateOfBirthDay
     */
    public String getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    /** 
     * Sets the dateOfBirthDay.
     * 
     * @param dateOfBirthDay the dateOfBirthDay
     */
    public void setDateOfBirthDay(String dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    /** 
     * Returns the currentTimestamp.
     * 
     * @return the currentTimestamp
     */
    public LocalDateTime getCurrentTimestamp() {
        return currentTimestamp;
    }

    /** 
     * Sets the currentTimestamp.
     * 
     * @param currentTimestamp the currentTimestamp
     */
    public void setCurrentTimestamp(LocalDateTime currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }

    /** 
     * Returns the updateTimestamp.
     * 
     * @return the updateTimestamp
     */
    public LocalDateTime getUpdateTimestamp() {
        return updateTimestamp;
    }

    /** 
     * Sets the updateTimestamp.
     * 
     * @param updateTimestamp the updateTimestamp
     */
    public void setUpdateTimestamp(LocalDateTime updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}