package dgg.com.projet_comptes.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

@Entity //  ON MET ENTITY VU QU'UN CLIENT EST UNE ENTIT2 DANS LA BASE DE DONNEES et entity se met avant le public class
public class Client  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code;
	private String nom; // declaration des variables
	@OneToMany(mappedBy="client",fetch=FetchType.LAZY) // OneToMany parceque un client peut avoir plusieurs compte et vu que la clé de client se trouve dans compte, en creant compte on va inclure client
	private Collection<Compte> comptes; // vu qu'un client peut avoir plusieurs comptes en mettant collection on fait une association entre les deux classes client et comptes
    // apres avoir entrer les variables on creer les getters et les setters
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	// ensuite les constructeurs avec et sans parametres
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String nom) {
		super();
		this.nom = nom;
	}
	public Client(long code) {
		super();
		this.code = code;
	}
	
	
}
