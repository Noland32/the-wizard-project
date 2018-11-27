package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
	
	private Outfit outfit;
	
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
