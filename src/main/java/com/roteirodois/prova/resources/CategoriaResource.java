package com.roteirodois.prova.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="categorias") /*PARA DIGITAR NA URL*/
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET) /*requisitos de mapa, para URL, o GET recebe dados via url*/
	public String listar () {
		return "LOKO";
	}
	
	
	
}
