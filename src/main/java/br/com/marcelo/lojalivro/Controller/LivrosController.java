package br.com.marcelo.lojalivro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.marcelo.lojalivro.Model.Livro;
import br.com.marcelo.lojalivro.Repository.LivroRepository;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LivrosController {
    @Autowired
    LivroRepository livroRepository;

    @GetMapping("livros")
    public ModelAndView getLivros() {
        ModelAndView mv = new ModelAndView("livros.list");
        mv.addObject("livros", livroRepository.findAll());
        return mv;

    }

    @GetMapping("addlivro")
    public String getAddLivro() {
        return "livro-add";
    }

    @PostMapping("/addlivro")
    public String postAddLivro(Livro livro) {
        livroRepository.save(livro);

        return "redirect:/livro";
    }

}
