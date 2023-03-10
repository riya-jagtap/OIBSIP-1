import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Online_exam extends JFrame implements ActionListener{

    private static final long serialVersionUID =1L;

    JLabel label;
    JRadioButton radioButton[] = new JRadioButton[5];
    JButton btnNext, btnBookmark;
    ButtonGroup bg;
    int count=0, current=0,x=1,y=1,now=0;
    int m[]=new int[10];

    Online_exam(String s){
        super(s);
        label=new JLabel();
        add(label);
        bg=new ButtonGroup();
        for (int i=0;i<5;i++){
            radioButton[i]=new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }

        btnNext=new JButton("Next");
        btnBookmark=new JButton("Bookmark");
        btnNext.addActionListener(this);
        btnBookmark.addActionListener(this);
        add(btnNext);
        add(btnBookmark);
        set();
        label.setBounds(30,40,450,20);
        radioButton[0].setBounds(50,80,450,20);
        radioButton[1].setBounds(50,110,200,20);
        radioButton[2].setBounds(50,140,200,20);
        radioButton[3].setBounds(50,170,200,20);
        btnNext.setBounds(100,240,100,30);
        btnBookmark.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnNext){
            if (check())
                count=count+1;
            current++;
            set();
            if(current==9){
                btnNext.setEnabled(false);
                btnBookmark.setText("Result");
            }
        }
        if(e.getActionCommand().equals("Bookmark")){
            JButton bk=new JButton("Bookmark" + x);
            bk.setBounds(480,20+30*x,100,30);
            add(bk);
            bk.addActionListener(this);
            m[x]=current;
            x++;
            current++;
            set();
            if (current==9)
                btnBookmark.setText("Result");
            setVisible(false);
            setVisible(true);
        }
        for (int i=0,y=1;i<x;i++,y++){
            if(e.getActionCommand().equals("Bookmark" + y)){
                if(check())
                    count=count+1;
                now=current;
                current=m[y];
                set();
                ((JButton)e.getSource()).setEnabled(false);
                current=now;
            }
        }
        if(e.getActionCommand().equals("Result")){
            if(check())
                count=count+1;
            current++;
            JOptionPane.showMessageDialog(this,"Your Score is: "+count*10+"/100");
            System.exit(0);
        }
    }

    void set(){
        radioButton[4].setSelected(true);
        if (current == 0){
            label.setText("Que1: Who is the inventor of Artificial Intelligence?");
            radioButton[0].setText("Geoffrey Hinton");
            radioButton[1].setText("Andrew Ng");
            radioButton[2].setText("John McCarthy");
            radioButton[3].setText("Jurgen Schmidhuber");

        }
        if (current == 1){
            label.setText("Que2: Which of the following is the branch of AI?");
            radioButton[0].setText("Machine Learning");
            radioButton[1].setText("Cyber Forensic");
            radioButton[2].setText("Full-Stack Developer");
            radioButton[3].setText("Network Design");
        }
        if (current == 2){
            label.setText("Que3: Which of the following is a component of AI?");
            radioButton[0].setText("Learning");
            radioButton[1].setText("Training");
            radioButton[2].setText("Designing");
            radioButton[3].setText("Puzzling");
        }
        if (current == 3){
            label.setText("Que4: Which is the following is not a type of AI?");
            radioButton[0].setText("Learning AI agent");
            radioButton[1].setText("Goal-Based AI agent");
            radioButton[2].setText("Simple reflex AI agent");
            radioButton[3].setText("Unity-based AI agent");
        }
        if (current == 4){
            label.setText("Que5: Which of the following is not the commonly used \nprogramming language for AI?");
            radioButton[0].setText("Perl");
            radioButton[1].setText("Java");
            radioButton[2].setText("PROLOG");
            radioButton[3].setText("LISP");
        }
        if (current == 5){
            label.setText("Que6: Which of the following is not an application of AI?");
            radioButton[0].setText("Face recognition System");
            radioButton[1].setText("Chatbots");
            radioButton[2].setText("LIDAR");
            radioButton[3].setText("DBMS");
        }
        if (current == 6){
            label.setText("Que7: Which of the following is an advantage of AI?");
            radioButton[0].setText("Reduces the time taken to solve the problems");
            radioButton[1].setText("Helps in providing security");
            radioButton[2].setText("Have the ability to think hence makes the work easier");
            radioButton[3].setText("All of the above");
        }
        if (current == 7){
            label.setText("Que8: Which of the following environment is strategic?");
            radioButton[0].setText("Rational");
            radioButton[1].setText("Deterministic");
            radioButton[2].setText("Partial");
            radioButton[3].setText("Stochastic");
        }
        if (current == 8){
            label.setText("Que9: Which instruments are used for perceiving and \nacting upon the environment?");
            radioButton[0].setText("Sensors & Actuators");
            radioButton[1].setText("Sensors");
            radioButton[2].setText("Perceiver");
            radioButton[3].setText("None of the above");
        }
        if (current == 9){
            label.setText("Que10: Exploratory Learning is another name for?");
            radioButton[0].setText("Supervised Learning");
            radioButton[1].setText("Unsupervised Learning");
            radioButton[2].setText("Reinforcement Learning");
            radioButton[3].setText("Semi-Supervised Learning");
        }
        label.setBounds(30,40,450,20);
        for (int i=0,j=0;i<90;i+=30,j++)
            radioButton[j].setBounds(50,80+i,200,20);
    }
    boolean check(){
        if (current==0)
            return (radioButton[2].isSelected());
        if (current==1)
            return (radioButton[0].isSelected());
        if (current==2)
            return (radioButton[0].isSelected());
        if (current==3)
            return (radioButton[3].isSelected());
        if (current==4)
            return (radioButton[0].isSelected());
        if (current==5)
            return (radioButton[3].isSelected());
        if (current==6)
            return (radioButton[3].isSelected());
        if (current==7)
            return (radioButton[1].isSelected());
        if (current==8)
            return (radioButton[0].isSelected());
        if (current==9)
            return (radioButton[1].isSelected());
        return false;
    }

    public static void main(String s[]) {
        new Online_exam("Online Examination");
    }
}

