package controller;

/** 
 * Classe concrete Operation 
 * @author Soizic et Taha
 * @version 1.0
 *
 */

public class Operation {

	/** D�claration d'une variable chaine de caract�res "idCompte" clef etrang�re */
	public String idCompte;
	
	/** D�claration d'une variable chaine de caract�res "idVirement" clef etrang�re */
	public String idVirement;
	
	/** D�claration d'une variable chaine de caract�res "date de virement" */
	public String dateVirement;

	/** M�thode permettant de modifier les comptes concern�s par le virement */
	public void modifierSolde(){
	
}
	/** M�thode constructeur par d�fault */ 
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
