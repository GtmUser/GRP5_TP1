package controller;

/** 
 * Classe métier InvestissementPlacement concrete 
 * @author Soizic et Taha
 * @version 1.0
 */

public class InvestissementPlacement{
	
	/** Déclaration d'une variable chaine de caractères "idplacement" clef unique */
	public String idPlacement;
	
	/** Déclaration d'une variable chaine de caractères "idConseiller" clef étrangère */
    public String idConseiller;
    
    /** Déclaration d'une variable chaine de caractères "date à laquelle un placement a été effectué" */ 
    public String datePlacement;
    
	/** méthode permettant de vérifier la condition sur la fortune donnant droit à la gestion de patrimoine*/
    public void confirmerFortune(){
		
	}
	public String getIdPlacement() {
		return idPlacement;
	}
	public void setIdPlacement(String idPlacement) {
		this.idPlacement = idPlacement;
	}
	public String getIdConseiller() {
		return idConseiller;
	}
	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}
	public String getDatePlacement() {
		return datePlacement;
	}
	public void setDatePlacement(String datePlacement) {
		this.datePlacement = datePlacement;
	}
	/** méthode permettant d'effectuer des placements non toxiques dans le cadre de la gestion du patrimoine */	
	public void EffectuerPlacement(){
	}

	/** consturcteur par défault de la classe GestionPatrimoine */
	public InvestissementPlacement(){
			
	}
}
