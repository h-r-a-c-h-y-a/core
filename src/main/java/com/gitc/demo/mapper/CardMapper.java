package com.gitc.demo.mapper;

import com.gitc.demo.dto.CardDto;
import com.gitc.demo.dto.RuWordDto;
import com.gitc.demo.model.Card;
import com.gitc.demo.model.RuWord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CardMapper {

    @Mapping(source = "enWord", target = "enWordDto")
    @Mapping(source = "ruWord", target = "ruWordDto")
    CardDto toDto(Card card);
}
