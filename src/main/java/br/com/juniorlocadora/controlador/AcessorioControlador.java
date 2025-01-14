package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.AcessorioDto;
import br.com.juniorlocadora.servico.AcessorioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/acessorios")
public class AcessorioControlador {

    @Autowired
    private AcessorioServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<AcessorioDto> findById(@PathVariable Long id){
        AcessorioDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<AcessorioDto>> findAll(Pageable pageable){
        Page<AcessorioDto> list = servico.findAll(pageable);
        return ResponseEntity.ok().body(list);
    }
}
