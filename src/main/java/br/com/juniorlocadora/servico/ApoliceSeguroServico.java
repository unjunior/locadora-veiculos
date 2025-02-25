package br.com.juniorlocadora.servico;

import br.com.juniorlocadora.dto.AluguelDto;
import br.com.juniorlocadora.dto.ApoliceSeguroDto;
import br.com.juniorlocadora.entidades.Aluguel;
import br.com.juniorlocadora.entidades.ApoliceSeguro;
import br.com.juniorlocadora.repositorio.ApoliceSeguroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Transactional(readOnly = true)
    public Page<ApoliceSeguroDto> findAll(Pageable pageable){
        Page<ApoliceSeguro> result = repositorio.findAll(pageable);
        return result.map(x -> new ApoliceSeguroDto(x));
    }

    @Transactional
    public ApoliceSeguroDto insert (ApoliceSeguroDto dto){
        ApoliceSeguro as = new ApoliceSeguro();
        as.setValorFranquia(dto.getValorFranquia());
        as.setProtecaoTerceiro(dto.getProtecaoTerceiro());
        as.setProtecaoCausasNaturais(dto.getProtecaoCausasNaturais());
        as.setProtecaoRoubo(dto.getProtecaoRoubo());

        as = repositorio.save(as);
        return new ApoliceSeguroDto(as);
    }

    @Transactional
    public ApoliceSeguroDto update(Long id, ApoliceSeguroDto dto){
        ApoliceSeguro as = new ApoliceSeguro();
        as.setValorFranquia(dto.getValorFranquia());
        as.setProtecaoTerceiro(dto.getProtecaoTerceiro());
        as.setProtecaoCausasNaturais(dto.getProtecaoCausasNaturais());
        as.setProtecaoRoubo(dto.getProtecaoRoubo());
        return new ApoliceSeguroDto(as);
    }
}
