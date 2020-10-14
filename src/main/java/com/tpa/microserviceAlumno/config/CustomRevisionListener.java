package com.tpa.microserviceAlumno.config;

import com.tpa.microserviceAlumno.entidades.audit.Revision;

import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

	public void newRevision(Object revisionEntity) {
		final Revision revision = (Revision) revisionEntity;

	}
}
