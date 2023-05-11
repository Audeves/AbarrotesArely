/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAOs.CategoriaDAO;
import Entidades.Categoria;
import Negocio.CategoriaService;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author itzel
 */
public class RegistroCategoria extends javax.swing.JFrame {
    
    CategoriaService cd = new CategoriaService();
    /**
     * Creates new form Categorias
     */
    public RegistroCategoria() {
        initComponents();
        configurarPantalla();
        hacerTabla();
    }
    public void eliminarDatos() {
        DefaultTableModel tb = (DefaultTableModel) tblCategoria.getModel();
        tb.setRowCount(0);
    }
    
    private void hacerTabla() {
        eliminarDatos();
        String[] dato = new String[4];
        DefaultTableModel tb = (DefaultTableModel) tblCategoria.getModel();
        List<Categoria> categorias = cd.mostrarTodasCategorias();
        try {
            for (Categoria producto : categorias) {
                dato[0] = String.valueOf(producto.getId());
                dato[1] = producto.getNombre();
                dato[2] = producto.getDescripcion();
                tb.addRow(dato);
            }
        } catch (Exception e) {
        }
    }
    public void limpiarCampos() {
        tfID.setText("");
        tfNombre.setText("");
        tfDescripcion.setText("");
    }
    
    private void configurarPantalla() {

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Registrar Ventas");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Header1 = new javax.swing.JPanel();
        panelProductos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        tfBuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tfDescripcion = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonEliminarCategoria = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        botonAgregarCategoria = new javax.swing.JButton();
        lblNota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(92, 153, 135));

        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuro.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setToolTipText("");
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuro.png"))); // NOI18N
        btnCerrarSesion.setRequestFocusEnabled(false);
        btnCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuroSelected.png"))); // NOI18N
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuro.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.setBorderPainted(false);
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuroSelected.png"))); // NOI18N
        botonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarMouseClicked(evt);
            }
        });
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Abarrotes Arely");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addComponent(botonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1174, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderLayout.createSequentialGroup()
                    .addGap(0, 683, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 683, Short.MAX_VALUE)))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderLayout.createSequentialGroup()
                    .addGap(0, 21, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Header1.setBackground(new java.awt.Color(255, 255, 255));

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCategoria);

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        tfBuscar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        tfBuscar.setForeground(new java.awt.Color(204, 204, 204));
        tfBuscar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfBuscar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscarMouseClicked(evt);
            }
        });
        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarKeyReleased(evt);
            }
        });

        tfDescripcion.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        tfDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        tfDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfDescripcion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDescripcionMouseClicked(evt);
            }
        });
        tfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescripcionActionPerformed(evt);
            }
        });

        tfID.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        tfID.setForeground(new java.awt.Color(204, 204, 204));
        tfID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfID.setEnabled(false);
        tfID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfIDMouseClicked(evt);
            }
        });
        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        tfNombre.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(204, 204, 204));
        tfNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNombreMouseClicked(evt);
            }
        });
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnGris.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnGris.png"))); // NOI18N
        btnLimpiar.setRequestFocusEnabled(false);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnGrisSelected.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("Nombre");

        jLabel4.setText("Descripción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNombre)
                    .addComponent(tfID)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60))
            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botonEliminarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnCancelar.png"))); // NOI18N
        botonEliminarCategoria.setText("Eliminar");
        botonEliminarCategoria.setToolTipText("");
        botonEliminarCategoria.setBorderPainted(false);
        botonEliminarCategoria.setContentAreaFilled(false);
        botonEliminarCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEliminarCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnCancelar.png"))); // NOI18N
        botonEliminarCategoria.setRequestFocusEnabled(false);
        botonEliminarCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnCancelarSelected.png"))); // NOI18N
        botonEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCategoriaActionPerformed(evt);
            }
        });

        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnActualizar.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setToolTipText("");
        Actualizar.setBorderPainted(false);
        Actualizar.setContentAreaFilled(false);
        Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnActualizar.png"))); // NOI18N
        Actualizar.setRequestFocusEnabled(false);
        Actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnActualizarSelected.png"))); // NOI18N
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        botonAgregarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnAceptar.png"))); // NOI18N
        botonAgregarCategoria.setText("Agregar");
        botonAgregarCategoria.setToolTipText("");
        botonAgregarCategoria.setBorderPainted(false);
        botonAgregarCategoria.setContentAreaFilled(false);
        botonAgregarCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnAceptar.png"))); // NOI18N
        botonAgregarCategoria.setRequestFocusEnabled(false);
        botonAgregarCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnAceptarSelected.png"))); // NOI18N
        botonAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Header1Layout = new javax.swing.GroupLayout(Header1);
        Header1.setLayout(Header1Layout);
        Header1Layout.setHorizontalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58))
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                            .addComponent(Actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEliminarCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)))
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79))
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNota, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        Header1Layout.setVerticalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(Header1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed

    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void tblCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriaMouseClicked
        if (evt.getClickCount() == 1) {
            tfID.setText(String.valueOf(tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 0)));
            tfNombre.setText(String.valueOf(tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 1)));
            tfDescripcion.setText(String.valueOf(tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 2)));
        }
    }//GEN-LAST:event_tblCategoriaMouseClicked

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked
        tfBuscar.setText("");
    }//GEN-LAST:event_tfBuscarMouseClicked

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void tfDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDescripcionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescripcionMouseClicked

    private void tfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescripcionActionPerformed

    private void tfIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDMouseClicked

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    private void tfNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreMouseClicked

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void botonEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCategoriaActionPerformed
        // TODO add your handling code here:
        if (!tfID.getText().isEmpty() && !tfID.getText().equals("")) {
            Categoria categoria = new Categoria(Integer.parseInt(tfID.getText()));
            cd.eliminarCategoria(categoria);
            hacerTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_botonEliminarCategoriaActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
        if (!tfID.getText().isEmpty() && !tfID.getText().equals("") && !tfNombre.getText().isEmpty() && !tfNombre.getText().equals("")
                && !tfDescripcion.getText().isEmpty() && !tfDescripcion.getText().equals("")) {
            Categoria categoria = new Categoria(Integer.parseInt(tfID.getText()), tfNombre.getText(), tfDescripcion.getText());
            cd.actualizarCategoria(categoria);
            hacerTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void botonAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCategoriaActionPerformed
        // TODO add your handling code here:
        if (!tfNombre.getText().isEmpty() && !tfNombre.getText().equals("") && !tfDescripcion.getText().isEmpty() && !tfDescripcion.getText().equals("")) {
            Categoria venta = new Categoria(tfNombre.getText(), tfDescripcion.getText());
            cd.agregarCategoria(venta);
            hacerTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_botonAgregarCategoriaActionPerformed

    private void botonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMouseClicked

    }//GEN-LAST:event_botonRegresarMouseClicked

    private void tfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyReleased
        // TODO add your handling code here:
        if (!tfBuscar.getText().isEmpty() || tfBuscar.equals("")) {
            eliminarDatos();
            String[] dato = new String[4];
            DefaultTableModel tb = (DefaultTableModel) tblCategoria.getModel();
            List<Categoria> categorias = null;

            categorias = cd.buscarCategoriasPorNombre(tfBuscar.getText());

            try {
                if (categorias.isEmpty()) {
                    lblNota.setForeground(Color.red);
                    lblNota.setText("No hay coincidencias de articulos.");
                    return;
                } else {
                    lblNota.setText("");
                }
                for (Categoria categoria : categorias) {
                    dato[0] = categoria.getNombre();
                    dato[1] = categoria.getDescripcion();
                    tb.addRow(dato);
                }
            } catch (Exception i) {
            }
        } else {
            hacerTabla();
        }
    }//GEN-LAST:event_tfBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(RegistroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Header1;
    private javax.swing.JButton botonAgregarCategoria;
    private javax.swing.JButton botonEliminarCategoria;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNota;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
