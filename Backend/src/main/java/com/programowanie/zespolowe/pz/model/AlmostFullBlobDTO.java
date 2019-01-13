package com.programowanie.zespolowe.pz.model;

import com.programowanie.zespolowe.pz.entities.User;

import java.math.BigDecimal;

public class AlmostFullBlobDTO {

    private int blobid;
    private String name;
    private String description;
    private String localizationUF;
    private BigDecimal latitude;
    private BigDecimal longtitude;
    private String userName;
    private int userId;

    public AlmostFullBlobDTO(int blobid, String name, String description, String localizationUF, BigDecimal latitude, BigDecimal longtitude, String userName, int userId) {
        this.blobid = blobid;
        this.name = name;
        this.description = description;
        this.localizationUF = localizationUF;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.userName = userName;
        this.userId = userId;
    }

    public AlmostFullBlobDTO(){
    }

    public int getBlobid() {
        return blobid;
    }

    public void setBlobid(int blobid) {
        this.blobid = blobid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalizationUF() {
        return localizationUF;
    }

    public void setLocalizationUF(String localizationUF) {
        this.localizationUF = localizationUF;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(BigDecimal longtitude) {
        this.longtitude = longtitude;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
