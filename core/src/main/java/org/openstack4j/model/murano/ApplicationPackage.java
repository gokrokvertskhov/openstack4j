package org.openstack4j.model.murano;

import java.util.List;

import org.openstack4j.model.ModelEntity;

public interface ApplicationPackage extends ModelEntity {
	String getId();
	String getType();
	String getFqn();
	String getOwnerId();
	Boolean isEnabled();
	String getCreated();
	String getAuthor();
	String getName();
	List<? extends String> getCategories();
	Boolean isPublic();
	String getUpdated();
	List<? extends String> getTags();
	String getDescription();
	List<? extends String> getClassDefinitions();
	 
}
