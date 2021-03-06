package com.coikontroly.service;

import java.io.IOException;

import org.bson.Document;

public interface OrganizationService {

	/**
	 * Searches organization by ico at webpage justice.cz
	 * @param ico Identification of organization
	 * @return org.bson.Document object with organization values'ico', 'name' and 'place'
	 */
	Document findOrganization(String ico) throws IOException;
}
