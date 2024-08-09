
package pos.system.restaurant;

import pos.system.restaurant.guii.JFrameHome;
import pos.system.restaurant.guii.JFrameLogin;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import pos.system.restaurant.gui.dialo.JDialogCustomer;
import pos.system.restaurant.gui.dialog.au.JDialogSendMessage;
import pos.system.restaurant.guii.JDialogLogin;

import pos.system.restaurant.guii.JFrameLoading;
import pos.system.restaurant.guii.JFrameWindow;



public class RestuarantPOSSystem {

    public static void main(String[] args) {
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 8);//JButton
        UIManager.put("ProgressBar.arc", 999);//JProgressBar
        UIManager.put("TextComponent.arc", 8);//JTextField,JPasswordField,JFormattedTextField
        UIManager.put("CheckBox", 999);//JCheckBox
        UIManager.put("Component.arc", 8);//JComboBox,JSpinner

        UIManager.put("Component.innerFocusWidth", 2);//JComboBox, JTextField,JPasswordField,JFormattedTextField,JSpinner
        UIManager.put("Button.innerFocusWidth", 2);//JButton

        System.setProperty("flatlaf.menuBarEmbedded", "false");
      //JFrameHome home = new JFrameHome();
      //home.setVisible(true);
        //JFrameLogin login = new JFrameLogin();
        //login.setVisible(true);
        //JFrameLogin login =new JFrameLogin();
        //login.setVisible(true);
        
        JFrameLoading l = new JFrameLoading();
        l.setVisible(true);
        l.startProgress();

//        JDialogSendMessage a = new  JDialogSendMessage();
//        a.setVisible(true);

//            JDialogCustomer a = new JDialogCustomer();
//            a.setVisible(true);
           
    }
}
