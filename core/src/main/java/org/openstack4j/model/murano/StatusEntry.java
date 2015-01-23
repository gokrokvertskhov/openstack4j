package org.openstack4j.model.murano;

import org.openstack4j.model.ModelEntity;

public interface StatusEntry extends ModelEntity {
	 //{updated=2014-12-19T20:06:42, level=info, text=Application Apache HTTPd listening 198.11.218.78:1027, created=2014-12-19T20:06:42, entity_id=25e6da85-4110-4ba9-98dd-ec6a01d72d30, entity=null, details=null, deployment_id=0cad9f2d35c9461183b98cb8b509e79e, id=b7da207b7dff4a5bbc56b1f420d69aba}
	
	String getUpdateTime();
	String getLevel();
	String getText();
	String getCreateTime();
	String getEntityId();
	String getEntity();
	String getdetails();
	String getdeploymentId();
	String getId();
}
