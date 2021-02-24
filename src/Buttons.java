import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    boolean myTurn = true;
    JButton reset;
    JButton[] button = new JButton[9];

    public Buttons() {

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("");
            button[i].addActionListener(this);
            add(button[i]);

        }
        reset = new JButton("RESET");
        reset.addActionListener(this);
        add(reset);

        setLayout(new GridLayout(4, 3));
    }

    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source .equals(reset)){
            for (int i = 0; i < button.length; i++){
                button[i].setText("");
                button[i].setEnabled(true);
                button[i].setBackground(Color.WHITE);
            }
        }
        
        myTurn = !myTurn;

        String symbol = "X";
        
        if(myTurn){
            symbol = "O";
        }

        for(int i = 0; i < button.length; i++) {
            if(source.equals(button[i])){
                button[i].setText(""+symbol);
                button[i].setEnabled(false);
                checkResult();}
            }
        }
     public void checkResult(){

    String[] s = new String[9];
      
        for(int fi = 0; fi < 3; fi++){
            for(int i = fi*3; i < (fi*3)+3; i++){
            s[i] = button[i].getText();
              }
              int i = fi*3;
              System.out.println(i);
              if (s[i].equals(s[i+1]) && s[i].equals(s[i+2]) && !s[i].equals("")) {
                button[i].setBackground(Color.GREEN);
                button[i+1].setBackground(Color.GREEN);
                button[i+2].setBackground(Color.GREEN);
                button[i].setEnabled(false);    
            }

             if(s[0].equals(s[4]) && s[4].equals(s[8]) && s[0] != ""){
                button[0].setBackground(Color.GREEN);
                button[4].setBackground(Color.GREEN);
                button[8].setBackground(Color.GREEN);
                 button[i].setEnabled(false);
                    
            }if(s[2].equals(s[4]) && s[4].equals(s[6]) && s[2] != ""){
                button[2].setBackground(Color.GREEN);
                button[4].setBackground(Color.GREEN);
                button[6].setBackground(Color.GREEN);
                button[i].setEnabled(false);
                    }
            }
        }   
    }


   
 


