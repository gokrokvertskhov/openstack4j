package org.openstack4j.murano.domain;

import org.openstack4j.model.murano.StatusEntry;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class MuranoStatusEntry implements StatusEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8148053954447481639L;

	@JsonProperty("updated")
	private String updated;
	@JsonProperty("level")
	private String level;
	@JsonProperty("text")
	private String text;
	@JsonProperty("created")
	private String created;
	@JsonProperty("entity_id")
	private String entity_id;
	@JsonProperty("entity")
	private String entity;
	@JsonProperty("details")
	private String details;
	@JsonProperty("deployment_id")
	private String deployment_id;
	@JsonProperty("id")
	private String id;


	
	@Override
	public String getUpdateTime() {
		// TODO Auto-generated method stub
		return updated;
	}

	@Override
	public String getLevel() {
		// TODO Auto-generated method stub
		return level;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	public String getCreateTime() {
		// TODO Auto-generated method stub
		return created;
	}

	@Override
	public String getEntityId() {
		// TODO Auto-generated method stub
		return entity_id;
	}

	@Override
	public String getEntity() {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	public String getdetails() {
		// TODO Auto-generated method stub
		return details;
	}

	@Override
	public String getdeploymentId() {
		// TODO Auto-generated method stub
		return deployment_id;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public String toString(){
		return "["+id+"]-["+level+"] " + text;
	}
}
