package br.com.juniorlocadora.repositorio;

import br.com.juniorlocadora.entidades.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoristaRepositorio extends JpaRepository<Motorista, Long> {
}
