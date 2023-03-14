package com.ditto.service.impl;

import com.ditto.enums.AppHttpCodeEnum;
import com.ditto.exception.SystemException;
import com.ditto.service.UploadService;
import com.ditto.utils.PathUtils;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.Objects;

@Service
public class UploadServiceImpl implements UploadService {

    @Override
    public void upload(MultipartFile img,String filePath) throws IOException {
        String url = String.format("https://api.github.com/repos/%s/%s/contents/%s", "Zenas1023", "imgBase", filePath);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", "token " + "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");
        String encodedContent = Base64.getEncoder().encodeToString(img.getBytes());
        String body = String.format("{\"message\": \"Adding %s\", \"content\": \"%s\"}", filePath, encodedContent);
        HttpEntity<String> entity = new HttpEntity<>(body, headers);
        ResponseEntity<String> response = new RestTemplate().exchange(url, HttpMethod.PUT, entity, String.class);
        if (response.getStatusCode() == HttpStatus.CREATED) {
            System.out.println("File uploaded successfully!");
        } else {
            System.out.println("File upload failed with status code: " + response.getStatusCodeValue());
        }
    }

    @Override
    public void uploadFileToGithub(MultipartFile img) throws IOException {
        /*if (!Objects.requireNonNull(img.getOriginalFilename()).endsWith(".png")) {
            throw new SystemException(AppHttpCodeEnum.FILE_TYPE_ERROR);
        }*/
        String filePath = PathUtils.generateFilePath(Objects.requireNonNull(img.getOriginalFilename()));
        upload(img,filePath);
    }
}