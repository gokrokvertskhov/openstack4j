package org.openstack4j.murano.domain;

import java.util.List;

import org.openstack4j.model.murano.Environment;
import org.openstack4j.model.murano.EnvironmentComponent;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.heat.domain.HeatStack;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Georgy Okrokvertskhov
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class MuranoEnvironment implements Environment {

	/**
	 * 
	 */
	private static final long serialVersionUID = 726790285558489262L;
	
	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("status")
	private String status;
	@JsonProperty("version")
	private String version;
	@JsonProperty("tenant_id")
	private String tenantId;
	@JsonProperty("created")
	private String created;
	@JsonProperty("updated")
	private String updated;
	@JsonProperty("services")
	private List<? extends MuranoEnvironmentComponent> components;


	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public String getTenantId() {
		return tenantId;
	}

	@Override
	public String getCreated() {
		return created;
	}

	@Override
	public String getUpdated() {
		return updated;
	}
	
	@Override
	public String toString() {
		return "MuranoEnvironment [id=" + id + ", name=" + name + ", status=" + status
				+ ", creationTime=" + created
				+ ", updatedTime=" + updated + "]";
	}
	/**
	 * An inner class for representing lists of Environemnts
	 * 
	 * @author Georgy Okorkvertskhov
	 * 
	 */
	public static class Environments extends ListResult<MuranoEnvironment> {
		
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -387630301627139977L;
		
		@JsonProperty("environments")
		private List<MuranoEnvironment> list;

		protected List<MuranoEnvironment> value() {
			return list;
		}
	}
	@Override
	public List<? extends EnvironmentComponent> getComponents() {
		// TODO Auto-generated method stub
		return components;
	}
}
