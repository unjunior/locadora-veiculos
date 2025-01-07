package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.CarroDto;
import br.com.juniorlocadora.servico.CarroServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/carros")
public class CarroControlador {

    @Autowired
    private CarroServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<CarroDto> findById(@PathVariable Long id){
        CarroDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }
}
