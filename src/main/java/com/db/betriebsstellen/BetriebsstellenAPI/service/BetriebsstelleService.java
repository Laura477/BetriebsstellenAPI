package com.db.betriebsstellen.BetriebsstellenAPI.service;

import com.db.betriebsstellen.BetriebsstellenAPI.entity.Betriebsstelle;

import java.util.List;

public interface BetriebsstelleService {
    Betriebsstelle retrieveBetriebsstelle(String abbrev);

    List<Betriebsstelle> retrieveBetriebsstellen();
}
