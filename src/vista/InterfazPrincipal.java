package vista;

import controlador.LoginController;
import controlador.TecnicoController;
import controlador.ReporteController;

public class InterfazPrincipal extends javax.swing.JFrame {  
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName());
    private TecnicoController tecnicoController = new TecnicoController();
    private ReporteController reporteController;
    public InterfazPrincipal() {
        initComponents();
        setResizable(false);
        setTitle("Panel de administracion");
        setLocationRelativeTo(null);
        LoginController login=new LoginController(this);
        cargarComboTecnico();
        cargarTablaTecnicos();
        this.reporteController = new ReporteController(this);
        this.repaint();
    }

    // Carga inicial de los combos del formulario de Tecnicos.
    // TODO: si ya tienes la tabla "especialidad" en tu BD, reemplaza este llenado
    // fijo por una consulta (por ejemplo con un metodo listar() en un EspecialidadDao).
    private void cargarComboTecnico() {
        comboxTecEstado.removeAllItems();
        comboxTecEstado.addItem("Activo");
        comboxTecEstado.addItem("Inactivo");

        comboxTecEspec.removeAllItems();
        comboxTecEspec.addItem("Hardware");
        comboxTecEspec.addItem("Software");
        comboxTecEspec.addItem("Redes");
    }

    private void cargarTablaTecnicos() {
        tecnicoController.listarTecnicos(TableUsuario1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        panelincidencia = new javax.swing.JPanel();
        lblincidencias = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        panelTecnicos = new javax.swing.JPanel();
        lblTecnicos = new javax.swing.JLabel();
        panelCategorias = new javax.swing.JPanel();
        lblCategorias = new javax.swing.JLabel();
        panelEspecialidades = new javax.swing.JPanel();
        lblEspecialidades = new javax.swing.JLabel();
        panelReportes = new javax.swing.JPanel();
        lblReportes = new javax.swing.JLabel();
        panelAsistente = new javax.swing.JPanel();
        lblAsistente = new javax.swing.JLabel();
        panelLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cabecera = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtInciTit = new javax.swing.JTextField();
        txtInciDes = new javax.swing.JTextField();
        txtInciPrio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtInciEst = new javax.swing.JTextField();
        txtInciUsu = new javax.swing.JTextField();
        txtInciTec = new javax.swing.JTextField();
        txtInciId = new javax.swing.JTextField();
        btnInciReg = new javax.swing.JButton();
        btnInciMod = new javax.swing.JButton();
        btnInciElim = new javax.swing.JButton();
        btnInciLim = new javax.swing.JButton();
        comboxInciCate = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableIncidencia = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtUsuCod2 = new javax.swing.JTextField();
        txtUsuNom2 = new javax.swing.JTextField();
        txtUsuPre2 = new javax.swing.JTextField();
        txtUsuDes2 = new javax.swing.JTextField();
        txtUsuId2 = new javax.swing.JTextField();
        comboxUsuCat2 = new javax.swing.JComboBox<>();
        btnUsuReg2 = new javax.swing.JButton();
        btnUsuMod2 = new javax.swing.JButton();
        btnUsuElim2 = new javax.swing.JButton();
        btnUsuCanc2 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableUsuario = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnTecRegistrar = new javax.swing.JButton();
        btnTecModif = new javax.swing.JButton();
        btnTecElimi = new javax.swing.JButton();
        btnTecLim = new javax.swing.JButton();
        txtTecNom = new javax.swing.JTextField();
        txxTecApell = new javax.swing.JTextField();
        txtTecCI = new javax.swing.JTextField();
        txtTecTelef = new javax.swing.JTextField();
        txtTecCorreo = new javax.swing.JTextField();
        txtTecID = new javax.swing.JTextField();
        comboxTecEstado = new javax.swing.JComboBox<>();
        comboxTecEspec = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableUsuario1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnCateRegis = new javax.swing.JButton();
        btnCatecModif = new javax.swing.JButton();
        btnCatecLimp = new javax.swing.JButton();
        btnCatecElimi = new javax.swing.JButton();
        txtCateID = new javax.swing.JTextField();
        txtCateNom = new javax.swing.JTextField();
        comboxCateEstado = new javax.swing.JComboBox<>();
        txtCateDescrip = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtCateBuscar = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableCategorias = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btnEspecRegis = new javax.swing.JButton();
        btnEspecMod = new javax.swing.JButton();
        btnEspecLimp = new javax.swing.JButton();
        btnEspecElimi = new javax.swing.JButton();
        txtEspecID = new javax.swing.JTextField();
        txtEspecNom = new javax.swing.JTextField();
        comboxEspecEstado = new javax.swing.JComboBox<>();
        txtEspecDescrip = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        comboxEspecNivel = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        txtEspecBuscar = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        btnReporteIncidencias = new javax.swing.JButton();
        btnIncidenciasTecnico = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        comboxReporteEstado = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        comboxReporteCategoria = new javax.swing.JComboBox<>();
        btnIncidenciasCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setBackground(new java.awt.Color(0, 0, 102));
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelincidencia.setBackground(new java.awt.Color(0, 0, 102));
        panelincidencia.setForeground(new java.awt.Color(255, 255, 255));

        lblincidencias.setBackground(new java.awt.Color(153, 255, 255));
        lblincidencias.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblincidencias.setForeground(new java.awt.Color(204, 204, 255));
        lblincidencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1 INICIO.png"))); // NOI18N
        lblincidencias.setText("Incidencias");

        javax.swing.GroupLayout panelincidenciaLayout = new javax.swing.GroupLayout(panelincidencia);
        panelincidencia.setLayout(panelincidenciaLayout);
        panelincidenciaLayout.setHorizontalGroup(
            panelincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblincidencias, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        panelincidenciaLayout.setVerticalGroup(
            panelincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelincidenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblincidencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(panelincidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 50));

        panelUsuarios.setBackground(new java.awt.Color(0, 0, 102));
        panelUsuarios.setForeground(new java.awt.Color(255, 255, 255));

        lblUsuario.setBackground(new java.awt.Color(153, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 204, 255));
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2 USUARIO.png"))); // NOI18N
        lblUsuario.setText("Usuarios");

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        Menu.add(panelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, -1));

        panelTecnicos.setBackground(new java.awt.Color(0, 0, 102));
        panelTecnicos.setForeground(new java.awt.Color(255, 255, 255));

        lblTecnicos.setBackground(new java.awt.Color(153, 255, 255));
        lblTecnicos.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTecnicos.setForeground(new java.awt.Color(204, 204, 255));
        lblTecnicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3TECNICO.png"))); // NOI18N
        lblTecnicos.setText("Tecnicos");

        javax.swing.GroupLayout panelTecnicosLayout = new javax.swing.GroupLayout(panelTecnicos);
        panelTecnicos.setLayout(panelTecnicosLayout);
        panelTecnicosLayout.setHorizontalGroup(
            panelTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTecnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelTecnicosLayout.setVerticalGroup(
            panelTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTecnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTecnicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(panelTecnicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 50));

        panelCategorias.setBackground(new java.awt.Color(0, 0, 102));
        panelCategorias.setForeground(new java.awt.Color(255, 255, 255));

        lblCategorias.setBackground(new java.awt.Color(153, 255, 255));
        lblCategorias.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(204, 204, 255));
        lblCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4 CATEGORIA.png"))); // NOI18N
        lblCategorias.setText("Categorias");

        javax.swing.GroupLayout panelCategoriasLayout = new javax.swing.GroupLayout(panelCategorias);
        panelCategorias.setLayout(panelCategoriasLayout);
        panelCategoriasLayout.setHorizontalGroup(
            panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        panelCategoriasLayout.setVerticalGroup(
            panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        Menu.add(panelCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 200, 50));

        panelEspecialidades.setBackground(new java.awt.Color(0, 0, 102));
        panelEspecialidades.setForeground(new java.awt.Color(255, 255, 255));

        lblEspecialidades.setBackground(new java.awt.Color(153, 255, 255));
        lblEspecialidades.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblEspecialidades.setForeground(new java.awt.Color(204, 204, 255));
        lblEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5 ESPRCIALIDADES.png"))); // NOI18N
        lblEspecialidades.setText("Especialidades");

        javax.swing.GroupLayout panelEspecialidadesLayout = new javax.swing.GroupLayout(panelEspecialidades);
        panelEspecialidades.setLayout(panelEspecialidadesLayout);
        panelEspecialidadesLayout.setHorizontalGroup(
            panelEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelEspecialidadesLayout.setVerticalGroup(
            panelEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadesLayout.createSequentialGroup()
                .addComponent(lblEspecialidades)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        Menu.add(panelEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 50));

        panelReportes.setBackground(new java.awt.Color(0, 0, 102));
        panelReportes.setForeground(new java.awt.Color(255, 255, 255));

        lblReportes.setBackground(new java.awt.Color(153, 255, 255));
        lblReportes.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(204, 204, 255));
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6REPORTES.png"))); // NOI18N
        lblReportes.setText("Reportes");

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReportes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu.add(panelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, -1));

        panelAsistente.setBackground(new java.awt.Color(0, 0, 102));
        panelAsistente.setForeground(new java.awt.Color(255, 255, 255));

        lblAsistente.setBackground(new java.awt.Color(153, 255, 255));
        lblAsistente.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblAsistente.setForeground(new java.awt.Color(204, 204, 255));
        lblAsistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/7CERRARCE.png"))); // NOI18N
        lblAsistente.setText("Asistente IA");

        javax.swing.GroupLayout panelAsistenteLayout = new javax.swing.GroupLayout(panelAsistente);
        panelAsistente.setLayout(panelAsistenteLayout);
        panelAsistenteLayout.setHorizontalGroup(
            panelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsistenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAsistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );
        panelAsistenteLayout.setVerticalGroup(
            panelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsistenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAsistente)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Menu.add(panelAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 200, -1));

        panelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelLogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        panelLogo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 210, 150));

        Cabecera.setBackground(new java.awt.Color(0, 0, 102));
        Cabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Asistente HelpDesk");
        Cabecera.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, 60));

        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsalir.setText("Salir");
        Cabecera.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 80, 20));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario3.png"))); // NOI18N
        jLabel24.setText("jLabel24");
        Cabecera.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 80, 70));

        jTabbedPane3.setForeground(new java.awt.Color(204, 0, 204));
        jTabbedPane3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jPanel21.setBackground(new java.awt.Color(255, 204, 204));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Incidencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Titulo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Descripcion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Categoria:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Prioridad:");

        txtInciTit.setToolTipText("");

        txtInciDes.addActionListener(this::txtInciDesActionPerformed);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Estado:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Usuario:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tecnico:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("ID:");

        txtInciEst.addActionListener(this::txtInciEstActionPerformed);

        txtInciUsu.addActionListener(this::txtInciUsuActionPerformed);

        txtInciId.setEditable(false);

        btnInciReg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInciReg.setText("Registrar");

        btnInciMod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInciMod.setText("Modificar");

        btnInciElim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInciElim.setText("Eliminar");

        btnInciLim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInciLim.setText("Limpiar");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInciPrio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInciTit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInciDes, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(comboxInciCate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(35, 35, 35)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInciEst, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInciUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInciTec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInciId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInciMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInciReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInciElim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInciLim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInciTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtInciEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInciReg))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtInciDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtInciUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInciMod))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtInciTec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInciElim)
                    .addComponent(comboxInciCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtInciPrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtInciId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInciLim))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 600, 230));

        TableIncidencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TableIncidencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "Categoria", "Prioridad", "Estado", "Usuario", "Tecnico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TableIncidencia);
        if (TableIncidencia.getColumnModel().getColumnCount() > 0) {
            TableIncidencia.getColumnModel().getColumn(4).setHeaderValue("Precio ");
            TableIncidencia.getColumnModel().getColumn(5).setHeaderValue("Cantidad");
        }

        jPanel21.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 610, 160));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Incidencias", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jPanel18.setBackground(new java.awt.Color(255, 204, 204));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Codigo:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Nombre:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Precio:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Descripcion:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Categoria:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Id:");

        txtUsuCod2.setEditable(false);

        txtUsuId2.setEditable(false);
        txtUsuId2.setEnabled(false);

        btnUsuReg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUsuReg2.setText("Registrar");

        btnUsuMod2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUsuMod2.setText("Modificar");

        btnUsuElim2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUsuElim2.setText("Eliminar");

        btnUsuCanc2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUsuCanc2.setText("Cancelar");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuPre2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtUsuNom2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsuCod2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuDes2)
                    .addComponent(txtUsuId2)
                    .addComponent(comboxUsuCat2, 0, 96, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUsuMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuCanc2)
                    .addComponent(btnUsuReg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuElim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(txtUsuPre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32)
                                    .addComponent(txtUsuId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUsuCanc2)))
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(comboxUsuCat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtUsuCod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuDes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuReg2))
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuMod2)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(txtUsuNom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnUsuElim2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 600, 230));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Buscar:");
        jPanel18.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel18.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 130, -1));

        TableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Nombre", "Descripcion", "Precio ", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TableUsuario);
        if (TableUsuario.getColumnModel().getColumnCount() > 0) {
            TableUsuario.getColumnModel().getColumn(4).setHeaderValue("Precio ");
            TableUsuario.getColumnModel().getColumn(5).setHeaderValue("Cantidad");
        }

        jPanel18.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 610, 130));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Usuarios", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setToolTipText("");

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tecnicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Apellido:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("CI:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Telefono:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Correo:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Especialidad:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Estado:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("ID Tecnico:");

        btnTecRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTecRegistrar.setText("Registrar");

        btnTecModif.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTecModif.setText("Modificar");

        btnTecElimi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTecElimi.setText("Eliminar");
        btnTecElimi.addActionListener(this::btnTecElimiActionPerformed);

        btnTecLim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTecLim.setText("Limpiar");
        btnTecLim.addActionListener(this::btnTecLimActionPerformed);

        txtTecNom.setName(""); // NOI18N

        txtTecTelef.addActionListener(this::txtTecTelefActionPerformed);

        txtTecID.addActionListener(this::txtTecIDActionPerformed);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txxTecApell, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTecCI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTecTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTecNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(txtTecID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnTecLim, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(txtTecCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTecRegistrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboxTecEstado, 0, 100, Short.MAX_VALUE)
                            .addComponent(comboxTecEspec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTecModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTecElimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addComponent(btnTecRegistrar)
                    .addComponent(txtTecNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTecCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(btnTecModif)
                    .addComponent(txxTecApell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxTecEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(btnTecElimi)
                    .addComponent(txtTecCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxTecEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTecTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(txtTecID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTecLim))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        TableUsuario1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "CI", "Telefono", "Especialidad", "Estado", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(TableUsuario1);
        if (TableUsuario1.getColumnModel().getColumnCount() > 0) {
            TableUsuario1.getColumnModel().getColumn(4).setHeaderValue("Precio ");
            TableUsuario1.getColumnModel().getColumn(5).setHeaderValue("Cantidad");
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Tecnicos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("ID Categoria:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Nombre:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Estado:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Descripcion:");

        btnCateRegis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCateRegis.setText("Registrar");

        btnCatecModif.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCatecModif.setText("Modificar");

        btnCatecLimp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCatecLimp.setText("Limpiar");

        btnCatecElimi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCatecElimi.setText("Eliminar");
        btnCatecElimi.addActionListener(this::btnCatecElimiActionPerformed);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(btnCateRegis)
                .addGap(206, 206, 206)
                .addComponent(btnCatecLimp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(txtCateID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCateNom)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboxCateEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCateDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnCatecModif)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCatecElimi)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(txtCateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCateNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxCateEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(txtCateDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCateRegis)
                    .addComponent(btnCatecModif)
                    .addComponent(btnCatecLimp)
                    .addComponent(btnCatecElimi))
                .addGap(34, 34, 34))
        );

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Buscar:");

        txtCateBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tableCategorias);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel37)
                        .addGap(25, 25, 25)
                        .addComponent(txtCateBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(txtCateBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Categorias", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("ID Categoria:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Nombre:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Estado:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Descripcion:");

        btnEspecRegis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEspecRegis.setText("Registrar");

        btnEspecMod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEspecMod.setText("Modificar");

        btnEspecLimp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEspecLimp.setText("Limpiar");

        btnEspecElimi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEspecElimi.setText("Eliminar");
        btnEspecElimi.addActionListener(this::btnEspecElimiActionPerformed);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Nivel:");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(btnEspecRegis)
                        .addGap(206, 206, 206)
                        .addComponent(btnEspecLimp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel29Layout.createSequentialGroup()
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(jPanel29Layout.createSequentialGroup()
                                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(38, 38, 38)))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)))
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(txtEspecID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEspecNom, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboxEspecEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEspecDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel29Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(btnEspecMod)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnEspecElimi)))
                                    .addComponent(comboxEspecNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(txtEspecID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxEspecEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(comboxEspecNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEspecRegis)
                    .addComponent(btnEspecMod)
                    .addComponent(btnEspecLimp)
                    .addComponent(btnEspecElimi))
                .addGap(34, 34, 34))
        );

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Buscar:");

        txtEspecBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEspecBuscar.addActionListener(this::txtEspecBuscarActionPerformed);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Estado", "Nivel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tableEspecialidades);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(35, 35, 35)
                        .addComponent(txtEspecBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtEspecBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Especialidades", jPanel6);

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asistente IA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Asistente IA", jPanel9);

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnReporteIncidencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReporteIncidencias.setText("Reportes de incidencias");
        btnReporteIncidencias.addActionListener(this::btnReporteIncidenciasActionPerformed);

        btnIncidenciasTecnico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIncidenciasTecnico.setText("Incidencias por Tecnicos ");
        btnIncidenciasTecnico.addActionListener(this::btnIncidenciasTecnicoActionPerformed);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("REPORTES DEL SISTEMA HELPDESK");

        jLabel26.setText("Estado");

        comboxReporteEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pendiente", "Asignada", "En proceso", "Resuelta" }));

        jLabel27.setText("Categoria");

        comboxReporteCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas ", "Hardware", "Software Hospitalario", "Red", "Impresora", "Correo Institusional", "Base de Datos ", "Base de Datos", "Equipos Biomedicos " }));

        btnIncidenciasCategoria.setText("Incidencias por categoria  ");
        btnIncidenciasCategoria.addActionListener(this::btnIncidenciasCategoriaActionPerformed);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(btnReporteIncidencias)
                                .addGap(61, 61, 61)
                                .addComponent(btnIncidenciasTecnico))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboxReporteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIncidenciasCategoria)
                    .addComponent(comboxReporteCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(comboxReporteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(comboxReporteCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporteIncidencias)
                    .addComponent(btnIncidenciasTecnico)
                    .addComponent(btnIncidenciasCategoria))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Reportes", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInciDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInciDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInciDesActionPerformed

    private void txtInciEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInciEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInciEstActionPerformed

    private void txtInciUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInciUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInciUsuActionPerformed

    private void txtTecTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTecTelefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTecTelefActionPerformed

    private void txtTecIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTecIDActionPerformed
        // Al presionar Enter en el campo ID, busca ese tecnico y llena el formulario (para Modificar)
        try {
            int id = Integer.parseInt(txtTecID.getText().trim());
            tecnicoController.cargarTecnicoEnFormulario(id, txtTecNom, txxTecApell, txtTecCI, txtTecTelef,
                    txtTecCorreo, comboxTecEspec, comboxTecEstado, txtTecID);
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe un Id de tecnico valido (numero).");
        }
    }//GEN-LAST:event_txtTecIDActionPerformed

    private void btnTecElimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecElimiActionPerformed
        try {
            int id = Integer.parseInt(txtTecID.getText().trim());
            boolean ok = tecnicoController.eliminarTecnico(id);
            if (ok) {
                cargarTablaTecnicos();
                tecnicoController.cancelar(txtTecID, txtTecNom, txxTecApell, txtTecCI, txtTecTelef, txtTecCorreo);
            }
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe o selecciona el Id del tecnico a eliminar.");
        }
    }//GEN-LAST:event_btnTecElimiActionPerformed

    private void btnTecLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecLimActionPerformed
        tecnicoController.cancelar(txtTecID, txtTecNom, txxTecApell, txtTecCI, txtTecTelef, txtTecCorreo);
        if (comboxTecEspec.getItemCount() > 0) {
            comboxTecEspec.setSelectedIndex(0);
        }
        if (comboxTecEstado.getItemCount() > 0) {
            comboxTecEstado.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnTecLimActionPerformed

    private void btnTecRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        boolean ok = tecnicoController.registrarTecnico(
                txtTecNom.getText().trim(),
                txxTecApell.getText().trim(),
                txtTecCI.getText().trim(),
                txtTecTelef.getText().trim(),
                txtTecCorreo.getText().trim(),
                (String) comboxTecEspec.getSelectedItem(),
                (String) comboxTecEstado.getSelectedItem());
        if (ok) {
            cargarTablaTecnicos();
            tecnicoController.cancelar(txtTecID, txtTecNom, txxTecApell, txtTecCI, txtTecTelef, txtTecCorreo);
        }
    }

    private void btnTecModifActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int id = Integer.parseInt(txtTecID.getText().trim());
            boolean ok = tecnicoController.modificarTecnico(
                    id,
                    txtTecNom.getText().trim(),
                    txxTecApell.getText().trim(),
                    txtTecCI.getText().trim(),
                    txtTecTelef.getText().trim(),
                    txtTecCorreo.getText().trim(),
                    (String) comboxTecEspec.getSelectedItem(),
                    (String) comboxTecEstado.getSelectedItem());
            if (ok) {
                cargarTablaTecnicos();
                tecnicoController.cancelar(txtTecID, txtTecNom, txxTecApell, txtTecCI, txtTecTelef, txtTecCorreo);
            }
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe o selecciona el Id del tecnico a modificar.");
        }
    }

    private void btnCatecElimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatecElimiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCatecElimiActionPerformed

    private void btnEspecElimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecElimiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEspecElimiActionPerformed

    private void txtEspecBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecBuscarActionPerformed

    private void btnReporteIncidenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteIncidenciasActionPerformed
              try {
        // 1. SACAR LOS DATOS SELECCIONADOS USANDO LOS NUEVOS NOMBRES ÚNICOS
        String est = comboxReporteEstado.getSelectedItem().toString(); 
        String cat = comboxReporteCategoria.getSelectedItem().toString();   
        String pri = "Todos"; 

        // 2. CORRECCIÓN DEL CONTROLADOR: Inicializar si es nulo
        if (this.reporteController == null) {
            this.reporteController = new controlador.ReporteController(this);
        }

        // 3. MANDAR LOS DATOS AL CONTROLADOR
        reporteController.ejecutarReporte(est, cat, pri);

        // 4. MENSAJE DE ÉXITO
        javax.swing.JOptionPane.showMessageDialog(this, "¡Reporte PDF generado exitosamente en la raíz del proyecto!");

    } catch (Exception e) {
        System.out.println("ERROR CRÍTICO AL PRESIONAR EL BOTÓN: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnReporteIncidenciasActionPerformed

    private void btnIncidenciasTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncidenciasTecnicoActionPerformed
        // TODO add your handling code here:
        try {
            if (this.reporteController == null) {
                this.reporteController = new controlador.ReporteController(this);
            }
            reporteController.ejecutarReporte("AGRUPADO_TECNICO", "Todos", "Todos");
            
            javax.swing.JOptionPane.showMessageDialog(this, "¡Reporte PDF por Técnico generado exitosamente!");
        } catch (Exception e) {
            System.out.println("ERROR CRÍTICO AL PRESIONAR EL BOTÓN TÉCNICOS: " + e.getMessage());
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_btnIncidenciasTecnicoActionPerformed

    private void btnIncidenciasCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncidenciasCategoriaActionPerformed
        // TODO add your handling code here:
        try {
            if (this.reporteController == null) {
                this.reporteController = new controlador.ReporteController(this);
            }
            // CORRECCIÓN: Cambiamos a AGRUPADO_CATEGORIA
            reporteController.ejecutarReporte("AGRUPADO_CATEGORIA", "Todos", "Todos");
            
            // CORRECCIÓN: Cambiamos el mensaje a Categoría
            javax.swing.JOptionPane.showMessageDialog(this, "¡Reporte PDF por Categoría generado exitosamente!");
        } catch (Exception e) {
            System.out.println("ERROR CRÍTICO AL PRESIONAR EL BOTÓN CATEGORÍAS: " + e.getMessage());
            e.printStackTrace();
        }
        

    }//GEN-LAST:event_btnIncidenciasCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    public javax.swing.JPanel Menu;
    public javax.swing.JTable TableIncidencia;
    public javax.swing.JTable TableUsuario;
    public javax.swing.JTable TableUsuario1;
    public javax.swing.JButton btnCateRegis;
    public javax.swing.JButton btnCatecElimi;
    public javax.swing.JButton btnCatecLimp;
    public javax.swing.JButton btnCatecModif;
    public javax.swing.JButton btnEspecElimi;
    public javax.swing.JButton btnEspecLimp;
    public javax.swing.JButton btnEspecMod;
    public javax.swing.JButton btnEspecRegis;
    public javax.swing.JButton btnInciElim;
    public javax.swing.JButton btnInciLim;
    public javax.swing.JButton btnInciMod;
    public javax.swing.JButton btnInciReg;
    private javax.swing.JButton btnIncidenciasCategoria;
    private javax.swing.JButton btnIncidenciasTecnico;
    private javax.swing.JButton btnReporteIncidencias;
    public javax.swing.JButton btnTecElimi;
    public javax.swing.JButton btnTecLim;
    public javax.swing.JButton btnTecModif;
    public javax.swing.JButton btnTecRegistrar;
    public javax.swing.JButton btnUsuCanc2;
    public javax.swing.JButton btnUsuElim2;
    public javax.swing.JButton btnUsuMod2;
    public javax.swing.JButton btnUsuReg2;
    private javax.swing.JButton btnsalir;
    public javax.swing.JComboBox<String> comboxCateEstado;
    public javax.swing.JComboBox<String> comboxEspecEstado;
    public javax.swing.JComboBox<String> comboxEspecNivel;
    public javax.swing.JComboBox<String> comboxInciCate;
    private javax.swing.JComboBox<String> comboxReporteCategoria;
    private javax.swing.JComboBox<String> comboxReporteEstado;
    public javax.swing.JComboBox<String> comboxTecEspec;
    public javax.swing.JComboBox<String> comboxTecEstado;
    public javax.swing.JComboBox<Object> comboxUsuCat2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    public javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    public javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    public javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JTabbedPane jTabbedPane3;
    public javax.swing.JTextField jTextField19;
    public javax.swing.JLabel lblAsistente;
    public javax.swing.JLabel lblCategorias;
    public javax.swing.JLabel lblEspecialidades;
    public javax.swing.JLabel lblReportes;
    public javax.swing.JLabel lblTecnicos;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JLabel lblincidencias;
    public javax.swing.JPanel panelAsistente;
    public javax.swing.JPanel panelCategorias;
    public javax.swing.JPanel panelEspecialidades;
    private javax.swing.JPanel panelLogo;
    public javax.swing.JPanel panelReportes;
    public javax.swing.JPanel panelTecnicos;
    public javax.swing.JPanel panelUsuarios;
    public javax.swing.JPanel panelincidencia;
    public javax.swing.JTable tableCategorias;
    public javax.swing.JTable tableEspecialidades;
    public javax.swing.JTextField txtCateBuscar;
    public javax.swing.JTextField txtCateDescrip;
    private javax.swing.JTextField txtCateID;
    public javax.swing.JTextField txtCateNom;
    public javax.swing.JTextField txtEspecBuscar;
    public javax.swing.JTextField txtEspecDescrip;
    private javax.swing.JTextField txtEspecID;
    public javax.swing.JTextField txtEspecNom;
    public javax.swing.JTextField txtInciDes;
    public javax.swing.JTextField txtInciEst;
    public javax.swing.JTextField txtInciId;
    public javax.swing.JTextField txtInciPrio;
    public javax.swing.JTextField txtInciTec;
    public javax.swing.JTextField txtInciTit;
    public javax.swing.JTextField txtInciUsu;
    public javax.swing.JTextField txtTecCI;
    public javax.swing.JTextField txtTecCorreo;
    private javax.swing.JTextField txtTecID;
    public javax.swing.JTextField txtTecNom;
    public javax.swing.JTextField txtTecTelef;
    public javax.swing.JTextField txtUsuCod2;
    public javax.swing.JTextField txtUsuDes2;
    public javax.swing.JTextField txtUsuId2;
    public javax.swing.JTextField txtUsuNom2;
    public javax.swing.JTextField txtUsuPre2;
    public javax.swing.JTextField txxTecApell;
    // End of variables declaration//GEN-END:variables
}
