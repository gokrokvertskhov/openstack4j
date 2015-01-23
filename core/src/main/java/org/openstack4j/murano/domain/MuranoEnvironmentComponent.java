package org.openstack4j.murano.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import org.openstack4j.model.murano.EnvironmentComponent;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MuranoEnvironmentComponent implements EnvironmentComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2773210518010284186L;

	@JsonProperty("?")
	private MuranoComponentFixedFields data;

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return data.getId();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return data.getType();
	}
	
}
