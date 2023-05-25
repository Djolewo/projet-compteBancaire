package dgg.com.projet_comptes.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double taux;

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(String codeCompte, Date dateCreation, double solde, Client client) {
		super(codeCompte, dateCreation, solde, client);
		// TODO Auto-generated constructor stub
	}
	

}
