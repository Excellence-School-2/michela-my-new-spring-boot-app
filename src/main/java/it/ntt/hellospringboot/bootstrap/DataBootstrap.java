package it.ntt.hellospringboot.bootstrap;
//per popolare tabella 

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.ntt.hellospringboot.model.Author;
import it.ntt.hellospringboot.model.Book;
import it.ntt.hellospringboot.repository.AuthorRepository;
import it.ntt.hellospringboot.repository.BookRepository;

@Component
public class DataBootstrap implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    //@Autowired // dico che mi serve un oggetto che implementi questa interfaccia e spring boot lo fa per me
 // anche se non metto @Autowired Spring boot lo prende lo stesso
    public DataBootstrap(AuthorRepository authorRepository, BookRepository bookRepository){
        this.authorRepository=authorRepository;
        this.bookRepository=bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       Author michela = new Author("Michela", "Minniti");
       Author italo = new Author("Italo", "Calvino");

    
       Book book1 = new Book("Le Gioie Mancate", "1326Afdnix");
       book1.setAuthor(michela);

       Book book2 = new Book("palomar", "45gfdnix");
       book2.setAuthor(italo);

       Book book3 = new Book("Gli Amori difficili", "45gfdnix");
       book3.setAuthor(italo);

       /*ora lo salvo nel db ma io ho le interfacce in repository --> sfrutto spring
       dichiaro sopra
        private  final AuthorRepository authorRepository;
       assegno col costruttore
      @Autowired // dico che mi serve un oggetto che implementi questa interfaccia e spring boot lo fa per me
    public DataBootstrap(AuthorRepository authorRepository){
        this.authorRepository=authorRepository; }poi faccio:
       */

       //nb l'ordine è importante perchè Author è entità forte, deve esistere autore perchè esista un libro!!!
       authorRepository.save(michela);
       authorRepository.save(italo);
       bookRepository.save(book1);
       bookRepository.save(book2);
       
       bookRepository.save(book3);

    }
}
