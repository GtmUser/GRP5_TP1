package controller;

/** 
 * Classe abstraite personne
 * @author Soizic et Taha
 * @version 1.0
 *
 */

public abstract class Personne {
	/** Déclaration d'une variable chaine de caractères "nom" */
	private String nom;
	/** Déclaration d'une variable chaine de caractères "prénom" */
	private String prenom;
	/** Déclaration d'une variable chaine de caractères "ville" */
	private String ville;
	/** Déclaration d'une variable chaine de caractères "adrésse" */
	private String adresse;
	/** Déclaration d'une variable entier "n° téléphone" */
	private int telephone;
	/** Déclaration d'une variable chaine de caractères "Identifiant" */
	private String id;
	/** Déclaration d'une variable entier "code postal" */
	private int codePostal;
	/** Déclaration d'une variable chaine de caractères "e-mail" */
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

/** constructeur par défaut de personne */
public Personne (){
	
}
/** Méthode permettant à Personne de lire */
public void lire(){
}

/** Méthode permettant à Personne d'écrire */
public void ecrire(){
	
}
/** Méthode permettant à Personne d'éplucher des bananes */
public void eplucherDesBananes(){
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}

