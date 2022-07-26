package com.db.betriebsstellen.BetriebsstellenAPI.web;

import com.db.betriebsstellen.BetriebsstellenAPI.entity.Betriebsstelle;
import com.db.betriebsstellen.BetriebsstellenAPI.service.BetriebsstelleService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ApiResponses(value = {
        @ApiResponse(code=400, message = "This is a bad request, please follow the API documentation for the proper request format."),
        @ApiResponse(code=401, message = "Unauthorized access."),
        @ApiResponse(code=404, message = "The requested resource was not found. If you were looking for breed by id, make sure to enter a valid id (integer between 1 and 5)."),
        @ApiResponse(code=500, message = "This is an internal server error.")
})
public class BetriebsstelleController {
    private BetriebsstelleService betriebsstelleService;

    @Autowired
    public void setBetriebsstelleService(BetriebsstelleService betriebsstelleService) {
        this.betriebsstelleService = betriebsstelleService;
    }

    @GetMapping(value="/betriebsstellen", produces = "application/json" )
    public ResponseEntity<List<Betriebsstelle>> getAllBetriebsstellen(){
        List<Betriebsstelle> list = betriebsstelleService.retrieveBetriebsstellen();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

//    @GetMapping(value="/betriebsstellen/{abbrev}", produces = "application/json")
//    public ResponseEntity<Betriebsstelle> getBetriebsstelleByAbbrev(@PathVariable("abbrev") String abbrev){
//        Betriebsstelle betriebsstelle = betriebsstelleService.retrieveBetriebsstelle(abbrev);
//        return new ResponseEntity<>(betriebsstelle, HttpStatus.OK);
//    }

    @GetMapping(value="/betriebsstellen/{abbrev}", produces = "application/json")
    public ResponseEntity<Betriebsstelle> getBetriebsstelleByAbbrev(@PathVariable String abbrev){
        String abbrev_upper = abbrev.toUpperCase();
        return new ResponseEntity<>(betriebsstelleService.retrieveBetriebsstelle(abbrev_upper), HttpStatus.OK);
    }



}