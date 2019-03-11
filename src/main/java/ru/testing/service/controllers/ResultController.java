package ru.testing.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.testing.service.forms.UrlForm;
import ru.testing.service.repositories.UrlRepository;

@Controller
public class ResultController {

    @Autowired
    private UrlRepository urlRepository;

    @GetMapping("/result")
    public String getResultPage(ModelMap model){
        model.addAttribute("urlsFromDataBase", urlRepository.findAll());
        System.out.println(urlRepository.findAll().get(0).toString());
        return "result";
    }

}
