/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NumberPanel.java
 *
 * Created on 14.06.2010, 16:42:25
 */
package com.jme3.gde.materials.multiview.widgets;

import com.jme3.math.FastMath;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author normenhansen
 */
public class ColorPanel extends MaterialPropertyWidget {

    /** Creates new form NumberPanel */
    public ColorPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rLabel = new javax.swing.JTextField();
        gLabel = new javax.swing.JTextField();
        bLabel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aLabel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        colorPreview = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(32767, 35));
        setPreferredSize(new java.awt.Dimension(430, 35));

        jLabel1.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.jLabel1.text")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 16));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        rLabel.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.rLabel.text")); // NOI18N
        rLabel.setMaximumSize(new java.awt.Dimension(110, 2147483647));
        rLabel.setNextFocusableComponent(gLabel);
        rLabel.setPreferredSize(new java.awt.Dimension(110, 28));
        rLabel.setVerifyInputWhenFocusTarget(false);
        rLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textChanged(evt);
            }
        });
        rLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rLabelFocusLost(evt);
            }
        });

        gLabel.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.gLabel.text")); // NOI18N
        gLabel.setMaximumSize(new java.awt.Dimension(110, 2147483647));
        gLabel.setNextFocusableComponent(bLabel);
        gLabel.setPreferredSize(new java.awt.Dimension(110, 28));
        gLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gLabeltextChanged(evt);
            }
        });
        gLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gLabelFocusLost(evt);
            }
        });

        bLabel.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.bLabel.text")); // NOI18N
        bLabel.setMaximumSize(new java.awt.Dimension(110, 2147483647));
        bLabel.setNextFocusableComponent(aLabel);
        bLabel.setPreferredSize(new java.awt.Dimension(110, 28));
        bLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLabeltextChanged(evt);
            }
        });
        bLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bLabelFocusLost(evt);
            }
        });

        jLabel2.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.jLabel3.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.jLabel4.text")); // NOI18N

        aLabel.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.aLabel.text")); // NOI18N
        aLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        aLabel.setMaximumSize(new java.awt.Dimension(110, 2147483647));
        aLabel.setNextFocusableComponent(jButton1);
        aLabel.setPreferredSize(new java.awt.Dimension(110, 28));
        aLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLabeltextChanged(evt);
            }
        });
        aLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                aLabelFocusLost(evt);
            }
        });

        jLabel5.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.jLabel5.text")); // NOI18N

        colorPreview.setBackground(new java.awt.Color(204, 204, 204));
        colorPreview.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        colorPreview.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.colorPreview.text")); // NOI18N
        colorPreview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        colorPreview.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
            .addComponent(bLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
            .addComponent(aLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jLabel4)
                .addComponent(jLabel5)
                .addComponent(jLabel2)
                .addComponent(rLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
            .addComponent(colorPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText(org.openide.util.NbBundle.getMessage(ColorPanel.class, "ColorPanel.jButton1.text")); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(43, 15));
        jButton1.setMinimumSize(new java.awt.Dimension(43, 15));
        jButton1.setPreferredSize(new java.awt.Dimension(43, 15));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ColorRGBADialog dialog = new ColorRGBADialog(new JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setColor(getColor(rLabel.getText(), gLabel.getText(), bLabel.getText(), aLabel.getText()));
        dialog.setVisible(true);
        if (dialog.getColorAsText() != null) {
            colorPreview.setBackground(dialog.getColor());
            float[] f = new float[4];
            dialog.getColor().getRGBComponents(f);            
            dialog.getColor().getAlpha();
            rLabel.setText(f[0] + "");
            gLabel.setText(f[1] + "");
            bLabel.setText(f[2] + "");
            aLabel.setText(f[3] + "");
            property.setValue(rLabel.getText() + " " + gLabel.getText() + " " + bLabel.getText() + " " + aLabel.getText());
            fireChanged();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void textChanged(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textChanged
        updateValue();
    }//GEN-LAST:event_textChanged
    
private void gLabeltextChanged(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gLabeltextChanged
    updateValue();
}//GEN-LAST:event_gLabeltextChanged
    
private void bLabeltextChanged(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLabeltextChanged
    updateValue();
}//GEN-LAST:event_bLabeltextChanged
    
private void aLabeltextChanged(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLabeltextChanged
    updateValue();
}//GEN-LAST:event_aLabeltextChanged
    
private void rLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rLabelFocusGained
    rLabel.setSelectionStart(0);
    rLabel.setSelectionEnd(rLabel.getText().length());
}//GEN-LAST:event_rLabelFocusGained
    
private void gLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gLabelFocusGained
    gLabel.setSelectionStart(0);
    gLabel.setSelectionEnd(gLabel.getText().length());
}//GEN-LAST:event_gLabelFocusGained
    
private void bLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bLabelFocusGained
    bLabel.setSelectionStart(0);
    bLabel.setSelectionEnd(bLabel.getText().length());
}//GEN-LAST:event_bLabelFocusGained
    
private void aLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aLabelFocusGained
    aLabel.setSelectionStart(0);
    aLabel.setSelectionEnd(aLabel.getText().length());
}//GEN-LAST:event_aLabelFocusGained
    
private void rLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rLabelFocusLost
    updateValue();
}//GEN-LAST:event_rLabelFocusLost
    
private void gLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gLabelFocusLost
    updateValue();
}//GEN-LAST:event_gLabelFocusLost
    
private void bLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bLabelFocusLost
    updateValue();
}//GEN-LAST:event_bLabelFocusLost
    
private void aLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aLabelFocusLost
    updateValue();
}//GEN-LAST:event_aLabelFocusLost
    
    private void updateValue() {
        Color c = getColor(rLabel.getText(), gLabel.getText(), bLabel.getText(), aLabel.getText());
        if (c != null) {
            colorPreview.setBackground(c);
            property.setValue(rLabel.getText() + " " + gLabel.getText() + " " + bLabel.getText() + " " + aLabel.getText());
            fireChanged();
        } else {
            colorPreview.setBackground(new Color(204, 204, 204));
        }
    }
    
    @Override
    protected void readProperty() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                jLabel1.setText(property.getName());
                jLabel1.setToolTipText(property.getName());
                System.out.println(property.getValue());
                String[] s = property.getValue().split(" ");
                if (s.length == 4) {
                    try {
                        colorPreview.setBackground(getColor(s[0], s[1], s[2], s[3]));
                        rLabel.setText(s[0]);
                        gLabel.setText(s[1]);
                        bLabel.setText(s[2]);
                        aLabel.setText(s[3]);
                    } catch (NumberFormatException e) {
                        clear();
                    }
                } else {
                    clear();
                }
            }
        });
    }
    
    private void clear() {
        colorPreview.setBackground(new Color(204, 204, 204));
        rLabel.setText("");
        gLabel.setText("");
        bLabel.setText("");
        aLabel.setText("");
    }
    
    private Color getColor(String r, String g, String b, String a) {
        try {
            float fr = FastMath.clamp(Float.parseFloat(r), 0, 1);
            float fg = FastMath.clamp(Float.parseFloat(g), 0, 1);
            float fb = FastMath.clamp(Float.parseFloat(b), 0, 1);
            float fa = FastMath.clamp(Float.parseFloat(a), 0, 1);
            return new Color(fr, fg, fb, fa);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aLabel;
    private javax.swing.JTextField bLabel;
    private javax.swing.JLabel colorPreview;
    private javax.swing.JTextField gLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField rLabel;
    // End of variables declaration//GEN-END:variables
}
