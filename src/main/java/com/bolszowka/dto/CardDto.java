package com.bolszowka.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {

    private Long id;
    private String number;
    private String name;
    private String clubCountry;
    private String type;
}
