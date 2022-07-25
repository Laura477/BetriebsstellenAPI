package com.db.betriebsstellen.BetriebsstellenAPI.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Betriebsstelle not found")
public class BetriebsstelleNotFoundException extends RuntimeException {

    public BetriebsstelleNotFoundException() {
    }

    public BetriebsstelleNotFoundException(String message) {
        super(message);
    }
}

