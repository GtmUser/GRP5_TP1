package controller;

/** 
 * Classe m�tier InvestissementPlacement concrete 
 * @author Soizic et Taha
 * @version 1.0
 */

public class InvestissementPlacement{
	
	/** D�claration d'une variable chaine de caract�res "idplacement" clef unique */
	public String idPlacement;
	
	/** D�claration d'une variable chaine de caract�res "idConseiller" clef �trang�re */
    public String idConseiller;
    
    /** D�claration d'une variable chaine de caract�res "date � laquelle un placement a �t� effectu�" */ 
    public String datePlacement;
    
	/** m�thode permettant de v�rifier la condition sur la fortune donnant droit � la gestion de patrimoine*/
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
	/** m�thode permettant d'effectuer des placements non toxiques dans le cadre de la gestion du patrimoine */	
	public void EffectuerPlacement(){
	}

	/** consturcteur par d�fault de la classe GestionPatrimoine */
	public InvestissementPlacement(){
			
	}
}
