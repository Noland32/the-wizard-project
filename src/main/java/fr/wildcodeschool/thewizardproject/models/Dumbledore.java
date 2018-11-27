package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("DumbledoreId")
public class Dumbledore implements WizardInterface {
	
	

	@Override
	public String giveAdvice() {
		return "La peur d'un nom ne fait qu'accroître la peur de la chose elle-même";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return null;
	}

}
