package com.coikontroly.dao;

import java.util.Collection;

import org.bson.Document;

public interface InspectionDao {
	/**
	 * Searches for inspections by given ico param.
	 * @param ico Identification of organization
	 * @return Collection of org.bson.Document objects. Each item of collection represents one inspection.
	 * If no inspection is found empty collection is returned
	 */
	Collection<Document> findInspections(Long ico);
}
