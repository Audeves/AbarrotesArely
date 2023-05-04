/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DTO.ProductoDTO;
import Entidades.Encargado;
import Entidades.Persona;
import Entidades.Producto;
import Entidades.RelProductosVentas;
import Entidades.Venta;
import Negocio.ProductoService;
import Negocio.VentaService;
import Negocio.VentasService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author itzel
 */
public class ConfirmarVenta extends javax.swing.JFrame {

    private RegistroVenta registroVenta;
    List<ProductoDTO> listaProductosDTO = new ArrayList<>();
    ArrayList<Producto> listaCarrito = new ArrayList<>();
    ArrayList<Object> listaTicket2 = new ArrayList<>();
    int id, stock, cVendida;
    String categoria, nombre;
    float precio;
    String total;
    float importe = 0, cambio = 0, totalFloat = 0;

    /**
     * Creates new form ConfirmarVenta
     */
    public ConfirmarVenta(List<ProductoDTO> lstProductos) {
        initComponents();
        setLocationRelativeTo(null);
        this.listaProductosDTO = lstProductos;
        this.listaCarrito = registroVenta.listaProductos;
        this.listaTicket2 = registroVenta.listaTicket;
        cVendida = registroVenta.nuevaCantidad;
        System.out.println(cVendida);
//        RegistroVenta rV = new RegistroVenta();
        this.labelTotal.setText(registroVenta.txtTotal);
        Persistencia();
        calcularCambio();
    }

    public void Persistencia() {
        for (int i = 0; i < listaCarrito.size(); i++) {
            id = listaCarrito.get(i).getId();
            categoria = listaCarrito.get(i).getCategoria();
            nombre = listaCarrito.get(i).getNombreProducto();
            precio = listaCarrito.get(i).getPrecioActual();
            stock = listaCarrito.get(i).getStock();
        }
        for (int i = 0; i < listaTicket2.size(); i++) {
//            cVendida = listaTicket2.get(i);
            System.out.println(listaTicket2.size());
        }

    }

    public static Date obtenerFechaActual() {
        Calendar calendar = Calendar.getInstance(); // Obtiene una instancia de Calendar con la fecha y hora actuales
        Date fechaActual = calendar.getTime(); // Obtiene la fecha y hora actual en forma de objeto Date
        return fechaActual;
    }

