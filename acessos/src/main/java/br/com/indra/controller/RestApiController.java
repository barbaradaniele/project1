package br.com.indra.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.indra.model.Pessoa;
import br.com.indra.service.PessoaService;
import br.com.indra.util.CustomErrorType;
 
 
@RestController
@RequestMapping("/api")
public class RestApiController {
 
    public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
 
    @Autowired
    PessoaService pessoaService; //Service which will do all data retrieval/manipulation work
 
    // -------------------Retrieve All Users---------------------------------------------
 
    @RequestMapping(value = "/pessoa/", method = RequestMethod.GET)
    public ResponseEntity<List<Pessoa>> listAllPessoas() {
        List<Pessoa> pessoas = pessoaService.findAllPessoas();
        if (pessoas.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.OK);
    }
 
    // -------------------Retrieve Single User------------------------------------------
 
    @RequestMapping(value = "/pessoa/{cpf}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable("cpf") String cpf) {
        logger.info("Fetching Pessoa with cpf {}", cpf);
        Pessoa pessoa = pessoaService.findByCpf(cpf);
        if (pessoa == null) {
            logger.error("Pessoa with cpf {} not found.", cpf);
            return new ResponseEntity(new CustomErrorType("User with cpf " + cpf 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
    }
 
    // -------------------Create a User-------------------------------------------
 
    @RequestMapping(value = "/pessoa/", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody Pessoa pessoa, UriComponentsBuilder ucBuilder) {
        logger.info("Creating Pessoa : {}", pessoa);
 
        if (pessoaService.isPessoaExist(pessoa)) {
            logger.error("Unable to create. A Pessoa with name {} already exist", pessoa.getNome());
            return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
            pessoa.getNome() + " already exist."),HttpStatus.CONFLICT);
        }
        pessoaService.savePessoa(pessoa);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/pessoa/{cpf}").buildAndExpand(pessoa.getCpf()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
 
    // ------------------- Update a User ------------------------------------------------
 
    @RequestMapping(value = "/pessoa/{cpf}", method = RequestMethod.PUT)
    public ResponseEntity<?> updatePessoa(@PathVariable("cpf") String cpf, @RequestBody Pessoa pessoa) {
        logger.info("Updating User with cpf {}", cpf);
 
        Pessoa currentPessoa = pessoaService.findByCpf(cpf);
 
        if (currentPessoa == null) {
            logger.error("Unable to update. User with cpf {} not found.", cpf);
            return new ResponseEntity(new CustomErrorType("Unable to upate. User with id " + cpf + " not found."),
                    HttpStatus.NOT_FOUND);
        }
 
        currentPessoa.setNome(pessoa.getNome());
 
        pessoaService.updatePessoa(currentPessoa);
        return new ResponseEntity<Pessoa>(currentPessoa, HttpStatus.OK);
    }
 
    // ------------------- Delete a User-----------------------------------------
 
    @RequestMapping(value = "/pessoa/{cpf}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePessoa(@PathVariable("cpf") String cpf) {
        logger.info("Fetching & Deleting User with cpf {}", cpf);
 
        Pessoa pessoa = pessoaService.findByCpf(cpf);
        if (pessoa == null) {
            logger.error("Unable to delete. User with id {} not found.", cpf);
            return new ResponseEntity(new CustomErrorType("Unable to delete. User with id " + cpf + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        pessoaService.deletePessoaByCpf(cpf);
        return new ResponseEntity<Pessoa>(HttpStatus.NO_CONTENT);
    }
 
    // ------------------- Delete All Users-----------------------------
 
    @RequestMapping(value = "/pessoa/", method = RequestMethod.DELETE)
    public ResponseEntity<Pessoa> deleteAllPessoas() {
        logger.info("Deleting All Pessoas");
 
        pessoaService.deleteAllPessoas();
        return new ResponseEntity<Pessoa>(HttpStatus.NO_CONTENT);
    }
}