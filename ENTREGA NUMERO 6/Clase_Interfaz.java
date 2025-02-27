public Interfaz() {
initComponents();
}
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
private void initComponents() {
    BotonCrear = new javax.swing.JButton();
    BotonLeer = new javax.swing.JButton();
    BotonActualizar = new javax.swing.JButton();
    BotonEliminar = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    EntradaNombre = new javax.swing.JTextField();
    EntradaNumero = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
   
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    BotonCrear.setText("Crear");
    BotonCrear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BotonCrearActionPerformed(evt);
        }
});

BotonLeer.setText("Leer");
BotonLeer.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonLeerActionPerformed(evt);
    }
});

    
BotonActualizar.setText("Actualizar");
BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonActualizarActionPerformed(evt);
    }
});
BotonEliminar.setText("Eliminar");
BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonEliminarActionPerformed(evt);
    }
});
jLabel1.setText("Nombre Completo");
jLabel2.setText("Numero de Identificacion");
jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
jLabel3.setText("REGISTRO");
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(BotonCrear)
        .addGap(18, 18, 18)
        .addComponent(BotonLeer)
        .addGap(18, 18, 18)
        .addComponent(BotonActualizar)
        .addGap(18, 18, 18)
        .addComponent(BotonEliminar)
        .addGap(57, 57, 57))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    .addContainerGap(38, Short.MAX_VALUE)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(16, 16, 16)))
            .addGap(11, 11, 11)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(EntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240,

javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(EntradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 240,

javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(37, 37, 37))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addGap(171, 171, 171))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49,

                          
javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(58, 58, 58)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(EntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE,

                              
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(EntradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE,

                              
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BotonCrear)
                    .addComponent(BotonLeer)
                    .addComponent(BotonActualizar)
                    .addComponent(BotonEliminar))
                    .addGap(79, 79, 79))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt)
{//GEN-FIRST:event_BotonCrearActionPerformed
        String nombre=EntradaNombre.getText();
        long numero=Long.parseLong(EntradaNumero.getText());
        JOptionPane.showMessageDialog(null, Crear.crear(nombre, numero));
    }//GEN-LAST:event_BotonCrearActionPerformed
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt)
{//GEN-FIRST:event_BotonEliminarActionPerformed
        String nombre=EntradaNombre.getText();
        long numero=Long.parseLong(EntradaNumero.getText());
        JOptionPane.showMessageDialog(null, Eliminar.eliminar(nombre, numero));
}//GEN-LAST:event_BotonEliminarActionPerformed
private void BotonLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLeerActionPerformed
        String nombre=EntradaNombre.getText();
        EntradaNumero.setText(Leer.leer(nombre));
            }//GEN-LAST:event_BotonLeerActionPerformed
private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt)
{//GEN-FIRST:event_BotonActualizarActionPerformed
        String nombre=EntradaNombre.getText();
        long numero=Long.parseLong(EntradaNumero.getText());
        JOptionPane.showMessageDialog(null, Actualizar.actualizar(nombre,numero));
}//GEN-LAST:event_BotonActualizarActionPerformed
// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton BotonActualizar;
private javax.swing.JButton BotonCrear;
private javax.swing.JButton BotonEliminar;
private javax.swing.JButton BotonLeer;
private javax.swing.JTextField EntradaNombre;
private javax.swing.JTextField EntradaNumero;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
// End of variables declaration//GEN-END:variables
}
