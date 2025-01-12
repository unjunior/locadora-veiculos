package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.AcessorioDto;
import br.com.juniorlocadora.entidades.Acessorio;
import br.com.juniorlocadora.repositorio.AcessorioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AcessorioServico {

    @Autowired
    private AcessorioRepositorio repositorio;

    @Transactional
    public AcessorioDto findById(Long id){
        Optional<Acessorio> result = repositorio.findById(id);
        Acessorio acessorio = result.get();
        AcessorioDto dto = new AcessorioDto(acessorio);
        return dto;
    }
}
