package controller;

/** 
 * Classe concrète gestion compte
 * @author Soizic et Taha
 * @version 1.0
 *
 */
public class GestionCompte {

	/** Déclaration d'une variable chaine de caractères "id compte" clef etrangère*/	
	public String idCompte;
	/** Déclaration d'une variable chaine de caractères "id virement" clef etrangère*/	
	public String idVirement;
	/** Déclaration d'une variable chaine de caractères "id audit" clef etrangère*/	
	public String idAudit;
	/** Déclaration d'une variable chaine de caractères "id conseiller" clef etrangère*/	
	public String idConseiller;
	/** Déclaration d'une variable chaine de caractères "id carte" clef etrangère*/	
	public String idCarte;
	/** Déclaration d'une variable chaine de caractères "id placement" clef etrangère*/	
	public String idPlacement;
	/** Déclaration d'une variable chaine de caractères "nom du client" */	
	public String nomClient;
	/** Déclaration d'une variable chaine de caractères "prénom du client" */	
	public String prenomClient;
	/** Déclaration d'une variable chaine de caractères "adresse du client" */	
	public String adresseClient;
	/** Déclaration d'une variable numérique "code postal du client" */	
	public int cpClient;
	/** Déclaration d'une variable chaine de caractères "ville du client" */	
	public String villeClient;
	/** Déclaration d'une variable numérique "numéro de téléphone du client" */	
	public String telephoneClient;
	/** Déclaration d'une variable chaine de caractères "adresse mail du client" */	
	public String emailClient;
	/** Déclaration d'une variable numérique "taux de rémunération du compte épargne" */	
	public float tauxRemuneration;
	/** Déclaration d'une variable numérique "autorisation de découvert du compte courant" */	
	public int autorisationDecouvert;
	/** Déclaration d'une variable chaine de caractères "type du client" */	
	public String typeClient;
	/** Déclaration d'une variable chaine de caractères "date d'ouverture du compte" */	
	public String dateOuvertureCompte;

	/** méthode permettant d'analyser le compte en vue d'effectuer une simulation de crédit */
	public void AnalyserCredit(){
		}
	/** méthode permettant d'analyser le solde du compte lors d'un audit, notamment le fait qu'il ne soit pas débiteur au delà d'un certain seuil */
	public void AnalyserAudit(){	
	}
	/** méthode permettant de consulter le compte en vue d'un placement */
	public void VerifierComptePlacement(){	
	}
	/** méthode permettant de consulter le compte en vue d'un virement */
	public void ConsulterCompte(){	
	}
	/** méthode permettant de valider une opération suite à un virement */
	public void ResultatOperation(){	
	}
	/** méthode permettant de vérifier la présence d'un compte bénéficiaire au sein de ProxiBanque lors d'un virement */
	public void VerifierBeneficiaireVirement(){	
	}
	/** méthode permettant de vérifier que le compte soit un compte courant afin de lui associer une carte bancaire */
	public void VerifierAssociationCarte(){	
	}
	/** méthode permettant de modifier le solde d'un compte */
	public void ModifierSoldeCompte(){	
	}
	/** méthode permettant de créer un compte */
	public void CreerCompte(){	
	}
	/** méthode permettant de valider la création d'un compte */
	public void ValiderCreaCompte(){	
	}
	/** méthode permettant de modifier les informations client liées au compte */
	public void ModifierInfoCompte(){	
	}
	/** méthode permettant de valider les modifications apportées aux informations client liées au compte */
	public void ValiderModifCompte(){	
	}
	/** méthode permettant d'afficher les informations d'un compte */
	public void AfficherCompte(){	
	}
	/** méthode permettant de supprimer un compte */
	public void SupprimerCompte(){	
	}
	/** méthode permettant de valider la suppression d'un compte */
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
/** constructeur par défaut du gestion compte */
public GestionCompte(){
}
}