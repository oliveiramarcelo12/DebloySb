package br.com.marcelo.lojalivro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.marcelo.lojalivro.Model.Livro;
import br.com.marcelo.lojalivro.Repository.LivroRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class LivrosController {
    @Autowired
    LivroRepository livroRepository;
    @GetMapping("livros")
    public List<Livro> getLivros(@RequestParam String param) {
        
        return new String();
    }
    @PostMapping("livros")
    public String postLivro(Livro livro ) {
        livroRepository.save(livro);
        
        return "/livro";
    }
    

}
