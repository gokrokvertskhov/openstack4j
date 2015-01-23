package org.openstack4j.model.murano;

import java.util.Map;

import org.openstack4j.model.ModelEntity;

public interface StatusList extends ModelEntity {
	
	Map<String, StatusEntry>  getStatuses();

}
