package org.openstack4j.murano.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openstack4j.api.murano.EnvironmentService;
import org.openstack4j.model.murano.Environment;
import org.openstack4j.model.murano.StatusList;
import org.openstack4j.murano.domain.MuranoEnvironment;
import org.openstack4j.murano.domain.MuranoEnvironment.Environments;
import org.openstack4j.murano.domain.MuranoStatus;
/**
 * @author Georgy Okrokvertskhov
 *
 */
public class EnvironmentServiceImpl extends BaseMuranoServices implements
		EnvironmentService {

	@Override
	public List<? extends Environment> list() {
		return get(Environments.class, uri("/v1/environments")).execute().getList();
	}

	@Override
	public Object getEnvironmentRaw(String env_id, String session_id) {
		Map <String, Object> headers = new HashMap <String, Object> ();
		headers.put("X-Configuration-Session", session_id);
		return get(String.class, uri("/v1/environments/%s",env_id)).headers(headers).execute();
	}

	@Override
	public Environment getEnvironment(String env_id, String session_id) {
		// TODO Auto-generated method stub
		Map <String, Object> headers = new HashMap <String, Object> ();
		headers.put("X-Configuration-Session", session_id);
		return get(MuranoEnvironment.class, uri("/v1/environments/%s",env_id)).headers(headers).execute();
	}

	@Override
	public Object getEnvironmentRaw(String env_id) {
		return get(String.class, uri("/v1/environments/%s",env_id)).execute();
	}

	@Override
	public Environment getEnvironment(String env_id) {
		return get(MuranoEnvironment.class, uri("/v1/environments/%s",env_id)).execute();
	}

	@Override
	public StatusList getLastStatuses(String env_id,
			String session_id) {
		Map <String, Object> headers = new HashMap <String, Object> ();
		headers.put("X-Configuration-Session", session_id);
		
		return get(MuranoStatus.class, uri("/v1/environments/%s/lastStatus",env_id)).headers(headers).execute();
	}

	@Override
	public StatusList getLastStatusList(String env_id) {
		// TODO Auto-generated method stub
		return get(MuranoStatus.class, uri("/v1/environments/%s/lastStatus",env_id)).execute();
	}
	
	
}
