package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.klef.jfsd.exam.service.CommentsService;
import java.util.List;
import com.klef.jfsd.exam.model.Comment;


@RestController
@RequestMapping("/api") 
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @GetMapping("/comments")
    public List<Comment> getAllComments() {
        List<Comment> comments = commentsService.fetchAllComments();
        if (comments.isEmpty()) {
            throw new RuntimeException("No comments found");
        }
        return comments;
    }

}
