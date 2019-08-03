package controller;

/** 
 * Classe m�tier concrete Virement 
 * @author Soizic et Taha
 * @version 1.0
 *
 */

public class Virement {
	
	/** D�claration d'une variable chaine de caract�res "id conseiller" clef �trang�re*/
	private String idConseiller;
	
	/** D�claration d'une variable chaine de caract�res "id virement" clef unique */
	private String idVirement;
	
	/** D�claration d'une variable chaine de caract�res "id compte" clef �trang�re*/
	private String idCompte;

	

	/** constructeur par d�faut de Virement */	
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

	/** m�thode permettant de demander un virement */
	public void demanderVirement(){
		
	}
	/** m�thode permettant de faire appel a une m�thode appartenant � la classe m�tier effectuer op�ration de virement" */ 	
	public void effectuerOperation(){
}
	/** m�thode permettant de v�rifier que le b�n�ficier du virement appartienne � proxybanque" */
	public void validerBeneficiaire(){
		
	}
	/** m�thode permettant de verifier les provisions et la faisabilit� du virement (solde suffisant)" */	
	public void autoriserVirement(){
		

	}
}
