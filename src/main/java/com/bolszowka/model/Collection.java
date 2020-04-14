package com.bolszowka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "collections")
@Getter
@Setter
public class Collection extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "collection")
    Set<Card> cards;

    @ManyToOne
    private Producer producer;
}
