package com.gitc.demo.model;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.IOException;

@Data
@Entity(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name = "original_filename")
    private String originalFilename;
    @Column(name = "content_type")
    private String contentType;
    private long size;

    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "file_content")
    private byte[] fileContent;

    public void setFileContent(MultipartFile file) throws IOException {
        fileContent = file.getBytes();
    }
}
