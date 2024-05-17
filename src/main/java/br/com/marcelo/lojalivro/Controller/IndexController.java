package br.com.marcelo.lojalivro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class IndexController {
    @GetMapping("/")
    public ModelAndView getIndex () {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    @GetMapping("/home")
    public ModelAndView getHome() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    @GetMapping("/livros-add")
    public ModelAndView getLivrosAdd() {
        ModelAndView mv = new ModelAndView("livros-add");
        return mv;
    }
    @GetMapping("/livros-list")
    public ModelAndView getLivrosList() {
        ModelAndView mv = new ModelAndView("livros-list");
        return mv;
    }
    
    
}
