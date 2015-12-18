package com.objis.demomaven;

import java.util.List;

public class ServicePersonne implements IServicePersonne {

	IPersonne i = new PersonneDao();
	public void savePersonne(Personne p) {
		// TODO Auto-generated method stub
		i.savePersonne(p);

	}

	public List<Personne> listPersonne() {
		// TODO Auto-generated method stub
		return i.listPersonne();
	}

	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub
		i.deletePersonne(p);
	}

	public Personne findPersonne(long id) {
		// TODO Auto-generated method stub
		return i.findPersonne(id);
	}

	public Personne updatePersonne(long id) {
		// TODO Auto-generated method stub
		return i.updatePersonne(id);
	}

}
