package org.openstack4j.murano.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.murano.EnvironmentService;
import org.openstack4j.api.murano.MuranoService;
import org.openstack4j.api.murano.PackagesService;
/**
 * This class contains getters for all implementation of the available Murano services
 * 
 * @author Georgy Okrokvertskhov
 */
public class MuranoServiceImpl extends BaseMuranoServices implements
		MuranoService {

	@Override
	public EnvironmentService environments() {
		return Apis.get(EnvironmentService.class);
	}

	@Override
	public PackagesService packages() {
		// TODO Auto-generated method stub
		return Apis.get(PackagesService.class);
	}

}
