package controller;

/** 
 * Classe Concrete Souscription Carte  
 * @author Soizic et Taha
 * @version 1.0
 */

public abstract class SouscriptionCarte {
		
	/** Déclaration d'une variable chaine de caractères "numéro de carte" */	
	private String numeroCarte;
	
	/** Déclaration d'une variable chaine de caractères "date d'expiration" */
	private String dateExpiration;
		
	/** Déclaration d'une variable numérique "code" */
	private int codeCarte;
		
	/** déclaration d'une variable chaine de caractères "type de carte visa Electron ou Premier" */ 	
	private String typeCarte;
	
	/** déclaration d'une variable entier "id conseiller" clef étrangère */
	private int idconseiller;
		
		
	public String getTypeCarte() {
		return typeCarte;
	}
	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}
	public int getIdconseiller() {
		return idconseiller;
	}
	public void setIdconseiller(int idconseiller) {
		this.idconseiller = idconseiller;
	}
	public String getNumerocarte() {
		return numeroCarte;
		}
	public void setNumerocarte(String numerocarte) {
		this.numeroCarte = numerocarte;
		}
	public String getDateexpiration() {
		return dateExpiration;
		}
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
		}
	public int getcodeCarte() {
		return codeCarte;
		}
	public void setcodeCarte(int codeCarte) {
		this.codeCarte = codeCarte;
		}
/** constructeur par défaut de la souscription de carte */	
public SouscriptionCarte(){	
}

/** Méthode publique permettant de souscrire au service carte bancaire */
public void souscrireCarte(){
	
}

/** Méthode publique permettant de vérifier la présence d'un compte courant à associer à la carte */ 
public void validerAssociationCompte(){

}
}
