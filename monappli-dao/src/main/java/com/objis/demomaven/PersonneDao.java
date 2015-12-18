package com.objis.demomaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonneDao implements IPersonne {

	String url="jdbc:mysql://localhost:3306/tpic";
	String user="root";
	String password="";
	String driver = "com.mysql.jdbc.Driver";
	Connection cn = null;
    Statement st = null;
	
	public void savePersonne(Personne p) {
		
		 try {
	            /**
				 * 1.Chargement d'un driver Mysql
				 */
				Class.forName(driver);
				
				/**
				 * 2.Le driverManager tente d'instancier une connexion
				 * vers la base, en utilisant le driver instancié précédemment
				 */
				cn = DriverManager.getConnection(url, user, password); ;
				
				/**
				 * 3.Création d'un objet Statement
				 */
				st = cn.createStatement();
				
				/**
				 * 4.L'objet statement exécute la requête et retourne 
				 * les résultats dans un objet ResultSet
				 */
				st.executeUpdate("insert into personne (id, nom, prenom) values (" + p.getId() + ", '" + p.getNom() + "', '" + p.getPrenom() + "');");
				
				
			}catch(SQLException e){
				e.printStackTrace();
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
			finally{
				try{
					/**
					 * Libération des ressources 
					 */
					if(st != null)
						st.close();
					if(cn != null)
						cn.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		
	}

	public List<Personne> listPersonne() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	public Personne findPersonne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Personne updatePersonne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
