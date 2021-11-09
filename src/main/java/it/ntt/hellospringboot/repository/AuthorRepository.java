package it.ntt.hellospringboot.repository;

import org.springframework.data.repository.CrudRepository;
import it.ntt.hellospringboot.model.Author;


//deve essere una interfaccia che estende CrudRepository e vuole classe più il tipo della chiave
public interface AuthorRepository extends CrudRepository<Author,Long>{
    
}
