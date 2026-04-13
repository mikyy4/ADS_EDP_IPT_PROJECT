package javaapplication79;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    private void loadEmployeePayslipTable() {
        DefaultTableModel model = (DefaultTableModel) payslipTable.getModel();
        model.setRowCount(0);

        if (this.loggedInEmployeeId <= 0) {
        return;
        }

        String sql =
        "SELECT pay_period, basic_salary, overtime_pay, thirteenth_month_pay, " +
        "(basic_salary + overtime_pay + thirteenth_month_pay) AS total_earnings, " +
        "tax_deduction, late_deduction, net_salary, status " +
        "FROM payroll " +
        "WHERE employee_id = ? " +
        "ORDER BY created_at DESC";

        try (Connection con = openConnection();
        PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, this.loggedInEmployeeId);

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Object[] row = {
                    rs.getString("pay_period"),
                    String.format("PHP %,.2f", rs.getDouble("basic_salary")),
                    String.format("PHP %,.2f", rs.getDouble("overtime_pay")),
                    String.format("PHP %,.2f", rs.getDouble("thirteenth_month_pay")),
                    String.format("PHP %,.2f", rs.getDouble("total_earnings")),
                    String.format("PHP %,.2f", rs.getDouble("tax_deduction")),
                    String.format("PHP %,.2f", rs.getDouble("late_deduction")),
                    String.format("PHP %,.2f", rs.getDouble("net_salary")),
                    rs.getString("status")
                };
                model.addRow(row);
            }
        }

        if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "No payslip records found for your account.");
        }

        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading payslips: " + e.getMessage());
        }
    }
    
    public Dashboard() {
        initComponents();
        // Employee table
    employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = employeeTable.getSelectedRow();
            if (row >= 0) {
                Object val = employeeTable.getValueAt(row, 0);
                if (val != null) {
                    loadSelectedEmployee(val.toString());
                }
            }
        }
    });

    // OT Status
    otStatusCB.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[]{"None", "Pending", "Approved", "Declined"}));
    otStatusCB.setSelectedIndex(-1);

    // Auto-format Time In (auto colon after 2 digits)
    timeINTxt.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            String current = timeINTxt.getText();
            if (!Character.isDigit(c)) {
                evt.consume();
                return;
            }
            if (current.length() == 2) {
                timeINTxt.setText(current + ":");
            }
            if (current.length() >= 5) {
                evt.consume();
            }
        }
    });

    // Auto-format Time Out (auto colon after 2 digits)
    timeOutTxt.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            String current = timeOutTxt.getText();
            if (!Character.isDigit(c)) {
                evt.consume();
                return;
            }
            if (current.length() == 2) {
                timeOutTxt.setText(current + ":");
            }
            if (current.length() >= 5) {
                evt.consume();
            }
        }
    });

}
    
    private int selectedEmployeeId = -1;
    private int loggedInEmployeeId = -1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        loginpanel = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        useridlbl = new javax.swing.JLabel();
        passlbl = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        userIDTxt = new javax.swing.JTextField();
        roleCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        adminPanel = new javax.swing.JPanel();
        managestaff = new javax.swing.JPanel();
        navPanelMS = new javax.swing.JPanel();
        msAdminDashboard = new javax.swing.JButton();
        msManageStaff = new javax.swing.JButton();
        msGeneratePayroll = new javax.swing.JButton();
        navMS = new javax.swing.JLabel();
        adLogout2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabelEmployeesDirectory = new javax.swing.JLabel();
        msHeader = new javax.swing.JPanel();
        jLabelMSHeader = new javax.swing.JLabel();
        msClrBtn = new javax.swing.JButton();
        jLabelFullName = new javax.swing.JLabel();
        jLabelManageEmployees = new javax.swing.JLabel();
        msSaveBtn = new javax.swing.JButton();
        positionCB = new javax.swing.JComboBox<>();
        statusCB = new javax.swing.JComboBox<>();
        salaryTxt = new javax.swing.JTextField();
        jLabelPosition = new javax.swing.JLabel();
        jLabelSalary = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        fullNameTxt = new javax.swing.JTextField();
        jLabelDateHired = new javax.swing.JLabel();
        msUpdateBtn = new javax.swing.JButton();
        msDeleteBtn = new javax.swing.JButton();
        dateHiredDC = new com.toedter.calendar.JDateChooser();
        generatepayroll = new javax.swing.JPanel();
        navPanelGP = new javax.swing.JPanel();
        gpAdminDashBoard = new javax.swing.JButton();
        gpManageStaff = new javax.swing.JButton();
        gpGeneratePayroll = new javax.swing.JButton();
        navGP = new javax.swing.JLabel();
        adLogout1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        payrollTable = new javax.swing.JTable();
        jLabelPayrollDetails = new javax.swing.JLabel();
        gpHeader = new javax.swing.JPanel();
        jLabelGPHeader = new javax.swing.JLabel();
        finalizePayroll = new javax.swing.JButton();
        jLabelSelectDate = new javax.swing.JLabel();
        jLabelGeneratePayroll = new javax.swing.JLabel();
        generatePayroll = new javax.swing.JButton();
        adDateChooser = new com.toedter.calendar.JDateChooser();
        adminDashboard = new javax.swing.JPanel();
        dhNavPanel = new javax.swing.JPanel();
        dasboardBtn = new javax.swing.JButton();
        mngStaffBtn = new javax.swing.JButton();
        payrollBtn = new javax.swing.JButton();
        navLbl = new javax.swing.JLabel();
        adLogout = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        titlePanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        overviewLbl = new javax.swing.JLabel();
        managerPanel = new javax.swing.JPanel();
        managerDashboard1 = new javax.swing.JPanel();
        mdNavPanel = new javax.swing.JPanel();
        mdDashboardBtn = new javax.swing.JButton();
        mdAttendanceBtn = new javax.swing.JButton();
        mdOTRequestBtn = new javax.swing.JButton();
        navLbl1 = new javax.swing.JLabel();
        adLogout3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        mdDashboardTable = new javax.swing.JTable();
        titlePanel1 = new javax.swing.JPanel();
        titleLbl1 = new javax.swing.JLabel();
        jlabelMDOverview = new javax.swing.JLabel();
        otrequest = new javax.swing.JPanel();
        orNavPanel = new javax.swing.JPanel();
        orDashboardBtn = new javax.swing.JButton();
        orAttendanceBtn = new javax.swing.JButton();
        orOTRequestBtn = new javax.swing.JButton();
        navGP1 = new javax.swing.JLabel();
        adLogout4 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        attendanceLogTable = new javax.swing.JTable();
        gpHeader1 = new javax.swing.JPanel();
        jLabelGPHeader1 = new javax.swing.JLabel();
        jLabelGeneratePayroll1 = new javax.swing.JLabel();
        orApproveBtn = new javax.swing.JButton();
        orDeclineBtn = new javax.swing.JButton();
        attendancelog = new javax.swing.JPanel();
        alNavPanel = new javax.swing.JPanel();
        atDashboardBtn = new javax.swing.JButton();
        atAttendanceBtn = new javax.swing.JButton();
        atOTRequestBtn = new javax.swing.JButton();
        navMS1 = new javax.swing.JLabel();
        adLogout5 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        atEmployeeTable = new javax.swing.JTable();
        jLabelEmployeesDirectory1 = new javax.swing.JLabel();
        msHeader1 = new javax.swing.JPanel();
        jLabelMSHeader1 = new javax.swing.JLabel();
        atClrBtn = new javax.swing.JButton();
        jlabelatName = new javax.swing.JLabel();
        jLabelManageEmployees1 = new javax.swing.JLabel();
        atSaveBtn = new javax.swing.JButton();
        otStatusCB = new javax.swing.JComboBox<>();
        employeeCB = new javax.swing.JComboBox<>();
        jLabelPosition1 = new javax.swing.JLabel();
        jLabelSalary1 = new javax.swing.JLabel();
        jLabelStatus1 = new javax.swing.JLabel();
        jLabelDateHired1 = new javax.swing.JLabel();
        timeINTxt = new javax.swing.JTextField();
        timeOutTxt = new javax.swing.JTextField();
        employeePanel = new javax.swing.JPanel();
        viewpayslip = new javax.swing.JPanel();
        dhNavPanel2 = new javax.swing.JPanel();
        vpViewPayslipBtn = new javax.swing.JButton();
        vpRequestOTBtn = new javax.swing.JButton();
        navLbl2 = new javax.swing.JLabel();
        adLogout6 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        payslipTable = new javax.swing.JTable();
        titlePanel2 = new javax.swing.JPanel();
        titleLbl2 = new javax.swing.JLabel();
        overviewLbl2 = new javax.swing.JLabel();
        requestOt = new javax.swing.JPanel();
        navPanelGP2 = new javax.swing.JPanel();
        roPayslipBtn = new javax.swing.JButton();
        roRequestOvertimeBtn = new javax.swing.JButton();
        navGP2 = new javax.swing.JLabel();
        adLogout7 = new javax.swing.JLabel();
        gpHeader2 = new javax.swing.JPanel();
        jLabelGPHeader2 = new javax.swing.JLabel();
        jLabelGeneratePayroll2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        otHrsSpinner = new javax.swing.JSpinner();
        reqBtn = new javax.swing.JButton();
        reqOTDC = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new java.awt.CardLayout());

        loginpanel.setBackground(new java.awt.Color(249, 247, 242));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(137, 87, 55));
        jLabelTitle.setText("KAPE-BULSU");

        useridlbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        useridlbl.setForeground(new java.awt.Color(137, 87, 55));
        useridlbl.setText("Username:");

        passlbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        passlbl.setForeground(new java.awt.Color(137, 87, 55));
        passlbl.setText("Password:");

        userIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTxtActionPerformed(evt);
            }
        });

        roleCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Employee" }));
        roleCB.setSelectedIndex(-1);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(137, 87, 55));
        jLabel2.setText("Role:");

        loginBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(60, 42, 33));
        loginBtn.setText("LOGIN");
        loginBtn.setFocusPainted(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(useridlbl)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roleCB, 0, 173, Short.MAX_VALUE)
                            .addComponent(userIDTxt)
                            .addComponent(passTxt))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelTitle)
                .addGap(30, 30, 30)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useridlbl)
                    .addComponent(userIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passlbl)
                    .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(loginBtn)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        getContentPane().add(login, "card5");
        getContentPane().add(login, "login");

        adminPanel.setLayout(new java.awt.CardLayout());

        managestaff.setBackground(new java.awt.Color(249, 247, 242));
        managestaff.setForeground(new java.awt.Color(166, 123, 91));

        navPanelMS.setBackground(new java.awt.Color(60, 42, 33));
        navPanelMS.setPreferredSize(new java.awt.Dimension(200, 360));

        msAdminDashboard.setBackground(new java.awt.Color(89, 63, 48));
        msAdminDashboard.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        msAdminDashboard.setForeground(new java.awt.Color(255, 255, 255));
        msAdminDashboard.setText("Dashboard");
        msAdminDashboard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 87, 55), 2, true));
        msAdminDashboard.setPreferredSize(new java.awt.Dimension(200, 40));
        msAdminDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msAdminDashboardActionPerformed(evt);
            }
        });

        msManageStaff.setBackground(new java.awt.Color(89, 63, 48));
        msManageStaff.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        msManageStaff.setForeground(new java.awt.Color(255, 255, 255));
        msManageStaff.setText("Manage Staff");
        msManageStaff.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 87, 55), 2, true));
        msManageStaff.setPreferredSize(new java.awt.Dimension(200, 40));
        msManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msManageStaffActionPerformed(evt);
            }
        });

        msGeneratePayroll.setBackground(new java.awt.Color(89, 63, 48));
        msGeneratePayroll.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        msGeneratePayroll.setForeground(new java.awt.Color(255, 255, 255));
        msGeneratePayroll.setText("Generate Payroll");
        msGeneratePayroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 87, 55), 2, true));
        msGeneratePayroll.setPreferredSize(new java.awt.Dimension(200, 40));
        msGeneratePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msGeneratePayrollActionPerformed(evt);
            }
        });

        navMS.setBackground(new java.awt.Color(255, 255, 255));
        navMS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navMS.setForeground(new java.awt.Color(255, 255, 255));
        navMS.setText("Navigation Panel");

        adLogout2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout2.setForeground(new java.awt.Color(153, 0, 0));
        adLogout2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout2.setText("LOG-OUT");
        adLogout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adLogout2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navPanelMSLayout = new javax.swing.GroupLayout(navPanelMS);
        navPanelMS.setLayout(navPanelMSLayout);
        navPanelMSLayout.setHorizontalGroup(
            navPanelMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelMSLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(navPanelMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msAdminDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msGeneratePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navMS))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelMSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        navPanelMSLayout.setVerticalGroup(
            navPanelMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelMSLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msAdminDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(msManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(msGeneratePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(adLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employeeTable.setBackground(new java.awt.Color(245, 235, 224));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Position", "Salary", "Status", "Date Hired"
            }
        ));
        employeeTable.setGridColor(new java.awt.Color(230, 230, 230));
        employeeTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane4.setViewportView(employeeTable);

        jLabelEmployeesDirectory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEmployeesDirectory.setForeground(new java.awt.Color(43, 30, 22));
        jLabelEmployeesDirectory.setText("Employee Directory");

        msHeader.setBackground(new java.awt.Color(255, 255, 255));
        msHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 42, 33), 4, true));
        msHeader.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabelMSHeader.setBackground(new java.awt.Color(0, 51, 255));
        jLabelMSHeader.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabelMSHeader.setForeground(new java.awt.Color(137, 87, 55));
        jLabelMSHeader.setText("ADMIN DASHBOARD");

        javax.swing.GroupLayout msHeaderLayout = new javax.swing.GroupLayout(msHeader);
        msHeader.setLayout(msHeaderLayout);
        msHeaderLayout.setHorizontalGroup(
            msHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msHeaderLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabelMSHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        msHeaderLayout.setVerticalGroup(
            msHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMSHeader)
                .addContainerGap())
        );

        msClrBtn.setBackground(new java.awt.Color(89, 63, 48));
        msClrBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        msClrBtn.setForeground(new java.awt.Color(255, 255, 255));
        msClrBtn.setText("Clear");
        msClrBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        msClrBtn.setFocusPainted(false);
        msClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msClrBtnActionPerformed(evt);
            }
        });

        jLabelFullName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFullName.setForeground(new java.awt.Color(43, 30, 22));
        jLabelFullName.setText("Full Name");
        jLabelFullName.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabelManageEmployees.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelManageEmployees.setForeground(new java.awt.Color(43, 30, 22));
        jLabelManageEmployees.setText("Manage Employees");

        msSaveBtn.setBackground(new java.awt.Color(89, 63, 48));
        msSaveBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        msSaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        msSaveBtn.setText("Save");
        msSaveBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        msSaveBtn.setFocusPainted(false);
        msSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msSaveBtnActionPerformed(evt);
            }
        });

        positionCB.setBackground(new java.awt.Color(230, 230, 230));
        positionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Barista", "Janitor", "Supervisor" }));
        positionCB.setSelectedIndex(-1);
        positionCB.setPreferredSize(new java.awt.Dimension(250, 30));

        statusCB.setBackground(new java.awt.Color(230, 230, 230));
        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Contractual" }));
        statusCB.setSelectedIndex(-1);
        statusCB.setPreferredSize(new java.awt.Dimension(250, 30));
        statusCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCBActionPerformed(evt);
            }
        });

        salaryTxt.setBackground(new java.awt.Color(230, 230, 230));
        salaryTxt.setPreferredSize(new java.awt.Dimension(250, 30));
        salaryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTxtActionPerformed(evt);
            }
        });

        jLabelPosition.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPosition.setForeground(new java.awt.Color(43, 30, 22));
        jLabelPosition.setText("Position:");
        jLabelPosition.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabelSalary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSalary.setForeground(new java.awt.Color(43, 30, 22));
        jLabelSalary.setText("Salary:");
        jLabelSalary.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabelStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(43, 30, 22));
        jLabelStatus.setText("Status:");
        jLabelStatus.setPreferredSize(new java.awt.Dimension(250, 30));

        fullNameTxt.setBackground(new java.awt.Color(230, 230, 230));
        fullNameTxt.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabelDateHired.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDateHired.setForeground(new java.awt.Color(43, 30, 22));
        jLabelDateHired.setText("Date Hired:");
        jLabelDateHired.setPreferredSize(new java.awt.Dimension(250, 30));

        msUpdateBtn.setBackground(new java.awt.Color(89, 63, 48));
        msUpdateBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        msUpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        msUpdateBtn.setText("Update");
        msUpdateBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        msUpdateBtn.setFocusPainted(false);
        msUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msUpdateBtnActionPerformed(evt);
            }
        });

        msDeleteBtn.setBackground(new java.awt.Color(89, 63, 48));
        msDeleteBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        msDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        msDeleteBtn.setText("Delete");
        msDeleteBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        msDeleteBtn.setFocusPainted(false);
        msDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msDeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout managestaffLayout = new javax.swing.GroupLayout(managestaff);
        managestaff.setLayout(managestaffLayout);
        managestaffLayout.setHorizontalGroup(
            managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(msHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
            .addGroup(managestaffLayout.createSequentialGroup()
                .addComponent(navPanelMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managestaffLayout.createSequentialGroup()
                        .addComponent(jLabelManageEmployees)
                        .addContainerGap(447, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)
                    .addGroup(managestaffLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managestaffLayout.createSequentialGroup()
                                .addComponent(jLabelSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managestaffLayout.createSequentialGroup()
                                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(positionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(managestaffLayout.createSequentialGroup()
                                .addComponent(jLabelDateHired, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateHiredDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(managestaffLayout.createSequentialGroup()
                                .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msUpdateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msSaveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msDeleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msClrBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(managestaffLayout.createSequentialGroup()
                        .addComponent(jLabelEmployeesDirectory)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        managestaffLayout.setVerticalGroup(
            managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managestaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navPanelMS, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addGroup(managestaffLayout.createSequentialGroup()
                        .addComponent(jLabelManageEmployees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managestaffLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managestaffLayout.createSequentialGroup()
                                        .addComponent(jLabelFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(managestaffLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(msUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(msDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(msClrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(managestaffLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(60, 60, 60))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managestaffLayout.createSequentialGroup()
                                        .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(positionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(salaryTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(8, 8, 8)
                                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelDateHired, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateHiredDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabelEmployeesDirectory)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        adminPanel.add(managestaff, "card4");
        getContentPane().add(managestaff, "managestaff");

        generatepayroll.setBackground(new java.awt.Color(255, 204, 204));
        generatepayroll.setForeground(new java.awt.Color(255, 102, 102));

        navPanelGP.setBackground(new java.awt.Color(255, 204, 204));
        navPanelGP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        gpAdminDashBoard.setBackground(new java.awt.Color(89, 63, 48));
        gpAdminDashBoard.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        gpAdminDashBoard.setForeground(new java.awt.Color(255, 255, 255));
        gpAdminDashBoard.setText("Dashboard");
        gpAdminDashBoard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        gpAdminDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpAdminDashBoardActionPerformed(evt);
            }
        });

        gpManageStaff.setBackground(new java.awt.Color(89, 63, 48));
        gpManageStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gpManageStaff.setForeground(new java.awt.Color(255, 255, 255));
        gpManageStaff.setText("Manage Staff");
        gpManageStaff.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        gpManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpManageStaffActionPerformed(evt);
            }
        });

        gpGeneratePayroll.setBackground(new java.awt.Color(89, 63, 48));
        gpGeneratePayroll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gpGeneratePayroll.setForeground(new java.awt.Color(255, 255, 255));
        gpGeneratePayroll.setText("Generate Payroll");
        gpGeneratePayroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        gpGeneratePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpGeneratePayrollActionPerformed(evt);
            }
        });

        navGP.setBackground(new java.awt.Color(255, 102, 102));
        navGP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navGP.setForeground(new java.awt.Color(255, 255, 255));
        navGP.setText("Navigation Panel");

        adLogout1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout1.setForeground(java.awt.Color.red);
        adLogout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout1.setText("LOG-OUT");
        adLogout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adLogout1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navPanelGPLayout = new javax.swing.GroupLayout(navPanelGP);
        navPanelGP.setLayout(navPanelGPLayout);
        navPanelGPLayout.setHorizontalGroup(
            navPanelGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelGPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(navPanelGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gpAdminDashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(gpManageStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(gpGeneratePayroll, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(navGP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelGPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        navPanelGPLayout.setVerticalGroup(
            navPanelGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelGPLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navGP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gpAdminDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gpManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gpGeneratePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(adLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        payrollTable.setBackground(new java.awt.Color(245, 235, 224));
        payrollTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Basic Salary", "OT Pay", "13th Month", "Tax", "Late Deduction", "Netn Salary", "Status"
            }
        ));
        payrollTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane5.setViewportView(payrollTable);
        if (payrollTable.getColumnModel().getColumnCount() > 0) {
            payrollTable.getColumnModel().getColumn(4).setHeaderValue("Tax");
            payrollTable.getColumnModel().getColumn(5).setHeaderValue("Late Deduction");
            payrollTable.getColumnModel().getColumn(6).setHeaderValue("Netn Salary");
            payrollTable.getColumnModel().getColumn(7).setHeaderValue("Status");
        }

        jLabelPayrollDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPayrollDetails.setForeground(new java.awt.Color(43, 30, 22));
        jLabelPayrollDetails.setText("Payroll Details");

        gpHeader.setBackground(new java.awt.Color(255, 204, 204));
        gpHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        jLabelGPHeader.setBackground(new java.awt.Color(0, 51, 255));
        jLabelGPHeader.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelGPHeader.setForeground(new java.awt.Color(255, 102, 102));
        jLabelGPHeader.setText("ADMIN DASHBOARD");

        javax.swing.GroupLayout gpHeaderLayout = new javax.swing.GroupLayout(gpHeader);
        gpHeader.setLayout(gpHeaderLayout);
        gpHeaderLayout.setHorizontalGroup(
            gpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpHeaderLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabelGPHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gpHeaderLayout.setVerticalGroup(
            gpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGPHeader)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        finalizePayroll.setBackground(new java.awt.Color(89, 63, 48));
        finalizePayroll.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        finalizePayroll.setForeground(new java.awt.Color(255, 255, 255));
        finalizePayroll.setText("Finalize Payroll");
        finalizePayroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        finalizePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizePayrollActionPerformed(evt);
            }
        });

        jLabelSelectDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSelectDate.setForeground(new java.awt.Color(43, 30, 22));
        jLabelSelectDate.setText("Select Pay Period");

        jLabelGeneratePayroll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelGeneratePayroll.setForeground(new java.awt.Color(43, 30, 22));
        jLabelGeneratePayroll.setText("GENERATE PAYROLL");

        generatePayroll.setBackground(new java.awt.Color(89, 63, 48));
        generatePayroll.setForeground(new java.awt.Color(255, 255, 255));
        generatePayroll.setText("Generate Payroll");
        generatePayroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        generatePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePayrollActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout generatepayrollLayout = new javax.swing.GroupLayout(generatepayroll);
        generatepayroll.setLayout(generatepayrollLayout);
        generatepayrollLayout.setHorizontalGroup(
            generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gpHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(generatepayrollLayout.createSequentialGroup()
                .addComponent(navPanelGP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generatepayrollLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPayrollDetails)))
                    .addGroup(generatepayrollLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(generatepayrollLayout.createSequentialGroup()
                                .addComponent(generatePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(finalizePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelSelectDate)
                            .addComponent(jLabelGeneratePayroll))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        generatepayrollLayout.setVerticalGroup(
            generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generatepayrollLayout.createSequentialGroup()
                .addComponent(gpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navPanelGP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(generatepayrollLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelGeneratePayroll)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSelectDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generatePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalizePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabelPayrollDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );

        adminPanel.add(generatepayroll, "card3");
        getContentPane().add(generatepayroll, "generatepayroll");

        adminDashboard.setBackground(new java.awt.Color(255, 204, 204));

        dhNavPanel.setBackground(new java.awt.Color(255, 204, 204));
        dhNavPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        dasboardBtn.setBackground(new java.awt.Color(89, 63, 48));
        dasboardBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dasboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        dasboardBtn.setText("Admin");
        dasboardBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        dasboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dasboardBtnActionPerformed(evt);
            }
        });

        mngStaffBtn.setBackground(new java.awt.Color(89, 63, 48));
        mngStaffBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mngStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        mngStaffBtn.setText("Manage Staff");
        mngStaffBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        mngStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngStaffBtnjButton12ActionPerformed(evt);
            }
        });

        payrollBtn.setBackground(new java.awt.Color(89, 63, 48));
        payrollBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        payrollBtn.setForeground(new java.awt.Color(255, 255, 255));
        payrollBtn.setText("Genearate Payroll");
        payrollBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        payrollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollBtnjButton13ActionPerformed(evt);
            }
        });

        navLbl.setBackground(new java.awt.Color(255, 102, 102));
        navLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navLbl.setForeground(new java.awt.Color(255, 102, 102));
        navLbl.setText("Navigation Panel");

        adLogout.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout.setForeground(java.awt.Color.red);
        adLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout.setText("LOG-OUT");
        adLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dhNavPanelLayout = new javax.swing.GroupLayout(dhNavPanel);
        dhNavPanel.setLayout(dhNavPanelLayout);
        dhNavPanelLayout.setHorizontalGroup(
            dhNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dhNavPanelLayout.createSequentialGroup()
                .addGroup(dhNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dhNavPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(dhNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(payrollBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mngStaffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dasboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(navLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(dhNavPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(adLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        dhNavPanelLayout.setVerticalGroup(
            dhNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dhNavPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dasboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mngStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payrollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(adLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminTable.setBackground(new java.awt.Color(245, 235, 224));
        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "Full Name", "Position", "Basic Salary", "Status", "Date Hired"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane3.setViewportView(adminTable);
        if (adminTable.getColumnModel().getColumnCount() > 0) {
            adminTable.getColumnModel().getColumn(0).setResizable(false);
            adminTable.getColumnModel().getColumn(1).setResizable(false);
            adminTable.getColumnModel().getColumn(2).setResizable(false);
            adminTable.getColumnModel().getColumn(3).setResizable(false);
            adminTable.getColumnModel().getColumn(4).setResizable(false);
            adminTable.getColumnModel().getColumn(5).setResizable(false);
        }

        titlePanel.setBackground(new java.awt.Color(255, 204, 204));
        titlePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        titleLbl.setBackground(new java.awt.Color(0, 51, 255));
        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 102, 102));
        titleLbl.setText("ADMIN DASHBOARD");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        overviewLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        overviewLbl.setForeground(new java.awt.Color(255, 102, 102));
        overviewLbl.setText("DASHBOARD OVERVIEW");

        javax.swing.GroupLayout adminDashboardLayout = new javax.swing.GroupLayout(adminDashboard);
        adminDashboard.setLayout(adminDashboardLayout);
        adminDashboardLayout.setHorizontalGroup(
            adminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(adminDashboardLayout.createSequentialGroup()
                .addComponent(dhNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminDashboardLayout.createSequentialGroup()
                        .addComponent(overviewLbl)
                        .addContainerGap())
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)))
        );
        adminDashboardLayout.setVerticalGroup(
            adminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminDashboardLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminDashboardLayout.createSequentialGroup()
                        .addComponent(overviewLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addComponent(dhNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        adminPanel.add(adminDashboard, "card2");
        getContentPane().add(adminDashboard, "adminDashboard");

        getContentPane().add(adminPanel, "card6");
        getContentPane().add(adminPanel, "adminPanel");

        managerPanel.setLayout(new java.awt.CardLayout());

        managerDashboard1.setBackground(new java.awt.Color(249, 247, 242));

        mdNavPanel.setBackground(new java.awt.Color(60, 42, 33));
        mdNavPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mdNavPanel.setPreferredSize(new java.awt.Dimension(210, 360));

        mdDashboardBtn.setBackground(new java.awt.Color(89, 63, 48));
        mdDashboardBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mdDashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        mdDashboardBtn.setText("Dashboard");
        mdDashboardBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 87, 55), 2, true));
        mdDashboardBtn.setPreferredSize(new java.awt.Dimension(210, 40));
        mdDashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdDashboardBtnActionPerformed(evt);
            }
        });

        mdAttendanceBtn.setBackground(new java.awt.Color(89, 63, 48));
        mdAttendanceBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mdAttendanceBtn.setForeground(new java.awt.Color(255, 255, 255));
        mdAttendanceBtn.setText("Attendance Log");
        mdAttendanceBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 87, 55), 2, true));
        mdAttendanceBtn.setPreferredSize(new java.awt.Dimension(210, 40));
        mdAttendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdAttendanceBtnjButton12ActionPerformed(evt);
            }
        });

        mdOTRequestBtn.setBackground(new java.awt.Color(89, 63, 48));
        mdOTRequestBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mdOTRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        mdOTRequestBtn.setText("Overtime Request");
        mdOTRequestBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 87, 55), 2, true));
        mdOTRequestBtn.setPreferredSize(new java.awt.Dimension(210, 40));
        mdOTRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdOTRequestBtnjButton13ActionPerformed(evt);
            }
        });

        navLbl1.setBackground(new java.awt.Color(255, 255, 255));
        navLbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navLbl1.setForeground(new java.awt.Color(255, 255, 255));
        navLbl1.setText("Navigation Panel");

        adLogout3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout3.setForeground(java.awt.Color.red);
        adLogout3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout3.setText("LOG-OUT");
        adLogout3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adLogout3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mdNavPanelLayout = new javax.swing.GroupLayout(mdNavPanel);
        mdNavPanel.setLayout(mdNavPanelLayout);
        mdNavPanelLayout.setHorizontalGroup(
            mdNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mdNavPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mdNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mdNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mdOTRequestBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addComponent(mdAttendanceBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(mdDashboardBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mdNavPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adLogout3)
                .addGap(82, 82, 82))
        );
        mdNavPanelLayout.setVerticalGroup(
            mdNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mdNavPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mdDashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mdAttendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mdOTRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(adLogout3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mdDashboardTable.setBackground(new java.awt.Color(245, 235, 224));
        mdDashboardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "First Name", "Last Name", "Program", "Year"
            }
        ));
        mdDashboardTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane6.setViewportView(mdDashboardTable);
        if (mdDashboardTable.getColumnModel().getColumnCount() > 0) {
            mdDashboardTable.getColumnModel().getColumn(4).setHeaderValue("Status");
        }

        titlePanel1.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 42, 33), 4, true));

        titleLbl1.setBackground(new java.awt.Color(0, 51, 255));
        titleLbl1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        titleLbl1.setForeground(new java.awt.Color(137, 87, 55));
        titleLbl1.setText("MANAGER DASHBOARD");

        javax.swing.GroupLayout titlePanel1Layout = new javax.swing.GroupLayout(titlePanel1);
        titlePanel1.setLayout(titlePanel1Layout);
        titlePanel1Layout.setHorizontalGroup(
            titlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(titleLbl1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanel1Layout.setVerticalGroup(
            titlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(titleLbl1)
                .addContainerGap())
        );

        jlabelMDOverview.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabelMDOverview.setForeground(new java.awt.Color(43, 30, 22));
        jlabelMDOverview.setText("DASHBOARD OVERVIEW");

        javax.swing.GroupLayout managerDashboard1Layout = new javax.swing.GroupLayout(managerDashboard1);
        managerDashboard1.setLayout(managerDashboard1Layout);
        managerDashboard1Layout.setHorizontalGroup(
            managerDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(managerDashboard1Layout.createSequentialGroup()
                .addComponent(mdNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(managerDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerDashboard1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jlabelMDOverview)
                        .addContainerGap())
                    .addGroup(managerDashboard1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))))
        );
        managerDashboard1Layout.setVerticalGroup(
            managerDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerDashboard1Layout.createSequentialGroup()
                .addComponent(titlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(managerDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerDashboard1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jlabelMDOverview)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(managerDashboard1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mdNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))))
        );

        managerPanel.add(managerDashboard1, "card2");
        getContentPane().add(managerDashboard1, "managerdashboard");

        otrequest.setBackground(new java.awt.Color(255, 204, 204));
        otrequest.setForeground(new java.awt.Color(255, 102, 102));

        orNavPanel.setBackground(new java.awt.Color(60, 42, 33));
        orNavPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        orDashboardBtn.setBackground(new java.awt.Color(89, 63, 48));
        orDashboardBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        orDashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        orDashboardBtn.setText("Dashboard");
        orDashboardBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        orDashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orDashboardBtnActionPerformed(evt);
            }
        });

        orAttendanceBtn.setBackground(new java.awt.Color(89, 63, 48));
        orAttendanceBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orAttendanceBtn.setForeground(new java.awt.Color(255, 255, 255));
        orAttendanceBtn.setText("Attendance Log");
        orAttendanceBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        orAttendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orAttendanceBtnActionPerformed(evt);
            }
        });

        orOTRequestBtn.setBackground(new java.awt.Color(89, 63, 48));
        orOTRequestBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orOTRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        orOTRequestBtn.setText("Overtime Request");
        orOTRequestBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        orOTRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orOTRequestBtnActionPerformed(evt);
            }
        });

        navGP1.setBackground(new java.awt.Color(255, 102, 102));
        navGP1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navGP1.setForeground(new java.awt.Color(255, 102, 102));
        navGP1.setText("Navigation Panel");

        adLogout4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout4.setForeground(java.awt.Color.red);
        adLogout4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout4.setText("LOG-OUT");
        adLogout4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adLogout4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout orNavPanelLayout = new javax.swing.GroupLayout(orNavPanel);
        orNavPanel.setLayout(orNavPanelLayout);
        orNavPanelLayout.setHorizontalGroup(
            orNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orNavPanelLayout.createSequentialGroup()
                .addGroup(orNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orNavPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(orNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orDashboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(orAttendanceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(orOTRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(navGP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(orNavPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(adLogout4)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        orNavPanelLayout.setVerticalGroup(
            orNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orNavPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navGP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orDashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(orAttendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orOTRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(adLogout4)
                .addGap(61, 61, 61))
        );

        attendanceLogTable.setBackground(new java.awt.Color(245, 235, 224));
        attendanceLogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Date", "OT Hours", "Actions"
            }
        ));
        attendanceLogTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane7.setViewportView(attendanceLogTable);

        gpHeader1.setBackground(new java.awt.Color(255, 204, 204));
        gpHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        jLabelGPHeader1.setBackground(new java.awt.Color(0, 51, 255));
        jLabelGPHeader1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelGPHeader1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelGPHeader1.setText("MANAGER DASHBOARD");

        javax.swing.GroupLayout gpHeader1Layout = new javax.swing.GroupLayout(gpHeader1);
        gpHeader1.setLayout(gpHeader1Layout);
        gpHeader1Layout.setHorizontalGroup(
            gpHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpHeader1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabelGPHeader1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gpHeader1Layout.setVerticalGroup(
            gpHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpHeader1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGPHeader1)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jLabelGeneratePayroll1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelGeneratePayroll1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelGeneratePayroll1.setText("OVERTIME APPROVAL");

        orApproveBtn.setBackground(new java.awt.Color(89, 63, 48));
        orApproveBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        orApproveBtn.setForeground(new java.awt.Color(255, 255, 255));
        orApproveBtn.setText("Approve");
        orApproveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        orApproveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orApproveBtnActionPerformed(evt);
            }
        });

        orDeclineBtn.setBackground(new java.awt.Color(89, 63, 48));
        orDeclineBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        orDeclineBtn.setForeground(new java.awt.Color(255, 255, 255));
        orDeclineBtn.setText("Decline");
        orDeclineBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        orDeclineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orDeclineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout otrequestLayout = new javax.swing.GroupLayout(otrequest);
        otrequest.setLayout(otrequestLayout);
        otrequestLayout.setHorizontalGroup(
            otrequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gpHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(otrequestLayout.createSequentialGroup()
                .addComponent(orNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(otrequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(otrequestLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelGeneratePayroll1))
                    .addGroup(otrequestLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(otrequestLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(orApproveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orDeclineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        otrequestLayout.setVerticalGroup(
            otrequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otrequestLayout.createSequentialGroup()
                .addComponent(gpHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otrequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(otrequestLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelGeneratePayroll1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(otrequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orApproveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orDeclineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        managerPanel.add(otrequest, "card3");
        getContentPane().add(otrequest, "otrequest");

        attendancelog.setBackground(new java.awt.Color(255, 204, 204));
        attendancelog.setForeground(new java.awt.Color(255, 102, 102));

        alNavPanel.setBackground(new java.awt.Color(60, 42, 33));
        alNavPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        atDashboardBtn.setBackground(new java.awt.Color(89, 63, 48));
        atDashboardBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        atDashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        atDashboardBtn.setText("Dashboard");
        atDashboardBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        atDashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atDashboardBtnActionPerformed(evt);
            }
        });

        atAttendanceBtn.setBackground(new java.awt.Color(89, 63, 48));
        atAttendanceBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        atAttendanceBtn.setForeground(new java.awt.Color(255, 255, 255));
        atAttendanceBtn.setText("Attendance Log");
        atAttendanceBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        atAttendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atAttendanceBtnActionPerformed(evt);
            }
        });

        atOTRequestBtn.setBackground(new java.awt.Color(89, 63, 48));
        atOTRequestBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        atOTRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        atOTRequestBtn.setText("Overtime Request");
        atOTRequestBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        atOTRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atOTRequestBtnActionPerformed(evt);
            }
        });

        navMS1.setBackground(new java.awt.Color(255, 102, 102));
        navMS1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navMS1.setForeground(new java.awt.Color(255, 255, 255));
        navMS1.setText("Navigation Panel");

        adLogout5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout5.setForeground(java.awt.Color.red);
        adLogout5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout5.setText("LOG-OUT");
        adLogout5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adLogout5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adLogout5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout alNavPanelLayout = new javax.swing.GroupLayout(alNavPanel);
        alNavPanel.setLayout(alNavPanelLayout);
        alNavPanelLayout.setHorizontalGroup(
            alNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alNavPanelLayout.createSequentialGroup()
                .addGroup(alNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alNavPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(alNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atDashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atAttendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atOTRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(navMS1)))
                    .addGroup(alNavPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(adLogout5)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        alNavPanelLayout.setVerticalGroup(
            alNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alNavPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navMS1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atDashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atAttendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atOTRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(adLogout5)
                .addGap(52, 52, 52))
        );

        atEmployeeTable.setBackground(new java.awt.Color(245, 235, 224));
        atEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Employee", "Time In", "Time Out", "Late", "Overtime", "Status"
            }
        ));
        atEmployeeTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane8.setViewportView(atEmployeeTable);

        jLabelEmployeesDirectory1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEmployeesDirectory1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelEmployeesDirectory1.setText("Employee Attendance Record");

        msHeader1.setBackground(new java.awt.Color(255, 204, 204));
        msHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        jLabelMSHeader1.setBackground(new java.awt.Color(0, 51, 255));
        jLabelMSHeader1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMSHeader1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelMSHeader1.setText("MANAGER DASHBOARD");

        javax.swing.GroupLayout msHeader1Layout = new javax.swing.GroupLayout(msHeader1);
        msHeader1.setLayout(msHeader1Layout);
        msHeader1Layout.setHorizontalGroup(
            msHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msHeader1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabelMSHeader1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        msHeader1Layout.setVerticalGroup(
            msHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msHeader1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabelMSHeader1)
                .addContainerGap())
        );

        atClrBtn.setBackground(new java.awt.Color(89, 63, 48));
        atClrBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        atClrBtn.setForeground(new java.awt.Color(255, 255, 255));
        atClrBtn.setText("Clear");
        atClrBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        atClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atClrBtnActionPerformed(evt);
            }
        });

        jlabelatName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlabelatName.setForeground(new java.awt.Color(255, 102, 102));
        jlabelatName.setText("Employee");

        jLabelManageEmployees1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelManageEmployees1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelManageEmployees1.setText("Add/Update Daily Attendace ");

        atSaveBtn.setBackground(new java.awt.Color(89, 63, 48));
        atSaveBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        atSaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        atSaveBtn.setText("Save");
        atSaveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        atSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atSaveBtnActionPerformed(evt);
            }
        });

        otStatusCB.setBackground(new java.awt.Color(255, 204, 204));
        otStatusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Declined" }));
        otStatusCB.setSelectedIndex(-1);
        otStatusCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otStatusCBActionPerformed(evt);
            }
        });

        employeeCB.setBackground(new java.awt.Color(255, 204, 204));
        employeeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeCBActionPerformed(evt);
            }
        });

        jLabelPosition1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelPosition1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelPosition1.setText("Work Date:");

        jLabelSalary1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelSalary1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelSalary1.setText("Time In:");

        jLabelStatus1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelStatus1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelStatus1.setText("Time Out:");

        jLabelDateHired1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelDateHired1.setForeground(new java.awt.Color(255, 102, 102));
        jLabelDateHired1.setText("OT Status:");

        timeINTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeINTxtActionPerformed(evt);
            }
        });

        timeOutTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeOutTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout attendancelogLayout = new javax.swing.GroupLayout(attendancelog);
        attendancelog.setLayout(attendancelogLayout);
        attendancelogLayout.setHorizontalGroup(
            attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(msHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(attendancelogLayout.createSequentialGroup()
                .addComponent(alNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addGroup(attendancelogLayout.createSequentialGroup()
                        .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmployeesDirectory1)
                            .addGroup(attendancelogLayout.createSequentialGroup()
                                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(attendancelogLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPosition1)
                                            .addComponent(jlabelatName)
                                            .addComponent(jLabelSalary1)
                                            .addComponent(jLabelStatus1)
                                            .addComponent(jLabelDateHired1))
                                        .addGap(22, 22, 22)
                                        .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(otStatusCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 231, Short.MAX_VALUE)
                                            .addComponent(employeeCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 231, Short.MAX_VALUE)
                                            .addComponent(timeINTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(timeOutTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(jLabelManageEmployees1))
                                .addGap(47, 47, 47)
                                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(atClrBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(atSaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        attendancelogLayout.setVerticalGroup(
            attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendancelogLayout.createSequentialGroup()
                .addComponent(msHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(attendancelogLayout.createSequentialGroup()
                        .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(attendancelogLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelManageEmployees1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlabelatName)
                                    .addComponent(employeeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jLabelPosition1)
                                .addGap(12, 12, 12)
                                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(attendancelogLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabelSalary1))
                                    .addComponent(timeINTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(attendancelogLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabelStatus1))
                                    .addGroup(attendancelogLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(timeOutTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(attendancelogLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(atSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(atClrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDateHired1)
                            .addComponent(otStatusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEmployeesDirectory1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        managerPanel.add(attendancelog, "card4");
        getContentPane().add(attendancelog, "attendancelog");

        getContentPane().add(managerPanel, "card4");
        getContentPane().add(managerPanel, "managerPanel");

        employeePanel.setLayout(new java.awt.CardLayout());

        viewpayslip.setBackground(new java.awt.Color(249, 247, 242));

        dhNavPanel2.setBackground(new java.awt.Color(60, 42, 33));
        dhNavPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        dhNavPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dhNavPanel2KeyPressed(evt);
            }
        });

        vpViewPayslipBtn.setBackground(new java.awt.Color(89, 63, 48));
        vpViewPayslipBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        vpViewPayslipBtn.setForeground(new java.awt.Color(255, 255, 255));
        vpViewPayslipBtn.setText("View Payslip");
        vpViewPayslipBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 87, 55), 2, true));
        vpViewPayslipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpViewPayslipBtnActionPerformed(evt);
            }
        });

        vpRequestOTBtn.setBackground(new java.awt.Color(89, 63, 48));
        vpRequestOTBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        vpRequestOTBtn.setForeground(new java.awt.Color(255, 255, 255));
        vpRequestOTBtn.setText("Request Overtime");
        vpRequestOTBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 87, 55), 2, true));
        vpRequestOTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpRequestOTBtnjButton12ActionPerformed(evt);
            }
        });

        navLbl2.setBackground(new java.awt.Color(255, 255, 255));
        navLbl2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navLbl2.setForeground(new java.awt.Color(255, 255, 255));
        navLbl2.setText("Navigation Panel");

        adLogout6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout6.setForeground(java.awt.Color.red);
        adLogout6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout6.setText("LOG-OUT");
        adLogout6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adLogout6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dhNavPanel2Layout = new javax.swing.GroupLayout(dhNavPanel2);
        dhNavPanel2.setLayout(dhNavPanel2Layout);
        dhNavPanel2Layout.setHorizontalGroup(
            dhNavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dhNavPanel2Layout.createSequentialGroup()
                .addGroup(dhNavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dhNavPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(dhNavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vpRequestOTBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vpViewPayslipBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(navLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(dhNavPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(adLogout6)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        dhNavPanel2Layout.setVerticalGroup(
            dhNavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dhNavPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navLbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vpViewPayslipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vpRequestOTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(adLogout6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        payslipTable.setBackground(new java.awt.Color(245, 235, 224));
        payslipTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pay Period", "Basic", "OT Pay", "13th Month", "Total Earnings", "Tax", "Late Deduction", "Net Salary", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        payslipTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane9.setViewportView(payslipTable);
        if (payslipTable.getColumnModel().getColumnCount() > 0) {
            payslipTable.getColumnModel().getColumn(0).setResizable(false);
            payslipTable.getColumnModel().getColumn(1).setResizable(false);
            payslipTable.getColumnModel().getColumn(2).setResizable(false);
            payslipTable.getColumnModel().getColumn(3).setResizable(false);
            payslipTable.getColumnModel().getColumn(4).setResizable(false);
            payslipTable.getColumnModel().getColumn(5).setResizable(false);
            payslipTable.getColumnModel().getColumn(6).setResizable(false);
            payslipTable.getColumnModel().getColumn(7).setResizable(false);
            payslipTable.getColumnModel().getColumn(8).setResizable(false);
        }

        titlePanel2.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        titlePanel2.setForeground(new java.awt.Color(51, 51, 51));

        titleLbl2.setBackground(new java.awt.Color(0, 51, 255));
        titleLbl2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLbl2.setForeground(new java.awt.Color(137, 87, 55));
        titleLbl2.setText("EMPLOYEE DASHBOARD");

        javax.swing.GroupLayout titlePanel2Layout = new javax.swing.GroupLayout(titlePanel2);
        titlePanel2.setLayout(titlePanel2Layout);
        titlePanel2Layout.setHorizontalGroup(
            titlePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel2Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(titleLbl2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanel2Layout.setVerticalGroup(
            titlePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl2)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        overviewLbl2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        overviewLbl2.setForeground(new java.awt.Color(43, 30, 22));
        overviewLbl2.setText("PAYSLIP OVERVIEW");

        javax.swing.GroupLayout viewpayslipLayout = new javax.swing.GroupLayout(viewpayslip);
        viewpayslip.setLayout(viewpayslipLayout);
        viewpayslipLayout.setHorizontalGroup(
            viewpayslipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewpayslipLayout.createSequentialGroup()
                .addComponent(dhNavPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewpayslipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewpayslipLayout.createSequentialGroup()
                        .addComponent(overviewLbl2)
                        .addContainerGap())
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)))
        );
        viewpayslipLayout.setVerticalGroup(
            viewpayslipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpayslipLayout.createSequentialGroup()
                .addComponent(titlePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewpayslipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewpayslipLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(overviewLbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addComponent(dhNavPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        employeePanel.add(viewpayslip, "card2");
        getContentPane().add(viewpayslip, "viewpayslip");

        requestOt.setBackground(new java.awt.Color(255, 204, 204));
        requestOt.setForeground(new java.awt.Color(255, 102, 102));

        navPanelGP2.setBackground(new java.awt.Color(60, 42, 33));
        navPanelGP2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        roPayslipBtn.setBackground(new java.awt.Color(89, 63, 48));
        roPayslipBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        roPayslipBtn.setForeground(new java.awt.Color(255, 255, 255));
        roPayslipBtn.setText("View Payslip");
        roPayslipBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        roPayslipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roPayslipBtnActionPerformed(evt);
            }
        });

        roRequestOvertimeBtn.setBackground(new java.awt.Color(89, 63, 48));
        roRequestOvertimeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        roRequestOvertimeBtn.setForeground(new java.awt.Color(255, 255, 255));
        roRequestOvertimeBtn.setText("Request Overtime");
        roRequestOvertimeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        roRequestOvertimeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roRequestOvertimeBtnActionPerformed(evt);
            }
        });

        navGP2.setBackground(new java.awt.Color(255, 102, 102));
        navGP2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navGP2.setForeground(new java.awt.Color(255, 255, 255));
        navGP2.setText("Navigation Panel");

        adLogout7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout7.setForeground(java.awt.Color.red);
        adLogout7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout7.setText("LOG-OUT");
        adLogout7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adLogout7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adLogout7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navPanelGP2Layout = new javax.swing.GroupLayout(navPanelGP2);
        navPanelGP2.setLayout(navPanelGP2Layout);
        navPanelGP2Layout.setHorizontalGroup(
            navPanelGP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelGP2Layout.createSequentialGroup()
                .addGroup(navPanelGP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navPanelGP2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(navPanelGP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roPayslipBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(roRequestOvertimeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(navGP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(navPanelGP2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(adLogout7)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        navPanelGP2Layout.setVerticalGroup(
            navPanelGP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelGP2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navGP2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roPayslipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roRequestOvertimeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(adLogout7)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        gpHeader2.setBackground(new java.awt.Color(255, 204, 204));
        gpHeader2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        jLabelGPHeader2.setBackground(new java.awt.Color(0, 51, 255));
        jLabelGPHeader2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelGPHeader2.setForeground(new java.awt.Color(255, 102, 102));
        jLabelGPHeader2.setText("EMPLOYEE DASHBOARD");

        javax.swing.GroupLayout gpHeader2Layout = new javax.swing.GroupLayout(gpHeader2);
        gpHeader2.setLayout(gpHeader2Layout);
        gpHeader2Layout.setHorizontalGroup(
            gpHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpHeader2Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabelGPHeader2)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        gpHeader2Layout.setVerticalGroup(
            gpHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpHeader2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGPHeader2)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabelGeneratePayroll2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelGeneratePayroll2.setForeground(new java.awt.Color(255, 102, 102));
        jLabelGeneratePayroll2.setText("REQUEST OVERTIME ");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Choose Date:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("OT Hours");

        reqBtn.setBackground(new java.awt.Color(89, 63, 48));
        reqBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reqBtn.setForeground(new java.awt.Color(255, 255, 255));
        reqBtn.setText("Request");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });

        reqOTDC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        reqOTDC.setDate(new java.util.Date(1776066454000L));

        javax.swing.GroupLayout requestOtLayout = new javax.swing.GroupLayout(requestOt);
        requestOt.setLayout(requestOtLayout);
        requestOtLayout.setHorizontalGroup(
            requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gpHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(requestOtLayout.createSequentialGroup()
                .addComponent(navPanelGP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelGeneratePayroll2)
                    .addGroup(requestOtLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(requestOtLayout.createSequentialGroup()
                                .addComponent(otHrsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(reqOTDC, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        requestOtLayout.setVerticalGroup(
            requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestOtLayout.createSequentialGroup()
                .addComponent(gpHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(requestOtLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(navPanelGP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(requestOtLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelGeneratePayroll2)
                        .addGap(20, 20, 20)
                        .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(reqOTDC, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(otHrsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        employeePanel.add(requestOt, "card3");
        getContentPane().add(requestOt, "requestOt");

        getContentPane().add(employeePanel, "card5");
        getContentPane().add(employeePanel, "employeePanel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void msSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msSaveBtnActionPerformed
    String fullName = fullNameTxt.getText().trim();
    String position = positionCB.getSelectedItem() != null ? positionCB.getSelectedItem().toString() : "";
    String salary = salaryTxt.getText().trim();
    String status = statusCB.getSelectedItem() != null ? statusCB.getSelectedItem().toString() : "";
    java.util.Date dateHired = dateHiredDC.getDate();

    if (fullName.isEmpty() || position.isEmpty() || salary.isEmpty() || status.isEmpty() || dateHired == null) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;password=12345;" +
                "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(url);

        String formattedDate = new java.text.SimpleDateFormat("yyyy-MM-dd").format(dateHired);

        
        //INSERT INTO Employee TABLE
        String sql = "INSERT INTO Employee (full_name, position, basic_salary, employment_status, date_hired) " +
                     "OUTPUT INSERTED.employee_id " +
                     "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, fullName);
        pst.setString(2, position);
        pst.setDouble(3, Double.parseDouble(salary));
        pst.setString(4, status);
        pst.setString(5, formattedDate);

        ResultSet generatedKeys = pst.executeQuery();
        
        if (!generatedKeys.next()) {
            JOptionPane.showMessageDialog(this, "Failed to get new employee ID.");
            con.close();
            return;
        }
        
        int newEmployeeId = generatedKeys.getInt(1);

        // AUTO-GENERATE USERNAME & PASSWORD
        String[] nameParts = fullName.toLowerCase().split(" ");
        String username;
        if (nameParts.length >= 2) {
            username = nameParts[0].substring(0, 1) + nameParts[nameParts.length - 1];
        } else {
            username = nameParts[0];
        }

        // Default password = 123456
        String defaultPassword = "123456";
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(defaultPassword.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        String hashedPassword = sb.toString();

        // Determine role based on position
        String role;
        switch (position) {
            case "Manager":
                role = "Manager";
                break;
            default:
                role = "Employee";
                break;
        }

        //  INSERT INTO users TABLE
        String userSql = "INSERT INTO users (employee_id, username, password_hash, role, is_active, created_at) " +
                         "VALUES (?, ?, ?, ?, 1, GETDATE())";
        PreparedStatement userPst = con.prepareStatement(userSql);
        userPst.setInt(1, newEmployeeId);
        userPst.setString(2, username);
        userPst.setString(3, hashedPassword);
        userPst.setString(4, role);
        userPst.executeUpdate();

        JOptionPane.showMessageDialog(this,
            "Employee saved successfully!\n" +
            "─────────────────────────────\n" +
            "Username : " + username + "\n" +
            "Password : 123456\n" +
            "Role     : " + role + "\n\n");

        con.close();
        msClrBtnActionPerformed(null);
        loadEmployeeTable();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid salary. Please enter a valid number.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }



    }//GEN-LAST:event_msSaveBtnActionPerformed

    private void msClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msClrBtnActionPerformed
        fullNameTxt.setText("");
        positionCB.setSelectedIndex(-1);
        salaryTxt.setText("");
        statusCB.setSelectedIndex(-1);
        dateHiredDC.setDate(null);
        selectedEmployeeId = -1;

    }//GEN-LAST:event_msClrBtnActionPerformed

    private void msGeneratePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msGeneratePayrollActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "generatepayroll");
    }//GEN-LAST:event_msGeneratePayrollActionPerformed

    private void msManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msManageStaffActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "managestaff");
        loadEmployeeTable();

    }//GEN-LAST:event_msManageStaffActionPerformed

    private void msAdminDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msAdminDashboardActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "adminDashboard");
    }//GEN-LAST:event_msAdminDashboardActionPerformed

    private void generatePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePayrollActionPerformed
        java.util.Date selectedDate = adDateChooser.getDate();
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Please select a pay period.");
            return;
        }

    String payPeriod = new java.text.SimpleDateFormat("yyyy-MM").format(selectedDate);
    String[] parts = payPeriod.split("-");
    int payYear  = Integer.parseInt(parts[0]);
    int payMonth = Integer.parseInt(parts[1]);

    int confirm = JOptionPane.showConfirmDialog(this,
        "Generate DRAFT payroll for " + payPeriod + "?\n" +
        "Existing drafts will be recalculated.",
        "Confirm Generate", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) return;

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;password=12345;" +
                "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(url);

        // Get all employees
        String empQuery = "SELECT employee_id, basic_salary FROM Employee";
        PreparedStatement empPs = con.prepareStatement(empQuery);
        ResultSet empRs = empPs.executeQuery();

        int generatedCount = 0;
        int skippedFinalized = 0;

        while (empRs.next()) {
            int empId = empRs.getInt("employee_id");
            double basicSalary = empRs.getDouble("basic_salary");

            // CHECK IF ALREADY FINALIZED - skip if yes
            String checkFinalSql = "SELECT COUNT(*) FROM payroll " +
                                   "WHERE employee_id=? AND pay_period=? AND status='Finalized'";
            PreparedStatement checkFinalPs = con.prepareStatement(checkFinalSql);
            checkFinalPs.setInt(1, empId);
            checkFinalPs.setString(2, payPeriod);
            ResultSet checkFinalRs = checkFinalPs.executeQuery();
            checkFinalRs.next();
            if (checkFinalRs.getInt(1) > 0) {
                skippedFinalized++;
                continue; // Don't overwrite finalized payroll
            }

            // GET ATTENDANCE DATA
            String attQuery = "SELECT " +
                "ISNULL(SUM(CASE WHEN overtime_status = 'Approved' THEN overtime_hours ELSE 0 END), 0) AS total_ot_hours, " +
                "ISNULL(SUM(late_minutes), 0) AS total_late_minutes " +
                "FROM Attendance " +
                "WHERE employee_id = ? " +
                "AND YEAR(work_date) = ? " +
                "AND MONTH(work_date) = ?";

            PreparedStatement attPs = con.prepareStatement(attQuery);
            attPs.setInt(1, empId);
            attPs.setInt(2, payYear);
            attPs.setInt(3, payMonth);
            ResultSet attRs = attPs.executeQuery();

            double totalOTHours = 0;
            double totalLateMinutes = 0;
            if (attRs.next()) {
                totalOTHours = attRs.getDouble("total_ot_hours");
                totalLateMinutes = attRs.getDouble("total_late_minutes");
            }

            // PAYROLL COMPUTATION
            double dailyRate       = basicSalary / 26;
            double hourlyRate      = dailyRate / 8;
            double otPay           = totalOTHours * hourlyRate * 1.25;
            double lateDeduction   = (totalLateMinutes / 60) * hourlyRate;
            double thirteenthMonth = basicSalary / 12;
            double taxDeduction    = basicSalary * 0.12;
            double netSalary       = basicSalary + otPay + thirteenthMonth - taxDeduction - lateDeduction;

            // CHECK IF DRAFT EXISTS - UPDATE or INSERT
            String checkDraftSql = "SELECT COUNT(*) FROM payroll " +
                                   "WHERE employee_id=? AND pay_period=? AND status='Draft'";
            PreparedStatement checkDraftPs = con.prepareStatement(checkDraftSql);
            checkDraftPs.setInt(1, empId);
            checkDraftPs.setString(2, payPeriod);
            ResultSet checkDraftRs = checkDraftPs.executeQuery();
            checkDraftRs.next();

            if (checkDraftRs.getInt(1) > 0) {
                // UPDATE existing draft
                String updateSql = "UPDATE payroll SET " +
                    "basic_salary=?, overtime_pay=?, thirteenth_month_pay=?, " +
                    "tax_deduction=?, late_deduction=?, net_salary=? " +
                    "WHERE employee_id=? AND pay_period=? AND status='Draft'";
                PreparedStatement updatePs = con.prepareStatement(updateSql);
                updatePs.setDouble(1, basicSalary);
                updatePs.setDouble(2, otPay);
                updatePs.setDouble(3, thirteenthMonth);
                updatePs.setDouble(4, taxDeduction);
                updatePs.setDouble(5, lateDeduction);
                updatePs.setDouble(6, netSalary);
                updatePs.setInt(7, empId);
                updatePs.setString(8, payPeriod);
                updatePs.executeUpdate();
            } else {
                // INSERT new draft
                String insertSql = "INSERT INTO payroll " +
                    "(employee_id, pay_period, basic_salary, overtime_pay, thirteenth_month_pay, " +
                    "tax_deduction, late_deduction, net_salary, status, created_at) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, 'Draft', GETDATE())";
                PreparedStatement insertPs = con.prepareStatement(insertSql);
                insertPs.setInt(1, empId);
                insertPs.setString(2, payPeriod);
                insertPs.setDouble(3, basicSalary);
                insertPs.setDouble(4, otPay);
                insertPs.setDouble(5, thirteenthMonth);
                insertPs.setDouble(6, taxDeduction);
                insertPs.setDouble(7, lateDeduction);
                insertPs.setDouble(8, netSalary);
                insertPs.executeUpdate();
            }
            generatedCount++;
        }

        con.close();

        String message = "Draft payroll generated for " + payPeriod + "!\n" +
                         "✔ Generated/Updated: " + generatedCount + " employee(s)\n";
        if (skippedFinalized > 0) {
            message += "Payroll already finalized: " + skippedFinalized + " employee(s)";
        }
        message += "\n\nReview the table then click 'Finalize Payroll' when ready.";
        JOptionPane.showMessageDialog(this, message);

        // Load draft records into table
        loadPayrollTable(payPeriod);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }


    }//GEN-LAST:event_generatePayrollActionPerformed

    private void finalizePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizePayrollActionPerformed
    java.util.Date selectedDate = adDateChooser.getDate();
    if (selectedDate == null) {
        JOptionPane.showMessageDialog(this, "Please select a pay period first.");
        return;
    }

    String payPeriod = new java.text.SimpleDateFormat("yyyy-MM").format(selectedDate);

    // Check if there are draft records to finalize
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;password=12345;" +
                "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(url);

        // Check if drafts exist
        String checkSql = "SELECT COUNT(*) FROM payroll WHERE pay_period=? AND status='Draft'";
        PreparedStatement checkPs = con.prepareStatement(checkSql);
        checkPs.setString(1, payPeriod);
        ResultSet checkRs = checkPs.executeQuery();
        checkRs.next();
        int draftCount = checkRs.getInt(1);

        if (draftCount == 0) {
            JOptionPane.showMessageDialog(this,
                "No DRAFT payroll found for " + payPeriod + ".\n" +
                "Please click 'Generate Payroll' first.");
            con.close();
            return;
        }

        // Confirm finalize
        int confirm = JOptionPane.showConfirmDialog(this,
            "Finalize " + draftCount + " payroll record(s) for " + payPeriod + "?\n\n" +
            "⚠ This CANNOT be undone!",
            "Confirm Finalize", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            con.close();
            return;
        }

        // Update Draft - Finalized
        String finalizeSql = "UPDATE payroll SET status='Finalized', finalized_at=GETDATE() " +
                             "WHERE pay_period=? AND status='Draft'";
        PreparedStatement finalizePs = con.prepareStatement(finalizeSql);
        finalizePs.setString(1, payPeriod);
        int updated = finalizePs.executeUpdate();

        con.close();

        JOptionPane.showMessageDialog(this,
            "✔ Payroll finalized for " + payPeriod + "!\n" +
            updated + " employee(s) payroll are now FINALIZED.");

        // Reload table to show Finalized status
        loadPayrollTable(payPeriod);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    
    
    }//GEN-LAST:event_finalizePayrollActionPerformed

    private void gpGeneratePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpGeneratePayrollActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "generatepayroll");
    }//GEN-LAST:event_gpGeneratePayrollActionPerformed

    private void gpManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpManageStaffActionPerformed
        // TODO add your handling code here:
    CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "managestaff");   
        loadEmployeeTable();

    }//GEN-LAST:event_gpManageStaffActionPerformed

    private void gpAdminDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpAdminDashBoardActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "adminDashboard");
    }//GEN-LAST:event_gpAdminDashBoardActionPerformed

    private void userIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDTxtActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
    String userID = userIDTxt.getText().trim();
    String password = new String(passTxt.getPassword()).trim();
    String selectedRole = roleCB.getSelectedItem() != null ? roleCB.getSelectedItem().toString() : "";

    if (userID.isEmpty() || password.isEmpty() || selectedRole.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields and select a role.");
        return;
    }

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String serverName = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;" +
                "password=12345;" +
                "encrypt=true;" +
                "trustServerCertificate=true;";

        Connection con = DriverManager.getConnection(serverName);

        java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        String hashedPassword = sb.toString();

        String sql = "SELECT u.role, u.employee_id FROM users u " +
                     "WHERE u.username = ? AND u.password_hash = ? AND u.role = ? AND u.is_active = 1";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, userID);
        pst.setString(2, hashedPassword);
        pst.setString(3, selectedRole);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String role = rs.getString("role");

            if ("Employee".equals(role)) {
                this.loggedInEmployeeId = rs.getInt("employee_id");
            } else {
                this.loggedInEmployeeId = -1;
            }
            CardLayout cl = (CardLayout)(getContentPane().getLayout());

            switch (role) {
                case "Admin" -> {
                    cl.show(getContentPane(), "adminDashboard");
                    loadEmployees() ;
                }
                    
                case "Manager" -> cl.show(getContentPane(), "managerdashboard");
                case "Employee" -> {cl.show(getContentPane(), "viewpayslip");
                                    loadEmployeePayslipTable();
                }
                default -> JOptionPane.showMessageDialog(this, "Unknown role. Contact administrator.");
            }

            userIDTxt.setText("");
            passTxt.setText("");
            roleCB.setSelectedIndex(-1);

        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials or role mismatch. Please try again.");
        }

        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Login error: " + e.getMessage());
    }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void payrollBtnjButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollBtnjButton13ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "generatepayroll");
    }//GEN-LAST:event_payrollBtnjButton13ActionPerformed

    private void mngStaffBtnjButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngStaffBtnjButton12ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "managestaff");
        loadEmployeeTable();
    }//GEN-LAST:event_mngStaffBtnjButton12ActionPerformed

    private void dasboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dasboardBtnActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "adminDashboard");
    }//GEN-LAST:event_dasboardBtnActionPerformed

    private void salaryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTxtActionPerformed

    private void statusCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusCBActionPerformed

    private void mdDashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdDashboardBtnActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "managerdashboard");
    }//GEN-LAST:event_mdDashboardBtnActionPerformed

    private void mdAttendanceBtnjButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdAttendanceBtnjButton12ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "attendancelog");
        loadEmployeeCB();
        loadAttendanceTable();
    }//GEN-LAST:event_mdAttendanceBtnjButton12ActionPerformed

    private void mdOTRequestBtnjButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdOTRequestBtnjButton13ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "otrequest");
    }//GEN-LAST:event_mdOTRequestBtnjButton13ActionPerformed

    private void orDashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orDashboardBtnActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "managerdashboard");
    }//GEN-LAST:event_orDashboardBtnActionPerformed

    private void orAttendanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orAttendanceBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "attendancelog");
        loadEmployeeCB();
        loadAttendanceTable();
    }//GEN-LAST:event_orAttendanceBtnActionPerformed

    private void orOTRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orOTRequestBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "otrequest");
    }//GEN-LAST:event_orOTRequestBtnActionPerformed

    private void atDashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atDashboardBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "managerdashboard");
        
        
    }//GEN-LAST:event_atDashboardBtnActionPerformed

    private void atAttendanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atAttendanceBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "attendancelog");
        loadEmployeeCB(); 
        loadAttendanceTable(); 
    }//GEN-LAST:event_atAttendanceBtnActionPerformed

    private void atOTRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atOTRequestBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "otrequest");
    }//GEN-LAST:event_atOTRequestBtnActionPerformed

    private void atClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atClrBtnActionPerformed
        employeeCB.setSelectedIndex(-1);
        timeINTxt.setText("");
        timeOutTxt.setText("");
        otStatusCB.setSelectedIndex(-1);
        dateHiredDC.setDate(null);

    }//GEN-LAST:event_atClrBtnActionPerformed

    private void atSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atSaveBtnActionPerformed
    String selectedEmployee = employeeCB.getSelectedItem() != null ?
        employeeCB.getSelectedItem().toString() : "";
    String timeIn = timeINTxt.getText().trim();
    String timeOut = timeOutTxt.getText().trim();
    String otStatus = otStatusCB.getSelectedItem() != null ?
        otStatusCB.getSelectedItem().toString() : "None";
    java.util.Date workDate = dateHiredDC.getDate();

    if (selectedEmployee.isEmpty() || timeIn.isEmpty() || timeOut.isEmpty() || workDate == null) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    // Validate time format HH:mm
    if (!timeIn.matches("\\d{2}:\\d{2}") || !timeOut.matches("\\d{2}:\\d{2}")) {
        JOptionPane.showMessageDialog(this, "Time format must be HH:mm\nExample: 08:00, 17:30");
        return;
    }

    try {
        // COMPUTE LATE MINUTES AND OVERTIME HOURS
        java.text.SimpleDateFormat timeFmt = new java.text.SimpleDateFormat("HH:mm");
        java.util.Date timeInDate  = timeFmt.parse(timeIn);
        java.util.Date timeOutDate = timeFmt.parse(timeOut);
        java.util.Date standardIn  = timeFmt.parse("08:00");
        java.util.Date standardOut = timeFmt.parse("17:00");

        // Late Minutes
        long lateMinutes = 0;
        if (timeInDate.after(standardIn)) {
            lateMinutes = (timeInDate.getTime() - standardIn.getTime()) / (1000 * 60);
        }

        // Overtime Hours 
        double overtimeHours = 0;
        if (timeOutDate.after(standardOut)) {
            overtimeHours = (timeOutDate.getTime() - standardOut.getTime()) / (1000.0 * 60 * 60);
            overtimeHours = Math.round(overtimeHours * 100.0) / 100.0;
        }

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;password=12345;" +
                "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(url);

        // Get Employee ID from name
        String getEmpSql = "SELECT employee_id FROM Employee WHERE full_name = ?";
        PreparedStatement getEmpPs = con.prepareStatement(getEmpSql);
        getEmpPs.setString(1, selectedEmployee);
        ResultSet empRs = getEmpPs.executeQuery();

        if (!empRs.next()) {
            JOptionPane.showMessageDialog(this, "Employee not found.");
            con.close();
            return;
        }
        int employeeId = empRs.getInt("employee_id");

        // Format work date to yyyy-MM-dd
        String formattedDate = new java.text.SimpleDateFormat("yyyy-MM-dd").format(workDate);

        java.sql.Time sqlTimeIn  = java.sql.Time.valueOf(timeIn + ":00");
        java.sql.Time sqlTimeOut = java.sql.Time.valueOf(timeOut + ":00");

        // CHECK IF RECORD ALREADY EXISTS
        String checkSql = "SELECT COUNT(*) FROM Attendance WHERE employee_id = ? AND work_date = ?";
        PreparedStatement checkPs = con.prepareStatement(checkSql);
        checkPs.setInt(1, employeeId);
        checkPs.setString(2, formattedDate);
        ResultSet checkRs = checkPs.executeQuery();
        checkRs.next();

        if (checkRs.getInt(1) > 0) {

            // UPDATE existing record
            String updateSql = "UPDATE Attendance SET " +
                    "time_in = ?, " +
                    "time_out = ?, " +
                    "late_minutes = ?, " +
                    "overtime_hours = ?, " +
                    "overtime_status = ? " +
                    "WHERE employee_id = ? AND work_date = ?";
            PreparedStatement updatePs = con.prepareStatement(updateSql);
            updatePs.setTime(1, sqlTimeIn);
            updatePs.setTime(2, sqlTimeOut);
            updatePs.setLong(3, lateMinutes);
            updatePs.setDouble(4, overtimeHours);
            updatePs.setString(5, otStatus);
            updatePs.setInt(6, employeeId);
            updatePs.setString(7, formattedDate);
            updatePs.executeUpdate();

            JOptionPane.showMessageDialog(this,
                "Attendance UPDATED!\n" +
                "─────────────────────\n" +
                "Employee : " + selectedEmployee + "\n" +
                "Date     : " + formattedDate + "\n" +
                "Time In  : " + timeIn + "\n" +
                "Time Out : " + timeOut + "\n" +
                "Late     : " + lateMinutes + " mins\n" +
                "OT Hours : " + overtimeHours + " hrs\n" +
                "OT Status: " + otStatus);

        } else {
            // INSERT new record
            String insertSql = "INSERT INTO Attendance " +
                    "(employee_id, work_date, time_in, time_out, late_minutes, overtime_hours, overtime_status, created_at) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, GETDATE())";
            PreparedStatement insertPs = con.prepareStatement(insertSql);
            insertPs.setInt(1, employeeId);
            insertPs.setString(2, formattedDate);
            insertPs.setTime(3, sqlTimeIn);
            insertPs.setTime(4, sqlTimeOut);
            insertPs.setLong(5, lateMinutes);
            insertPs.setDouble(6, overtimeHours);
            insertPs.setString(7, otStatus);
            insertPs.executeUpdate();

            JOptionPane.showMessageDialog(this,
                "Attendance SAVED!\n" +
                "─────────────────────\n" +
                "Employee : " + selectedEmployee + "\n" +
                "Date     : " + formattedDate + "\n" +
                "Time In  : " + timeIn + "\n" +
                "Time Out : " + timeOut + "\n" +
                "Late     : " + lateMinutes + " mins\n" +
                "OT Hours : " + overtimeHours + " hrs\n" +
                "OT Status: " + otStatus);
        }

        con.close();

        // Clear fields and reload table
        atClrBtnActionPerformed(null);
        loadAttendanceTable();

    } catch (java.text.ParseException pe) {
        JOptionPane.showMessageDialog(this, "Invalid time format. Use HH:mm (e.g. 08:00)");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }


    }//GEN-LAST:event_atSaveBtnActionPerformed

    private void employeeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeCBActionPerformed

    private void otStatusCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otStatusCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otStatusCBActionPerformed

    private void timeOutTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeOutTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeOutTxtActionPerformed

    private void timeINTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeINTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeINTxtActionPerformed

    private void vpViewPayslipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpViewPayslipBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "viewpayslip");
        loadEmployeePayslipTable();
    }//GEN-LAST:event_vpViewPayslipBtnActionPerformed

    private void vpRequestOTBtnjButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpRequestOTBtnjButton12ActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "requestOt");
    }//GEN-LAST:event_vpRequestOTBtnjButton12ActionPerformed

    private void roPayslipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roPayslipBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "viewpayslip");
        loadEmployeePayslipTable();
    }//GEN-LAST:event_roPayslipBtnActionPerformed

    private void roRequestOvertimeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roRequestOvertimeBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "requestOt");
    }//GEN-LAST:event_roRequestOvertimeBtnActionPerformed

    private void dhNavPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dhNavPanel2KeyPressed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_dhNavPanel2KeyPressed

    private void adLogout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout1MouseClicked
        this.loggedInEmployeeId = -1;
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout1MouseClicked

    private void adLogout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout2MouseClicked
        this.loggedInEmployeeId = -1;
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout2MouseClicked

    private void adLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogoutMouseClicked
        this.loggedInEmployeeId = -1;
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogoutMouseClicked

    private void adLogout3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout3MouseClicked
        this.loggedInEmployeeId = -1;
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout3MouseClicked

    private void adLogout4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout4MouseClicked
        this.loggedInEmployeeId = -1;
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout4MouseClicked

    private void adLogout5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout5MouseClicked
        this.loggedInEmployeeId = -1;
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout5MouseClicked

    private void adLogout6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout6MouseClicked
        this.loggedInEmployeeId = -1;
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout6MouseClicked

    private void adLogout7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout7MouseClicked
        this.loggedInEmployeeId = -1;
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout7MouseClicked

    private void msUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msUpdateBtnActionPerformed
     if (selectedEmployeeId <= 0) {
        JOptionPane.showMessageDialog(this, "Please select an employee from the table first.");
        return;
    }

    String fullName = fullNameTxt.getText().trim();
    String position = positionCB.getSelectedItem() != null ? positionCB.getSelectedItem().toString() : "";
    String salary = salaryTxt.getText().trim();
    String status = statusCB.getSelectedItem() != null ? statusCB.getSelectedItem().toString() : "";
    java.util.Date dateHired = dateHiredDC.getDate();

    if (fullName.isEmpty() || position.isEmpty() || salary.isEmpty() || status.isEmpty() || dateHired == null) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;password=12345;" +
                "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(url);

        String formattedDate = new java.text.SimpleDateFormat("yyyy-MM-dd").format(dateHired);

        String sql = "UPDATE Employee SET full_name=?, position=?, basic_salary=?, employment_status=?, date_hired=? WHERE employee_id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, fullName);
        pst.setString(2, position);
        pst.setDouble(3, Double.parseDouble(salary));
        pst.setString(4, status);
        pst.setString(5, formattedDate);
        pst.setInt(6, selectedEmployeeId);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Employee updated successfully!");
        con.close();
        msClrBtnActionPerformed(null);
        loadEmployeeTable();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid salary. Please enter a valid number.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    }//GEN-LAST:event_msUpdateBtnActionPerformed

    private void msDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msDeleteBtnActionPerformed
       
    if (selectedEmployeeId <= 0) {
        JOptionPane.showMessageDialog(this, "Please select an employee from the table first.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this,
        "Are you sure you want to delete this employee?",
        "Confirm Delete", JOptionPane.YES_NO_OPTION);

    if (confirm != JOptionPane.YES_OPTION) return;

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;password=12345;" +
                "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(url);

        // Delete from users
        String deleteUser = "DELETE FROM users WHERE employee_id = ?";
        PreparedStatement pst1 = con.prepareStatement(deleteUser);
        pst1.setInt(1, selectedEmployeeId);
        pst1.executeUpdate();

        // Then delete from Attendance
        String deleteAttendance = "DELETE FROM Attendance WHERE employee_id = ?";
        PreparedStatement pst2 = con.prepareStatement(deleteAttendance);
        pst2.setInt(1, selectedEmployeeId);
        pst2.executeUpdate();

        // Then delete from payroll 
        String deletePayroll = "DELETE FROM payroll WHERE employee_id = ?";
        PreparedStatement pst3 = con.prepareStatement(deletePayroll);
        pst3.setInt(1, selectedEmployeeId);
        pst3.executeUpdate();

        // Finally delete the employee
        String deleteEmp = "DELETE FROM Employee WHERE employee_id = ?";
        PreparedStatement pst4 = con.prepareStatement(deleteEmp);
        pst4.setInt(1, selectedEmployeeId);
        pst4.executeUpdate();

        JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
        con.close();
        msClrBtnActionPerformed(null);
        loadEmployeeTable();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    }//GEN-LAST:event_msDeleteBtnActionPerformed

    private void adDateChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adDateChooserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adDateChooserMouseClicked

    private void orApproveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orApproveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orApproveBtnActionPerformed

    private void orDeclineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orDeclineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orDeclineBtnActionPerformed

    private static final String DB_URL =
        "jdbc:sqlserver://localhost:1433;" +
        "databaseName=EmployeePayroll;" +
        "user=sa;password=12345;" +
        "encrypt=true;trustServerCertificate=true;";

    private Connection openConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(DB_URL);
    }

    
    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        java.util.Date selectedDate = reqOTDC.getDate();
        double requestedOtHours = ((Number) otHrsSpinner.getValue()).doubleValue();

        if (loggedInEmployeeId <= 0) {
            JOptionPane.showMessageDialog(this, "Session expired. Please log in again.");
            return;
        }
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Please select a work date.");
            return;
        }
        if (requestedOtHours <= 0) {
            JOptionPane.showMessageDialog(this, "Overtime hours must be greater than 0.");
            return;
        }
        if (requestedOtHours > 6.99) {
            JOptionPane.showMessageDialog(this, "Maximum OT is 6.99 hours (5:00 PM to 11:59 PM).");
            return;
        }

        java.time.LocalDate workDate = selectedDate.toInstant()
                .atZone(java.time.ZoneId.systemDefault())
                .toLocalDate();

        if (workDate.isAfter(java.time.LocalDate.now())) {
            JOptionPane.showMessageDialog(this, "Work date cannot be in the future.");
            return;
        }

        java.time.LocalTime standardTimeIn = java.time.LocalTime.of(8, 0);
        java.time.LocalTime shiftEnd = java.time.LocalTime.of(17, 0);

        int otMinutes = (int) Math.round(requestedOtHours * 60.0);
        java.time.LocalTime computedTimeOut = shiftEnd.plusMinutes(otMinutes);

        if (!computedTimeOut.isAfter(shiftEnd)) {
            JOptionPane.showMessageDialog(this, "Computed time-out is invalid.");
            return;
        }

        double roundedOtHours = Math.round((otMinutes / 60.0) * 100.0) / 100.0;

        try (Connection con = openConnection()) {
            con.setAutoCommit(false);
            try {
                int attendanceId = -1;
                String existingStatus = null;

                String checkSql =
                        "SELECT attendance_id, overtime_status " +
                        "FROM Attendance " +
                        "WHERE employee_id = ? AND work_date = ?";

                try (PreparedStatement checkPs = con.prepareStatement(checkSql)) {
                    checkPs.setInt(1, loggedInEmployeeId);
                    checkPs.setDate(2, java.sql.Date.valueOf(workDate));

                    try (ResultSet rs = checkPs.executeQuery()) {
                        if (rs.next()) {
                            attendanceId = rs.getInt("attendance_id");
                            existingStatus = rs.getString("overtime_status");
                        }
                    }
                }

                if ("Approved".equalsIgnoreCase(existingStatus)) {
                    throw new IllegalStateException(
                            "An approved overtime entry already exists for this date."
                    );
                }
                if ("Pending".equalsIgnoreCase(existingStatus)) {
                    throw new IllegalStateException(
                            "You already have a pending overtime request for this date."
                    );
                }

                if (attendanceId > 0) {
                    String updateSql =
                            "UPDATE Attendance SET " +
                            "time_in = ?, " +
                            "time_out = ?, " +
                            "late_minutes = ?, " +
                            "overtime_hours = ?, " +
                            "overtime_status = ? " +
                            "WHERE attendance_id = ?";

                    try (PreparedStatement updatePs = con.prepareStatement(updateSql)) {
                        updatePs.setTime(1, java.sql.Time.valueOf(standardTimeIn));
                        updatePs.setTime(2, java.sql.Time.valueOf(computedTimeOut));
                        updatePs.setInt(3, 0); // 8:00 AM fixed time in
                        updatePs.setDouble(4, roundedOtHours);
                        updatePs.setString(5, "Pending");
                        updatePs.setInt(6, attendanceId);
                        updatePs.executeUpdate();
                    }
                } else {
                    String insertSql =
                            "INSERT INTO Attendance " +
                            "(employee_id, work_date, time_in, time_out, late_minutes, overtime_hours, overtime_status, created_at) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, GETDATE())";

                    try (PreparedStatement insertPs = con.prepareStatement(insertSql)) {
                        insertPs.setInt(1, loggedInEmployeeId);
                        insertPs.setDate(2, java.sql.Date.valueOf(workDate));
                        insertPs.setTime(3, java.sql.Time.valueOf(standardTimeIn));
                        insertPs.setTime(4, java.sql.Time.valueOf(computedTimeOut));
                        insertPs.setInt(5, 0);
                        insertPs.setDouble(6, roundedOtHours);
                        insertPs.setString(7, "Pending");
                        insertPs.executeUpdate();
                    }
                }

                con.commit();

                JOptionPane.showMessageDialog(this,
                        "Overtime request submitted successfully.\nStatus: Pending");

                reqOTDC.setDate(new java.util.Date());
                otHrsSpinner.setValue(1.0);

                // Optional refresh if you show request history/attendance table
                loadAttendanceTable();

            } catch (Exception ex) {
                con.rollback();
                throw ex;
            }
        } catch (IllegalStateException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_reqBtnActionPerformed
    
    
    public void loadEmployees() {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +   
                "user=sa;" +
                "password=12345;" +
                "encrypt=true;" +                   
                "trustServerCertificate=true;";

        Connection con = DriverManager.getConnection(url);

        String loadQuery = "SELECT employee_id, full_name, position, basic_salary, employment_status, date_hired FROM Employee";
        PreparedStatement ps = con.prepareStatement(loadQuery);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) adminTable.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            String[] data = {
                rs.getString("employee_id"),
                rs.getString("full_name"),
                rs.getString("position"),
                rs.getString("basic_salary"),
                rs.getString("employment_status"),
                rs.getString("date_hired")
            };
            model.addRow(data);
        }

        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}
    
    public void loadEmployeeTable() {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;password=12345;" +
                "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(url);

        String loadQuery = "SELECT employee_id, full_name, position, basic_salary, employment_status, date_hired FROM Employee";
        PreparedStatement ps = con.prepareStatement(loadQuery);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            String[] data = {
                rs.getString("full_name"),
                rs.getString("position"),
                rs.getString("basic_salary"),
                rs.getString("employment_status"),
                rs.getString("date_hired")
            };
            model.addRow(data);
        }
        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}
    
