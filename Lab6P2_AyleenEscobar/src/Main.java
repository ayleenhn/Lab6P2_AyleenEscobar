
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        jP_IniciarSesion.setVisible(false);
        jP_CrearCuenta.setVisible(false);
        jP_CrearUsuario.setVisible(false);
        jL_Iniciar.setVisible(true);
        jB_login.setVisible(true);
        jB_crear.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jD_Menu = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jP_IniciarSesion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jP_CrearUsuario = new javax.swing.JPanel();
        jL_contra2 = new javax.swing.JLabel();
        jL_contra = new javax.swing.JLabel();
        jTF_usuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPF_Password = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jP_CrearCuenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTF_nombre = new javax.swing.JTextField();
        jTF_correo = new javax.swing.JTextField();
        jTF_pais = new javax.swing.JTextField();
        jd_fecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jL_edad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jP_Inicio = new javax.swing.JPanel();
        jB_crear = new javax.swing.JButton();
        jB_login = new javax.swing.JButton();
        jL_Iniciar = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jD_MenuLayout = new javax.swing.GroupLayout(jD_Menu.getContentPane());
        jD_Menu.getContentPane().setLayout(jD_MenuLayout);
        jD_MenuLayout.setHorizontalGroup(
            jD_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_MenuLayout.setVerticalGroup(
            jD_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jP_IniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        jP_IniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/need-for-speed-2560x1440-mclaren.jpg"))); // NOI18N
        jP_IniciarSesion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jP_CrearUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jP_CrearUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_contra2.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jL_contra2.setForeground(new java.awt.Color(255, 102, 102));
        jL_contra2.setText("una minúscula y un carácter especial."); // NOI18N
        jP_CrearUsuario.add(jL_contra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 210, -1));

        jL_contra.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jL_contra.setForeground(new java.awt.Color(255, 102, 102));
        jL_contra.setText("La contraseña debe tener una letra mayúscula,"); // NOI18N
        jP_CrearUsuario.add(jL_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 250, -1));

        jTF_usuario.setForeground(new java.awt.Color(0, 0, 0));
        jP_CrearUsuario.add(jTF_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 210, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Crea tu cuenta");
        jP_CrearUsuario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));
        jP_CrearUsuario.add(jPF_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 210, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Usuario: ");
        jP_CrearUsuario.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contraseña: ");
        jP_CrearUsuario.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jP_CrearUsuario.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ford-Focus-RS-nfs-4k(1).jpg"))); // NOI18N
        jP_CrearUsuario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jP_CrearCuenta.setBackground(new java.awt.Color(0, 0, 0));
        jP_CrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jP_CrearCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear cuenta");
        jP_CrearCuenta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo: ");
        jP_CrearCuenta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre: ");
        jP_CrearCuenta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pais de residencia: ");
        jP_CrearCuenta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de nacimiento:");
        jP_CrearCuenta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jTF_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jP_CrearCuenta.add(jTF_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 206, -1));

        jTF_correo.setForeground(new java.awt.Color(0, 0, 0));
        jP_CrearCuenta.add(jTF_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 206, -1));

        jTF_pais.setForeground(new java.awt.Color(0, 0, 0));
        jP_CrearCuenta.add(jTF_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 206, -1));

        jd_fecha.setForeground(new java.awt.Color(255, 255, 255));
        jP_CrearCuenta.add(jd_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 206, -1));

        jButton1.setText("Crear Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jP_CrearCuenta.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jL_edad.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jL_edad.setForeground(new java.awt.Color(255, 153, 153));
        jL_edad.setText("La edad debe ser mayor de 12.");
        jP_CrearCuenta.add(jL_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/652823(1).png"))); // NOI18N
        jP_CrearCuenta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        jP_Inicio.setBackground(new java.awt.Color(0, 0, 0));
        jP_Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB_crear.setFont(new java.awt.Font("Five Nights at Freddy's", 0, 36)); // NOI18N
        jB_crear.setText("Crear una cuenta");
        jB_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_crearMouseClicked(evt);
            }
        });
        jP_Inicio.add(jB_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 220, 30));

        jB_login.setFont(new java.awt.Font("Five Nights at Freddy's", 0, 36)); // NOI18N
        jB_login.setText("Iniciar sesion");
        jB_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_loginMouseClicked(evt);
            }
        });
        jP_Inicio.add(jB_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 220, 30));

        jL_Iniciar.setFont(new java.awt.Font("Five Nights at Freddy's", 1, 40)); // NOI18N
        jL_Iniciar.setForeground(new java.awt.Color(255, 255, 255));
        jL_Iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/650294(1).jpg"))); // NOI18N
        jP_Inicio.add(jL_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jP_CrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jP_CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jP_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jP_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jP_CrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jP_CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jP_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jP_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if (jTF_nombre.getText().isEmpty()|| jTF_correo.getText().isEmpty() || jTF_pais.getText().isEmpty() || jd_fecha.getDate()==null) {
            JOptionPane.showMessageDialog(this, "Llene las casillas.");
            
        }else if (!edadvalida(jd_fecha.getDate())) {
            jL_edad.setVisible(true);
        } else {
            usuarios.add(new Usuario(jTF_nombre.getText(),
                                    jTF_correo.getText(),
                                    jTF_pais.getText(),"","",150000,
                                    jd_fecha.getDate())
            );
            jTF_nombre.setText("");
            jTF_correo.setText("");
            jTF_pais.setText("");
            jd_fecha.setDate(new Date());
            jL_edad.setVisible(false);
            
            jP_CrearCuenta.setVisible(false);
            jP_CrearUsuario.setVisible(true);
            jP_IniciarSesion.setVisible(false);
            jL_contra.setVisible(false);
            jL_contra2.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==27) {
            jD_Menu.setVisible(true);
            jD_Menu.pack();
            jD_Menu.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_formKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jTF_usuario.getText().isEmpty() || jPF_Password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene las casillas.");
        }else if (!validarContra(jPF_Password.getText())) {
            jL_contra.setVisible(true);
            jL_contra2.setVisible(true); 
            jTF_usuario.setText("");
            jPF_Password.setText("");
        }else{
            usuarios.add(new Usuario(jTF_nombre.getText(),
                                    jTF_correo.getText(),
                                    jTF_pais.getText(),jTF_usuario.getText(),jPF_Password.getText(),150000,
                                    jd_fecha.getDate())
            );
            JOptionPane.showMessageDialog(this, "Usuario creado existosamente");
            jL_Iniciar.setVisible(true);
            jP_CrearCuenta.setVisible(false);
            jP_CrearUsuario.setVisible(false);
            jP_IniciarSesion.setVisible(false);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jB_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_crearMouseClicked
        // TODO add your handling code here:
        jL_edad.setVisible(false);
        jL_Iniciar.setVisible(false);
        jP_IniciarSesion.setVisible(false);
        jP_CrearUsuario.setVisible(false);
        jP_CrearCuenta.setVisible(true);
        jB_login.setVisible(false);
        jB_crear.setVisible(false);
    }//GEN-LAST:event_jB_crearMouseClicked

    private void jB_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_loginMouseClicked
        // TODO add your handling code here:
        jL_Iniciar.setVisible(false);
        jP_CrearUsuario.setVisible(false);
        jP_CrearCuenta.setVisible(false);
        jP_IniciarSesion.setVisible(true);
        jB_login.setVisible(false);
        jB_crear.setVisible(false);
    }//GEN-LAST:event_jB_loginMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public static boolean edadvalida(Date fecha) {
        Date fechaActual = new Date();
        long edad = fechaActual.getTime() - fecha.getTime();
        long edadActual = edad / (1000L * 60 * 60 * 24 * 365);
        return edadActual >= 12;
    }
    
    private boolean validarContra(String password) {
        boolean mayus = false, 
                minus = false, 
                caracterEspecial = false;

        for (char caracter : password.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                mayus = true;
            } else if (Character.isLowerCase(caracter)) {
                minus = true;
            } else if (!Character.isLetterOrDigit(caracter)) {
                caracterEspecial = true;
            }
        }

        return mayus && minus && caracterEspecial;
    }

    
    private ArrayList<Usuario> usuarios= new ArrayList();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_crear;
    private javax.swing.JButton jB_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jD_Menu;
    private javax.swing.JLabel jL_Iniciar;
    private javax.swing.JLabel jL_contra;
    private javax.swing.JLabel jL_contra2;
    private javax.swing.JLabel jL_edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPF_Password;
    private javax.swing.JPanel jP_CrearCuenta;
    private javax.swing.JPanel jP_CrearUsuario;
    private javax.swing.JPanel jP_IniciarSesion;
    private javax.swing.JPanel jP_Inicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_correo;
    private javax.swing.JTextField jTF_nombre;
    private javax.swing.JTextField jTF_pais;
    private javax.swing.JTextField jTF_usuario;
    private com.toedter.calendar.JDateChooser jd_fecha;
    // End of variables declaration//GEN-END:variables
}
