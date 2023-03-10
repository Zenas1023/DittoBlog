package com.ditto.controller;

import com.ditto.domain.ResponseResult;
import com.ditto.enums.AppHttpCodeEnum;
import com.ditto.exception.SystemException;
import com.ditto.service.UploadService;
import com.ditto.vo.ResultVo;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.Objects;

@RestController
public class UploadController {

    private UploadService uploadService;


    @PostMapping("/upload")
    public void uploadFileToGitHub(MultipartFile img) throws IOException {
        if (!Objects.requireNonNull(img.getOriginalFilename()).endsWith(".png")){
            throw new SystemException(AppHttpCodeEnum.FILE_TYPE_ERROR);
        }else {

        }
        uploadService.upload(img);
    }
}
