
package pos.system.restaurant.gui.dialog.au;


import pos.system.restaurant.RestuarantPOSSystem;
import pos.system.restaurant.dao.impl.RoleDAOImpl;
import pos.system.restaurant.dao.impl.UserAccountDAOImpl;
import pos.system.restaurant.guii.JFrameHome;
import pos.system.restaurant.model.Role;
import pos.system.restaurant.model.UserAccount;
import pos.system.restaurant.util.ComboBoxList;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JDialogUserAccountAU extends javax.swing.JDialog {

    private RoleDAOImpl roleDAOImpl = new RoleDAOImpl();
    private UserAccountDAOImpl studentDAOImpl = new UserAccountDAOImpl();
    private JFrameHome jFrameHome;

    /**
     * Creates new form JDialogStudent
     */
    private UserAccount userAccount = new UserAccount();
    static String title = "";

    public JDialogUserAccountAU(JFrameHome jFrameSariPOS, boolean modal) {
        super(jFrameSariPOS, modal);
        initComponents();
        this.jFrameHome =jFrameSariPOS;
        setTitle("New user account");
        this.title = "New";
        jTextFieldFirstname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "FIRST NAME");
        jTextFieldSurname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SURNAME");
        jTextFieldUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        jTextFieldPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        comboBoxUserAccount();
        jCheckBoxActive.setSelected(true);
        jButtonSave.setIcon(new FlatSVGIcon("svg/save.svg",24,24));
        jButtonSave.setEnabled(false);
        

    }

    public JDialogUserAccountAU(JFrameHome jFrameHome, boolean modal, UserAccount userAccount, String title) {
        super(jFrameHome, modal);
        initComponents();
        setTitle("Update user account");
        this.userAccount = userAccount;
        this.title = title;
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        jTextFieldFirstname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "First name");
        jTextFieldSurname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Surname");
        jTextFieldUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        jTextFieldPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");
        comboBoxUserAccount();
        jTextFieldFirstname.setText(userAccount.getFirstname());
        jTextFieldSurname.setText(userAccount.getSurname());
        jTextFieldUsername.setText(userAccount.getUsername());
        jTextFieldPassword.setText(userAccount.getPassword());
        jCheckBoxActive.setSelected(userAccount.getActive());
        for (ComboBoxList a : this.roleDAOImpl.getList()) {
            a.setSelectedId(roleDAOImpl.getList(), String.valueOf(userAccount.getRole().getId()), jComboBoxRole);
        }
        displayPicture(userAccount);
        jButtonSave.setIcon(new FlatSVGIcon("svg/edit.svg",24,24));

    }

    public JDialogUserAccountAU(JFrameHome jFrameHome, boolean modal, String title, UserAccount userAccount) {
        super(jFrameHome, modal);
        initComponents();
        setTitle("Delete user account");
        this.userAccount = userAccount;
        this.title = title;
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(187, 187, 187));
        jTextFieldFirstname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "FIRST NAME");
        jTextFieldSurname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SURNAME");
        jTextFieldUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        jTextFieldPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        comboBoxUserAccount();
        jTextFieldFirstname.setText(userAccount.getFirstname());
        jTextFieldSurname.setText(userAccount.getSurname());
        jTextFieldUsername.setText(userAccount.getUsername());
        jTextFieldPassword.setText(userAccount.getPassword());
        jCheckBoxActive.setSelected(userAccount.getActive());
        for (ComboBoxList a : this.roleDAOImpl.getList()) {
            a.setSelectedId(roleDAOImpl.getList(), String.valueOf(userAccount.getRole().getId()), jComboBoxRole);
        }
        displayPicture(userAccount);
        jButtonSave.setIcon(new FlatSVGIcon("svg/delete.svg",24,24));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFirstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelPicture = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxActive = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldotp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonVerify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("FIRST NAME:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, 70, 30));

        jTextFieldFirstname.setPreferredSize(new java.awt.Dimension(64, 30));
        getContentPane().add(jTextFieldFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 250, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 30));

        jTextFieldSurname.setPreferredSize(new java.awt.Dimension(64, 30));
        getContentPane().add(jTextFieldSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 250, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "PHOTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no photo.jpg"))); // NOI18N
        jLabelPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPictureMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelPicture, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(210, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 210, 230));

        jTextFieldPassword.setMinimumSize(new java.awt.Dimension(64, 32));
        jTextFieldPassword.setPreferredSize(new java.awt.Dimension(64, 32));
        getContentPane().add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 250, -1));

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 168, 32));

        jComboBoxRole.setPreferredSize(new java.awt.Dimension(72, 32));
        getContentPane().add(jComboBoxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 250, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("SURNAME:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 70, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ROLE:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 100, 70, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("USERNAME:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 140, 70, 30));

        jTextFieldUsername.setMinimumSize(new java.awt.Dimension(64, 32));
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(64, 32));
        getContentPane().add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 250, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PASSWORD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 180, 70, 30));

        jCheckBoxActive.setText("ACTIVE");
        getContentPane().add(jCheckBoxActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 250, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 550, 1));

        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(64, 32));
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(64, 32));
        jTextFieldEmail.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldEmailMouseMoved(evt);
            }
        });
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });
        jTextFieldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextFieldEmailMouseExited(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 250, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email Addr:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 70, 30));

        jTextFieldotp.setMinimumSize(new java.awt.Dimension(64, 32));
        jTextFieldotp.setPreferredSize(new java.awt.Dimension(64, 32));
        getContentPane().add(jTextFieldotp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 250, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("OTP:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 30));

        jButtonVerify.setText("Verify OTP");
        jButtonVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerifyActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 168, 32));

        setSize(new java.awt.Dimension(589, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (this.title.equals("New")) {
            int response = JOptionPane.showConfirmDialog(jFrameHome, "Are you sure to save " + jTextFieldFirstname.getText() + " " + jTextFieldSurname.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                this.userAccount.setFirstname(jTextFieldFirstname.getText());
                this.userAccount.setSurname(jTextFieldSurname.getText());
                this.userAccount.setUsername(jTextFieldUsername.getText());
                this.userAccount.setPassword(jTextFieldPassword.getText());
                this.userAccount.setActive(jCheckBoxActive.isSelected());
                ComboBoxList roleId = (ComboBoxList) this.jComboBoxRole.getSelectedItem();
                Role role = new Role();
                role.setId(roleId.getId());
                this.userAccount.setRole(role);
                try {
                    validatePhoto();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(JDialogUserAccountAU.class.getName()).log(Level.SEVERE, null, ex);
                }
                studentDAOImpl.addUserAccount(userAccount);
                this.dispose();
            }
        } else if (this.title.equals("Update")) {
            int response = JOptionPane.showConfirmDialog(jFrameHome, "Are you sure to update " + jTextFieldFirstname.getText() + " " + jTextFieldSurname.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                this.userAccount.setFirstname(jTextFieldFirstname.getText());
                this.userAccount.setSurname(jTextFieldSurname.getText());
                this.userAccount.setUsername(jTextFieldUsername.getText());
                this.userAccount.setPassword(jTextFieldPassword.getText());
                this.userAccount.setActive(jCheckBoxActive.isSelected());
                ComboBoxList roleId = (ComboBoxList) this.jComboBoxRole.getSelectedItem();
                Role role = new Role();
                role.setId(roleId.getId());
                this.userAccount.setRole(role);
                try {
                    validatePhoto();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(JDialogUserAccountAU.class.getName()).log(Level.SEVERE, null, ex);
                }
                studentDAOImpl.updateUserAccount(userAccount);
                this.dispose();
            }
        } else if (this.title.equals("Delete")) {
            int response = JOptionPane.showConfirmDialog(jFrameHome, "Are you sure to delete " + jTextFieldFirstname.getText() + " " + jTextFieldSurname.getText() + " ?", "Save confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                studentDAOImpl.deleteUserAccount(userAccount);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jLabelPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPictureMouseClicked

        browse();
    }//GEN-LAST:event_jLabelPictureMouseClicked
    
    private static String randomCode;
    public static String toEmail;
    
    public static void sendVerificationCode(String toEmail, String userName) {
        String from = "sahanresturantandcafe@gmail.com";
        final String password = "hclk qdaj inxz cqkr";
        Random rand = new Random();
        randomCode = String.format("%06d", rand.nextInt(999999));
        String messageBody = "Hi " + userName + ",\n\nWe received a request to access your account " + toEmail + ". Through your email address. \n\nYour verification code is:\n" + randomCode + "\n\nThank You!";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        session.setDebug(true);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("Password Resetting Code");
            message.setText(messageBody);

            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Code sent successfully....", "Successfully", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Code sent successfully....");
            
        } catch (MessagingException mex) {
            mex.printStackTrace();
            System.out.println("Error sending code: " + mex.getMessage());
        }
    }
    
    private void jButtonVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerifyActionPerformed
        // TODO add your handling code here:
        String enteredOtp = jTextFieldotp.getText();
                if (enteredOtp.equals(randomCode)) {
                    JOptionPane.showMessageDialog(null, "OTP verified successfully!...", "Successfully", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("OTP verified successfully!");
                    jButtonVerify.setEnabled(false);
                    jButtonSave.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid OTP. Please try again....", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Invalid OTP. Please try again.");
                }
    }//GEN-LAST:event_jButtonVerifyActionPerformed

    private void jTextFieldEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEmailMouseExited
        // TODO add your handling code here:
                toEmail = jTextFieldEmail.getText();
                String userName = jTextFieldFirstname.getText();
                sendVerificationCode(toEmail, userName);
                
                jButtonVerify.setEnabled(true);
    }//GEN-LAST:event_jTextFieldEmailMouseExited

    private void jTextFieldEmailMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEmailMouseMoved
        // TODO add your handling code here:
                 
    }//GEN-LAST:event_jTextFieldEmailMouseMoved

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldEmailFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonVerify;
    private javax.swing.JCheckBox jCheckBoxActive;
    private javax.swing.JComboBox<Object> jComboBoxRole;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstname;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldSurname;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextFieldotp;
    // End of variables declaration//GEN-END:variables

    private void comboBoxUserAccount() {
        roleDAOImpl.comboBoxRole();
        jComboBoxRole.removeAllItems();
        for (ComboBoxList a : roleDAOImpl.getList()) {
            this.jComboBoxRole.addItem(a);
        }
    }

    private File pictureFile = null;

    private void browse() {
        try {
            int returnVal = jFileChooser1.showOpenDialog(this);
            if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                pictureFile = jFileChooser1.getSelectedFile();
                uploadPhoto(pictureFile);
                int IMG_WIDTH = jLabelPicture.getWidth();
                int IMG_HEIGHT = jLabelPicture.getHeight();

                try {
                    BufferedImage originalImage = ImageIO.read(pictureFile);
                    int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

                    BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
                    Graphics2D g = resizedImage.createGraphics();
                    g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
                    g.dispose();
                    g.setComposite(AlphaComposite.Src);

                    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                            RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g.setRenderingHint(RenderingHints.KEY_RENDERING,
                            RenderingHints.VALUE_RENDER_QUALITY);
                    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

                    jLabelPicture.setIcon(new ImageIcon(resizedImage)); //to eliminate .jpeg from picture filename
                    ImageIO.write(resizedImage, "png", new File(RestuarantPOSSystem.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "\\images\\model.jpg"));

                } catch (final IOException ex) {
                    
                }

            } else {
                File defaultDirectory = new File(System.getProperty("user.home"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void uploadPhoto(File file) {
        if (file != null) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] imageData = new byte[(int) file.length()];
                fis.read(imageData);
                userAccount.setPhoto(imageData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    int IMG_WIDTH = 200;
    int IMG_HEIGHT = 200;

    private void displayPicture(UserAccount userAccount) {
        try {
            byte[] imageData = userAccount.getPhoto();
            ImageIcon imageIcon = new ImageIcon(imageData);

            Image image = imageIcon.getImage();
            int type = BufferedImage.TYPE_INT_ARGB;

            BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(image, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
            g.dispose();
            g.setComposite(AlphaComposite.Src);

            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.setRenderingHint(RenderingHints.KEY_RENDERING,
                    RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            jLabelPicture.setIcon(new ImageIcon(resizedImage));//image to label

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void validatePhoto() throws URISyntaxException {
        if (userAccount.getPhoto() == null) {
            File targetClassesDir = new File(RestuarantPOSSystem.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "\\images\\no photo.jpg");
            try {
                FileInputStream fis = new FileInputStream(targetClassesDir);
                byte[] imageData = new byte[(int) targetClassesDir.length()];
                fis.read(imageData);
                userAccount.setPhoto(imageData);
            } catch (Exception e) {
                System.out.println("default of no photo is error");
            }
        }
    }

}
