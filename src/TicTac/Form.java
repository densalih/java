package TicTac;

import javax.swing.*;

public class Form {
    public Shape [][] array = new Shape[3][3];
    public int Sum=0;


        Form() {

        JFrame f = new JFrame("Tictac");
            f.setSize(600, 600);
            f.setLayout(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            for(int i=0;i<array.length;i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = new Shape(i, j);
                    f.add(array[i][j]);

                }
            }






        f.setVisible(true);
        Sum=array[0][0].getCount();
    }
public int getSum(){
            return array[0][0].getCount();
        }


}
