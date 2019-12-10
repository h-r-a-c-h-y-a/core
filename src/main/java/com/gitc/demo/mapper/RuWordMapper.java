package com.gitc.demo.mapper;

import com.gitc.demo.dto.RuWordDto;
import com.gitc.demo.model.RuWord;
import org.mapstruct.Mapper;

@Mapper
public interface RuWordMapper {
    RuWordDto toDto(RuWord ruWord);
}
