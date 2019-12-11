package com.gitc.demo.service;

import com.gitc.demo.model.Image;

import java.util.Optional;

public interface ImageService {

    Optional<Image> getImage(long id);

    Optional<Image> saveImage(Image image);
}
