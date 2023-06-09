package com.istad.springthymleaf.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUploadService {
    public String uploadFile(MultipartFile file) throws IOException;
}