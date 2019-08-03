package model;

import java.sql.Connection;

/** 
 * Classe concrete BDDPBSI "Base De Données Proxi Banque Systeme d'Information"
 * @author Soizic et Taha
 * @version 1.0
 *
 */
public class BDDPBSI {

	/** Déclaration d'une variable connexion "con" */
	public Connection con;

	/** Déclaration d'une variable chaine de caractères "id conseiller" clef étrangère */
	public String idConseiller;

    /** Déclaration d'une variable chaine de caractères "id gérant" clef étrangère */
	public String idGerant;

	/** Déclaration d'une variable chaine de caractères "password gérant" */
	public String pwGerant;

	/** Déclaration d'une variable chaine de caractères "password conseiller" */
	public String pwConseiller;

	/** méthode permettant de se connecter à la base de données PBSI  @return */
	public Connection connecter(){
	return con;
	
}
/** méthode permettant de se déconnecter à la base de données PBSI */
public void deconnecter(){
	
}
/** constructeur par défaut de BDDPBSI */
public BDDPBSI(){
	
}
public Connection getCon() {
	return con;
}
public void setCon(Connection con) {
	this.con = con;
}
public String getIdConseiller() {
	return idConseiller;
}
public void setIdConseiller(String idConseiller) {
	this.idConseiller = idConseiller;
}
public String getIdGerant() {
	return idGerant;
}
public void setIdGerant(String idGerant) {
	this.idGerant = idGerant;
}
public String getPwGerant() {
	return pwGerant;
}
public void setPwGerant(String pwGerant) {
	this.pwGerant = pwGerant;
}
public String getPwConseiller() {
	return pwConseiller;
}
public void setPwConseiller(String pwConseiller) {
	this.pwConseiller = pwConseiller;
}
}
