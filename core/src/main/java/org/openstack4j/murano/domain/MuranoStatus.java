package org.openstack4j.murano.domain;
import java.util.HashMap;
import java.util.Map;

import org.openstack4j.model.murano.StatusEntry;
import org.openstack4j.model.murano.StatusList;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonAnySetter;
@JsonRootName("lastStatuses")
public class MuranoStatus implements StatusList {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1755062627179884169L;
	Map <String, StatusEntry> values = new HashMap<String, StatusEntry>();
	@Override
	public Map<String, StatusEntry> getStatuses() {
		// TODO This is nasty :-)
		return values;
	}
	
    @JsonAnySetter
    public void set(String name, MuranoStatusEntry value) {
        values.put(name, value);
    }

}
