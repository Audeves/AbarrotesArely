/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DTO.ProductoDTO;
import Entidades.Producto;
import Negocio.ProductoService;
import java.awt.Component;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Desktop actualizacion
 */
public class RegistroVenta extends javax.swing.JFrame {

    List<ProductoDTO> listaProductoDTOs = new ArrayList<>();
    ProductoService productoService = new ProductoService();
    int cantidad = 0;
    public static String txtTotal = "";
    public static DefaultTableModel modelo;
    public static DefaultTableModel modelo2;
    int id, stock;
    String categoria, nombre;
    public static int cantidadVendida;
    float precio;
    public static ArrayList<Producto> listaProductos = new ArrayList<>();
    public static ArrayList<Object> listaTicket = new ArrayList<>();
    Integer cantidadActual;
    public static int nuevaCantidad;
    float subTotal;

    /**
     * Creates new form RegistroVenta
     */
    public RegistroVenta() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
//        this.jTotal.setText(cF.textoTotal);
        //cargarProductos();
        //jLabel6.setIcon(setIcono("/UI/imagenes/precio.png", jLabel6));
//        btnBuscar.setIcon(setIcono("/UI/imagenes/lupa.png", btnBuscar));
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
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Header1 = new javax.swing.JPanel();
        panelProductos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panelTicket = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTicket = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        textTotal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabelTicket = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();

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

        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuro.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuroSelected.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
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
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 770, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderLayout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Header1.setBackground(new java.awt.Color(255, 255, 255));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock", "Categoría", "Cantidad", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductos);

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        tablaTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio/Precio Granel", "Cantidad", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaTicket);

