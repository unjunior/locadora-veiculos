package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.CarroDto;
import br.com.juniorlocadora.dto.FabricanteDto;
import br.com.juniorlocadora.servico.CarroServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/carro")
public class CarroControlador {

    @Autowired
    private CarroServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<CarroDto> findById(@PathVariable Long id){
        CarroDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<CarroDto>> findAll(Pageable p){
        Page<CarroDto> carros = servico.findAll(p);
        return ResponseEntity.ok().body(carros);
    }

    @PostMapping
    public ResponseEntity<CarroDto> insert(@RequestBody CarroDto dto){
        dto = servico.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
