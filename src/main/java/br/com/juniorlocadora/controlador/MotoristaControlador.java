package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.MotoristaDto;
import br.com.juniorlocadora.dto.PessoaDto;
import br.com.juniorlocadora.servico.MotoristaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/motoristas")
public class MotoristaControlador {

    @Autowired
    private MotoristaServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PessoaDto> findById(@PathVariable Long id){
        PessoaDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }
}
