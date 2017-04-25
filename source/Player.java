import java.util.ArrayList;

/** Player is a representation of player */

public class Player {

    private Illuminati illuminati;
    private int diceRollOutcome;
    private int actionsTaken;
    private ArrayList<SpecialCard> specialCards;
    private boolean interfereFlag;

    public Player() {
	diceRollOutcome = 0;
	actionsTaken = 0;
	specialCards = new ArrayList<SpecialCard>();
	interfereFlag = false;
    }

    public Player(Illuminati illuminati) {
	this.illuminati = illuminati;
	diceRollOutcome = 0;
	actionsTaken = 0;
	specialCards = new ArrayList<SpecialCard>();
	interfereFlag = false;
    }

    public void setIlluminati(Illuminati illuminati) {
	this.illuminati = illuminati;
    }

    public Illuminati getIlluminati() {
	return this.illuminati;
    }

    public void addSpecialCard(SpecialCard specialCard) {
	specialCards.add(specialCard);
    }

    public void useSpecialCard(int choice) {
	specialCards.get(choice).useSpecialCardEffect();
    }

    // Roll dice value from 2 to 12
    public void rollDie() {

	int highestRange = 12;
	int lowestRange = 2;
	diceRollOutcome = (int) (Math.random() * highestRange) + lowestRange;

    }

    public int getDiceRollOutcome() {
	return diceRollOutcome;
    }

    public int getActionsTaken() {
	return actionsTaken;
    }

    public void takeAction() {
	actionsTaken--;
    }

    /**
     * After the player is done with his turn, then his number of actions taken
     * is set back to 0
     */
    public void resetAction() {
	actionsTaken = 0;
    }

    /** Player interferes an attack */
    public void interfere() {
	interfereFlag = true;
    }

    /**
     * After the player is done with his turn, then his interference is set back
     * to false
     */
    public void resetInterfere() {
	interfereFlag = false;
    }

    /**
     * Remove this method since the power structured should be already be
     * displayed via the gameUI class public void displayPowerStructure(){
     * 
     * }
     */

}
