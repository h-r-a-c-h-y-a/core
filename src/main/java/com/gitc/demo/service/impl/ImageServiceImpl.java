package com.gitc.demo.service.impl;

import com.gitc.demo.model.Image;
import com.gitc.demo.repository.ImageRepository;
import com.gitc.demo.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository repository;

    @Override
    public Optional<Image> getImage(long id) {
        return repository.getById(id);
    }

    @Override
    public Optional<Image> saveImage(Image image) {
        return Optional.of(repository.save(image));
    }
}
