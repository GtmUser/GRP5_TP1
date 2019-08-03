package controller;

/** 
 * Classe concrete Operation 
 * @author Soizic et Taha
 * @version 1.0
 *
 */

public class Operation {

	/** Déclaration d'une variable chaine de caractères "idCompte" clef etrangère */
	public String idCompte;
	
	/** Déclaration d'une variable chaine de caractères "idVirement" clef etrangère */
	public String idVirement;
	
	/** Déclaration d'une variable chaine de caractères "date de virement" */
	public String dateVirement;

	/** Méthode permettant de modifier les comptes concernés par le virement */
	public void modifierSolde(){
	
}
	/** Méthode constructeur par défault */ 
	public Operation(){
		
	}
	public String getIdcompte() {
		return idCompte;
	}
	public void setIdcompte(String idCompte) {
		this.idCompte = idCompte;
	}
	public String getIdVirement() {
		return idVirement;
	}
	public void setIdVirement(String idVirement) {
		this.idVirement = idVirement;
	}
	public String getDateVirement() {
		return dateVirement;
	}
	public void setDateVirement(String dateVirement) {
		this.dateVirement = dateVirement;
	}
}
