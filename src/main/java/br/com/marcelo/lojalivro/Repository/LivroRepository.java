package br.com.marcelo.lojalivro.Repository;
import org.springframework.data.repository.CrudRepository;

import br.com.marcelo.lojalivro.Model.Livro;

public interface LivroRepository extends CrudRepository<Livro, Integer> {
    
}
