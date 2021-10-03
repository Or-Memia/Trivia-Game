import biuoop.DrawSurface;
import biuoop.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CorrectScreen implements ActionListener {

    boolean flag = true;
    private JLabel lable;
    private JFrame frame;
    private JButton button;
    private JPanel panel;

    public CorrectScreen(boolean flag){
        this.flag = flag;
        frame = new JFrame();
        button = new JButton("click here to continue");
        button.addActionListener(this);
        lable = new JLabel("Correct!");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,10,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(lable);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Trivia Game");
        frame.pack();
        frame.setVisible(true);
    }

//    public void getGui() {
//        try{Thread.sleep(5000);}
//        catch(InterruptedException ignored){
//
//        }
//        gui = new GUI("Game Screen", 800, 600);
//        DrawSurface d = this.gui.getDrawSurface();
//        d.setColor(Color.black);
//        drawOn(d);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        flag = false;
        frame.dispose();

    }

    public boolean checkFlag() {
        return flag;
    }

//    public void drawOn(DrawSurface d){
//        d.drawText(160, d.getHeight() / 2, "correct! keep going", 32);
//    }
}
