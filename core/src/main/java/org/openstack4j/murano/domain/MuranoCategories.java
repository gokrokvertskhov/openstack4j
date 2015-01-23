package org.openstack4j.murano.domain;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class MuranoCategories {
	@JsonProperty("categories")
	public List <? extends String> categories;
	
	public List <? extends String> getList(){
		return categories;
	}
}
