package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.AluguelDto;
import br.com.juniorlocadora.entidades.Aluguel;
import br.com.juniorlocadora.repositorio.AluguelRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AluguelServico {

    @Autowired
    private AluguelRepositorio repositorio;

    @Transactional
    public AluguelDto findById(Long id){
        Optional<Aluguel> result = repositorio.findById(id);
        Aluguel aluguel = result.get();
        return new AluguelDto(aluguel);
    }
}
