package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.AcessorioDto;
import br.com.juniorlocadora.dto.AluguelDto;
import br.com.juniorlocadora.entidades.Aluguel;
import br.com.juniorlocadora.servico.AluguelServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alugueis")
public class AluguelControlador {

    @Autowired
    private AluguelServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<AluguelDto> findById(@PathVariable Long id){
        AluguelDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<AluguelDto>> findAll(Pageable pageable){
        Page<AluguelDto> list = servico.findAll(pageable);
        return ResponseEntity.ok().body(list);
    }
}
