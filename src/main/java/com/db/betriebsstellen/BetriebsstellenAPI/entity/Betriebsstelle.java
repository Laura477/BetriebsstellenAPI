package com.db.betriebsstellen.BetriebsstellenAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Betriebsstelle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String abbrev;
    private String name;
    private String kurzname; //renamed from "short"
    private String type;
    private String status;
    private String locationCode;
    private String UIC;
    private int RB;
    private String validFrom;
    private String validTill;
    private boolean timeTableRelevant;
    private boolean borderStation;

    public Betriebsstelle(long id, String abbrev, String name, String kurzname, String type) {
        this.id = id;
        this.abbrev = abbrev;
        this.name = name;
        this.kurzname = kurzname;
        this.type = type;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKurzname() {
        return kurzname;
    }

    public void setKurzname(String kurzname) {
        this.kurzname = kurzname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getUIC() {
        return UIC;
    }

    public void setUIC(String UIC) {
        this.UIC = UIC;
    }

    public int getRB() {
        return RB;
    }

    public void setRB(int RB) {
        this.RB = RB;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public boolean isTimeTableRelevant() {
        return timeTableRelevant;
    }

    public void setTimeTableRelevant(boolean timeTableRelevant) {
        this.timeTableRelevant = timeTableRelevant;
    }

    public boolean isBorderStation() {
        return borderStation;
    }

    public void setBorderStation(boolean borderStation) {
        this.borderStation = borderStation;
    }
}
