package Test;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class SimpleClickListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked аt " + e.getX() + "," + e.getY());

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.addMouseListener(new SimpleClickListener());
        jf.setVisible(true);

    }
}

