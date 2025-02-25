package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.AcessorioDto;
import br.com.juniorlocadora.dto.CarroDto;
import br.com.juniorlocadora.servico.AcessorioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/acessorio")
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

    @PostMapping
    public ResponseEntity<AcessorioDto> insert(@RequestBody AcessorioDto dto){
        dto = servico.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
