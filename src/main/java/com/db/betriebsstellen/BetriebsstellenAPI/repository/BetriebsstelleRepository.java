package com.db.betriebsstellen.BetriebsstellenAPI.repository;

import com.db.betriebsstellen.BetriebsstellenAPI.entity.Betriebsstelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface repository with query for getting resource by abbreviation *
 */
@Repository
public interface BetriebsstelleRepository extends JpaRepository<Betriebsstelle, Long> {
    @Query(value = "select * from Betriebsstelle b where b.abbrev= ?1", nativeQuery = true)
    Betriebsstelle findByAbbrev(String abbrev); //abbrev is unique, so result will always be one Betriebsstelle
}