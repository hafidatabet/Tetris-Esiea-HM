package Interface;

import TetrisHM.Tetris;
import sun.plugin2.message.SetJVMIDMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;


/**
 * Created by Dadoo on 02/04/2016.
 */
public class Fenetre extends Frame {

    public Fenetre() {
        Frame frame = new Frame("Tetris*Hafida&Myriam*");
        Tetris tetris = new Tetris();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(600, 700);
        frame.setResizable(false);
        frame.setVisible(true);
    }


}

