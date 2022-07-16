package com.Who.sYourLeader.WYL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CandidateController {

//    public CandidateController(Candidate bookService) {
//        this.bookService = bookService;
//    }

//    private BookService bookService;

    @GetMapping("/candidate")
    public String listBooks(Model model){
//        model.addAttribute("books",bookService.getAllBooks());
        return "index";
    }
}


