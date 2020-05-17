package com.bolszowka.service;

import static java.util.stream.Collectors.toList;

import com.bolszowka.dto.CardDto;
import com.bolszowka.dto.CardSearchCriteria;
import com.bolszowka.mapper.CardMapper;
import com.bolszowka.repository.CardRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private final CardRepository cardRepository;
    private final CardMapper cardMapper;

    public CardService(CardRepository cardRepository, CardMapper cardMapper) {
        this.cardRepository = cardRepository;
        this.cardMapper = cardMapper;
    }

    public List<CardDto> findByProducerAndCollection(CardSearchCriteria cardSearchCriteria) {
        return cardRepository.findByProducerAndCollection(cardSearchCriteria.getProducerName(), cardSearchCriteria.getCollectionName()).stream()
            .map(cardMapper::toDto)
            .collect(toList()); //TODO try to use query projection in repo and remove mapper
    }
}
