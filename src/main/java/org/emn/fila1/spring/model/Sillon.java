package org.emn.fila1.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sillon implements Serializable{

	@Id
	String id;
	List<Pi> pis;
	
	public Sillon(String id, List<Pi> pis)
	{
		this.id = id;
		this.pis = pis;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Pi> getPis() {
		return pis;
	}

	public void setPis(List<Pi> pis) {
		this.pis = pis;
	}
}
