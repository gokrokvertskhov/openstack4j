package org.openstack4j.murano.internal;

import java.util.List;

import org.openstack4j.api.murano.PackagesService;
import org.openstack4j.model.murano.ApplicationPackage;
import org.openstack4j.murano.domain.MuranoApplicationPackage;
import org.openstack4j.murano.domain.MuranoApplicationPackage.MuranoApplicationPackages;
import org.openstack4j.murano.domain.MuranoCategories;

public class PackagesServiceImpl extends BaseMuranoServices implements
		PackagesService {

	@Override
	public List<? extends String> getCategories() {
		return get(MuranoCategories.class, uri("/v1/catalog/packages/categories")).execute().getList();
	}

	@Override
	public ApplicationPackage getPackage(String pckg_id) {
		
		return get(MuranoApplicationPackage.class, uri("'/v1/catalog/packages/%s", pckg_id)).execute();
	}

	@Override
	public byte[] getPackageLogo(String pkg_id) {
		return get(byte[].class, uri("/v1/catalog/packages/%s/logo", pkg_id)).execute();
	}

	@Override
	public List<? extends ApplicationPackage> list() {
		return get(MuranoApplicationPackages.class, uri("/v1/catalog/packages")).execute().getList();
	}

}
