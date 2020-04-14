package com.bolszowka.mapper;

import com.bolszowka.dto.CardDto;
import com.bolszowka.model.Card;
import org.springframework.stereotype.Component;

@Component
public class CardMapper implements GenericMapper<Card, CardDto> {

    @Override
    public Card toEntity(CardDto cardDto) {
        Card card = new Card();
        card.setId(cardDto.getId());
        card.setNumber(cardDto.getNumber());
        card.setName(cardDto.getName());
        card.setClubCountry(cardDto.getClubCountry());
        card.setType(cardDto.getType());
        return card;
    }

    @Override
    public CardDto toDto(Card card) {
        CardDto cardDto = new CardDto();
        cardDto.setId(card.getId());
        cardDto.setNumber(card.getNumber());
        cardDto.setName(card.getName());
        cardDto.setClubCountry(card.getClubCountry());
        cardDto.setType(card.getType());
        return cardDto;
    }
}
