package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("GandalfId")
public class Gandalf implements WizardInterface {
	
	private Outfit outfit;
	
	@Autowired
	public Gandalf(Outfit theDressColor) {
		outfit = theDressColor;
	}

	@Override
	public String giveAdvice() {
		return "Vous ne passerez paaaaas";
	}

	@Override
	public String changeDress() {
		return this.outfit.dress();
	}

}
