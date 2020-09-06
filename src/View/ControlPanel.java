package View;

import Controller.Controller;

public class ControlPanel extends javax.swing.JFrame {

    private final Controller controller;
    private int coorX,coorY;
    
    public ControlPanel(Controller controller) {
        initComponents();
        this.controller = controller;
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        titleHoursToGo = new javax.swing.JLabel();
        hoursToGo = new javax.swing.JLabel();
        entreesTitle = new javax.swing.JLabel();
        entreesCounter = new javax.swing.JLabel();
        mainDishesTitle = new javax.swing.JLabel();
        mainDishesCounter = new javax.swing.JLabel();
        dessertsCounter = new javax.swing.JLabel();
        dessertsTitle = new javax.swing.JLabel();
        OrdersTitle = new javax.swing.JLabel();
        ordersCounter = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bossState = new javax.swing.JLabel();
        managerState = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entreeChefs = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mainDishChefs = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dessertChefs = new javax.swing.JLabel();
        fireEntreeChef = new javax.swing.JButton();
        hireEntreeChef = new javax.swing.JButton();
        hireDessertChef = new javax.swing.JButton();
        fireDessertChef = new javax.swing.JButton();
        hireMainChef = new javax.swing.JButton();
        fireMainChef = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        waitresses = new javax.swing.JLabel();
        fireWaitress = new javax.swing.JButton();
        hireWaitress = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 490));
        setUndecorated(true);
        setResizable(false);

        navbar.setBackground(new java.awt.Color(102, 102, 102));
        navbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                navbarMouseDragged(evt);
            }
        });
        navbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                navbarMousePressed(evt);
            }
        });

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Title.png"))); // NOI18N

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/closeButton.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/minimizeButton.png"))); // NOI18N
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizeButton)
                    .addComponent(closeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboard.setPreferredSize(new java.awt.Dimension(800, 480));

        titleHoursToGo.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        titleHoursToGo.setText("Hours to Go");

        hoursToGo.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hoursToGo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoursToGo.setText("XX");

        entreesTitle.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        entreesTitle.setText("Entrees");

        entreesCounter.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        entreesCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entreesCounter.setText("XX");

        mainDishesTitle.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        mainDishesTitle.setText("Main Dishes");

        mainDishesCounter.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        mainDishesCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainDishesCounter.setText("XX");

        dessertsCounter.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        dessertsCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dessertsCounter.setText("XX");

        dessertsTitle.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        dessertsTitle.setText("Desserts");

        OrdersTitle.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        OrdersTitle.setText("Orders Taken");

        ordersCounter.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        ordersCounter.setText("XX");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setText("Boss State");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setText("Manager State");

        bossState.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        bossState.setText("State");

        managerState.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        managerState.setText("State");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleHoursToGo)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(hoursToGo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(bossState, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(managerState, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addComponent(entreesTitle)
                                .addGap(18, 18, 18)
                                .addComponent(mainDishesTitle)
                                .addGap(18, 18, 18)
                                .addComponent(dessertsTitle))
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(ordersCounter))
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(OrdersTitle))
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(entreesCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(mainDishesCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(dessertsCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleHoursToGo)
                .addGap(0, 0, 0)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(entreesCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dessertsCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mainDishesCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mainDishesTitle)
                                .addComponent(entreesTitle)
                                .addComponent(dessertsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(OrdersTitle))
                    .addComponent(hoursToGo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bossState)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(managerState))
                    .addComponent(ordersCounter))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        sidebar.setBackground(new java.awt.Color(204, 204, 204));
        sidebar.setPreferredSize(new java.awt.Dimension(200, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel1.setText("Chefs");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setText("Entrees");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        entreeChefs.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        entreeChefs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entreeChefs.setText("xx");
        entreeChefs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setText("Main Dishes");

        mainDishChefs.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        mainDishChefs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainDishChefs.setText("xx");
        mainDishChefs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setText("Desserts");

        dessertChefs.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        dessertChefs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dessertChefs.setText("xx");
        dessertChefs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fireEntreeChef.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        fireEntreeChef.setText("Fire");
        fireEntreeChef.setToolTipText("");
        fireEntreeChef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fireEntreeChef.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fireEntreeChef.setFocusPainted(false);
        fireEntreeChef.setFocusable(false);
        fireEntreeChef.setMaximumSize(new java.awt.Dimension(40, 20));
        fireEntreeChef.setMinimumSize(new java.awt.Dimension(40, 20));
        fireEntreeChef.setName(""); // NOI18N
        fireEntreeChef.setOpaque(false);
        fireEntreeChef.setPreferredSize(new java.awt.Dimension(40, 20));
        fireEntreeChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireEntreeChefActionPerformed(evt);
            }
        });

        hireEntreeChef.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        hireEntreeChef.setText("Hire");
        hireEntreeChef.setToolTipText("");
        hireEntreeChef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hireEntreeChef.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hireEntreeChef.setFocusPainted(false);
        hireEntreeChef.setFocusable(false);
        hireEntreeChef.setMaximumSize(new java.awt.Dimension(40, 20));
        hireEntreeChef.setMinimumSize(new java.awt.Dimension(40, 20));
        hireEntreeChef.setName(""); // NOI18N
        hireEntreeChef.setOpaque(false);
        hireEntreeChef.setPreferredSize(new java.awt.Dimension(40, 20));
        hireEntreeChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireEntreeChefActionPerformed(evt);
            }
        });

        hireDessertChef.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        hireDessertChef.setText("Hire");
        hireDessertChef.setToolTipText("");
        hireDessertChef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hireDessertChef.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hireDessertChef.setFocusPainted(false);
        hireDessertChef.setFocusable(false);
        hireDessertChef.setMaximumSize(new java.awt.Dimension(40, 20));
        hireDessertChef.setMinimumSize(new java.awt.Dimension(40, 20));
        hireDessertChef.setName(""); // NOI18N
        hireDessertChef.setOpaque(false);
        hireDessertChef.setPreferredSize(new java.awt.Dimension(40, 20));
        hireDessertChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireDessertChefActionPerformed(evt);
            }
        });

        fireDessertChef.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        fireDessertChef.setText("Fire");
        fireDessertChef.setToolTipText("");
        fireDessertChef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fireDessertChef.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fireDessertChef.setFocusPainted(false);
        fireDessertChef.setFocusable(false);
        fireDessertChef.setMaximumSize(new java.awt.Dimension(40, 20));
        fireDessertChef.setMinimumSize(new java.awt.Dimension(40, 20));
        fireDessertChef.setName(""); // NOI18N
        fireDessertChef.setOpaque(false);
        fireDessertChef.setPreferredSize(new java.awt.Dimension(40, 20));
        fireDessertChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireDessertChefActionPerformed(evt);
            }
        });

        hireMainChef.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        hireMainChef.setText("Hire");
        hireMainChef.setToolTipText("");
        hireMainChef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hireMainChef.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hireMainChef.setFocusPainted(false);
        hireMainChef.setFocusable(false);
        hireMainChef.setMaximumSize(new java.awt.Dimension(40, 20));
        hireMainChef.setMinimumSize(new java.awt.Dimension(40, 20));
        hireMainChef.setName(""); // NOI18N
        hireMainChef.setOpaque(false);
        hireMainChef.setPreferredSize(new java.awt.Dimension(40, 20));
        hireMainChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireMainChefActionPerformed(evt);
            }
        });

        fireMainChef.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        fireMainChef.setText("Fire");
        fireMainChef.setToolTipText("");
        fireMainChef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fireMainChef.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fireMainChef.setFocusPainted(false);
        fireMainChef.setFocusable(false);
        fireMainChef.setMaximumSize(new java.awt.Dimension(40, 20));
        fireMainChef.setMinimumSize(new java.awt.Dimension(40, 20));
        fireMainChef.setName(""); // NOI18N
        fireMainChef.setOpaque(false);
        fireMainChef.setPreferredSize(new java.awt.Dimension(40, 20));
        fireMainChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireMainChefActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel6.setText("Waitress");

        waitresses.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        waitresses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitresses.setText("xx");
        waitresses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fireWaitress.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        fireWaitress.setText("Fire");
        fireWaitress.setToolTipText("");
        fireWaitress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fireWaitress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fireWaitress.setFocusPainted(false);
        fireWaitress.setFocusable(false);
        fireWaitress.setMaximumSize(new java.awt.Dimension(40, 20));
        fireWaitress.setMinimumSize(new java.awt.Dimension(40, 20));
        fireWaitress.setName(""); // NOI18N
        fireWaitress.setOpaque(false);
        fireWaitress.setPreferredSize(new java.awt.Dimension(40, 20));
        fireWaitress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireWaitressActionPerformed(evt);
            }
        });

        hireWaitress.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        hireWaitress.setText("Hire");
        hireWaitress.setToolTipText("");
        hireWaitress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hireWaitress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hireWaitress.setFocusPainted(false);
        hireWaitress.setFocusable(false);
        hireWaitress.setMaximumSize(new java.awt.Dimension(40, 20));
        hireWaitress.setMinimumSize(new java.awt.Dimension(40, 20));
        hireWaitress.setName(""); // NOI18N
        hireWaitress.setOpaque(false);
        hireWaitress.setPreferredSize(new java.awt.Dimension(40, 20));
        hireWaitress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireWaitressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sidebarLayout.createSequentialGroup()
                                .addComponent(fireEntreeChef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hireEntreeChef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(sidebarLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mainDishChefs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(sidebarLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(entreeChefs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(sidebarLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dessertChefs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(sidebarLayout.createSequentialGroup()
                                .addComponent(fireDessertChef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hireDessertChef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidebarLayout.createSequentialGroup()
                                .addComponent(fireMainChef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hireMainChef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidebarLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(waitresses, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sidebarLayout.createSequentialGroup()
                                .addComponent(fireWaitress, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hireWaitress, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(95, 95, 95))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entreeChefs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fireEntreeChef, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hireEntreeChef, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainDishChefs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fireMainChef, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hireMainChef, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dessertChefs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fireDessertChef, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hireDessertChef, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waitresses, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fireWaitress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hireWaitress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbarMousePressed
        this.coorX = evt.getX();
        this.coorY = evt.getY();
    }//GEN-LAST:event_navbarMousePressed

    private void navbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbarMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - this.coorX, this.getLocation().y + evt.getY() - this.coorY);
    }//GEN-LAST:event_navbarMouseDragged

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        this.controller.closePanel();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.controller.minimizePanel(this);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void hireEntreeChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireEntreeChefActionPerformed
        this.controller.kitchen.HireEntreeChef();
    }//GEN-LAST:event_hireEntreeChefActionPerformed

    private void hireDessertChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireDessertChefActionPerformed
        this.controller.kitchen.HireDessertChef();
    }//GEN-LAST:event_hireDessertChefActionPerformed

    private void hireMainChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireMainChefActionPerformed
        this.controller.kitchen.HireMainChef();
    }//GEN-LAST:event_hireMainChefActionPerformed

    private void fireEntreeChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireEntreeChefActionPerformed
        this.controller.kitchen.FireEntreeChef();
    }//GEN-LAST:event_fireEntreeChefActionPerformed

    private void fireMainChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireMainChefActionPerformed
        this.controller.kitchen.FireMainChef();
    }//GEN-LAST:event_fireMainChefActionPerformed

    private void fireDessertChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireDessertChefActionPerformed
        this.controller.kitchen.FireDessertChef();
    }//GEN-LAST:event_fireDessertChefActionPerformed

    private void fireWaitressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireWaitressActionPerformed
        this.controller.kitchen.FireWaitress();
    }//GEN-LAST:event_fireWaitressActionPerformed

    private void hireWaitressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireWaitressActionPerformed
        this.controller.kitchen.HireWaitress();
    }//GEN-LAST:event_hireWaitressActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OrdersTitle;
    public javax.swing.JLabel bossState;
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel dashboard;
    public javax.swing.JLabel dessertChefs;
    public javax.swing.JLabel dessertsCounter;
    private javax.swing.JLabel dessertsTitle;
    public javax.swing.JLabel entreeChefs;
    public javax.swing.JLabel entreesCounter;
    private javax.swing.JLabel entreesTitle;
    public javax.swing.JButton fireDessertChef;
    public javax.swing.JButton fireEntreeChef;
    public javax.swing.JButton fireMainChef;
    public javax.swing.JButton fireWaitress;
    public javax.swing.JButton hireDessertChef;
    public javax.swing.JButton hireEntreeChef;
    public javax.swing.JButton hireMainChef;
    public javax.swing.JButton hireWaitress;
    public javax.swing.JLabel hoursToGo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel mainDishChefs;
    public javax.swing.JLabel mainDishesCounter;
    private javax.swing.JLabel mainDishesTitle;
    public javax.swing.JLabel managerState;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JPanel navbar;
    public javax.swing.JLabel ordersCounter;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleHoursToGo;
    public javax.swing.JLabel waitresses;
    // End of variables declaration//GEN-END:variables
}
