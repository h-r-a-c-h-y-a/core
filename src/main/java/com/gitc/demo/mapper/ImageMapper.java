package com.gitc.demo.mapper;

import com.gitc.demo.dto.ImageDto;
import com.gitc.demo.model.Image;
import org.mapstruct.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Mapper
public interface ImageMapper {

    ImageDto toDto(Image image) throws IOException;

    Image toEntity(MultipartFile file) throws IOException;
}
