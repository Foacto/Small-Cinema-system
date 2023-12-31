/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.manager;

import com.htc.test.ws.Film;
import com.htc.test.ws.FilmCategory;
import com.htc.test.ws.FilmProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import view.ResultFrm;

/**
 *
 * @author vvt
 */
public class AddNewFilmFrm extends javax.swing.JFrame {
    protected SearchFilmProviderFrm searchFilmProvider;
    private Film film = getFilm();
    private Map<String, FilmCategory> filmCategories = new HashMap<>();

    /**
     * Creates new form Login
     */
    public AddNewFilmFrm(SearchFilmProviderFrm searchFilmProvider, FilmProvider filmProvider) {
        initComponents();
        this.searchFilmProvider = searchFilmProvider;
        this.film.setFp(filmProvider);
        
        for (FilmCategory filmCategory : getListFilmCategory()) {
            filmCategories.put(filmCategory.getName(), filmCategory);
            categorybox.addItem(filmCategory.getName());
        }
    }

    public void updateCate(){
        String txt = "Category: ";
        for (FilmCategory cate : film.getListFilmCategory().getFilmCategory()) {
            txt += cate.getName() + ",";
        }
        
        category.setText(txt);
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
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        des = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        director = new javax.swing.JTextField();
        category = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        length = new javax.swing.JTextField();
        categorybox = new javax.swing.JComboBox<>();
        confirmbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        length1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Film's Name");

        name.setText("Enter Film's name");
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel2.setText("Description");

        des.setText("Enter Film's des");
        des.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desMouseClicked(evt);
            }
        });
        des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desActionPerformed(evt);
            }
        });

        rate.setText("Enter Film's rate");
        rate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rateMouseClicked(evt);
            }
        });

        jLabel3.setText("Rate");

        jLabel4.setText("Director");

        director.setText("Enter Film's director");
        director.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                directorMouseClicked(evt);
            }
        });

        category.setText("Category:");
        category.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel6.setText("Length");

        length.setText("Enter Film's length");
        length.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lengthMouseClicked(evt);
            }
        });

        categorybox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryboxItemStateChanged(evt);
            }
        });
        categorybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryboxActionPerformed(evt);
            }
        });

        confirmbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmbtn.setText("Confirm");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        cancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        length1.setText("300");
        length1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                length1MouseClicked(evt);
            }
        });
        length1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                length1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Import Price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(confirmbtn)
                        .addGap(107, 107, 107)
                        .addComponent(cancelbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(length1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(des, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(director, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(categorybox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(des))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(director))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(length))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(categorybox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addComponent(category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(length1))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmbtn)
                    .addComponent(cancelbtn))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        searchFilmProvider.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        try {
            int fRate = Integer.parseInt(rate.getText());
            if(name.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Name is not allow null");
            else if(length.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Length is not allow null");
            else {
                film.setName(name.getText());
                film.setDes(des.getText());
                film.setDirector(director.getText());
                film.setRate(fRate);
                film.setLength(length.getText());
                
                //Save data
                Boolean result = addFilm(film);
                
                if(result)
                    (new ResultFrm("Them thanh cong!")).setVisible(true);
                else
                    (new ResultFrm("Them that bai!")).setVisible(true);
                
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Rate only contains number");
        }
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void categoryboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryboxActionPerformed
        String item = (String) categorybox.getSelectedItem();
        if(film.getListFilmCategory().getFilmCategory().contains(filmCategories.get(item)))
            film.getListFilmCategory().getFilmCategory().remove((filmCategories.get(item)));
        else
            film.getListFilmCategory().getFilmCategory().add(filmCategories.get(item));
        
        updateCate();
    }//GEN-LAST:event_categoryboxActionPerformed

    private void categoryboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryboxItemStateChanged
        
    }//GEN-LAST:event_categoryboxItemStateChanged

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        name.setText("");
    }//GEN-LAST:event_nameMouseClicked

    private void desMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desMouseClicked
        des.setText("");
    }//GEN-LAST:event_desMouseClicked

    private void rateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rateMouseClicked
        rate.setText("");
    }//GEN-LAST:event_rateMouseClicked

    private void directorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directorMouseClicked
        director.setText("");
    }//GEN-LAST:event_directorMouseClicked

    private void lengthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lengthMouseClicked
        length.setText("");
    }//GEN-LAST:event_lengthMouseClicked

    private void length1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_length1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_length1MouseClicked

    private void length1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_length1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_length1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel category;
    private javax.swing.JComboBox<String> categorybox;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JTextField des;
    private javax.swing.JTextField director;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField length;
    private javax.swing.JTextField length1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField rate;
    // End of variables declaration//GEN-END:variables



    private static Boolean addFilm(com.htc.test.ws.Film film) {
        com.htc.test.ws.ManagerWS_Service service = new com.htc.test.ws.ManagerWS_Service();
        com.htc.test.ws.ManagerWS port = service.getManagerWSPort();
        return port.addFilm(film);
    }

    private static java.util.List<com.htc.test.ws.FilmCategory> getListFilmCategory() {
        com.htc.test.ws.UserWS_Service service = new com.htc.test.ws.UserWS_Service();
        com.htc.test.ws.UserWS port = service.getUserWSPort();
        return port.getListFilmCategory();
    }

    private static Film getFilm() {
        com.htc.test.ws.UserWS_Service service = new com.htc.test.ws.UserWS_Service();
        com.htc.test.ws.UserWS port = service.getUserWSPort();
        return port.getFilm();
    }
}
