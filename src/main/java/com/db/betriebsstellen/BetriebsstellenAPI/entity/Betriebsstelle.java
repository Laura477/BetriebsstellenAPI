package com.db.betriebsstellen.BetriebsstellenAPI.entity;

import javax.persistence.*;

@Entity
public class Betriebsstelle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String abbrev;
    private String name;
    private String kurzname; //renamed from "short"
    private String typk;

    private String typl;

    private String status;
    private String location_code;
    private String niederlassung;
    private String regionalbereich;
    private String valid_from;
    private String valid_till;
    private String last_change;

    public Betriebsstelle(long id, String abbrev, String name, String kurzname, String typk) {
        this.id = id;
        this.abbrev = abbrev;
        this.name = name;
        this.kurzname = kurzname;
        this.typk = typk;
    }

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

    public String getTypk() {
        return typk;
    }

    public void setTypk(String typk) {
        this.typk = typk;
    }

    public String getTypl() {
        return typl;
    }

    public void setTypl(String typl) {
        this.typl = typl;
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
