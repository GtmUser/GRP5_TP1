package controller;

/** 
 * Classe abstraite Employ� h�rite de la classe Personne
 * @author Soizic et Taha
 * @version 1.0
 *
 */
public abstract class Employe extends Personne {
	
	/** D�claration d'une variable chaine de caract�res "login (nom d'utilisateur)" */
	private String login;
	
	/** D�claration d'une variable chaine de caract�res "password (mot de passe)" */
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
/** constructeur par d�faut de Employe */
public Employe (){
	
}
/** m�thode permettant d'autoriser la connexion � la base de donn�es proxibanque */ 
public void AutoriserConnextionProxibanque(){
	
}
}
