package controller;

/** 
 * Classe concrete Conseiller h�rite d'Employ�
 * @author Soizic et Taha
 * @version 1.0
 *
 */
public class Conseiller extends Employe {
	
/** D�claration d'une variable chaine de caract�res "idclient" clef etrang�re */
	private String idClient;
	
/** d�claration d'une variable entier "nombre de clients" */ 
	private int nbClient;
	

/** constructeur par d�faut de Conseiller */
	public Conseiller (){
		
	}
	
	/** M�thode permettant de verifier si l'on exc�de la limite du nombre de clients par conseiller */
	public void calculLimiteClients(){
		
	}
	
	/** m�thode permettant de confirmer la modification apport�e � un compte */
	public void confirmerModifCompte(){
		
	}
	
	/** m�thode permettant de confirmer un virement */ 
	public void confirmerVirement(){
		
	}
	
	/** m�thode permettant de valider la cr�ation d'une carte */
	public void validerCarte(){
		
	}
	
	/** m�thode permettant de confirmer la mise en place d'un placement */
	public void validerPlacement(){
		
	}
	
	/** m�thode permettant de confirmer la suppression d'un compte */
	public void confirmerSuppCompte(){
		
	}
	
	/** m�thode permettant de confirmer la cr�ation d'un compte */ 
	public void confirmerCreaCompte(){
		
	}
	
	/** m�thode permettant d'afficher le resultat d'une simulation de cr�dit */
	public void affichageSimCredit(){
		
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public int getNbClient() {
		return nbClient;
	}

	public void setNbClient(int nbClient) {
		this.nbClient = nbClient;
	}
	

}
