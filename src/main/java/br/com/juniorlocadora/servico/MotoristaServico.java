package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.FuncionarioDto;
import br.com.juniorlocadora.dto.MotoristaDto;
import br.com.juniorlocadora.entidades.Motorista;
import br.com.juniorlocadora.repositorio.MotoristaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MotoristaServico {

    @Autowired
    private MotoristaRepositorio motoristaRepositorio;

    @Transactional
    public MotoristaDto findById(Long id){
        Optional<Motorista> result = motoristaRepositorio.findById(id);
        Motorista motorista = result.get();
        return new MotoristaDto(motorista.getId(), motorista.getNome(), motorista.getDataNascimento(),
                motorista.getCpf(), motorista.getSexo(), motorista.getNumeroCnh());
    }

    @Transactional(readOnly = true)
    public Page<MotoristaDto> findAll(Pageable pageable){
        Page<Motorista> result = motoristaRepositorio.findAll(pageable);
        return result.map(x -> new MotoristaDto(x.getId(), x.getNome(), x.getDataNascimento(), x.getCpf(),
                x.getSexo(), x.getNumeroCnh()));
    }
}
