/*Colette Abadie
CS110
War*/

import javax.swing.*;
import java.awt.*;

public class CreateWindow extends JFrame
{
   /**Constructor*/
   public CreateWindow()
   {
      final int WINDOW_WIDTH = 600; //window width in pixels
      final int WINDOW_HEIGHT = 500;//window height in pixels
      
      //create a window
      JFrame window = new JFrame();
      
      //set the title
      setTitle("War");
      
      //set the size of the window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      //close window
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //create layout
      setLayout(new GridLayout(2,3));
      
      //add images
      ImageIcon back;
      back = new ImageIcon("back.jpg");
      ImageIcon p1Card;
      p1Card = new ImageIcon("8d.jpg");
      ImageIcon p2Card;
      p2Card = new ImageIcon("queens.jpg");
      
      //create Buttons
      JButton button1 = new JButton(back);
      JButton button2 = new JButton(back);
      JButton button3 = new JButton(p1Card);
      JButton button4 = new JButton(p2Card);
      JButton button5 = new JButton(back);
      JButton button6 = new JButton(back);
      
      //add panels to the content pane
      add(button1);
      add(button2);
      add(button3);
      add(button4);
      add(button5);
      add(button6);
      
      //display the window
      setVisible(true);
   }
   
   public void DealCards()
   {
      //create card deck
      final int SPADESACE = 1;
      final int SPADES2 = 2;
      final int SPADES3 = 3;
      final int SPADES4 = 4;
      final int SPADES5 = 5;
      final int SPADES6 = 6;
      final int SPADES7 = 7;
      final int SPADES8 = 8;
      final int SPADES9 = 9;
      final int SPADES10 = 10;
      final int SPADESJACK = 11;
      final int SPADESQUEEN = 12;
      final int SPADESKING = 13;
      
      final int CLUBSACE = 1;
      final int CLUBS2 = 2;
      final int CLUBS3 = 3;
      final int CLUBS4 = 4;
      final int CLUBS5 = 5;
      final int CLUBS6 = 6;
      final int CLUBS7 = 7;
      final int CLUBS8 = 8;
      final int CLUBS9 = 9;
      final int CLUBS10 = 10;
      final int CLUBSJACK = 11;
      final int CLUBSQUEEN = 12;
      final int CLUBSKING = 13;
      
      final int HEARTSACE = 1;
      final int HEARTS2 = 2;
      final int HEARTS3 = 3;
      final int HEARTS4 = 4;
      final int HEARTS5 = 5;
      final int HEARTS6 = 6;
      final int HEARTS7 = 7;
      final int HEARTS8 = 8;
      final int HEARTS9 = 9;
      final int HEARTS10 = 10;
      final int HEARTSJACK = 11;
      final int HEARTSQUEEN = 12;
      final int HEARTSKING = 13;
     
      final int DIAMONDSACE = 1;
      final int DIAMONDS2 = 2;
      final int DIAMONDS3 = 3;
      final int DIAMONDS4 = 4;
      final int DIAMONDS5 = 5;
      final int DIAMONDS6 = 6;
      final int DIAMONDS7 = 7;
      final int DIAMONDS8 = 8;
      final int DIAMONDS9 = 9;
      final int DIAMONDS10 = 10;
      final int DIAMONDSJACK = 11;
      final int DIAMONDSQUEEN = 12;
      final int DIAMONDSKING = 13;
      
      //create cards array
      int[] deck = { SPADESACE, SPADES2, SPADES3, SPADES4, SPADES5, SPADES6, SPADES7, SPADES8, SPADES9, SPADES10, SPADESJACK, SPADESQUEEN, SPADESKING,
                     CLUBSACE, CLUBS2, CLUBS3, CLUBS4, CLUBS5, CLUBS6, CLUBS7, CLUBS8, CLUBS9, CLUBS10, CLUBSJACK, CLUBSQUEEN, CLUBSKING,
                     HEARTSACE, HEARTS2, HEARTS3, HEARTS4, HEARTS5, HEARTS6, HEARTS7, HEARTS8, HEARTS9, HEARTS10, HEARTSJACK, HEARTSQUEEN, HEARTSKING,
                     DIAMONDSACE, DIAMONDS2, DIAMONDS3, DIAMONDS4, DIAMONDS5, DIAMONDS6, DIAMONDS7, DIAMONDS8, DIAMONDS9, DIAMONDS10, DIAMONDSJACK, DIAMONDSQUEEN, DIAMONDSKING};
      for(int i = 0; i < deck.length; i++) 
      {
          int r = i + (int) (Math.random() * (deck.length - i));
          int t = deck[r];
          deck[r] = deck[i];
          deck[i] = t;
      }
      
      //deal cards
      int PLAYERS = 2;
      int CARDS_PER_PLAYER = 26;
      for(int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++)
      {
         int player1[i] = deck[i];
         i++;
         int player2[i] = deck[i];
         System.out.println(deck[i]);
      }
   }
   
   public static void main(String[] args)
   {
      new CreateWindow();
   }
}