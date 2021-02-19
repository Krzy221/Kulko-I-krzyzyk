import javax.swing.*;

public class Buttons extends JPanel {
    private static final long serialVersionUID = 1L;
    JButton reset;
    JButton[] button = new JButton[9];
    public Buttons(){
        for (JButton b : button) {
            b = new JButton("");
            add(b);
        }

        
        reset = new JButton("RESET");
        add(reset);
    


    }

}

