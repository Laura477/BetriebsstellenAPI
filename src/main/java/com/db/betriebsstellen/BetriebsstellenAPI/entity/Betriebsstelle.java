package com.db.betriebsstellen.BetriebsstellenAPI.entity;

import javax.persistence.*;

/**
 * Betriebsstelle Entity with all the attributes of the csv file and getter and setter and default constructor.
 */
@Entity
public class Betriebsstelle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String abbrev;
    private String name_lang;
    private String name_kurz;
    private String typ_kurz;
    private String typ_lang;
    private String status;
    private String location_code;
    private String niederlassung;
    private String regionalbereich;
    private String valid_from;
    private String valid_till;
    private String last_change;

//    public Betriebsstelle(Long id, String abbrev, String name, String kurzname, String typk, String location_code, String typl, ) {
//        this.id = id;
//        this.abbrev = abbrev;
//        this.name = name;
//        this.kurzname = kurzname;
//        this.typk = typk;
//    }

    public Betriebsstelle() {
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

    public String getName_lang() {
        return name_lang;
    }

    public void setName_lang(String name_lang) {
        this.name_lang = name_lang;
    }

    public String getName_kurz() {
        return name_kurz;
    }

    public void setName_kurz(String name_kurz) {
        this.name_kurz = name_kurz;
    }

    public String getTyp_kurz() {
        return typ_kurz;
    }

    public void setTyp_kurz(String typ_kurz) {
        this.typ_kurz = typ_kurz;
    }

    public String getTyp_lang() {
        return typ_lang;
    }

    public void setTyp_lang(String typ_lang) {
        this.typ_lang = typ_lang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation_code() {
        return location_code;
    }

    public void setLocation_code(String location_code) {
        this.location_code = location_code;
    }

    public String getNiederlassung() {
        return niederlassung;
    }

    public void setNiederlassung(String niederlassung) {
        this.niederlassung = niederlassung;
    }

    public String getRegionalbereich() {
        return regionalbereich;
    }

    public void setRegionalbereich(String regionalbereich) {
        this.regionalbereich = regionalbereich;
    }

    public String getValid_from() {
        return valid_from;
    }

    public void setValid_from(String valid_from) {
        this.valid_from = valid_from;
    }

    public String getValid_till() {
        return valid_till;
    }

    public void setValid_till(String valid_till) {
        this.valid_till = valid_till;
    }

    public String getLast_change() {
        return last_change;
    }

    public void setLast_change(String last_change) {
        this.last_change = last_change;
    }

}
