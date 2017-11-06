/**
 * 
 */
package com.edersongs.campanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edersongs.campanha.model.Campanha;

/**
 * @author Éderson Gervásio
		   edersongervasiosilva@gmail.com
		   github.com/edersongs	
 *
 */
@Repository
public interface RepositoryCampanha extends JpaRepository<Campanha, Long> {

}
