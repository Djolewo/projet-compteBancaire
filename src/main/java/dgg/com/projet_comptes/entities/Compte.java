package dgg.com.projet_comptes.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Collection;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) // POUR GERER LES RELATIONS D'HERITAGE
@DiscriminatorColumn(name="TYPE_COMPTE",discriminatorType=DiscriminatorType.STRING,length=2)// cette table type compte permet de stocker les informations sur le type de compte
public class Compte implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id // ici on ne met pas @GeneratedValue parceque la clé primaire est string
	private String codeCompte;
	private Date dateCreation;
	private double solde;
	@ManyToOne // Parcequ'un client peut avoir un ou plusieurs comptes
	@JoinColumn(name="CODE_CLIENT")
	private Client client; // vu qu'un compte appartient forcement a un client alors on inclu client
	@OneToMany(mappedBy="compte")
	private Collection<Operation> operation;
	public String getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<Operation> getOperation() {
		return operation;
	}
	public void setOperation(Collection<Operation> operation) {
		this.operation = operation;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String codeCompte, Date dateCreation, double solde, Client client) {
		super();
		this.codeCompte = codeCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
	}
	
	
	
	

}
