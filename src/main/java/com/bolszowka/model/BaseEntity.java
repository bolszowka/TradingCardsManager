package com.bolszowka.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(of = {"uuid"})
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //TODO zmienic na sequence
    private Long id;

    @CreationTimestamp
    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @UpdateTimestamp
    @Column(name = "modification_date")
    private LocalDateTime modificationDate;

    @Version
    private Integer version;

    private String uuid = UUID.randomUUID().toString();
}
