import javax.swing.*;

public class Interfaz extends JFrame {
    private JButton BotonCrear;
    private JButton BotonLeer;
    private JButton BotonActualizar;
    private JButton BotonEliminar;
    private JTextField EntradaNombre;
    private JTextField EntradaNumero;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    
    public Interfaz() {
        initComponents();
    }
    
    private void initComponents() {
        BotonCrear = new JButton("Crear");
        BotonLeer = new JButton("Leer");
        BotonActualizar = new JButton("Actualizar");
        BotonEliminar = new JButton("Eliminar");
        EntradaNombre = new JTextField();
        EntradaNumero = new JTextField();
        jLabel1 = new JLabel("Nombre Completo");
        jLabel2 = new JLabel("Número de Identificación");
        jLabel3 = new JLabel("REGISTRO");
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jLabel3.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
        
        BotonCrear.addActionListener(evt -> BotonCrearActionPerformed(evt));
        BotonLeer.addActionListener(evt -> BotonLeerActionPerformed(evt));
        BotonActualizar.addActionListener(evt -> BotonActualizarActionPerformed(evt));
        BotonEliminar.addActionListener(evt -> BotonEliminarActionPerformed(evt));
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(EntradaNombre, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(EntradaNumero))
                    .addContainerGap(37, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                    .addComponent(BotonCrear)
                    .addGap(18, 18, 18)
                    .addComponent(BotonLeer)
                    .addGap(18, 18, 18)
                    .addComponent(BotonActualizar)
                    .addGap(18, 18, 18)
                    .addComponent(BotonEliminar))
                .addGroup(GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addComponent(jLabel3))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    .addGap(58, 58, 58)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(EntradaNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(EntradaNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(70, 70, 70)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(BotonCrear)
                        .addComponent(BotonLeer)
                        .addComponent(BotonActualizar)
                        .addComponent(BotonEliminar))
                    .addGap(79, 79, 79))
        );
        
        pack();
    }
    
    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = EntradaNombre.getText();
        long numero = Long.parseLong(EntradaNumero.getText());
        JOptionPane.showMessageDialog(null, Crear.crear(nombre, numero));
    }
    
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = EntradaNombre.getText();
        long numero = Long.parseLong(EntradaNumero.getText());
        JOptionPane.showMessageDialog(null, Eliminar.eliminar(nombre, numero));
    }
    
    private void BotonLeerActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = EntradaNombre.getText();
        EntradaNumero.setText(Leer.leer(nombre));
    }
    
    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = EntradaNombre.getText();
        long numero = Long.parseLong(EntradaNumero.getText());
        JOptionPane.showMessageDialog(null, Actualizar.actualizar(nombre, numero));
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Interfaz().setVisible(true));
    }
}
