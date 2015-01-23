package org.openstack4j.murano.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import org.openstack4j.model.murano.ComponentFixedFields;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MuranoComponentFixedFields implements ComponentFixedFields {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4496583448833824566L;


	@JsonProperty("id")
	private String id;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("status")
	private String status;
	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
