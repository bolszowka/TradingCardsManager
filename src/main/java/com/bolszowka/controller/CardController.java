package com.bolszowka.controller;

import com.bolszowka.dto.CardDto;
import com.bolszowka.dto.CardSearchCriteria;
import com.bolszowka.model.Card;
import com.bolszowka.service.CardService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cards")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    // hasRole('ROLE_')  hasAnyRole('ROLE_')  hasAuthority('permission')  hasAnyAuthority('permission') //TODO remove

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public List<CardDto> findCardsInCollection(@RequestBody CardSearchCriteria cardSearchCriteria) { //TODO request body w get - zamienic na Specification
        return cardService.findByProducerAndCollection(cardSearchCriteria);
    }

    @PostMapping()
    @PreAuthorize("hasAuthority('card:write')")
    public String insertCard(@RequestBody Card cardDto) {
        return "TODO"; //TODO
    }
}
