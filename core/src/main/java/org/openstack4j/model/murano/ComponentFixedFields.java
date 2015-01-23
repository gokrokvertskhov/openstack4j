package org.openstack4j.model.murano;

import org.openstack4j.model.ModelEntity;

public interface ComponentFixedFields extends ModelEntity {
	
	String getStatus();
	
	String getType();
	
	String getId();
}
