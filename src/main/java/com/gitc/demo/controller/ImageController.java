package com.gitc.demo.controller;

import com.gitc.demo.dto.ImageDto;
import com.gitc.demo.mapper.ImageMapper;
import com.gitc.demo.model.Image;
import com.gitc.demo.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;
    private final ImageMapper imageMapper;

    @GetMapping("/images/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) throws IOException {
        Image image = imageService.getImage(id).orElseThrow(RuntimeException::new);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("filename", image.getOriginalFilename())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(image.getFileContent());
    }

    @PostMapping("/images")
    public ResponseEntity<?> saveImage(@RequestParam("file") MultipartFile file) throws IOException {
        Image image = imageMapper.toEntity(file);
        image.setFileContent(file);
        image = imageService.saveImage(image).orElseThrow(RuntimeException::new);
        ImageDto imageDto = imageMapper.toDto(image);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("filename", image.getOriginalFilename())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(image.getFileContent());
    }
}
