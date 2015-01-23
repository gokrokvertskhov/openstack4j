package org.openstack4j.api.murano;

import org.openstack4j.common.RestService;

/**
 * This interface contains all available HeatServices
 * @author Georgy Okrokvertskhov
 *
 */
public interface MuranoService extends RestService {

	/**
	 * Service implementation which provides methods for manipulation of Murano environments
	 * 
	 * @return EnvironmentService
	 */
	
	EnvironmentService environments();
	PackagesService packages();
	
}
