package org.openstack4j.murano.domain;

import java.util.List;

import org.openstack4j.model.murano.ApplicationPackage;
import org.openstack4j.model.murano.EnvironmentComponent;
import org.openstack4j.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MuranoApplicationPackage implements ApplicationPackage {

	/**
	 * {
            "class_definitions": [
                "io.murano.resources.Network",
                "io.murano.Environment",
                "io.murano.Object",
                "io.murano.resources.Instance",
                "io.murano.system.SecurityGroupManager",
                "io.murano.Application"
            ],
            "description": "Core MuranoPL library\n",
            "tags": [
                "MuranoPL"
            ],
            "updated": "2014-12-13T00:24:02",
            "is_public": true,
            "categories": [],
            "name": "Core library",
            "author": "murano.io",
            "created": "2014-12-13T00:24:02",
            "enabled": true,
            "id": "2b84b51cf9464dc6a6064264a2e7e715",
            "fully_qualified_name": "io.murano",
            "type": "Library",
            "owner_id": ""
        }
	 */
	private static final long serialVersionUID = 6879088223136716635L;
	
	@JsonProperty("id")
	private String id;
	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getFqn() {
		return fqn;
	}

	public String getOwnerId() {
		return owner_id;
	}

	public Boolean isEnabled() {
		return enabled;
	}

	public String getCreated() {
		return created;
	}

	public String getAuthor() {
		return author;
	}

	public String getName() {
		return name;
	}

	public List<? extends String> getCategories() {
		return categories;
	}

	public Boolean isPublic() {
		return is_public;
	}

	public String getUpdated() {
		return updated;
	}

	public List<? extends String> getTags() {
		return tags;
	}

	public String getDescription() {
		return description;
	}

	public List<? extends String> getClassDefinitions() {
		return class_definitions;
	}

	@JsonProperty("type")
	private String type;
	@JsonProperty("fully_qualified_name")
	private String fqn;
	@JsonProperty("owner_id")
	private String owner_id;
	@JsonProperty("enabled")
	private Boolean enabled;
	@JsonProperty("created")
	private String created;
	@JsonProperty("author")
	private String author;	
	@JsonProperty("name")
	private String name;
	@JsonProperty("categories")
	private List<? extends String> categories;
	@JsonProperty("is_public")
	private Boolean is_public;
	@JsonProperty("updated")
	private String updated;
	@JsonProperty("tags")
	private List <? extends String> tags;
	@JsonProperty("description")
	private String description;
	@JsonProperty("class_definitions")
	private List <? extends String> class_definitions;
	
public static class MuranoApplicationPackages extends ListResult<MuranoApplicationPackage> {		
	/**
	 * 
	 */
	private static final long serialVersionUID = 3933733736657414835L;

		/**
		 * 
		 */
		
		@JsonProperty("packages")
		private List<MuranoApplicationPackage> list;

		protected List<MuranoApplicationPackage> value() {
			return list;
		}
	}

}
