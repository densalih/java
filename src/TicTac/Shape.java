package TicTac;
import java.awt.event.*;
import javax.swing.*;
public class Shape extends JButton{
    private static String text1 = "X";
    private static String text2 = "O";
    private static String text= "";
    private static int count =0;
    private static boolean game=false;
    Shape(int i,int j) {

        setText(text);


        setBounds(i * 100, j * 100, 100, 100);

        addActionListener(new ActionListener() {
                              public void actionPerformed(ActionEvent e) {
                                  if (getText().equals(text)) {


                                      if (count % 2 != 0) {
                                          setText(text2);


                                      } else {
                                          setText(text1);

                                      }

                                      count++;

                                      if (count==9) {
                                          game=true;

                                          JOptionPane.showMessageDialog( null,"Game_Over.","Alert",JOptionPane.WARNING_MESSAGE);

                                      }
                                  }

                              }
                          }
        );


    }




    void setCount(int count) {
        this.count=count;
    }

    public int getCount()
    {
        return count;
    }
    public boolean getGame() {
        return game;
    }



}
