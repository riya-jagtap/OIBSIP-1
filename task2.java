import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    private JButton checkButton;
    private JTextField message;
    private JTextField mynumber;
    private JTextField computerno;
    private JPanel mypanel;

    public task2() {
        checkButton.addActionListener(new ActionListener() {
            int noOfGuesses=0;

            @Override
            public void actionPerformed(ActionEvent e) {
                int myno=Integer.parseInt(mynumber.getText());
                int no2= (int) (Math.random()*10);

//                Random random=new Random();
//                this.no2=random.nextInt(100);


                noOfGuesses++;
                if(myno==no2){
                    message.setText("Congratulations Your guess is correct!! You guessed it in "+noOfGuesses+" attempts");
                }
                else if(myno < no2){
                    message.setText("Your Number is Smaller Try Again....");
                }
                else if (myno > no2){
                    message.setText("Your Number is greater Try Again....");
                }

                computerno.setText(Integer.toString(no2));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame=new JFrame("Guess The Number");
        frame.setContentPane(new task2().mypanel);
        frame.setSize(450,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
