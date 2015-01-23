package org.openstack4j.api.murano;

import java.util.List;

import org.openstack4j.model.murano.ApplicationPackage;

public interface PackagesService {
	
	List<? extends String> getCategories();
	
	ApplicationPackage getPackage(String pckg_id);
	
	List <? extends ApplicationPackage> list();
	
	byte[] getPackageLogo(String pkg_id);

}