        jButton1.setText("Borrar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTicketLayout = new javax.swing.GroupLayout(panelTicket);
        panelTicket.setLayout(panelTicketLayout);
        panelTicketLayout.setHorizontalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTicketLayout.setVerticalGroup(
            panelTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTicketLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setText("TOTAL");

        jTotal.setFont(new java.awt.Font("Dialog", 0, 60)); // NOI18N
        jTotal.setText("000.00");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 60)); // NOI18N
        jLabel4.setText("$");
        jLabel4.setAutoscrolls(true);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout textTotalLayout = new javax.swing.GroupLayout(textTotal);
        textTotal.setLayout(textTotalLayout);
        textTotalLayout.setHorizontalGroup(
            textTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textTotalLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(textTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        textTotalLayout.setVerticalGroup(
            textTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textTotalLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(textTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        txtBuscar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBuscar.setText("Buscar Producto");
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtBuscar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/lupa.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setMaximumSize(new java.awt.Dimension(524, 520));
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/lupa.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/lupaGrande.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnAceptar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnAceptar.png"))); // NOI18N
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnAceptarSelected.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnCancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnCancelar.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnCancelarSelected.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabelTicket.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTicket.setText("TICKET");

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/botonAgregar.png"))); // NOI18N
        btnAgregar.setText("+");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/botonAgregar.png"))); // NOI18N
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/botonAgregarSelected.png"))); // NOI18N
        btnAgregar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/botonAgregarSelected.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Header1Layout = new javax.swing.GroupLayout(Header1);
        Header1.setLayout(Header1Layout);
        Header1Layout.setHorizontalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addComponent(jLabelTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(326, 326, 326))
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Header1Layout.createSequentialGroup()
                                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Header1Layout.createSequentialGroup()
                                        .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(Header1Layout.createSequentialGroup()
                                        .addComponent(txtBuscar)
                                        .addGap(4, 4, 4)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)))
                                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(panelTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
        Header1Layout.setVerticalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header1Layout.createSequentialGroup()
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Header1Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(Header1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(textTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addGap(36, 36, 36)
                .addComponent(jLabelTicket)
                .addGap(15, 15, 15)
                .addComponent(panelTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(Header1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        int row = this.tablaProductos.getSelectedRow();
        try {
            if (row == -1) {
                System.out.println("no hay una fila");
            } else {
                System.out.println(cantidad);
                cantidadVendida = cantidad;
                System.out.println("cantidad Vendida " + cantidadVendida);
                id = Integer.parseInt(tablaProductos.getValueAt(row, 0).toString());
                categoria = tablaProductos.getValueAt(row, 4).toString();
                nombre = tablaProductos.getValueAt(row, 1).toString();
                precio = Float.parseFloat(tablaProductos.getValueAt(row, 2).toString());
                stock = Integer.parseInt(tablaProductos.getValueAt(row, 3).toString());
                Producto prod = new Producto();
                prod.setId(id);
                prod.setCategoria(categoria);
                prod.setNombreProducto(nombre);
                prod.setPrecioActual(precio);
                prod.setStock(stock);
                listaProductos.add(prod);
                limpiarTabla();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        limpiarTabla();
        cantidad = 0;
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        ConfirmarVenta cv = new ConfirmarVenta(this.listaProductoDTOs);
        cv.setVisible(true);
        jTotal.setText("000.00");
        limpiarTablaTicket();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed

    }//GEN-LAST:event_btnCerrarSesionActionPerformed
    private void cargarTicket() {
        //Renderización de la tabla para que puedan añadirse componentes dentro
        //de las celdas
        tablaTicket.setDefaultRenderer(Object.class, new Render());
        //Botones que se general al compilar
        JButton btnBorrar = new JButton();
        btnBorrar.setName("borrar");
        btnBorrar.setText("Delete");

        int row = tablaProductos.getSelectedRow();
        DefaultTableModel modeloTicket = (DefaultTableModel) this.tablaTicket.getModel();
        DefaultTableModel productosTabla = (DefaultTableModel) this.tablaProductos.getModel();

        String name;
        float price, subTotal;
        name = productosTabla.getValueAt(row, 1).toString();
        price = (float) productosTabla.getValueAt(row, 2);
        subTotal = price * cantidad;
        Object[] products = {name, price, cantidad, subTotal};
        modeloTicket.addRow(products);
        listaTicket.add(products);

        //limpiarTabla();
        cargarTotal();
    }

    public void limpiarTabla() {
        DefaultTableModel modeloTablaProductos = (DefaultTableModel) tablaProductos.getModel();
        modeloTablaProductos.setRowCount(0);
    }

    public void limpiarTablaTicket() {
        DefaultTableModel modeloTablaTicket = (DefaultTableModel) tablaTicket.getModel();
        modeloTablaTicket.setRowCount(0);
    }

    private void cargarProductos() {
        ArrayList<Producto> productosListaService = (ArrayList<Producto>) this.productoService.mostrarTodosLosProductos();
        DefaultTableModel modeloProducto = (DefaultTableModel) this.tablaProductos.getModel();
        modeloProducto.setRowCount(0);
        for (Producto producto : productosListaService) {
            Object[] fila = new Object[5];
            fila[0] = producto.getId();
            fila[1] = producto.getNombreProducto();
            fila[2] = producto.getPrecioActual();
            fila[3] = producto.getStock();
            fila[4] = producto.getCategoria();
            modeloProducto.addRow(fila);
        }

    }

    private void buscarProductos() {
        //Renderización de la tabla para que puedan añadirse componentes dentro
        //de las celdas
        tablaProductos.setDefaultRenderer(Object.class, new Render());
        //Botones que se general al compilar
        JButton btnAumentar = new JButton();
        btnAumentar.setName("aumentar");
        btnAumentar.setText("+");
        JButton btnDisminuir = new JButton();
        btnDisminuir.setName("disminuir");
        btnDisminuir.setText("-");
        String nombre = this.txtBuscar.getText();
        ArrayList<Producto> productos = new ArrayList<>();
        DefaultTableModel xmodelo = (DefaultTableModel) this.tablaProductos.getModel();
        productos = (ArrayList<Producto>) this.productoService.buscarPorNombre(nombre);
        listaProductos = productos;
        xmodelo.setRowCount(0);
        for (Producto producto : productos) {
            Object[] fila = new Object[8];
            fila[0] = producto.getId();
            fila[1] = producto.getNombreProducto();
            fila[2] = producto.getPrecioActual();
            fila[3] = producto.getStock();
            fila[4] = producto.getCategoria();
            fila[5] = cantidad; //Este es el campo de cantidad
            fila[6] = btnAumentar;
            fila[7] = btnDisminuir;
            xmodelo.addRow(fila);
        }
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la fila seleccionada
                int filaSeleccionada = tablaProductos.getSelectedRow();

                if (filaSeleccionada >= 0) {
                    // Obtener la cantidad actual del producto de la fila seleccionada
                    cantidadActual = (Integer) tablaProductos.getValueAt(filaSeleccionada, 5);
                    cargarTicket();

                    Integer idObtenido = Integer.parseInt(tablaProductos.getValueAt(filaSeleccionada, 0).toString());
                    String categoriaObtenidoa = tablaProductos.getValueAt(filaSeleccionada, 4).toString();
                    String nombreObtenido = tablaProductos.getValueAt(filaSeleccionada, 1).toString();
                    float precioObtenido = Float.parseFloat(tablaProductos.getValueAt(filaSeleccionada, 2).toString());
                    int stockOptenido = Integer.parseInt(tablaProductos.getValueAt(filaSeleccionada, 3).toString());
                    Producto prod = new Producto();
                    prod.setId(idObtenido);
                    prod.setCategoria(categoriaObtenidoa);
                    prod.setNombreProducto(nombreObtenido);
                    prod.setPrecioActual(precioObtenido);
                    prod.setStock(stockOptenido);

                    listaProductos.add(prod);
                    
                    // Si la cantidad actual es nula, establecerla en 1. Si no, incrementarla en 1
                    if (cantidadActual == null) {
                        tablaProductos.setValueAt(1, filaSeleccionada, 5);
                        limpiarTabla();
                    } else {
                        nuevaCantidad = cantidadActual;
                        tablaProductos.setValueAt(nuevaCantidad, filaSeleccionada, 5);
                        subTotal = nuevaCantidad * precioObtenido;
                        ProductoDTO datosProductoDTO = new ProductoDTO(idObtenido, precioObtenido, nuevaCantidad, calcularSubtotal(nuevaCantidad, precioObtenido));
                        listaProductoDTOs.add(datosProductoDTO);
                        System.out.println("Id del producto: "+ datosProductoDTO.getIdProducto());
                        System.out.println("Precio del producto"+datosProductoDTO.getPrecioVenta());
                        System.out.println("Cantidad de producto: "+ datosProductoDTO.getCantidad());
                        System.out.println("Subtotal: "+ calcularSubtotal(nuevaCantidad, precioObtenido));
                        limpiarTabla();
                    }

                }
            }
        });
    }
    public float calcularSubtotal(int cantidadVender, float precioVender){
        return cantidadVender * precioVender;
    }
    private void cargarTotal() {

        float total = 0;

        for (int i = 0; i < this.tablaTicket.getRowCount(); i++) {
            total += Float.parseFloat(this.tablaTicket.getValueAt(i, 3).toString());

        }
        System.out.println("total: " + total);

        String totalView = String.format("%06.2f", total);
        this.jTotal.setText(totalView);
        txtTotal = jTotal.getText();
    }


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (this.txtBuscar.getText().length() > 0 && !txtBuscar.getText().equals("Buscar Producto")) {
            this.buscarProductos();

        } else {
            this.cargarProductos();
            txtBuscar.setText("Buscar Producto");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int column = tablaProductos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tablaProductos.getRowHeight();

        if (row < tablaProductos.getRowCount() && row >= 0 && column < tablaProductos.getColumnCount() && column >= 0) {
            Object value = tablaProductos.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getName().equals("aumentar")) {
                    if (boton.getName().equals("aumentar")) {
                        cantidad += 1;
                    }
                    tablaProductos.setValueAt(cantidad, row, 5);
                    System.out.println("Se aumentó");
                }
                if (boton.getName().equals("disminuir")) {
                    if (cantidad > 0) {
                        cantidad -= 1;
                    }
                    tablaProductos.setValueAt(cantidad, row, 5);
                    System.out.println("Se disminuyó");
                }
                if (boton.getName().equals("borrar")) {
                    //Aquí va el evento del botón borrar
                    DefaultTableModel model = (DefaultTableModel) tablaTicket.getModel();
                    int selectedRowIndex = tablaTicket.getSelectedRow();
                    model.removeRow(selectedRowIndex);
                    System.out.println("Ya se borró");
                }
            }
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaTicket.getModel();

        // Obtener el índice de la fila seleccionada
        int indiceFilaSeleccionada = tablaTicket.getSelectedRow();
        int respuesta = JOptionPane.showOptionDialog(null, "¿Deseas Eliminar el Producto Seleccionado", "Confirmación",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sí", "No"}, "No");

        if (respuesta == JOptionPane.YES_OPTION) {
            if (indiceFilaSeleccionada != -1) {
                modelo.removeRow(indiceFilaSeleccionada);
                cargarTotal();
            }
        } else {
            ((Window) SwingUtilities.getRoot((Component) evt.getSource())).dispose();
        }
        // Eliminar la fila seleccionada

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int indiceFilaSeleccionada = tablaTicket.getSelectedRow();
        int respuesta = JOptionPane.showOptionDialog(null, "¿Deseas Cancelar la venta en progreso?", "Confirmación",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sí", "No"}, "No");
        DefaultTableModel modelo = (DefaultTableModel) this.tablaTicket.getModel();

        if (respuesta == JOptionPane.YES_OPTION) {
            if (indiceFilaSeleccionada != -1) {
                JOptionPane.showConfirmDialog(this, "Sin valores por borrar.");
            } else {
                modelo.setRowCount(0);
            }
        } else {
            ((Window) SwingUtilities.getRoot((Component) evt.getSource())).dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVenta().setVisible(true);
            }
        });
    }

    public Icon setIcono(String url, JComponent componente) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int ancho = componente.getWidth();
        int alto = componente.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        return icono;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Header1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTicket;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel jTotal;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelTicket;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaTicket;
    private javax.swing.JPanel textTotal;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
