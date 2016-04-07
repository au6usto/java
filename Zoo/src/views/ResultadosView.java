/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import presenter.IResultadosView;
import presenter.ResultadosPresenter;
import model.Zoologico;

/**
 *
 * @author au6usto
 */
public class ResultadosView extends javax.swing.JFrame implements IResultadosView {

  private ResultadosPresenter resultadosPresenter;

  /**
   * Creates new form ResultadosView
   */
  public ResultadosView() {
    initComponents();
    resultadosPresenter = new ResultadosPresenter(this);
    this.updateViewFromModel();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    cantidadCarnivoros = new javax.swing.JLabel();
    canidadHerbivoros = new javax.swing.JLabel();
    pesoCarnivoros = new javax.swing.JLabel();
    pesoHerbivoros = new javax.swing.JLabel();
    kgCarnivoros = new javax.swing.JLabel();
    kgHerbivoros = new javax.swing.JLabel();
    jFormattedTextField1 = new javax.swing.JFormattedTextField();
    jFormattedTextField2 = new javax.swing.JFormattedTextField();
    jButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
    jLabel1.setText("Comida Total");

    jLabel2.setFont(new java.awt.Font("Droid Sans", 0, 18)); // NOI18N
    jLabel2.setText("Cantidad de animales carnívoros:");

    jLabel3.setFont(new java.awt.Font("Droid Sans", 0, 18)); // NOI18N
    jLabel3.setText("Cantidad de animales herbívoros:");

    jLabel4.setFont(new java.awt.Font("Droid Sans", 0, 18)); // NOI18N
    jLabel4.setText("Peso total de animales carnivoros:");

    jLabel5.setFont(new java.awt.Font("Droid Sans", 0, 18)); // NOI18N
    jLabel5.setText("Peso total de animales herbívoros:");

    jLabel6.setFont(new java.awt.Font("Droid Sans", 0, 18)); // NOI18N
    jLabel6.setText("Kg total para carnívoros:");

    jLabel7.setFont(new java.awt.Font("Droid Sans", 0, 18)); // NOI18N
    jLabel7.setText("Kg total para herbívoros:");

    jButton1.setText("Cerrar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    cantidadCarnivoros.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
    cantidadCarnivoros.setText("jLabel8");

    canidadHerbivoros.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
    canidadHerbivoros.setText("jLabel9");

    pesoCarnivoros.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
    pesoCarnivoros.setText("jLabel10");

    pesoHerbivoros.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
    pesoHerbivoros.setText("jLabel11");

    kgCarnivoros.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
    kgCarnivoros.setText("jLabel12");

    kgHerbivoros.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
    kgHerbivoros.setText("jLabel13");

    jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
    jFormattedTextField1.setText("DD/MM/YY");
    jFormattedTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        jFormattedTextField1FocusGained(evt);
      }
    });
    jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jFormattedTextField1ActionPerformed(evt);
      }
    });

    jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
    jFormattedTextField2.setText("DD/MM/YY");
    jFormattedTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        jFormattedTextField2FocusGained(evt);
      }
    });

    jButton2.setText("Calcular");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(124, 124, 124)
        .addComponent(jLabel1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(42, 42, 42)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(canidadHerbivoros))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel6)
              .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kgHerbivoros))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel5)
              .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(pesoHerbivoros, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(pesoCarnivoros, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(kgCarnivoros, javax.swing.GroupLayout.Alignment.TRAILING)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jFormattedTextField1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cantidadCarnivoros)))
        .addGap(46, 46, 46))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(cantidadCarnivoros))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(canidadHerbivoros))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(pesoCarnivoros))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(pesoHerbivoros))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(kgCarnivoros))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(kgHerbivoros))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton2)
          .addComponent(jButton1))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.close();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jFormattedTextField1ActionPerformed

  private void jFormattedTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusGained
    jFormattedTextField1.selectAll();
  }//GEN-LAST:event_jFormattedTextField1FocusGained

  private void jFormattedTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField2FocusGained
    jFormattedTextField2.selectAll();
  }//GEN-LAST:event_jFormattedTextField2FocusGained

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.updateViewFromModel();
  }//GEN-LAST:event_jButton2ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel canidadHerbivoros;
  private javax.swing.JLabel cantidadCarnivoros;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JFormattedTextField jFormattedTextField1;
  private javax.swing.JFormattedTextField jFormattedTextField2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel kgCarnivoros;
  private javax.swing.JLabel kgHerbivoros;
  private javax.swing.JLabel pesoCarnivoros;
  private javax.swing.JLabel pesoHerbivoros;
  // End of variables declaration//GEN-END:variables

  @Override
  public ResultadosPresenter getPresenter() {
    return resultadosPresenter;
  }

  @Override
  public void setPresenter(ResultadosPresenter resultadosPresenter) {
    this.resultadosPresenter = resultadosPresenter;
  }

  @Override
  public void updateModelFromView() {

  }

  @Override
  public void updateViewFromModel() {
    double kgHerb, kgCarn;
    canidadHerbivoros.setText(Integer.toString(Zoologico.contarAnimales("Herbivoro")));
    cantidadCarnivoros.setText(Integer.toString(Zoologico.contarAnimales("Carnivoro")));
    pesoHerbivoros.setText(Double.toString(Zoologico.calcularPeso("Herbivoro")));
    pesoCarnivoros.setText(Double.toString(Zoologico.calcularPeso("Carnivoro")));

    try {
      kgHerb = resultadosPresenter.cantidadDias(jFormattedTextField1.getText(), jFormattedTextField2.getText()) * Zoologico.calcularComida("Herbivoro");
    } catch (ParseException ex) {
      kgHerb = Zoologico.calcularComida("Herbivoro");
    }
    kgHerbivoros.setText(Double.toString(kgHerb));

    try {
      kgCarn = resultadosPresenter.cantidadDias(jFormattedTextField1.getText(), jFormattedTextField2.getText()) * Zoologico.calcularComida("Carnivoro");
    } catch (ParseException ex) {
      kgCarn = Zoologico.calcularComida("Carnivoro");
    }
    kgCarnivoros.setText(Double.toString(kgCarn));
  }

  @Override
  public void open() {
    setVisible(true);
  }

  @Override
  public void close() {
    dispose();
  }
}
