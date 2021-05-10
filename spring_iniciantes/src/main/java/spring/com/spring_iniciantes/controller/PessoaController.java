package spring.com.spring_iniciantes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.com.spring_iniciantes.model.Pessoa;
import spring.com.spring_iniciantes.repository.PessoaRepository;

@RestController("/pessoa")
public class PessoaController {
    @Autowired
    PessoaRepository pessoaRepository;

    @PostMapping()
    public void salvaPessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);

    }

    

} // end class
