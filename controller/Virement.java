package controller;

/** 
 * Classe métier concrete Virement 
 * @author Soizic et Taha
 * @version 1.0
 *
 */

public class Virement {
	
	/** Déclaration d'une variable chaine de caractères "id conseiller" clef étrangère*/
	private String idConseiller;
	
	/** Déclaration d'une variable chaine de caractères "id virement" clef unique */
	private String idVirement;
	
	/** Déclaration d'une variable chaine de caractères "id compte" clef étrangère*/
	private String idCompte;

	

	/** constructeur par défaut de Virement */	
	public Virement() {
		
	}
	
public String getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getIdVirement() {
		return idVirement;
	}

	public void setIdVirement(String idVirement) {
		this.idVirement = idVirement;
	}

	public String getIdCompte() {
		return idCompte;
	}



	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}

	/** méthode permettant de demander un virement */
	public void demanderVirement(){
		
	}
	/** méthode permettant de faire appel a une méthode appartenant à la classe métier effectuer opération de virement" */ 	
	public void effectuerOperation(){
}
	/** méthode permettant de vérifier que le bénéficier du virement appartienne à proxybanque" */
	public void validerBeneficiaire(){
		
	}
	/** méthode permettant de verifier les provisions et la faisabilité du virement (solde suffisant)" */	
	public void autoriserVirement(){
		

	}
}
