package com.ditto.service;


import com.ditto.domain.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {

    void upload(MultipartFile img) throws IOException;
}
