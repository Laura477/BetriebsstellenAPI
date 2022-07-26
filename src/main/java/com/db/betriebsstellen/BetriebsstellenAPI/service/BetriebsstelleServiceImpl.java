package com.db.betriebsstellen.BetriebsstellenAPI.service;

import com.db.betriebsstellen.BetriebsstellenAPI.entity.Betriebsstelle;
import com.db.betriebsstellen.BetriebsstellenAPI.repository.BetriebsstelleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BetriebsstelleServiceImpl implements BetriebsstelleService {

    @Autowired
    BetriebsstelleRepository betriebsstelleRepository;
//
//    public Betriebsstelle retrieveBetriebsstelle(String abbrev){
//        Optional<Betriebsstelle> optionalBetriebsstelle = Optional.ofNullable(betriebsstelleRepository.findByAbbrev(abbrev));
//        return optionalBetriebsstelle.orElseThrow(BetriebsstelleNotFoundException::new);
//    }

    public Betriebsstelle retrieveBetriebsstelle(String abbrev){
        return betriebsstelleRepository.findByAbbrev(abbrev);
    }


    public List<Betriebsstelle> retrieveBetriebsstellen(){
        return betriebsstelleRepository.findAll();
    }

}
