package org.openstack4j.model.murano;

import java.util.List;

import org.openstack4j.model.ModelEntity;

/**
 * @author Georgy Okrokvertskhov
 *
 */
public interface Environment extends ModelEntity {
	/**
	 *       "status": "ready",
     *       "updated": "2015-01-22T04:28:14",
     *       "networking": {},
     *       "name": "KubeTest099334",
     *       "created": "2015-01-21T23:41:50",
     *       "tenant_id": "0f3fe5fd582f44329cb02948c2ce5dde",
     *       "version": 1,
     *       "id": "5858bf33ab58455f9af0eb7780f63a5c"
	 */
	
	/**
	 * Returns the id of the Environment
	 * 
	 * @return the id of the Environment
	 */
	String getId();

	/**
	 * Returns the name of the Environment
	 * 
	 * @return the name of the Environment
	 */
	String getName();

	/**
	 * Returns the status of the Environment
	 * 
	 * @return the status of the Environment
	 */
	String getStatus();
	
	/**
	 * Returns the version of Environment
	 * 
	 * @return the version of the Environment
	 */
	String getVersion();
	
	/**
	 * Returns the ID of the tenant
	 * @return Tenant id
	 */
	String getTenantId();
	
	/**
	 * Date of creations of the Environment
	 * @return Date of creation of the Environment
	 */
	String getCreated();
	
	/**
	 * Returns the date of the last update
	 * @return the date of the last update
	 */
	String getUpdated();
	
	/**
	 * Returns the list of components
	 * @return the list of components
	 */
	List <? extends EnvironmentComponent> getComponents();
}
