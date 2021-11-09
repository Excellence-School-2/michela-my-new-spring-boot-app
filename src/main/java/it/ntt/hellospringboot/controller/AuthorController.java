package it.ntt.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ntt.hellospringboot.repository.AuthorRepository;
@Controller
public class AuthorController  {
    
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository=authorRepository;
    }

    @RequestMapping("/authors") //così sa che deve rispondere ad una richiesta
    public String getAuthor(Model model){
        model.addAttribute("author_list", authorRepository.findAll()); 
        // Author_List va messo in html quando faccio la ricerca nella lista
        //ovvero , in authors.html-->  <tr th:each="author : ${author_list}">
        return "authors";
    }
}
