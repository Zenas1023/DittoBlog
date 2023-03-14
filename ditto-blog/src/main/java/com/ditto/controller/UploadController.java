package com.ditto.controller;

import com.ditto.constants.MyMediaType;
import com.ditto.domain.ResponseResult;
import com.ditto.enums.AppHttpCodeEnum;
import com.ditto.exception.SystemException;
import com.ditto.service.UploadService;
import com.ditto.utils.PathUtils;
import com.ditto.vo.ResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.Objects;

@RestController
public class UploadController {
    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);
    @Resource
    private UploadService uploadService;


    @PostMapping("/upload")
    public ResponseResult<?> uploadFileToGitHub(MultipartFile img) throws IOException {
        //uploadService.uploadFileToGithub(img);
        String filePath = PathUtils.generateFilePath(Objects.requireNonNull(img.getOriginalFilename()));

        String url = String.format("https://api.github.com/repos/%s/%s/contents/%s", "Zenas1023", "imgBase", filePath);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", "token " + "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");
        String encodedContent = Base64.getEncoder().encodeToString(img.getBytes());
        String body = String.format("{\"message\": \"Adding %s\", \"content\": \"%s\"}", filePath, encodedContent);
        HttpEntity<String> entity = new HttpEntity<>(body, headers);
        ResponseEntity<Object> response = new RestTemplate().exchange(url, HttpMethod.PUT, entity, Object.class);
        if (response.getStatusCode() == HttpStatus.CREATED) {
            System.out.println("File uploaded successfully!");
            return ResponseResult.okResult();
        } else {
            System.out.println("File upload failed with status code: " + response.getStatusCodeValue());
            return ResponseResult.errorResult(AppHttpCodeEnum.SYSTEM_ERROR);
        }
    }
}
