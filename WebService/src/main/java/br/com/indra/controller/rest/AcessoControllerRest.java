package br.com.indra.controller.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.indra.model.Acesso;
import br.com.indra.repository.AcessoRepository;

@Controller
@RestController
@RequestMapping(value = "/acessos", produces = MediaType.APPLICATION_JSON_VALUE)
@Path("/acessos")
public class AcessoControllerRest {

	@Autowired
	private AcessoRepository acessoRepository;
	
	@PathParam("/listar")
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Acesso> findAll() {
		final List<Acesso> resultList = new ArrayList<>();
		final Iterable<Acesso> all = acessoRepository.findAll();
		all.forEach(new Consumer<Acesso>() {
			@Override
			public void accept(Acesso appUser) {
				resultList.add(appUser);
			}
		});
		return resultList;
	}

}
