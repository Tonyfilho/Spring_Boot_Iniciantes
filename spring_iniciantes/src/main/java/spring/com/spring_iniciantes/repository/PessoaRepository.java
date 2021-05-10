package spring.com.spring_iniciantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.com.spring_iniciantes.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
