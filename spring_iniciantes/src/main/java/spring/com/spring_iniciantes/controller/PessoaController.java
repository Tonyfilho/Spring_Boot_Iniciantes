package spring.com.spring_iniciantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.com.spring_iniciantes.model.Pessoa;
import spring.com.spring_iniciantes.services.PessoaServices;

@RestController()
public class PessoaController {
    @Autowired
    PessoaServices pessoaServices;

    @PostMapping("/pessoas")
    
    public Pessoa savePessoa(@ RequestBody Pessoa pessoa) {
       return pessoaServices.savePessoa(pessoa);

    }

    @GetMapping("/pessoas")
   
    public List<Pessoa> getPessoa(){
      return pessoaServices.getPessoa();
    }

} // end class
