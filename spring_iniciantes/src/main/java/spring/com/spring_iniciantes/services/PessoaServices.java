package spring.com.spring_iniciantes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.com.spring_iniciantes.model.Pessoa;
import spring.com.spring_iniciantes.repository.PessoaRepository;

@Service
public class PessoaServices {

 @Autowired
 PessoaRepository pessoaRepository;


 public Pessoa savePessoa(Pessoa pessoa){
    
  return  this.pessoaRepository.save(pessoa);
    
 }


 public List<Pessoa> getPessoa(){

    return this.pessoaRepository.findAll();
 }


    
}// end class
