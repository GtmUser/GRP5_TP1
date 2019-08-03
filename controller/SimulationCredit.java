package controller;

/** 
 * Classe m�tier SimulationCredit concrete
 * @author Soizic et Taha
 * @version 1.0
 */

public class SimulationCredit {
	
	/** D�claration d'une variable chaine de caract�res "id conseiller" clef �trang�re */	
	private String idConseiller;

	/** D�claration d'une variable chaine de caract�res "id compte clef �trang�re */
	private String idCompte;

	/** D�claration d'une variable chaine de caract�res "type de cr�dit" */
	private String typeCredit;




public String getIdConseiller() {
	return idConseiller;
}

public void setIdConseiller(String idConseiller) {
	this.idConseiller = idConseiller;
}

public String getIdCompte() {
	return idCompte;
}

public void setIdCompte(String idCompte) {
	this.idCompte = idCompte;
}

public String getTypeCredit() {
	return typeCredit;
}

public void setTypeCredit(String typeCredit) {
	this.typeCredit = typeCredit;
}

/** M�thode permettant de demander la simulation d'un cr�dit bancaire */
public void simulerCredit(){
	
}

/** M�thode permettant d'effectuer les calculs n�cessaire au cr�dit (modalit�s) */
public void calculerCredit(){
	
}

/** Consturcteur par d�fault de la classe SimulationCredit */ 
public SimulationCredit(){
	
}
}
