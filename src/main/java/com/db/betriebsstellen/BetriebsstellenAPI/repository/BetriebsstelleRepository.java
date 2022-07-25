package com.db.betriebsstellen.BetriebsstellenAPI.repository;

import com.db.betriebsstellen.BetriebsstellenAPI.entity.Betriebsstelle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BetriebsstelleRepository extends CrudRepository<Betriebsstelle, Integer> {
    @Query("select * from Betriebsstelle b where b.abbrev=:abbrev")
    String findBetriebsstelleByAbbrev(String abbrev); //TODO check for duplicates
}