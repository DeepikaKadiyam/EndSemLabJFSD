package com.klef.jfsd.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.klef.jfsd.exam.model.Comment;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/comments")
    public List<Comment> fetchAllComments() {
        return Arrays.asList(
            new Comment(1, "Test User", "test@example.com", "This is a test comment"),
            new Comment(2, "Another User", "another@example.com", "This is another test comment")
        );
    }
}
