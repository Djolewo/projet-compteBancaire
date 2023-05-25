package dgg.com.projet_comptes.entities;
import javax.persistence.Entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation{

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(Date dateOperation, double montant, Compte compte) {
		super(dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}
	

}
