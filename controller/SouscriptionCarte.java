package controller;

/** 
 * Classe Concrete Souscription Carte  
 * @author Soizic et Taha
 * @version 1.0
 */

public abstract class SouscriptionCarte {
		
	/** D�claration d'une variable chaine de caract�res "num�ro de carte" */	
	private String numeroCarte;
	
	/** D�claration d'une variable chaine de caract�res "date d'expiration" */
	private String dateExpiration;
		
	/** D�claration d'une variable num�rique "code" */
	private int codeCarte;
		
	/** d�claration d'une variable chaine de caract�res "type de carte visa Electron ou Premier" */ 	
	private String typeCarte;
	
	/** d�claration d'une variable entier "id conseiller" clef �trang�re */
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
/** constructeur par d�faut de la souscription de carte */	
public SouscriptionCarte(){	
}

/** M�thode publique permettant de souscrire au service carte bancaire */
public void souscrireCarte(){
	
}

/** M�thode publique permettant de v�rifier la pr�sence d'un compte courant � associer � la carte */ 
public void validerAssociationCompte(){

}
}
