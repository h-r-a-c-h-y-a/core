package com.gitc.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @ManyToOne
    private EnWord enWord;

    @ManyToOne
    private RuWord ruWord;

    private long rating;
}
