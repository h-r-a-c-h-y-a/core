package com.gitc.demo.mapper;

import com.gitc.demo.dto.EnWordDto;
import com.gitc.demo.dto.UserDto;
import com.gitc.demo.model.EnWord;
import com.gitc.demo.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface EnWordMapper {
    EnWordDto toDto(EnWord enWord);
}
