package br.com.marcelo.lojalivro.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.marcelo.lojalivro.Model.Livro;
import br.com.marcelo.lojalivro.Repository.LivroRepository;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RestController
public class LivrosController {
    @Autowired
    LivroRepository livroRepository;

    @GetMapping("/livros")
    public List<Livro> list() {
        return (List<Livro>) this.livroRepository.findAll();

    }

    @PostMapping("/livros")
    public Livro create(Livro livro) {
        return this.livroRepository.save(livro);

    }

}
