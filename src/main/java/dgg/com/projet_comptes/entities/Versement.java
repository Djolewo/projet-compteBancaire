package dgg.com.projet_comptes.entities;

import javax.persistence.Entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Date dateOperation, double montant, Compte compte) {
		super(dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}

}
