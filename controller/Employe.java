package controller;

/** 
 * Classe abstraite Employé hérite de la classe Personne
 * @author Soizic et Taha
 * @version 1.0
 *
 */
public abstract class Employe extends Personne {
	
	/** Déclaration d'une variable chaine de caractères "login (nom d'utilisateur)" */
	private String login;
	
	/** Déclaration d'une variable chaine de caractères "password (mot de passe)" */
	private String password;


public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
/** constructeur par défaut de Employe */
public Employe (){
	
}
/** méthode permettant d'autoriser la connexion à la base de données proxibanque */ 
public void AutoriserConnextionProxibanque(){
	
}
}
