package PanelsWithTimers;
// here, I have the colours changing, and the labels changing from one event listener - each. No hard code.

import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        setSize(800, 400);
        setTitle("Simonish Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);

    }
}