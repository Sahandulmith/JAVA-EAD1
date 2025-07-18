
package pos.system.restaurant.gui.dialog.au;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import pos.system.restaurant.guii.JFrameHome;

public class JWebCamOpen extends javax.swing.JFrame {
    
    private Webcam webcam;
    private WebcamPanel panel;
    public JWebCamOpen(JFrameHome jFrameHome, boolean par) {
        initComponents();
        FlatSVGIcon icon = new FlatSVGIcon("svg/restaurant-plate.svg", 16, 16);
        setIconImage(icon.getImage());
        jTextFieldSavedname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Savename");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonStart = new javax.swing.JButton();
        jButtonCapture = new javax.swing.JButton();
        jButtonPause = new javax.swing.JButton();
        jTextFieldSavedname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PICTURE");
        setBackground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(649, 545));
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        jButtonStart.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jButtonCapture.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButtonCapture.setText("Capture");
        jButtonCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaptureActionPerformed(evt);
            }
        });

        jButtonPause.setIcon(new javax.swing.ImageIcon("D:\\NIBM\\2ND SEM\\2ND STAGE\\EAD(JAVA)\\netbeans\\RestuarantPOSSystem\\src\\main\\resources\\icons8-pause-50.png")); // NOI18N
        jButtonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPauseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButtonPause)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldSavedname)
                    .addComponent(jButtonCapture, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSavedname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCapture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(180, 180, 180))
        );

        setSize(new java.awt.Dimension(738, 668));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaptureActionPerformed
        // TODO add your handling code here:
        if (webcam != null) {
        BufferedImage image = webcam.getImage();
        try {
            File downloadFolder = new File(System.getProperty("user.home") + "/Downloads");
            if (!downloadFolder.exists()) {
                downloadFolder.mkdirs();
            }
            
            // Retrieve the text from jTextFieldSavedname
            String savedName = jTextFieldSavedname.getText().trim();
            if (savedName.isEmpty()) {
                savedName = "captured_photo"; // Default name if no name is provided
            }
            
            File file = new File(downloadFolder, savedName + ".png");
            ImageIO.write(image, "PNG", file);
            JOptionPane.showMessageDialog(null, "Photo captured and saved to " + file.getAbsolutePath());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_jButtonCaptureActionPerformed

    private void jButtonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPauseActionPerformed
        // TODO add your handling code here:
         if (webcam != null) {
            webcam.close();
            jPanel1.remove(panel);
            jPanel1.repaint();
        }
    }//GEN-LAST:event_jButtonPauseActionPerformed

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        // TODO add your handling code here:
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640, 480));
        panel = new WebcamPanel(webcam);
        panel.setFPSDisplayed(true);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(panel, BorderLayout.CENTER);
        jPanel1.revalidate();
    }//GEN-LAST:event_jButtonStartActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCapture;
    private javax.swing.JButton jButtonPause;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldSavedname;
    // End of variables declaration//GEN-END:variables
}
