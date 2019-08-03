package controller;

/** 
 * Classe concr�te gestion compte
 * @author Soizic et Taha
 * @version 1.0
 *
 */
public class GestionCompte {

	/** D�claration d'une variable chaine de caract�res "id compte" clef etrang�re*/	
	public String idCompte;
	/** D�claration d'une variable chaine de caract�res "id virement" clef etrang�re*/	
	public String idVirement;
	/** D�claration d'une variable chaine de caract�res "id audit" clef etrang�re*/	
	public String idAudit;
	/** D�claration d'une variable chaine de caract�res "id conseiller" clef etrang�re*/	
	public String idConseiller;
	/** D�claration d'une variable chaine de caract�res "id carte" clef etrang�re*/	
	public String idCarte;
	/** D�claration d'une variable chaine de caract�res "id placement" clef etrang�re*/	
	public String idPlacement;
	/** D�claration d'une variable chaine de caract�res "nom du client" */	
	public String nomClient;
	/** D�claration d'une variable chaine de caract�res "pr�nom du client" */	
	public String prenomClient;
	/** D�claration d'une variable chaine de caract�res "adresse du client" */	
	public String adresseClient;
	/** D�claration d'une variable num�rique "code postal du client" */	
	public int cpClient;
	/** D�claration d'une variable chaine de caract�res "ville du client" */	
	public String villeClient;
	/** D�claration d'une variable num�rique "num�ro de t�l�phone du client" */	
	public String telephoneClient;
	/** D�claration d'une variable chaine de caract�res "adresse mail du client" */	
	public String emailClient;
	/** D�claration d'une variable num�rique "taux de r�mun�ration du compte �pargne" */	
	public float tauxRemuneration;
	/** D�claration d'une variable num�rique "autorisation de d�couvert du compte courant" */	
	public int autorisationDecouvert;
	/** D�claration d'une variable chaine de caract�res "type du client" */	
	public String typeClient;
	/** D�claration d'une variable chaine de caract�res "date d'ouverture du compte" */	
	public String dateOuvertureCompte;

	/** m�thode permettant d'analyser le compte en vue d'effectuer une simulation de cr�dit */
	public void AnalyserCredit(){
		}
	/** m�thode permettant d'analyser le solde du compte lors d'un audit, notamment le fait qu'il ne soit pas d�biteur au del� d'un certain seuil */
	public void AnalyserAudit(){	
	}
	/** m�thode permettant de consulter le compte en vue d'un placement */
	public void VerifierComptePlacement(){	
	}
	/** m�thode permettant de consulter le compte en vue d'un virement */
	public void ConsulterCompte(){	
	}
	/** m�thode permettant de valider une op�ration suite � un virement */
	public void ResultatOperation(){	
	}
	/** m�thode permettant de v�rifier la pr�sence d'un compte b�n�ficiaire au sein de ProxiBanque lors d'un virement */
	public void VerifierBeneficiaireVirement(){	
	}
	/** m�thode permettant de v�rifier que le compte soit un compte courant afin de lui associer une carte bancaire */
	public void VerifierAssociationCarte(){	
	}
	/** m�thode permettant de modifier le solde d'un compte */
	public void ModifierSoldeCompte(){	
	}
	/** m�thode permettant de cr�er un compte */
	public void CreerCompte(){	
	}
	/** m�thode permettant de valider la cr�ation d'un compte */
	public void ValiderCreaCompte(){	
	}
	/** m�thode permettant de modifier les informations client li�es au compte */
	public void ModifierInfoCompte(){	
	}
	/** m�thode permettant de valider les modifications apport�es aux informations client li�es au compte */
	public void ValiderModifCompte(){	
	}
	/** m�thode permettant d'afficher les informations d'un compte */
	public void AfficherCompte(){	
	}
	/** m�thode permettant de supprimer un compte */
	public void SupprimerCompte(){	
	}
	/** m�thode permettant de valider la suppression d'un compte */
	public void ValiderSuppCompte(){	
	}

public String getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}
	public String getIdVirement() {
		return idVirement;
	}
	public void setIdVirement(String idVirement) {
		this.idVirement = idVirement;
	}
	public String getIdAudit() {
		return idAudit;
	}
	public void setIdAudit(String idAudit) {
		this.idAudit = idAudit;
	}
	public String getIdConseiller() {
		return idConseiller;
	}
	public void setIdConseiller(String idConseiller) {
		this.idConseiller = idConseiller;
	}
	public String getIdCarte() {
		return idCarte;
	}
	public void setIdCarte(String idCarte) {
		this.idCarte = idCarte;
	}
	public String getIdPlacement() {
		return idPlacement;
	}
	public void setIdPlacement(String idPlacement) {
		this.idPlacement = idPlacement;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	public int getCpClient() {
		return cpClient;
	}
	public void setCpClient(int cpClient) {
		this.cpClient = cpClient;
	}
	public String getVilleClient() {
		return villeClient;
	}
	public void setVilleClient(String villeClient) {
		this.villeClient = villeClient;
	}
	public String getTelephoneClient() {
		return telephoneClient;
	}
	public void setTelephoneClient(String telephoneClient) {
		this.telephoneClient = telephoneClient;
	}
	public String getEmailClient() {
		return emailClient;
	}
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	public float getTauxRemuneration() {
		return tauxRemuneration;
	}
	public void setTauxRemuneration(float tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	public int getAutorisationDecouvert() {
		return autorisationDecouvert;
	}
	public void setAutorisationDecouvert(int autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}
	public String getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	public String getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}
	public void setDateOuvertureCompte(String dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}
/** constructeur par d�faut du gestion compte */
public GestionCompte(){
}
}