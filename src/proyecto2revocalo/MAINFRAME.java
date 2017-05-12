package proyecto2revocalo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class MAINFRAME extends javax.swing.JFrame implements Serializable{
    
    //creamos dos archivos HashMap, uno para electoress y otro para centros de validacion
    private HashMap<Integer, Elector> electores = new HashMap<>();
    private HashMap<Integer, Centro> centros = new HashMap<>();
    File fileElectores = new File ("hashElectores.dat");
    File fileCentros = new File ("hashCentros.dat");
    
    public MAINFRAME() throws Exception {
        initComponents();
        startElectores();
        startCentros();
    }
    
    //estos son los metodos para guardar los HashMaps en archivos de objeto
    
    public void saveElector() throws Exception{
        FileOutputStream fos = new FileOutputStream (fileElectores);
        ObjectOutputStream oos = new ObjectOutputStream (fos);
        oos.writeObject(electores);
        oos.close();
    }
    
    public HashMap startElectores() throws IOException, FileNotFoundException, ClassNotFoundException{
        try { 
            FileInputStream fis = new FileInputStream(fileElectores);
            ObjectInputStream ois = new ObjectInputStream (fis);
            electores = (HashMap<Integer, Elector>)ois.readObject();
            ois.close();
        } catch (IOException ex) {
            System.out.println("Error leyendo "+ex.getMessage());
        }
        return electores;
    }
    
     public void saveCentro() throws Exception{
        FileOutputStream fos = new FileOutputStream (fileCentros);
        ObjectOutputStream oos = new ObjectOutputStream (fos);
        oos.writeObject(centros);
        oos.close();
    }
    
    public HashMap startCentros() throws IOException, FileNotFoundException, ClassNotFoundException{
        try {       
            FileInputStream fis = new FileInputStream(fileCentros);
            ObjectInputStream ois = new ObjectInputStream (fis);
            centros = (HashMap<Integer, Centro>)ois.readObject();
            ois.close();
        } catch (IOException ex) {
            System.out.println("Error leyendo "+ex.getMessage());
        }
        return centros;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameBuscarCentro = new javax.swing.JFrame();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldGetNumBuscar = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextFieldShowNombreC = new javax.swing.JTextField();
        jTextFieldShowDirC = new javax.swing.JTextField();
        jTextFieldShowLatCB = new javax.swing.JTextField();
        jTextFieldShowLongCB = new javax.swing.JTextField();
        jButtonModificarCentro = new javax.swing.JButton();
        jButtonEliminarCentro = new javax.swing.JButton();
        jButtonOka = new javax.swing.JButton();
        jButtonBuscarC = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jFrameAddCentro = new javax.swing.JFrame();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldGetNum = new javax.swing.JTextField();
        jTextFieldGetNombreCentro = new javax.swing.JTextField();
        jTextFieldGetDireccionCentro = new javax.swing.JTextField();
        jTextFieldGetLatCentro = new javax.swing.JTextField();
        jTextFieldGetLongCentro = new javax.swing.JTextField();
        jButtonAddCentro = new javax.swing.JButton();
        jFrameAddElector = new javax.swing.JFrame();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldGetName = new javax.swing.JTextField();
        jTextFieldGetFech = new javax.swing.JTextField();
        jTextFieldGetLat = new javax.swing.JTextField();
        jTextFieldGetLong = new javax.swing.JTextField();
        jTextFieldGetCed = new javax.swing.JTextField();
        jButtonAddElector = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButtonSearchElector = new javax.swing.JButton();
        jButtonNewElector = new javax.swing.JButton();
        jButtonNewCentro = new javax.swing.JButton();
        jButtonSearchCenter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCedula = new javax.swing.JTextField();
        jPanelMain = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextShowName = new javax.swing.JTextField();
        jTextShowFecha = new javax.swing.JTextField();
        jTextShowLat = new javax.swing.JTextField();
        jTextShowLong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextShowNameC = new javax.swing.JTextField();
        jTextShowDirec = new javax.swing.JTextField();
        jTextShowLatC = new javax.swing.JTextField();
        jTextShowLongC = new javax.swing.JTextField();
        jButtonModElector = new javax.swing.JButton();
        jButtonEliminarElector = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextGetN = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();

        jFrameBuscarCentro.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameBuscarCentro.setTitle("Buscar Centro");
        jFrameBuscarCentro.setLocation(new java.awt.Point(500, 190));
        jFrameBuscarCentro.setResizable(false);
        jFrameBuscarCentro.setType(java.awt.Window.Type.UTILITY);

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 153));
        jLabel27.setText("Ingresa el numero del centro que quieres buscar:");

        jLabel28.setText("NOMBRE:");

        jLabel29.setText("DIRRECCION:");

        jLabel30.setText("LATITUD:");

        jLabel31.setText("LONGITUD:");

        jButtonModificarCentro.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonModificarCentro.setForeground(new java.awt.Color(0, 51, 153));
        jButtonModificarCentro.setText("MODIFICAR");
        jButtonModificarCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarCentroActionPerformed(evt);
            }
        });

        jButtonEliminarCentro.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonEliminarCentro.setForeground(new java.awt.Color(255, 0, 51));
        jButtonEliminarCentro.setText("ELIMINAR");
        jButtonEliminarCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminarCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCentroActionPerformed(evt);
            }
        });

        jButtonOka.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonOka.setForeground(new java.awt.Color(0, 153, 0));
        jButtonOka.setText("OK");
        jButtonOka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkaActionPerformed(evt);
            }
        });

        jButtonBuscarC.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonBuscarC.setForeground(new java.awt.Color(0, 51, 153));
        jButtonBuscarC.setText("BUSCAR");
        jButtonBuscarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial Narrow", 2, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Para modificar, ingresa los nuevos datos en los textfields, y presiona \"Modificar\" ");

        javax.swing.GroupLayout jFrameBuscarCentroLayout = new javax.swing.GroupLayout(jFrameBuscarCentro.getContentPane());
        jFrameBuscarCentro.getContentPane().setLayout(jFrameBuscarCentroLayout);
        jFrameBuscarCentroLayout.setHorizontalGroup(
            jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameBuscarCentroLayout.createSequentialGroup()
                .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrameBuscarCentroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(49, 49, 49)
                        .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldShowNombreC)
                            .addComponent(jTextFieldShowDirC)
                            .addComponent(jTextFieldShowLatCB)
                            .addComponent(jTextFieldShowLongCB, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(jFrameBuscarCentroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonModificarCentro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jButtonEliminarCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jButtonOka, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameBuscarCentroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldGetNumBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButtonBuscarC)
                .addGap(76, 76, 76))
            .addGroup(jFrameBuscarCentroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrameBuscarCentroLayout.setVerticalGroup(
            jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameBuscarCentroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGetNumBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarC))
                .addGap(28, 28, 28)
                .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextFieldShowNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextFieldShowDirC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextFieldShowLatCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextFieldShowLongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jFrameBuscarCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOka)
                    .addComponent(jButtonModificarCentro)
                    .addComponent(jButtonEliminarCentro))
                .addContainerGap())
        );

        jFrameAddCentro.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameAddCentro.setTitle("Nuevo Centro");
        jFrameAddCentro.setLocation(new java.awt.Point(500, 190));
        jFrameAddCentro.setResizable(false);
        jFrameAddCentro.setType(java.awt.Window.Type.UTILITY);

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 153));
        jLabel21.setText("Por favor, ingresa los siguientes datos:");

        jLabel22.setText("NUMERO DE CENTRO:");

        jLabel23.setText("NOMBRE DEL CENTRO:");

        jLabel24.setText("DIRECCION:");

        jLabel25.setText("LATITUD:");

        jLabel26.setText("LONGITUD:");

        jButtonAddCentro.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonAddCentro.setForeground(new java.awt.Color(51, 153, 0));
        jButtonAddCentro.setText("ADD CENTRO");
        jButtonAddCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCentroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameAddCentroLayout = new javax.swing.GroupLayout(jFrameAddCentro.getContentPane());
        jFrameAddCentro.getContentPane().setLayout(jFrameAddCentroLayout);
        jFrameAddCentroLayout.setHorizontalGroup(
            jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameAddCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrameAddCentroLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jLabel21))
                    .addGroup(jFrameAddCentroLayout.createSequentialGroup()
                        .addGroup(jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGetLongCentro)
                            .addComponent(jTextFieldGetLatCentro)
                            .addComponent(jTextFieldGetNombreCentro)
                            .addComponent(jTextFieldGetDireccionCentro)
                            .addComponent(jTextFieldGetNum))))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameAddCentroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddCentro)
                .addGap(103, 103, 103))
        );
        jFrameAddCentroLayout.setVerticalGroup(
            jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAddCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldGetNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldGetNombreCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldGetDireccionCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextFieldGetLatCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrameAddCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGetLongCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButtonAddCentro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFrameAddElector.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameAddElector.setTitle("Nuevo Elector");
        jFrameAddElector.setLocation(new java.awt.Point(500, 190));
        jFrameAddElector.setResizable(false);
        jFrameAddElector.setType(java.awt.Window.Type.UTILITY);

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("Por favor, ingresa los siguientes datos:");

        jLabel16.setText("NOMBRES Y APELLIDOS: ");

        jLabel17.setText("NUMERO DE CEDULA:");

        jLabel18.setText("FECHA DE NACIMIENTO:");

        jLabel19.setText("LATITUD DE DOMICILIO:");

        jLabel20.setText("LONGITUD DE DOMICILIO:");

        jButtonAddElector.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonAddElector.setForeground(new java.awt.Color(51, 153, 0));
        jButtonAddElector.setText("INSCRIBIR");
        jButtonAddElector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddElector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddElectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameAddElectorLayout = new javax.swing.GroupLayout(jFrameAddElector.getContentPane());
        jFrameAddElector.getContentPane().setLayout(jFrameAddElectorLayout);
        jFrameAddElectorLayout.setHorizontalGroup(
            jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAddElectorLayout.createSequentialGroup()
                .addGroup(jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameAddElectorLayout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldGetLong)
                            .addComponent(jTextFieldGetName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGetCed, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGetFech, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGetLat, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jFrameAddElectorLayout.createSequentialGroup()
                        .addGroup(jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrameAddElectorLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jButtonAddElector, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFrameAddElectorLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel15)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jFrameAddElectorLayout.setVerticalGroup(
            jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAddElectorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGetCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGetFech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGetLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jFrameAddElectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGetLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(27, 27, 27)
                .addComponent(jButtonAddElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("#Revocalo");
        setLocation(new java.awt.Point(300, 50));
        setResizable(false);

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jLabel9.setText("Kms");

        jButtonSearchElector.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButtonSearchElector.setForeground(new java.awt.Color(0, 51, 153));
        jButtonSearchElector.setText("BUSCAR");
        jButtonSearchElector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSearchElector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchElectorActionPerformed(evt);
            }
        });

        jButtonNewElector.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonNewElector.setForeground(new java.awt.Color(51, 153, 0));
        jButtonNewElector.setText("+ ELECTOR");
        jButtonNewElector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewElector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewElectorActionPerformed(evt);
            }
        });

        jButtonNewCentro.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonNewCentro.setForeground(new java.awt.Color(51, 153, 0));
        jButtonNewCentro.setText("+ CENTRO");
        jButtonNewCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewCentroActionPerformed(evt);
            }
        });

        jButtonSearchCenter.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonSearchCenter.setForeground(new java.awt.Color(0, 51, 153));
        jButtonSearchCenter.setText("BUSCAR CENTRO");
        jButtonSearchCenter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSearchCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchCenterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("#Revocalo");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setText("Ingresa tu cedula y revisa cual es tu centro de validacion mas cercano!");

        jTextCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCedulaActionPerformed(evt);
            }
        });

        jLabel3.setText("NOMBRES: ");

        jLabel4.setText("FECHA DE NAC.:");

        jLabel5.setText("LATITUD:");

        jLabel6.setText("LONGITUD:");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel7.setText("Centro de validacion mas conveniente:");

        jLabel11.setText("NOMBRE:");

        jLabel12.setText("DIRECCION:");

        jLabel13.setText("LATITUD:");

        jLabel14.setText("LONGITUD:");

        jTextShowNameC.setEditable(false);

        jTextShowDirec.setEditable(false);

        jTextShowLatC.setEditable(false);

        jTextShowLongC.setEditable(false);

        jButtonModElector.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonModElector.setForeground(new java.awt.Color(0, 51, 153));
        jButtonModElector.setText("MODIFICAR ELECTOR");
        jButtonModElector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModElector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModElectorActionPerformed(evt);
            }
        });

        jButtonEliminarElector.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonEliminarElector.setForeground(new java.awt.Color(255, 0, 0));
        jButtonEliminarElector.setText(" ELIMINAR ELECTOR");
        jButtonEliminarElector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminarElector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarElectorActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(0, 153, 153));
        jButtonClear.setText("CLEAR");
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(22, 22, 22)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jTextShowName)
                    .addComponent(jTextShowFecha)
                    .addComponent(jTextShowLat)
                    .addComponent(jTextShowLong)
                    .addComponent(jTextShowNameC)
                    .addComponent(jTextShowDirec)
                    .addComponent(jTextShowLatC)
                    .addComponent(jTextShowLongC, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonModElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminarElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextShowName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextShowFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminarElector)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModElector)
                    .addComponent(jLabel5)
                    .addComponent(jTextShowLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTextShowLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextShowNameC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextShowDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextShowLatC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextShowLongC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jLabel8.setText("Mostrar centro de validacion a");

        jLabel33.setFont(new java.awt.Font("Arial Narrow", 2, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Para modificar un elector, ingresa los nuevos datos en los textfields, y presiona \"Modificar Elector\" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonSearchElector, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNewCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNewElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSearchCenter))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextGetN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextGetN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearchElector, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSearchCenter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNewCentro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNewElector)
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonSearchElectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchElectorActionPerformed
         
        /* dada la cedula (key) se inserta en el HashMap de electores
        y obtengo el objeto Elector relacionado a esa key. Luego, con los atributos Latitud y Longitud
        del elector obtenido, los utilizo para encontrar el centro mas cercano, en base al 'N'
        que se lee por pantalla despues de la cedula. Este boton realiza la funcionalidad principal
        del programa */
        
        //se valida que los textfields de cedula y KMs esten llenos, si no, muestra error
        if (jTextCedula.getText().isEmpty() && jTextGetN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay nada que buscar!", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }else if(jTextCedula.getText().isEmpty() || jTextGetN.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Faltan datos por llenar!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            int ced = Integer.parseInt(jTextCedula.getText());
            Elector Belector = electores.get(ced);
            //si no se encuentra el elector, muestra mensaje de error
            if (Belector == null) {
              JOptionPane.showMessageDialog(this, "No se puede encontrar al elector!", "ERROR", JOptionPane.WARNING_MESSAGE);
            }else{
                jTextShowName.setText(Belector.getNombre());
                jTextShowFecha.setText(Belector.getFechaNac());
                jTextShowLat.setText(String.valueOf(Belector.getLatitud()));
                jTextShowLong.setText(String.valueOf(Belector.getLongitud()));
                //este es el proceso para encontrar el centro de validacion mas conveniente, en base al N leido
                float N = Float.parseFloat(jTextGetN.getText());
                float latE = Belector.getLatitud();
                float longE = Belector.getLongitud();
                Iterator it = centros.entrySet().iterator();
                //aqui se recorre todo el HashMap
                while (it.hasNext()){
                    HashMap.Entry entry = (HashMap.Entry)it.next();
                    Centro Itcentro = (Centro)entry.getValue();
                    float latC = Itcentro.getLatitud();
                    float longC = Itcentro.getLongitud();
                    
                    //se compara la distancia entre el elector y el centro recorrido, con el N
                    
                    if (distancia(latE, longE, latC, longC) <= N) {
                        jTextShowNameC.setText(Itcentro.getNombre());
                        jTextShowDirec.setText(Itcentro.getDireccion());
                        jTextShowLatC.setText(String.valueOf(Itcentro.getLatitud()));
                        jTextShowLongC.setText(String.valueOf(Itcentro.getLongitud()));
                    }
                }
            }
        }  
    }//GEN-LAST:event_jButtonSearchElectorActionPerformed

    private void jButtonSearchCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchCenterActionPerformed
        jFrameBuscarCentro.setSize(400, 330);
        jFrameBuscarCentro.setVisible(true);
    }//GEN-LAST:event_jButtonSearchCenterActionPerformed

    private void jTextCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCedulaActionPerformed

    }//GEN-LAST:event_jTextCedulaActionPerformed

    private void jButtonModElectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModElectorActionPerformed
        //aqui se modifican los datos del elector, sustituyendo los valores de los textfields
        
        if (jTextCedula.getText().isEmpty() && jTextShowName.getText().isEmpty() && jTextShowFecha.getText().isEmpty() && jTextShowLat.getText().isEmpty() && jTextShowLong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay nada que modificar!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(jTextCedula.getText().isEmpty() || jTextShowName.getText().isEmpty() || jTextShowFecha.getText().isEmpty() || jTextShowLat.getText().isEmpty() || jTextShowLong.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Faltan datos!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            int ced = Integer.parseInt(jTextCedula.getText());
            Elector Melector = electores.get(ced);
            Melector.setNombres(jTextShowName.getText());
            Melector.setFechaNac(jTextShowFecha.getText());
            Melector.setLatitud(Float.parseFloat(jTextShowLat.getText()));
            Melector.setLongitud(Float.parseFloat(jTextShowLong.getText()));
            JOptionPane.showMessageDialog(this, "Los datos se han modificado con exito!", "Modificacion exitosa", JOptionPane.INFORMATION_MESSAGE);
            try {
                saveElector();
            } catch (Exception ex) {}
        }
    }//GEN-LAST:event_jButtonModElectorActionPerformed

    private void jButtonModificarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarCentroActionPerformed
        //se modifican los centros de validacion, de la misma forma que los electores

        if (jTextFieldGetNumBuscar.getText().isEmpty() && jTextFieldShowNombreC.getText().isEmpty() && jTextFieldShowDirC.getText().isEmpty() && jTextFieldShowLatCB.getText().isEmpty() && jTextFieldShowLongCB.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay nada que modificar!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(jTextFieldGetNumBuscar.getText().isEmpty() || jTextFieldShowNombreC.getText().isEmpty() || jTextFieldShowDirC.getText().isEmpty() || jTextFieldShowLatCB.getText().isEmpty() || jTextFieldShowLongCB.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Faltan datos!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            int num = Integer.parseInt(jTextFieldGetNumBuscar.getText());
            Centro Mcentro = centros.get(num);
            Mcentro.setNombre(jTextFieldShowNombreC.getText());
            Mcentro.setDireccion(jTextFieldShowDirC.getText());
            Mcentro.setLatitud(Float.parseFloat(jTextFieldShowLatCB.getText()));
            Mcentro.setLongitud(Float.parseFloat(jTextFieldShowLongCB.getText()));
            JOptionPane.showMessageDialog(this, "Los datos se han modificado con exito!", "Modificacion exitosa", JOptionPane.INFORMATION_MESSAGE);
            try {
                saveCentro();
            } catch (Exception ex) {}
        }
    }//GEN-LAST:event_jButtonModificarCentroActionPerformed

    private void jButtonOkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkaActionPerformed
        //al cerrar la ventana de buscar centros de validacion, se limpian los textfields
        jTextFieldShowNombreC.setText(null);
        jTextFieldGetNumBuscar.setText(null);
        jTextFieldShowDirC.setText(null);
        jTextFieldShowLatCB.setText(null);
        jTextFieldShowLongCB.setText(null);
        jFrameBuscarCentro.setVisible(false);
    }//GEN-LAST:event_jButtonOkaActionPerformed

    private void jButtonAddCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCentroActionPerformed
        /* aqui se crea un nuevo centro de validacion, dado el numero de centro (key)
         y el objeto Centro, se insertan en el HashMap de Centros*/
        Centro nuevoCentro = new Centro();
        //si un textfield esta vacio, entonces muestra mensaje de error. Si no, se guarda el centro
        if (!jTextFieldGetNum.getText().isEmpty() && !jTextFieldGetNombreCentro.getText().isEmpty() && !jTextFieldGetDireccionCentro.getText().isEmpty() && !jTextFieldGetLatCentro.getText().isEmpty() && !jTextFieldGetLongCentro.getText().isEmpty()) {
            int numero = Integer.parseInt(jTextFieldGetNum.getText());
            nuevoCentro.setNombre(jTextFieldGetNombreCentro.getText());
            nuevoCentro.setDireccion(jTextFieldGetDireccionCentro.getText());
            nuevoCentro.setLatitud(Float.parseFloat(jTextFieldGetLatCentro.getText()));
            nuevoCentro.setLongitud(Float.parseFloat(jTextFieldGetLongCentro.getText()));
            centros.put(numero, nuevoCentro);
            
            try {
                saveCentro();
            } catch (Exception ex) {
                Logger.getLogger(MAINFRAME.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //se cierra la ventana y se limpian los textfields
            jFrameAddCentro.setVisible(false);
            jTextFieldGetNum.setText(null);
            jTextFieldGetNombreCentro.setText(null);
            jTextFieldGetDireccionCentro.setText(null);
            jTextFieldGetLatCentro.setText(null);
            jTextFieldGetLongCentro.setText(null);
        }else{
             JOptionPane.showMessageDialog(this, "Faltan datos por ingresar!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddCentroActionPerformed

    private void jButtonAddElectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddElectorActionPerformed
        /* aqui se crea un nuevo elector, dada la cedula (key)
         y el objeto Elector, se insertan en el HashMap de Electores*/
        Elector nuevoElector = new Elector();
        //si algun textfield esta vacio, entonces muestra mensaje de error
        if (!jTextFieldGetCed.getText().isEmpty() && !jTextFieldGetName.getText().equals("") && !jTextFieldGetFech.getText().equals("") && !jTextFieldGetLat.getText().isEmpty() && !jTextFieldGetLong.getText().isEmpty()) {
            int nuevaCe = Integer.parseInt(jTextFieldGetCed.getText());
            nuevoElector.setNombres(jTextFieldGetName.getText());
            nuevoElector.setFechaNac(jTextFieldGetFech.getText());
            nuevoElector.setLatitud(Float.parseFloat(jTextFieldGetLat.getText()));
            nuevoElector.setLongitud(Float.parseFloat(jTextFieldGetLong.getText()));
            electores.put(nuevaCe, nuevoElector);
            try {
                saveElector();
            } catch (Exception ex){}
            //se cierra la ventana y se limpian los textfields
            jFrameAddElector.setVisible(false);
            jTextFieldGetCed.setText(null);
            jTextFieldGetName.setText(null);
            jTextFieldGetFech.setText(null);
            jTextFieldGetLat.setText(null);
            jTextFieldGetLong.setText(null);
        }else{
            JOptionPane.showMessageDialog(this, "Faltan datos por ingresar!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddElectorActionPerformed

    private void jButtonNewCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCentroActionPerformed
        jFrameAddCentro.setSize(400, 325);
        jFrameAddCentro.setVisible(true);
    }//GEN-LAST:event_jButtonNewCentroActionPerformed

    private void jButtonNewElectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewElectorActionPerformed
        jFrameAddElector.setSize(400, 325);
        jFrameAddElector.setVisible(true);
    }//GEN-LAST:event_jButtonNewElectorActionPerformed

    private void jButtonBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCActionPerformed
        /* dado el numero de centro (key) se inserta en el HashMap de centros de validacion
        y obtengo el objeto Centro relacionado a esa key*/
        //primero se valida que el textfield del numero de centro no este vacio, si lo esta, muestra error
        if (jTextFieldGetNumBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay nada que buscar!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            int num = Integer.parseInt(jTextFieldGetNumBuscar.getText());
            Centro Bcentro = centros.get(num);
            //si no encuentra el centro, da mensaje de error
            if (Bcentro == null) {
               JOptionPane.showMessageDialog(this, "No se puede encontrar el centro!", "ERROR", JOptionPane.WARNING_MESSAGE);
               jTextFieldGetNumBuscar.setText(null);
               jTextFieldShowNombreC.setText(null);
               jTextFieldShowDirC.setText(null);
               jTextFieldShowLatCB.setText(null);
               jTextFieldShowLongCB.setText(null);
            }else{
               jTextFieldShowNombreC.setText(Bcentro.getNombre());
               jTextFieldShowDirC.setText(Bcentro.getDireccion());
               jTextFieldShowLatCB.setText(String.valueOf(Bcentro.getLatitud()));
               jTextFieldShowLongCB.setText(String.valueOf(Bcentro.getLongitud()));
            }
        }  
    }//GEN-LAST:event_jButtonBuscarCActionPerformed
                                   
    private void jButtonEliminarElectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarElectorActionPerformed
        /*aqui se elimina a un elector, primero se pregunta al user si esta seguro
        de eliminarlo. Si es cierto, se elimina el elector del HashMap*/
        int optionPane = JOptionPane.showConfirmDialog(this, "Seguro deseas eliminar al elector?", null, JOptionPane.YES_NO_OPTION);
        if (optionPane == JOptionPane.YES_OPTION) {
            if (jTextCedula.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puedes eliminar porque este elector no existe!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                int cedulaBorrar = Integer.parseInt(jTextCedula.getText());
                electores.remove(cedulaBorrar);
                jTextCedula.setText(null);
                jTextShowName.setText(null);
                jTextShowFecha.setText(null);
                jTextShowLat.setText(null);
                jTextShowLong.setText(null);
                try {
                    saveElector();
                } catch (Exception ex) {}
            }
        }
    }//GEN-LAST:event_jButtonEliminarElectorActionPerformed

    private void jButtonEliminarCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCentroActionPerformed
        /*aqui se elimina un centro de validacion (de la misma forma como
        se eliminan los electores)*/

        int optionPane = JOptionPane.showConfirmDialog(this, "Seguro deseas eliminar el centro?", null, JOptionPane.YES_NO_OPTION);
        if (optionPane == JOptionPane.YES_OPTION) {
            if (jTextFieldGetNumBuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puedes eliminar porque este centro no existe!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                int numeroBorrar = Integer.parseInt(jTextFieldGetNumBuscar.getText());
                centros.remove(numeroBorrar);
                jTextFieldGetNumBuscar.setText(null);
                jTextFieldShowNombreC.setText(null);
                jTextFieldShowDirC.setText(null);
                jTextFieldShowLatCB.setText(null);
                jTextFieldShowLongCB.setText(null);
                try {
                    saveCentro();
                } catch (Exception ex) {}
            }
        }
    }//GEN-LAST:event_jButtonEliminarCentroActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        //Boton de clear. Limpia todos los campos de la pantalla principal
        jTextCedula.setText(null);
        jTextShowName.setText(null);
        jTextShowFecha.setText(null);
        jTextShowLat.setText(null);
        jTextShowLong.setText(null);
        jTextShowNameC.setText(null);
        jTextShowDirec.setText(null);
        jTextShowLatC.setText(null);
        jTextShowLongC.setText(null);
        jTextGetN.setText(null);
    }//GEN-LAST:event_jButtonClearActionPerformed
    
    //Este es el metodo que calcula la distancia en KMs entre dos puntos, dados la latitud y longitud de ambos
    public static double distancia(double lat1, double lng1, double lat2, double lng2) {  
        double radioTierra = 6371; //radio de la tierra en KMs
        double dLat = Math.toRadians(lat2 - lat1);  
        double dLng = Math.toRadians(lng2 - lng1);  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        double distancia = radioTierra * va2;  
        return distancia;  
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCentro;
    private javax.swing.JButton jButtonAddElector;
    private javax.swing.JButton jButtonBuscarC;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonEliminarCentro;
    private javax.swing.JButton jButtonEliminarElector;
    private javax.swing.JButton jButtonModElector;
    private javax.swing.JButton jButtonModificarCentro;
    private javax.swing.JButton jButtonNewCentro;
    private javax.swing.JButton jButtonNewElector;
    private javax.swing.JButton jButtonOka;
    private javax.swing.JButton jButtonSearchCenter;
    private javax.swing.JButton jButtonSearchElector;
    private javax.swing.JFrame jFrameAddCentro;
    private javax.swing.JFrame jFrameAddElector;
    private javax.swing.JFrame jFrameBuscarCentro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextFieldGetCed;
    private javax.swing.JTextField jTextFieldGetDireccionCentro;
    private javax.swing.JTextField jTextFieldGetFech;
    private javax.swing.JTextField jTextFieldGetLat;
    private javax.swing.JTextField jTextFieldGetLatCentro;
    private javax.swing.JTextField jTextFieldGetLong;
    private javax.swing.JTextField jTextFieldGetLongCentro;
    private javax.swing.JTextField jTextFieldGetName;
    private javax.swing.JTextField jTextFieldGetNombreCentro;
    private javax.swing.JTextField jTextFieldGetNum;
    private javax.swing.JTextField jTextFieldGetNumBuscar;
    private javax.swing.JTextField jTextFieldShowDirC;
    private javax.swing.JTextField jTextFieldShowLatCB;
    private javax.swing.JTextField jTextFieldShowLongCB;
    private javax.swing.JTextField jTextFieldShowNombreC;
    private javax.swing.JTextField jTextGetN;
    private javax.swing.JTextField jTextShowDirec;
    private javax.swing.JTextField jTextShowFecha;
    private javax.swing.JTextField jTextShowLat;
    private javax.swing.JTextField jTextShowLatC;
    private javax.swing.JTextField jTextShowLong;
    private javax.swing.JTextField jTextShowLongC;
    private javax.swing.JTextField jTextShowName;
    private javax.swing.JTextField jTextShowNameC;
    // End of variables declaration//GEN-END:variables
}
