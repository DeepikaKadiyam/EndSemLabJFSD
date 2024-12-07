package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CommentsService {
    private static final Logger logger = LoggerFactory.getLogger(CommentsService.class);

    public List<Comment> fetchAllComments() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/comments";
        try {
            return Arrays.asList(restTemplate.getForObject(url, Comment[].class));
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch comments", e);
        }
    }

}

