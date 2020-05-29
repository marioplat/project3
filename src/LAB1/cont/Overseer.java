package LAB1.cont;

import LAB1.view.Window;
import java.util.ArrayList;

public class Overseer {

	//instance variables
    private Window _w;
    private static final String[] buttons = { "Card 1", "Card 2", "Card 3", "Card 4", "Card 5", "Card 6", "Card 7", "Card 8", "Card 9", "Card 10", "Card 11", "Card 12", "HELP", "EXIT" };
    
    //constructor
    public Overseer() {
    	_w = new Window();
        matchcheck();
    }
    
    /*
     * This method checks everything the player can do in the game. If the player selects a card, it will change to a letter.
     * If the player selects another card that has the same letter as the previous selected card, the player achieves a match and they
     * will both stay open. If the player fails to do so, it will "flip" both cards and the player must do it again.
     */
    public void matchcheck() {
    	while(true) {
			int input = _w.option(buttons, "M   e   m   o   r   y \r\n G   a   m   e   !");
			
			
    		if(input == 0) {
    			buttons[0] = buttons[0].replace("Card 1", "A");
    			int selectCard = _w.option(buttons, "You selected Card 1: A" + "\r\n Which is the pair?");
    			if(selectCard == 2) {
    				_w.msg("Nice!");
        			buttons[0] = buttons[0].replace("A", "A");
        			buttons[2] = buttons[2].replace("Card 3", "A");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[0] = buttons[0].replace("A", "Card 1");
    			}
    		}
    		
    		
    		if(input == 1) {
    			buttons[1] = buttons[1].replace("Card 2", "C");
    			int selectCard = _w.option(buttons, "You selected Card 2: C" + "\r\n Which is the pair?");
    			if(selectCard == 11) {
    				_w.msg("Nice!");
        			buttons[1] = buttons[1].replace("C", "C");
        			buttons[11] = buttons[11].replace("Card 12", "C");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[1] = buttons[1].replace("C", "Card 2");
    			}
    		}
    		
    		
    		if(input == 2) {
    			buttons[2] = buttons[2].replace("Card 3", "A");
    			int selectCard = _w.option(buttons, "You selected Card 3: A" + "\r\n Which is the pair?");
    			if(selectCard == 0) {
    				_w.msg("Nice!");
        			buttons[2] = buttons[2].replace("A", "A");
        			buttons[0] = buttons[0].replace("Card 1", "A");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[2] = buttons[2].replace("A", "Card 3");
    			}
    		}
    		
    		
    		if(input == 3) {
    			buttons[3] = buttons[3].replace("Card 4", "D");
    			int selectCard = _w.option(buttons, "You selected Card 4: D" + "\r\n Which is the pair?");
    			if(selectCard == 7) {
    				_w.msg("Nice!");
        			buttons[3] = buttons[3].replace("D", "D");
        			buttons[7] = buttons[7].replace("Card 8", "D");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[3] = buttons[3].replace("D", "Card 4");
    			}
    		}
    		
    		
    		if(input == 4) {
    			buttons[4] = buttons[4].replace("Card 5", "B");
    			int selectCard = _w.option(buttons, "You selected Card 5: B" + "\r\n Which is the pair?");
    			if(selectCard == 10) {
    				_w.msg("Nice!");
        			buttons[4] = buttons[4].replace("B", "B");
        			buttons[10] = buttons[10].replace("Card 11", "B");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[4] = buttons[4].replace("B", "Card 5");
    			}
    		}
    		
    		
    		if(input == 5) {
    			buttons[5] = buttons[5].replace("Card 6", "E");
    			int selectCard = _w.option(buttons, "You selected Card 6: E" + "\r\n Which is the pair?");
    			if(selectCard == 8) {
    				_w.msg("Nice!");
        			buttons[5] = buttons[5].replace("E", "E");
        			buttons[8] = buttons[8].replace("Card 9", "E");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[5] = buttons[5].replace("E", "Card 6");
    			}
    		}
    		
    		
    		if(input == 6) {
    			buttons[6] = buttons[6].replace("Card 7", "F");
    			int selectCard = _w.option(buttons, "You selected Card 7: F" + "\r\n Which is the pair?");
    			if(selectCard == 9) {
    				_w.msg("Nice!");
        			buttons[6] = buttons[6].replace("F", "F");
        			buttons[9] = buttons[9].replace("Card 10", "F");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[6] = buttons[6].replace("F", "Card 7");
    			}
    		}
    		
    		
    		if(input == 7) {
    			buttons[7] = buttons[7].replace("Card 8", "D");
    			int selectCard = _w.option(buttons, "You selected Card 8: D" + "\r\n Which is the pair?");
    			if(selectCard == 3) {
    				_w.msg("Nice!");
        			buttons[7] = buttons[7].replace("D", "D");
        			buttons[3] = buttons[3].replace("Card 4", "D");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[7] = buttons[7].replace("D", "Card 8");
    			}
    		}
    		
    		
    		if(input == 8) {
    			buttons[8] = buttons[8].replace("Card 9", "E");
    			int selectCard = _w.option(buttons, "You selected Card 9: E" + "\r\n Which is the pair?");
    			if(selectCard == 5) {
    				_w.msg("Nice!");
        			buttons[8] = buttons[8].replace("E", "E");
        			buttons[5] = buttons[5].replace("Card 6", "E");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[8] = buttons[8].replace("E", "Card 9");
    			}
    		}
    		
    		
    		if(input == 9) {
    			buttons[9] = buttons[9].replace("Card 10", "F");
    			int selectCard = _w.option(buttons, "You selected Card 10: F" + "\r\n Which is the pair?");
    			if(selectCard == 6) {
    				_w.msg("Nice!");
        			buttons[9] = buttons[9].replace("F", "F");
        			buttons[6] = buttons[6].replace("Card 7", "F");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[9] = buttons[9].replace("F", "Card 10");
    			}
    		}
    		
    		
    		if(input == 10) {
    			buttons[10] = buttons[10].replace("Card 11", "B");
    			int selectCard = _w.option(buttons, "You selected Card 11: B" + "\r\n Which is the pair?");
    			if(selectCard == 4) {
    				_w.msg("Nice!");
        			buttons[10] = buttons[10].replace("B", "B");
        			buttons[4] = buttons[4].replace("Card 5", "B");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[10] = buttons[10].replace("B", "Card 11");
    			}
    		}
    		
    		
    		if(input == 11) {
    			buttons[11] = buttons[11].replace("Card 12", "C");
    			int selectCard = _w.option(buttons, "You selected Card 12: C" + "\r\n Which is the pair?");
    			if(selectCard == 1) {
    				_w.msg("Nice!");
        			buttons[11] = buttons[11].replace("C", "C");
        			buttons[1] = buttons[1].replace("Card 2", "C");
    			}
    			else {
    				_w.msg("Nope");
        			buttons[11] = buttons[11].replace("C", "Card 12");
    			}
    		}
    		
    		
    		if(input == 12) {
    			_w.msg(" Try and match pairs to complete the game! \r\n Each card has a letter and you must choose another card with the same letter in order to complete the pair.");
    		}
    		
    		
    		if(input == 13) {
    			System.exit(0);
    		}
    	}
    }
}