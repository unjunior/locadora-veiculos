package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.AluguelDto;
import br.com.juniorlocadora.entidades.Aluguel;
import br.com.juniorlocadora.repositorio.AluguelRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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

    @Transactional(readOnly = true)
    public Page<AluguelDto> findAll(Pageable pageable){
        Page<Aluguel> result = repositorio.findAll(pageable);
        return result.map(x -> new AluguelDto(x));
    }
}
