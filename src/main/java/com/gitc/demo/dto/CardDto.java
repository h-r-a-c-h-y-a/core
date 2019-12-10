package com.gitc.demo.dto;

import com.gitc.demo.mapper.CardMapper;
import com.gitc.demo.model.Card;
import com.gitc.demo.model.EnWord;
import com.gitc.demo.model.RuWord;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
public class CardDto {

    private EnWordDto enWordDto;

    private RuWordDto ruWordDto;

    private long rating;
}