public void loadSelectedEmployee(String fullName) {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;password=12345;" +
                "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(url);

        String sql = "SELECT * FROM Employee WHERE full_name = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, fullName);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            selectedEmployeeId = rs.getInt("employee_id");
            fullNameTxt.setText(rs.getString("full_name"));
            positionCB.setSelectedItem(rs.getString("position"));
            salaryTxt.setText(rs.getString("basic_salary"));
            statusCB.setSelectedItem(rs.getString("employment_status"));
            dateHiredDC.setDate(rs.getDate("date_hired"));
        }
        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}
        
        public void loadAttendanceTable() {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;" +
                        "databaseName=EmployeePayroll;" +
                        "user=sa;password=12345;" +
                        "encrypt=true;trustServerCertificate=true;";
                Connection con = DriverManager.getConnection(url);

                String sql = "SELECT " +
                             "a.work_date, " +
                             "e.full_name, " +
                             "LEFT(CONVERT(VARCHAR(8), a.time_in), 5) AS time_in, " +
                             "LEFT(CONVERT(VARCHAR(8), a.time_out), 5) AS time_out, " +
                             "a.late_minutes, " +
                             "a.overtime_hours, " +
                             "a.overtime_status " +
                             "FROM Attendance a " +
                             "JOIN Employee e ON a.employee_id = e.employee_id " +
                             "ORDER BY a.work_date DESC";

                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) atEmployeeTable.getModel();
                model.setRowCount(0);

                while (rs.next()) {
                    Object[] row = {
                        rs.getString("work_date"),    // Date
                        rs.getString("full_name"),    // Employee
                        rs.getString("time_in"),      // Time In  → "08:30"
                        rs.getString("time_out"),     // Time Out → "17:00"
                        rs.getString("late_minutes") + " mins",    // Late
                        rs.getString("overtime_hours") + " hrs",   // Overtime
                        rs.getString("overtime_status")            // Status
                    };
                    model.addRow(row);
                }
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error loading attendance: " + e.getMessage());
            }
        }
        
        public void loadEmployeeCB() {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;" +
                        "databaseName=EmployeePayroll;" +
                        "user=sa;password=12345;" +
                        "encrypt=true;trustServerCertificate=true;";
                Connection con = DriverManager.getConnection(url);

                String sql = "SELECT full_name FROM Employee ORDER BY full_name";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                employeeCB.removeAllItems();

                while (rs.next()) {
                    employeeCB.addItem(rs.getString("full_name"));
                }
                employeeCB.setSelectedIndex(-1);
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error loading employees: " + e.getMessage());
            }
        }
        
        public void loadPayrollTable(String payPeriod) {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=EmployeePayroll;" +
                "user=sa;password=12345;" +
                "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(url);

        String query = "SELECT e.full_name, p.basic_salary, p.overtime_pay, " +
                "p.thirteenth_month_pay, p.tax_deduction, p.late_deduction, " +
                "p.net_salary, p.status " +
                "FROM payroll p JOIN Employee e ON p.employee_id = e.employee_id " +
                "WHERE p.pay_period = ? " +
                "ORDER BY e.full_name";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, payPeriod);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) payrollTable.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            Object[] row = {
                rs.getString("full_name"),
                rs.getString("basic_salary"),
                rs.getString("overtime_pay"),
                rs.getString("thirteenth_month_pay"),
                rs.getString("tax_deduction"),
                rs.getString("late_deduction"),
                rs.getString("net_salary"),
                rs.getString("status")
            };
            model.addRow(row);
        }
        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading payroll: " + e.getMessage());
    }
}

    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser adDateChooser;
    private javax.swing.JLabel adLogout;
    private javax.swing.JLabel adLogout1;
    private javax.swing.JLabel adLogout2;
    private javax.swing.JLabel adLogout3;
    private javax.swing.JLabel adLogout4;
    private javax.swing.JLabel adLogout5;
    private javax.swing.JLabel adLogout6;
    private javax.swing.JLabel adLogout7;
    private javax.swing.JPanel adminDashboard;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JTable adminTable;
    private javax.swing.JPanel alNavPanel;
    private javax.swing.JButton atAttendanceBtn;
    private javax.swing.JButton atClrBtn;
    private javax.swing.JButton atDashboardBtn;
    private javax.swing.JTable atEmployeeTable;
    private javax.swing.JButton atOTRequestBtn;
    private javax.swing.JButton atSaveBtn;
    private javax.swing.JTable attendanceLogTable;
    private javax.swing.JPanel attendancelog;
    private javax.swing.JButton dasboardBtn;
    private com.toedter.calendar.JDateChooser dateHiredDC;
    private javax.swing.JPanel dhNavPanel;
    private javax.swing.JPanel dhNavPanel2;
    private javax.swing.JComboBox<String> employeeCB;
    private javax.swing.JPanel employeePanel;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton finalizePayroll;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JButton generatePayroll;
    private javax.swing.JPanel generatepayroll;
    private javax.swing.JButton gpAdminDashBoard;
    private javax.swing.JButton gpGeneratePayroll;
    private javax.swing.JPanel gpHeader;
    private javax.swing.JPanel gpHeader1;
    private javax.swing.JPanel gpHeader2;
    private javax.swing.JButton gpManageStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDateHired;
    private javax.swing.JLabel jLabelDateHired1;
    private javax.swing.JLabel jLabelEmployeesDirectory;
    private javax.swing.JLabel jLabelEmployeesDirectory1;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelGPHeader;
    private javax.swing.JLabel jLabelGPHeader1;
    private javax.swing.JLabel jLabelGPHeader2;
    private javax.swing.JLabel jLabelGeneratePayroll;
    private javax.swing.JLabel jLabelGeneratePayroll1;
    private javax.swing.JLabel jLabelGeneratePayroll2;
    private javax.swing.JLabel jLabelMSHeader;
    private javax.swing.JLabel jLabelMSHeader1;
    private javax.swing.JLabel jLabelManageEmployees;
    private javax.swing.JLabel jLabelManageEmployees1;
    private javax.swing.JLabel jLabelPayrollDetails;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelPosition1;
    private javax.swing.JLabel jLabelSalary;
    private javax.swing.JLabel jLabelSalary1;
    private javax.swing.JLabel jLabelSelectDate;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatus1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel jlabelMDOverview;
    private javax.swing.JLabel jlabelatName;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPanel managerDashboard1;
    private javax.swing.JPanel managerPanel;
    private javax.swing.JPanel managestaff;
    private javax.swing.JButton mdAttendanceBtn;
    private javax.swing.JButton mdDashboardBtn;
    private javax.swing.JTable mdDashboardTable;
    private javax.swing.JPanel mdNavPanel;
    private javax.swing.JButton mdOTRequestBtn;
    private javax.swing.JButton mngStaffBtn;
    private javax.swing.JButton msAdminDashboard;
    private javax.swing.JButton msClrBtn;
    private javax.swing.JButton msDeleteBtn;
    private javax.swing.JButton msGeneratePayroll;
    private javax.swing.JPanel msHeader;
    private javax.swing.JPanel msHeader1;
    private javax.swing.JButton msManageStaff;
    private javax.swing.JButton msSaveBtn;
    private javax.swing.JButton msUpdateBtn;
    private javax.swing.JLabel navGP;
    private javax.swing.JLabel navGP1;
    private javax.swing.JLabel navGP2;
    private javax.swing.JLabel navLbl;
    private javax.swing.JLabel navLbl1;
    private javax.swing.JLabel navLbl2;
    private javax.swing.JLabel navMS;
    private javax.swing.JLabel navMS1;
    private javax.swing.JPanel navPanelGP;
    private javax.swing.JPanel navPanelGP2;
    private javax.swing.JPanel navPanelMS;
    private javax.swing.JButton orApproveBtn;
    private javax.swing.JButton orAttendanceBtn;
    private javax.swing.JButton orDashboardBtn;
    private javax.swing.JButton orDeclineBtn;
    private javax.swing.JPanel orNavPanel;
    private javax.swing.JButton orOTRequestBtn;
    private javax.swing.JSpinner otHrsSpinner;
    private javax.swing.JComboBox<String> otStatusCB;
    private javax.swing.JPanel otrequest;
    private javax.swing.JLabel overviewLbl;
    private javax.swing.JLabel overviewLbl2;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel passlbl;
    private javax.swing.JButton payrollBtn;
    private javax.swing.JTable payrollTable;
    private javax.swing.JTable payslipTable;
    private javax.swing.JComboBox<String> positionCB;
    private javax.swing.JButton reqBtn;
    private com.toedter.calendar.JCalendar reqOTDC;
    private javax.swing.JPanel requestOt;
    private javax.swing.JButton roPayslipBtn;
    private javax.swing.JButton roRequestOvertimeBtn;
    private javax.swing.JComboBox<String> roleCB;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JTextField timeINTxt;
    private javax.swing.JTextField timeOutTxt;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel titleLbl1;
    private javax.swing.JLabel titleLbl2;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JPanel titlePanel1;
    private javax.swing.JPanel titlePanel2;
    private javax.swing.JTextField userIDTxt;
    private javax.swing.JLabel useridlbl;
    private javax.swing.JPanel viewpayslip;
    private javax.swing.JButton vpRequestOTBtn;
    private javax.swing.JButton vpViewPayslipBtn;
    // End of variables declaration//GEN-END:variables

}
