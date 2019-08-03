package controller;

/** 
 * Classe métier SimulationCredit concrete
 * @author Soizic et Taha
 * @version 1.0
 */

public class SimulationCredit {
	
	/** Déclaration d'une variable chaine de caractères "id conseiller" clef étrangère */	
	private String idConseiller;

	/** Déclaration d'une variable chaine de caractères "id compte clef étrangère */
	private String idCompte;

	/** Déclaration d'une variable chaine de caractères "type de crédit" */
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

/** Méthode permettant de demander la simulation d'un crédit bancaire */
public void simulerCredit(){
	
}

/** Méthode permettant d'effectuer les calculs nécessaire au crédit (modalités) */
public void calculerCredit(){
	
}

/** Consturcteur par défault de la classe SimulationCredit */ 
public SimulationCredit(){
	
}
}
