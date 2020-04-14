package com.bolszowka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cards")
@Getter
@Setter
public class Card extends BaseEntity {

    private String number;
    private String name;
    private String clubCountry;
    private String type;

    @ManyToOne
    private Collection collection;
}
