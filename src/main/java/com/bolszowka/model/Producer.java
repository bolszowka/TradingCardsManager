package com.bolszowka.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "producers")
@Getter
@Setter
public class Producer extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "producer")
    private Set<Collection> collections;
}
