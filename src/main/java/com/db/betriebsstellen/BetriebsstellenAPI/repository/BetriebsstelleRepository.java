package com.db.betriebsstellen.BetriebsstellenAPI.repository;

import com.db.betriebsstellen.BetriebsstellenAPI.entity.Betriebsstelle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetriebsstelleRepository extends CrudRepository<Betriebsstelle, String> {
    @Query("select * from Betriebsstelle b where b.abbrev=:abbrev")
    Betriebsstelle findBetriebsstelleByAbbrev(String abbrev); //TODO check for duplicates
}