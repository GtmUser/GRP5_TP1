package controller;

/** 
 * Classe concrete Conseiller hérite d'Employé
 * @author Soizic et Taha
 * @version 1.0
 *
 */
public class Conseiller extends Employe {
	
/** Déclaration d'une variable chaine de caractères "idclient" clef etrangère */
	private String idClient;
	
/** déclaration d'une variable entier "nombre de clients" */ 
	private int nbClient;
	

/** constructeur par défaut de Conseiller */
	public Conseiller (){
		
	}
	
	/** Méthode permettant de verifier si l'on excède la limite du nombre de clients par conseiller */
	public void calculLimiteClients(){
		
	}
	
	/** méthode permettant de confirmer la modification apportée à un compte */
	public void confirmerModifCompte(){
		
	}
	
	/** méthode permettant de confirmer un virement */ 
	public void confirmerVirement(){
		
	}
	
	/** méthode permettant de valider la création d'une carte */
	public void validerCarte(){
		
	}
	
	/** méthode permettant de confirmer la mise en place d'un placement */
	public void validerPlacement(){
		
	}
	
	/** méthode permettant de confirmer la suppression d'un compte */
	public void confirmerSuppCompte(){
		
	}
	
	/** méthode permettant de confirmer la création d'un compte */ 
	public void confirmerCreaCompte(){
		
	}
	
	/** méthode permettant d'afficher le resultat d'une simulation de crédit */
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
