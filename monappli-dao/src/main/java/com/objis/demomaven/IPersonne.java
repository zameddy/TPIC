package com.objis.demomaven;

import java.util.List;

public interface IPersonne {
	
	public void savePersonne(Personne p);
	public List<Personne> listPersonne();
	public void deletePersonne(Personne p);
	public Personne findPersonne(long id);
	public Personne updatePersonne(long id);
}
