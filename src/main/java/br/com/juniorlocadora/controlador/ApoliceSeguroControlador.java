package br.com.juniorlocadora.controlador;

import br.com.juniorlocadora.dto.ApoliceSeguroDto;
import br.com.juniorlocadora.servico.ApoliceSeguroServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/apolices-seguros")
public class ApoliceSeguroControlador {

    @Autowired
    private ApoliceSeguroServico servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ApoliceSeguroDto> findById(@PathVariable Long id){
        ApoliceSeguroDto dto = servico.findById(id);
        return ResponseEntity.ok(dto);
    }
}
