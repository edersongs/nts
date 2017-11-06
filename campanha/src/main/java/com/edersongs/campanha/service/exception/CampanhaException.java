/**
 * 
 */
package com.edersongs.campanha.service.exception;

/**
 * @author Éderson Gervásio
		   edersongervasiosilva@gmail.com
		   github.com/edersongs	
 *
 */
public class CampanhaException extends Exception {

	private static final long serialVersionUID = 1L;

	public CampanhaException(String message) {
	        super(message);
    }

    public CampanhaException(String message, Throwable cause) {
        super(message, cause);
    }
}
