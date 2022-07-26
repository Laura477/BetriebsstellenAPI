package com.db.betriebsstellen.BetriebsstellenAPI.repository;

import com.db.betriebsstellen.BetriebsstellenAPI.entity.Betriebsstelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BetriebsstelleRepository extends JpaRepository<Betriebsstelle, Long> {
    @Query(value = "select * from Betriebsstelle b where b.abbrev= ?1", nativeQuery = true)
    Betriebsstelle findByAbbrev(String abbrev); //checked externally that abbrev is unique
}