package com.example.moviecatalogue.model;

import java.util.Date;

public class Tomatoes {
	
	private Viewer viewer;
	private Date lastUpdated;
	
	public Viewer getViewer() {
		return viewer;
	}

	public void setViewer(Viewer viewer) {
		this.viewer = viewer;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
