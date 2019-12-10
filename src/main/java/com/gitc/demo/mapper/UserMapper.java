package com.gitc.demo.mapper;

import com.gitc.demo.dto.UserDto;
import com.gitc.demo.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserDto toDto(User user);
}
