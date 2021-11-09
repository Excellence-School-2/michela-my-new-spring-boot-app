package it.ntt.hellospringboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;
    private String surname;

    //var ausiliare per mappare i libri scritti dall'autore
    //NB
    @OneToMany(mappedBy = "author") // specifico il mapping inserendo il beam della entity che ha quella relazione one to many
    private Set<Book> bookSet = new HashSet<>();


     //JPA (java persistent API) per funzionare vuole costruttori vuoti
     public Author(){}

     public Author(String name, String surname){
         this.name=name;
         this.surname=surname;
     }

     public Long getId(){
         return id;
     }

     public Set<Book> getbookSet(){
         return this.bookSet;

     }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setBookset(Set<Book> bookSet){
        this.bookSet=bookSet;
    }
}
