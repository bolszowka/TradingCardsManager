package com.bolszowka.controller;

import com.bolszowka.dto.CardDto;
import com.bolszowka.dto.CardSearchCriteria;
import com.bolszowka.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/cards")
    public List<CardDto> findCardsInCollection(@RequestBody CardSearchCriteria cardSearchCriteria) {
        return cardService.findByProducerAndCollection(cardSearchCriteria);
    }
}
