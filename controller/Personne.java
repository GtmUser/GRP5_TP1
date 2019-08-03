package controller;

/** 
 * Classe abstraite personne
 * @author Soizic et Taha
 * @version 1.0
 *
 */

public abstract class Personne {
	/** D�claration d'une variable chaine de caract�res "nom" */
	private String nom;
	/** D�claration d'une variable chaine de caract�res "pr�nom" */
	private String prenom;
	/** D�claration d'une variable chaine de caract�res "ville" */
	private String ville;
	/** D�claration d'une variable chaine de caract�res "adr�sse" */
	private String adresse;
	/** D�claration d'une variable entier "n� t�l�phone" */
	private int telephone;
	/** D�claration d'une variable chaine de caract�res "Identifiant" */
	private String id;
	/** D�claration d'une variable entier "code postal" */
	private int codePostal;
	/** D�claration d'une variable chaine de caract�res "e-mail" */
	private String email;


public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getTelephone() {
	return telephone;
}
public void setTelephone(int telephone) {
	this.telephone = telephone;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getCodePostal() {
	return codePostal;
}
public void setCodePostal(int codePostal) {
	this.codePostal = codePostal;
}

/** constructeur par d�faut de personne */
public Personne (){
	
}
/** M�thode permettant � Personne de lire */
public void lire(){
}

/** M�thode permettant � Personne d'�crire */
public void ecrire(){
	
}
/** M�thode permettant � Personne d'�plucher des bananes */
public void eplucherDesBananes(){
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}

