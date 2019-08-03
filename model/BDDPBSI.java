package model;

import java.sql.Connection;

/** 
 * Classe concrete BDDPBSI "Base De Donn�es Proxi Banque Systeme d'Information"
 * @author Soizic et Taha
 * @version 1.0
 *
 */
public class BDDPBSI {

	/** D�claration d'une variable connexion "con" */
	public Connection con;

	/** D�claration d'une variable chaine de caract�res "id conseiller" clef �trang�re */
	public String idConseiller;

    /** D�claration d'une variable chaine de caract�res "id g�rant" clef �trang�re */
	public String idGerant;

	/** D�claration d'une variable chaine de caract�res "password g�rant" */
	public String pwGerant;

	/** D�claration d'une variable chaine de caract�res "password conseiller" */
	public String pwConseiller;

	/** m�thode permettant de se connecter � la base de donn�es PBSI  @return */
	public Connection connecter(){
	return con;
	
}
/** m�thode permettant de se d�connecter � la base de donn�es PBSI */
public void deconnecter(){
	
}
/** constructeur par d�faut de BDDPBSI */
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
