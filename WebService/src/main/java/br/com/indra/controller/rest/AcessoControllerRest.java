package br.com.indra.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.indra.model.Acesso;
import br.com.indra.service.AcessoService;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class AcessoControllerRest {

	@Autowired
	private AcessoService acessoService;
	
	@RequestMapping(value = "/acesso", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Acesso>> listAllAcessos() {
        List<Acesso> acessos = acessoService.findAllAcessos();
        if (acessos.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Acesso>>(acessos, HttpStatus.OK);
    }

}
