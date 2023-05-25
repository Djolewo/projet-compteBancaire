package dgg.com.projet_comptes.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue; 

@Entity
@DiscriminatorValue("CC")// qui signifie que la colonne type-compte egale a CC
public class CompteCourant extends Compte{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(String codeCompte, Date dateCreation, double solde, Client client, double decouvert) {
		super(codeCompte, dateCreation, solde, client);
		this.decouvert = decouvert;
	}
	

}
