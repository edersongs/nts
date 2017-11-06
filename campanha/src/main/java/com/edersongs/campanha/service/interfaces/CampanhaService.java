/**
 * 
 */
package com.edersongs.campanha.service.interfaces;

import com.edersongs.campanha.model.Campanha;
import com.edersongs.campanha.service.exception.CampanhaException;

/**
 * @author Éderson Gervásio
		   edersongervasiosilva@gmail.com
		   github.com/edersongs	
 *
 */
public interface CampanhaService {

	void salvarCampanha(Campanha campanha) throws CampanhaException;

	void deletarCampanha(Long codigoCampanha) throws CampanhaException;
}
