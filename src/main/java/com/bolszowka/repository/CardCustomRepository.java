package com.bolszowka.repository;

import com.bolszowka.model.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CardCustomRepository {

    @Query(value = "SELECT c FROM Card c " +
            "INNER JOIN c.collection col INNER JOIN col.producer p " +
            "WHERE p.name = :producer_name and col.name = :collection_name")
    List<Card> findByProducerAndCollection(@Param("producer_name") String producerName, @Param("collection_name") String collectionName);
}
