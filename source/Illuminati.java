/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theilluminatigame;

/**
 *
 * @author saidz
 */
import java.util.ArrayList;



public abstract class Illuminati extends Card implements Attack, cardStats, cardUpdateStats {
    private ArrayList<GroupCard> puppets = new ArrayList<GroupCard>();
    private final static int outgoingArrows = 4;
    private int income;
    private int treasury;
    private int power;
    private int transferrablePower;
    private Arrow top = new OutgoingArrow();
    private Arrow bottom = new OutgoingArrow();
    private Arrow left = new OutgoingArrow();
    private Arrow right = new OutgoingArrow();
    public Illuminati(String name, int type, int power, int tPower, int income,javax.swing.ImageIcon face) {
	super(name, type, power, tPower, income,face);
    }
    /*
     * An Illuminati has a max of 4 direct puppets, and an unlimited amount of indirect puppets 
     */
    public GroupCard getIlluminatiPuppet(int choice) {
	if ((choice > outgoingArrows) && (choice < 0)) {
	    // invalid choice
	}
	return null;
    }
    
    public void addIncomeAtStartOfTurn() {
	// this.treasury += this.income;
    }
    
    public void moveMegaBucks() {
    }
    
    public void movePuppets() {
    }
    
    public void useSpecialPowerActions(){
	if(this.getCardName() == "The Bavarian Illuminati"){
            }else if(this.getCardName() == "The Bermuda Triangle"){
	}
    }
    
    public void setTopArrow(Arrow direction) {
	top = direction;
    }
    
    public void setBottomArrow(Arrow direction) {
	bottom = direction;
    }
    
    public void setLeftArrow(Arrow direction) {
	left = direction;
    }
    
    public void setRightArrow(Arrow direction) {
	right = direction;
    }
}

