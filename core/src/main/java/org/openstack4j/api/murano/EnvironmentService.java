package org.openstack4j.api.murano;
import java.util.List;

import org.openstack4j.model.murano.Environment;
import org.openstack4j.model.murano.StatusList;

/**
 * This interface defines all methods for the manipulation of Murano Environments
 * @author Georgy Okrokvertskhov
 *
 */
public interface EnvironmentService {
	
	/**
	 * Gets a list of currently existing {@link Environment}s.
	 * 
	 * @return the list of {@link Environment}s
	 */
	List<? extends Environment> list();
	/**
	 * Gets a full description of the {@link Environment} as a string with JSON
	 * 
	 * @return the String with JSON content of the {@link Environment}
	 */
	Object getEnvironmentRaw(String env_id);
	/**
	 * Gets a full description of the {@link Environment}
	 * 
	 * @return the content of the {@link Environment}
	 */
	Environment getEnvironment( String env_id);
	Object getEnvironmentRaw(String env_id, String session_id);
	Environment getEnvironment(String env_id, String session_id);
	
	StatusList getLastStatusList(String env_id);
	StatusList getLastStatuses(String env_id, String session_id);

}