    private void calcularCambio() {
        String total = this.labelTotal.getText();

        try {
            totalFloat = Float.parseFloat(total.replace(",", ".")); // Reemplazamos la coma por un punto y luego convertimos a float
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El total no es un número válido");
            return;
        }

        do {
            String importeStr = JOptionPane.showInputDialog("INGRESA EL IMPORTE $ ");
            try {
                importe = Float.parseFloat(importeStr.replace(",", ".")); // Reemplazamos la coma por un punto y luego convertimos a float
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El importe no es un número válido");
                continue;
            }

            if (totalFloat > importe) {
                JOptionPane.showMessageDialog(null, "El importe debe ser mayor o igual al total");
            }
        } while (totalFloat > importe);

        String importeFormatted = String.format("%06.2f", importe).replace(".", ","); // Formateamos el importe con dos decimales y reemplazamos el punto por una coma
        this.labelPago.setText(importeFormatted);

        cambio = importe - totalFloat;
        String cambioFormatted = String.format("%06.2f", cambio).replace(".", ","); // Formateamos el cambio con dos decimales y reemplazamos el punto por una coma
        this.labelCambio.setText(cambioFormatted);
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
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelTotal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelPago = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelPago = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelCambio = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        labelCambio = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(92, 153, 135));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 36));

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Abarrotes Arely");

        jButton1.setBackground(new java.awt.Color(54, 87, 77));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuro.png"))); // NOI18N
        jButton1.setText("Cerrar Sesión");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuro.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnVerdeOscuroSelected.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(569, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(412, 412, 412)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panelTotal.setBackground(new java.awt.Color(217, 217, 217));
        panelTotal.setForeground(new java.awt.Color(217, 217, 217));

        jLabel2.setBackground(new java.awt.Color(217, 217, 217));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 63, 63));
        jLabel2.setText("TOTAL");

        labelTotal.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelTotal.setText("000.00");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(54, 87, 77));
        jLabel4.setText("$");

        javax.swing.GroupLayout panelTotalLayout = new javax.swing.GroupLayout(panelTotal);
        panelTotal.setLayout(panelTotalLayout);
        panelTotalLayout.setHorizontalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
        );
        panelTotalLayout.setVerticalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelPago.setBackground(new java.awt.Color(217, 217, 217));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(63, 63, 63));
        jLabel5.setText("PAGO");

        labelPago.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        labelPago.setForeground(new java.awt.Color(0, 0, 0));
        labelPago.setText("000.00");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(54, 87, 77));
        jLabel7.setText("$");

        javax.swing.GroupLayout panelPagoLayout = new javax.swing.GroupLayout(panelPago);
        panelPago.setLayout(panelPagoLayout);
        panelPagoLayout.setHorizontalGroup(
            panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPago, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
        );
        panelPagoLayout.setVerticalGroup(
            panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(labelPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelCambio.setBackground(new java.awt.Color(217, 217, 217));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(63, 63, 63));
        jLabel14.setText("CAMBIO");

        labelCambio.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        labelCambio.setForeground(new java.awt.Color(0, 0, 0));
        labelCambio.setText("000.00");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(54, 87, 77));
        jLabel16.setText("$");

        javax.swing.GroupLayout panelCambioLayout = new javax.swing.GroupLayout(panelCambio);
        panelCambio.setLayout(panelCambioLayout);
        panelCambioLayout.setHorizontalGroup(
            panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
        );
        panelCambioLayout.setVerticalGroup(
            panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambioLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(labelCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnCancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnCancelar.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnCancelarSelected.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnAceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnAceptar.png"))); // NOI18N
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/btnAceptarSelected.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Date fechaActual = obtenerFechaActual();
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Cantidad vendida " + cVendida);
        ProductoService productoService = new ProductoService();
//        int canVendida = Integer.parseInt(cVendida);
        int cantidadVendida = cVendida;
        float PrecioVender = precio;
        float subTotal = PrecioVender * cantidadVendida;

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("AbarrotesArelyPU");
        EntityManager em = managerFactory.createEntityManager();
        try {
            em.getTransaction().begin();

            //Persona personaBuscada = em.find(Persona.class, 1);
            //Producto productoBuscado = em.find(Producto.class, productoBD.getId());
            Encargado encargadoBuscadoFijo = em.find(Encargado.class, 1);
//            Venta ventaBuscada = em.find(Venta.class, 2);
            float totalDeVenta = totalFloat;
            System.out.println("Venta total: " + totalDeVenta);
            Venta venta = new Venta(totalDeVenta, fechaActual, encargadoBuscadoFijo);
            em.persist(venta);

            List<RelProductosVentas> relProductoVentasCollection = new ArrayList<>();

            for (int i = 0; i < listaProductosDTO.size(); i++) {

                Producto productoBD = em.find(Producto.class, listaProductosDTO.get(i).getIdProducto());
                //Cantidad vendida del ticket
                int stocA = productoBD.getStock() - listaProductosDTO.get(i).getCantidad();
                productoBD.setStock(stocA);
                em.merge(productoBD);
                
                listaCarrito.get(i).setStock(productoBD.getStock());
                
                System.out.println("Producto: "+listaCarrito.get(i).getNombreProducto() + " Stock: "+ listaCarrito.get(i).getStock());
//                for (int j = 0; j < listaCarrito.size(); j++) {
//                    listaCarrito.get(j).setStock(productoBD.getStock());
//                    
//                    System.out.println("Producto: "+listaCarrito.get(i).getNombreProducto() + "Stock: "+ listaCarrito.get(i).getStock());
//                    
//                }
                //id = listaCarrito.get(i).getId();
                System.out.println(listaProductosDTO.size());
               
                relProductoVentasCollection.add(new RelProductosVentas(listaProductosDTO.get(i).getCantidad(), listaProductosDTO.get(i).getPrecioVenta(), listaProductosDTO.get(i).getSubtotal(), productoBD, venta));
                productoBD.setRelProductosVentasCollection(relProductoVentasCollection);
                venta.setRelProductosVentasCollection(relProductoVentasCollection);
                
//                RelProductosVentas relProductosVentasBuscada = em.find(RelProductosVentas.class, listaProductosDTO.get(i).getIdProducto());
                System.out.println("ID del producto: "+ listaProductosDTO.get(i).getIdProducto());
                System.out.println("Cantidad vendida " + listaProductosDTO.get(i).getCantidad());
                
            }
            listaProductosDTO.clear();
//            RelProductosVentas relProductosVentas = new RelProductosVentas(cantidadVendida, PrecioVender, subTotal, productoBuscado, venta);
            //em.persist(relProductosVentas);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "La venta se agregó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            
            JOptionPane.showMessageDialog(null, "Error al agregar el producto: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
        
        this.dispose();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCambio;
    private javax.swing.JLabel labelPago;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panelCambio;
    private javax.swing.JPanel panelPago;
    private javax.swing.JPanel panelTotal;
    // End of variables declaration//GEN-END:variables
}
