/**
 * 
 */
package com.edersongs.campanha.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edersongs.campanha.model.Campanha;
import com.edersongs.campanha.repository.RepositoryCampanha;
import com.edersongs.campanha.service.exception.CampanhaException;
import com.edersongs.campanha.service.interfaces.CampanhaService;

/**
 * @author Éderson Gervásio
		   edersongervasiosilva@gmail.com
		   github.com/edersongs	
 *
 */
@RestController
@RequestMapping("/campanhas")
public class CampanhaController {

	@Autowired private RepositoryCampanha repositoryCampanha;
	@Autowired private CampanhaService campanhaService;
	
	@PostMapping
	public ResponseEntity<?> salvarCampanha(@Valid @RequestBody Campanha campanha) throws CampanhaException {
		
		campanhaService.salvarCampanha(campanha);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("{codigo}")
	public ResponseEntity<?> deletarCampanha(Long codigo) throws CampanhaException {
		
		campanhaService.deletarCampanha(codigo);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
