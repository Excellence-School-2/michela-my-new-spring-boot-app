package it.ntt.hellospringboot.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ntt.hellospringboot.repository.BookRepository;

@Controller
public class BookController {

    
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @RequestMapping("/books")
            //nel model metto chiave-valore er ogni attributo da popolare
    public String getBooks(Model model){   //lista di libri
        model.addAttribute("books",  bookRepository.findAll());
        return "books";
    }


    @Scheduled(fixedDelay = 3000)
    public void printHello(){
        System.out.println("Hello!");
    }

   
}
