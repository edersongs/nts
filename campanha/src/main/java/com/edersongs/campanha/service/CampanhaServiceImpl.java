/**
 * 
 */
package com.edersongs.campanha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
class CampanhaServiceImpl implements CampanhaService {

	@Autowired private RepositoryCampanha repositoryCampanha;
	
	@Override
	public void salvarCampanha(Campanha campanha) throws CampanhaException {
		
		repositoryCampanha.save(campanha);
	}

	@Override
	public void deletarCampanha(Long codigoCampanha) throws CampanhaException {
		
		repositoryCampanha.delete(codigoCampanha);
		
	}
}
