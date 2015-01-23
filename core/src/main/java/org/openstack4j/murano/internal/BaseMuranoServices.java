package org.openstack4j.murano.internal;

import org.openstack4j.api.types.ServiceType;
import org.openstack4j.openstack.internal.BaseOpenStackService;

public class BaseMuranoServices extends BaseOpenStackService {

	protected BaseMuranoServices() {
		super(ServiceType.APPLICATION_CATALOG);
	}
}
