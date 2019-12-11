package com.gitc.demo.dto;

import lombok.Data;


@Data
public class ImageDto {

    private String name;

    private String originalFilename;

    private String contentType;
    private long size;

    private byte[] fileContent;
}
