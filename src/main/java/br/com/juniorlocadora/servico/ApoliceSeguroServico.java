package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.ApoliceSeguroDto;
import br.com.juniorlocadora.entidades.ApoliceSeguro;
import br.com.juniorlocadora.repositorio.ApoliceSeguroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ApoliceSeguroServico {

    @Autowired
    private ApoliceSeguroRepositorio repositorio;

    @Transactional
    public ApoliceSeguroDto findById(Long id){
        Optional<ApoliceSeguro> result = repositorio.findById(id);
        ApoliceSeguro apolice = result.get();
        ApoliceSeguroDto dto = new ApoliceSeguroDto(apolice);
        return dto;
    }
}
