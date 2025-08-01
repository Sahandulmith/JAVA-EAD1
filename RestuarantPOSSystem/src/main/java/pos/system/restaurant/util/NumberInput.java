
package pos.system.restaurant.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class NumberInput {

    public void intValidator(JTextField txtField) {
        txtField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                 char d = e.getKeyChar();
                if (!(Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
    }
     public void doubleValidator(JTextField txtField) {
        txtField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                 char d = e.getKeyChar();
                if (!(Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)||(c == KeyEvent.VK_PERIOD))) {
                    e.consume();
                }
            }
        });
    }
     
        public void intWithSpaceValidator(JTextField txtField) {

        txtField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                 char d = e.getKeyChar();
                if (!(Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
    }
}
