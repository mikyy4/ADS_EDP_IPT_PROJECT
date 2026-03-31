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

    public Dashboard() {
        initComponents();
    }

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
        selectDate = new com.toedter.calendar.JDateChooser();
        adminDashboard = new javax.swing.JPanel();
        dhNavPanel = new javax.swing.JPanel();
        dasboardBtn = new javax.swing.JButton();
        mngStaffBtn = new javax.swing.JButton();
        payrollBtn = new javax.swing.JButton();
        navLbl = new javax.swing.JLabel();
        adLogout = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        studtable = new javax.swing.JTable();
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
        workdateDC = new com.toedter.calendar.JDateChooser();
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
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabelTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(95, 67, 57));
        jLabelTitle.setText("KAPE-BULSU");

        useridlbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        useridlbl.setText("USER ID");

        passlbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        passlbl.setText("PASSWORD");

        userIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTxtActionPerformed(evt);
            }
        });

        roleCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Employee" }));
        roleCB.setSelectedIndex(-1);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Role");

        loginBtn.setBackground(new java.awt.Color(60, 42, 33));
        loginBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
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
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginBtn)
                            .addGroup(loginpanelLayout.createSequentialGroup()
                                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(useridlbl)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roleCB, 0, 173, Short.MAX_VALUE)
                                    .addComponent(userIDTxt)
                                    .addComponent(passTxt)))))
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
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
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        getContentPane().add(login, "card5");
        getContentPane().add(login, "login");

        adminPanel.setLayout(new java.awt.CardLayout());

        managestaff.setBackground(new java.awt.Color(255, 204, 204));
        managestaff.setForeground(new java.awt.Color(255, 102, 102));

        navPanelMS.setBackground(new java.awt.Color(255, 204, 204));
        navPanelMS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        msAdminDashboard.setBackground(new java.awt.Color(255, 204, 204));
        msAdminDashboard.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        msAdminDashboard.setForeground(new java.awt.Color(255, 102, 102));
        msAdminDashboard.setText("Dashboard");
        msAdminDashboard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        msAdminDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msAdminDashboardActionPerformed(evt);
            }
        });

        msManageStaff.setBackground(new java.awt.Color(255, 204, 204));
        msManageStaff.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        msManageStaff.setForeground(new java.awt.Color(255, 102, 102));
        msManageStaff.setText("Manage Staff");
        msManageStaff.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        msManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msManageStaffActionPerformed(evt);
            }
        });

        msGeneratePayroll.setBackground(new java.awt.Color(255, 204, 204));
        msGeneratePayroll.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        msGeneratePayroll.setForeground(new java.awt.Color(255, 102, 102));
        msGeneratePayroll.setText("Generate Payroll");
        msGeneratePayroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        msGeneratePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msGeneratePayrollActionPerformed(evt);
            }
        });

        navMS.setBackground(new java.awt.Color(255, 102, 102));
        navMS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navMS.setForeground(new java.awt.Color(255, 102, 102));
        navMS.setText("Navigation Panel");

        adLogout2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout2.setForeground(java.awt.Color.red);
        adLogout2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout2.setText("LOG-OUT");
        adLogout2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGroup(navPanelMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navPanelMSLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(navPanelMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msAdminDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msGeneratePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(navMS)))
                    .addGroup(navPanelMSLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(adLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        employeeTable.setBackground(new java.awt.Color(255, 204, 204));
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
        employeeTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane4.setViewportView(employeeTable);

        jLabelEmployeesDirectory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEmployeesDirectory.setForeground(new java.awt.Color(255, 102, 102));
        jLabelEmployeesDirectory.setText("Employee Directory");

        msHeader.setBackground(new java.awt.Color(255, 204, 204));
        msHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        jLabelMSHeader.setBackground(new java.awt.Color(0, 51, 255));
        jLabelMSHeader.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMSHeader.setForeground(new java.awt.Color(255, 102, 102));
        jLabelMSHeader.setText("ADMIN DASHBOARD");

        javax.swing.GroupLayout msHeaderLayout = new javax.swing.GroupLayout(msHeader);
        msHeader.setLayout(msHeaderLayout);
        msHeaderLayout.setHorizontalGroup(
            msHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msHeaderLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabelMSHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        msHeaderLayout.setVerticalGroup(
            msHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msHeaderLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabelMSHeader)
                .addContainerGap())
        );

        msClrBtn.setBackground(new java.awt.Color(255, 204, 204));
        msClrBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        msClrBtn.setForeground(new java.awt.Color(255, 102, 102));
        msClrBtn.setText("Clear");
        msClrBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        msClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msClrBtnActionPerformed(evt);
            }
        });

        jLabelFullName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelFullName.setForeground(new java.awt.Color(255, 102, 102));
        jLabelFullName.setText("Full Name");

        jLabelManageEmployees.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelManageEmployees.setForeground(new java.awt.Color(255, 102, 102));
        jLabelManageEmployees.setText("Manage Employees");

        msSaveBtn.setBackground(new java.awt.Color(255, 204, 204));
        msSaveBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        msSaveBtn.setForeground(new java.awt.Color(255, 102, 102));
        msSaveBtn.setText("Save");
        msSaveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        msSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msSaveBtnActionPerformed(evt);
            }
        });

        positionCB.setBackground(new java.awt.Color(255, 204, 204));
        positionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Barista", "Janitor", "Supervisor" }));
        positionCB.setSelectedIndex(-1);

        statusCB.setBackground(new java.awt.Color(255, 204, 204));
        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Contractual" }));
        statusCB.setSelectedIndex(-1);
        statusCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCBActionPerformed(evt);
            }
        });

        salaryTxt.setBackground(new java.awt.Color(255, 204, 204));
        salaryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTxtActionPerformed(evt);
            }
        });

        jLabelPosition.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelPosition.setForeground(new java.awt.Color(255, 102, 102));
        jLabelPosition.setText("Position:");

        jLabelSalary.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelSalary.setForeground(new java.awt.Color(255, 102, 102));
        jLabelSalary.setText("Salary:");

        jLabelStatus.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(255, 102, 102));
        jLabelStatus.setText("Status:");

        fullNameTxt.setPreferredSize(new java.awt.Dimension(89, 22));

        jLabelDateHired.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelDateHired.setForeground(new java.awt.Color(255, 102, 102));
        jLabelDateHired.setText("Date Hired:");

        javax.swing.GroupLayout managestaffLayout = new javax.swing.GroupLayout(managestaff);
        managestaff.setLayout(managestaffLayout);
        managestaffLayout.setHorizontalGroup(
            managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(msHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(managestaffLayout.createSequentialGroup()
                .addComponent(navPanelMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managestaffLayout.createSequentialGroup()
                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(managestaffLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPosition)
                                    .addComponent(jLabelFullName)
                                    .addComponent(jLabelSalary)
                                    .addComponent(jLabelStatus)
                                    .addComponent(jLabelDateHired))
                                .addGap(22, 22, 22)
                                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(positionCB, 0, 231, Short.MAX_VALUE)
                                    .addComponent(fullNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salaryTxt)
                                    .addComponent(statusCB, 0, 231, Short.MAX_VALUE)
                                    .addComponent(dateHiredDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(msClrBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(msSaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                            .addComponent(jLabelManageEmployees)
                            .addComponent(jLabelEmployeesDirectory))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)))
        );
        managestaffLayout.setVerticalGroup(
            managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managestaffLayout.createSequentialGroup()
                .addComponent(msHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navPanelMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(managestaffLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelManageEmployees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(managestaffLayout.createSequentialGroup()
                                .addComponent(jLabelFullName)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fullNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(positionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPosition)
                            .addComponent(msSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(managestaffLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelSalary)
                                    .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelStatus)
                                    .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(managestaffLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(msClrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(managestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDateHired)
                            .addComponent(dateHiredDC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabelEmployeesDirectory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        adminPanel.add(managestaff, "card4");
        getContentPane().add(managestaff, "managestaff");

        generatepayroll.setBackground(new java.awt.Color(255, 204, 204));
        generatepayroll.setForeground(new java.awt.Color(255, 102, 102));

        navPanelGP.setBackground(new java.awt.Color(255, 204, 204));
        navPanelGP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        gpAdminDashBoard.setBackground(new java.awt.Color(255, 204, 204));
        gpAdminDashBoard.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        gpAdminDashBoard.setForeground(new java.awt.Color(255, 102, 102));
        gpAdminDashBoard.setText("Dashboard");
        gpAdminDashBoard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        gpAdminDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpAdminDashBoardActionPerformed(evt);
            }
        });

        gpManageStaff.setBackground(new java.awt.Color(255, 204, 204));
        gpManageStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gpManageStaff.setForeground(new java.awt.Color(255, 102, 102));
        gpManageStaff.setText("Manage Staff");
        gpManageStaff.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        gpManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpManageStaffActionPerformed(evt);
            }
        });

        gpGeneratePayroll.setBackground(new java.awt.Color(255, 204, 204));
        gpGeneratePayroll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gpGeneratePayroll.setForeground(new java.awt.Color(255, 102, 102));
        gpGeneratePayroll.setText("Generate Payroll");
        gpGeneratePayroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        gpGeneratePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpGeneratePayrollActionPerformed(evt);
            }
        });

        navGP.setBackground(new java.awt.Color(255, 102, 102));
        navGP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navGP.setForeground(new java.awt.Color(255, 102, 102));
        navGP.setText("Navigation Panel");

        adLogout1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout1.setForeground(java.awt.Color.red);
        adLogout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout1.setText("LOG-OUT");
        adLogout1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGroup(navPanelGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navPanelGPLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(navPanelGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gpAdminDashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(gpManageStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(gpGeneratePayroll, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(navGP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(navPanelGPLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(adLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(adLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        payrollTable.setBackground(new java.awt.Color(255, 204, 204));
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
        jLabelPayrollDetails.setForeground(new java.awt.Color(255, 102, 102));
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
                .addGap(0, 19, Short.MAX_VALUE))
        );

        finalizePayroll.setBackground(new java.awt.Color(255, 204, 204));
        finalizePayroll.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        finalizePayroll.setForeground(new java.awt.Color(255, 102, 102));
        finalizePayroll.setText("Finalize Payroll");
        finalizePayroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        finalizePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizePayrollActionPerformed(evt);
            }
        });

        jLabelSelectDate.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelSelectDate.setForeground(new java.awt.Color(255, 102, 102));
        jLabelSelectDate.setText("Select Pay Period");

        jLabelGeneratePayroll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelGeneratePayroll.setForeground(new java.awt.Color(255, 102, 102));
        jLabelGeneratePayroll.setText("GENERATE PAYROLL");

        generatePayroll.setBackground(new java.awt.Color(255, 204, 204));
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
                        .addGap(26, 26, 26)
                        .addGroup(generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGeneratePayroll)
                            .addGroup(generatepayrollLayout.createSequentialGroup()
                                .addComponent(generatePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(finalizePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(generatepayrollLayout.createSequentialGroup()
                                .addComponent(jLabelSelectDate)
                                .addGap(32, 32, 32)
                                .addComponent(selectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(generatepayrollLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPayrollDetails))
                    .addGroup(generatepayrollLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(34, 34, 34)
                        .addGroup(generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSelectDate)
                            .addComponent(selectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(generatepayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generatePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalizePayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabelPayrollDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        adminPanel.add(generatepayroll, "card3");
        getContentPane().add(generatepayroll, "generatepayroll");

        adminDashboard.setBackground(new java.awt.Color(255, 204, 204));

        dhNavPanel.setBackground(new java.awt.Color(255, 204, 204));
        dhNavPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        dasboardBtn.setBackground(new java.awt.Color(255, 204, 204));
        dasboardBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dasboardBtn.setForeground(new java.awt.Color(255, 102, 102));
        dasboardBtn.setText("Admin");
        dasboardBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        dasboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dasboardBtnActionPerformed(evt);
            }
        });

        mngStaffBtn.setBackground(new java.awt.Color(255, 204, 204));
        mngStaffBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mngStaffBtn.setForeground(new java.awt.Color(255, 102, 102));
        mngStaffBtn.setText("Manage Staff");
        mngStaffBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        mngStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngStaffBtnjButton12ActionPerformed(evt);
            }
        });

        payrollBtn.setBackground(new java.awt.Color(255, 204, 204));
        payrollBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        payrollBtn.setForeground(new java.awt.Color(255, 102, 102));
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
        adLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                        .addGap(52, 52, 52)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(adLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        studtable.setBackground(new java.awt.Color(255, 153, 153));
        studtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "First Name", "Last Name", "Program", "Year"
            }
        ));
        studtable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane3.setViewportView(studtable);

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
                .addGap(0, 19, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)))
        );
        adminDashboardLayout.setVerticalGroup(
            adminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminDashboardLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dhNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(adminDashboardLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(overviewLbl)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        adminPanel.add(adminDashboard, "card2");
        getContentPane().add(adminDashboard, "adminDashboard");

        getContentPane().add(adminPanel, "card6");

        managerPanel.setLayout(new java.awt.CardLayout());

        managerDashboard1.setBackground(new java.awt.Color(255, 204, 204));

        mdNavPanel.setBackground(new java.awt.Color(255, 204, 204));
        mdNavPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        mdDashboardBtn.setBackground(new java.awt.Color(255, 204, 204));
        mdDashboardBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mdDashboardBtn.setForeground(new java.awt.Color(255, 102, 102));
        mdDashboardBtn.setText("Dashboard");
        mdDashboardBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        mdDashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdDashboardBtnActionPerformed(evt);
            }
        });

        mdAttendanceBtn.setBackground(new java.awt.Color(255, 204, 204));
        mdAttendanceBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mdAttendanceBtn.setForeground(new java.awt.Color(255, 102, 102));
        mdAttendanceBtn.setText("Attendance Log");
        mdAttendanceBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        mdAttendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdAttendanceBtnjButton12ActionPerformed(evt);
            }
        });

        mdOTRequestBtn.setBackground(new java.awt.Color(255, 204, 204));
        mdOTRequestBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mdOTRequestBtn.setForeground(new java.awt.Color(255, 102, 102));
        mdOTRequestBtn.setText("Overtime Request");
        mdOTRequestBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        mdOTRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdOTRequestBtnjButton13ActionPerformed(evt);
            }
        });

        navLbl1.setBackground(new java.awt.Color(255, 102, 102));
        navLbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navLbl1.setForeground(new java.awt.Color(255, 102, 102));
        navLbl1.setText("Navigation Panel");

        adLogout3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout3.setForeground(java.awt.Color.red);
        adLogout3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout3.setText("LOG-OUT");
        adLogout3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGroup(mdNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mdNavPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(mdNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mdOTRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mdAttendanceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mdDashboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(navLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mdNavPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(adLogout3)))
                .addContainerGap(34, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adLogout3)
                .addGap(60, 60, 60))
        );

        mdDashboardTable.setBackground(new java.awt.Color(255, 153, 153));
        mdDashboardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "First Name", "Last Name", "Program", "Year"
            }
        ));
        mdDashboardTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane6.setViewportView(mdDashboardTable);

        titlePanel1.setBackground(new java.awt.Color(255, 204, 204));
        titlePanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        titleLbl1.setBackground(new java.awt.Color(0, 51, 255));
        titleLbl1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLbl1.setForeground(new java.awt.Color(255, 102, 102));
        titleLbl1.setText("MANAGER DASHBOARD");

        javax.swing.GroupLayout titlePanel1Layout = new javax.swing.GroupLayout(titlePanel1);
        titlePanel1.setLayout(titlePanel1Layout);
        titlePanel1Layout.setHorizontalGroup(
            titlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(titleLbl1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanel1Layout.setVerticalGroup(
            titlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl1)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jlabelMDOverview.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabelMDOverview.setForeground(new java.awt.Color(255, 102, 102));
        jlabelMDOverview.setText("DASHBOARD OVERVIEW");

        javax.swing.GroupLayout managerDashboard1Layout = new javax.swing.GroupLayout(managerDashboard1);
        managerDashboard1.setLayout(managerDashboard1Layout);
        managerDashboard1Layout.setHorizontalGroup(
            managerDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(managerDashboard1Layout.createSequentialGroup()
                .addComponent(mdNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managerDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerDashboard1Layout.createSequentialGroup()
                        .addComponent(jlabelMDOverview)
                        .addContainerGap())
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)))
        );
        managerDashboard1Layout.setVerticalGroup(
            managerDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerDashboard1Layout.createSequentialGroup()
                .addComponent(titlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managerDashboard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mdNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(managerDashboard1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jlabelMDOverview)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(267, Short.MAX_VALUE))))
        );

        managerPanel.add(managerDashboard1, "card2");
        getContentPane().add(managerDashboard1, "managerdashboard");

        otrequest.setBackground(new java.awt.Color(255, 204, 204));
        otrequest.setForeground(new java.awt.Color(255, 102, 102));

        orNavPanel.setBackground(new java.awt.Color(255, 204, 204));
        orNavPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        orDashboardBtn.setBackground(new java.awt.Color(255, 204, 204));
        orDashboardBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        orDashboardBtn.setForeground(new java.awt.Color(255, 102, 102));
        orDashboardBtn.setText("Dashboard");
        orDashboardBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        orDashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orDashboardBtnActionPerformed(evt);
            }
        });

        orAttendanceBtn.setBackground(new java.awt.Color(255, 204, 204));
        orAttendanceBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orAttendanceBtn.setForeground(new java.awt.Color(255, 102, 102));
        orAttendanceBtn.setText("Attendance Log");
        orAttendanceBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        orAttendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orAttendanceBtnActionPerformed(evt);
            }
        });

        orOTRequestBtn.setBackground(new java.awt.Color(255, 204, 204));
        orOTRequestBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orOTRequestBtn.setForeground(new java.awt.Color(255, 102, 102));
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
        adLogout4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(18, 18, 18)
                .addComponent(orAttendanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orOTRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adLogout4)
                .addGap(61, 61, 61))
        );

        attendanceLogTable.setBackground(new java.awt.Color(255, 204, 204));
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
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
        );

        managerPanel.add(otrequest, "card3");
        getContentPane().add(otrequest, "otrequest");

        attendancelog.setBackground(new java.awt.Color(255, 204, 204));
        attendancelog.setForeground(new java.awt.Color(255, 102, 102));

        alNavPanel.setBackground(new java.awt.Color(255, 204, 204));
        alNavPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        atDashboardBtn.setBackground(new java.awt.Color(255, 204, 204));
        atDashboardBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        atDashboardBtn.setForeground(new java.awt.Color(255, 102, 102));
        atDashboardBtn.setText("Dashboard");
        atDashboardBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        atDashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atDashboardBtnActionPerformed(evt);
            }
        });

        atAttendanceBtn.setBackground(new java.awt.Color(255, 204, 204));
        atAttendanceBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        atAttendanceBtn.setForeground(new java.awt.Color(255, 102, 102));
        atAttendanceBtn.setText("Attendance Log");
        atAttendanceBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        atAttendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atAttendanceBtnActionPerformed(evt);
            }
        });

        atOTRequestBtn.setBackground(new java.awt.Color(255, 204, 204));
        atOTRequestBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        atOTRequestBtn.setForeground(new java.awt.Color(255, 102, 102));
        atOTRequestBtn.setText("Overtime Request");
        atOTRequestBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        atOTRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atOTRequestBtnActionPerformed(evt);
            }
        });

        navMS1.setBackground(new java.awt.Color(255, 102, 102));
        navMS1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navMS1.setForeground(new java.awt.Color(255, 102, 102));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adLogout5)
                .addGap(52, 52, 52))
        );

        atEmployeeTable.setBackground(new java.awt.Color(255, 204, 204));
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
        jLabelEmployeesDirectory1.setText("Employee Directory");

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

        atClrBtn.setBackground(new java.awt.Color(255, 204, 204));
        atClrBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        atClrBtn.setForeground(new java.awt.Color(255, 102, 102));
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

        atSaveBtn.setBackground(new java.awt.Color(255, 204, 204));
        atSaveBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        atSaveBtn.setForeground(new java.awt.Color(255, 102, 102));
        atSaveBtn.setText("Save");
        atSaveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        atSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atSaveBtnActionPerformed(evt);
            }
        });

        otStatusCB.setBackground(new java.awt.Color(255, 204, 204));
        otStatusCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otStatusCBActionPerformed(evt);
            }
        });

        employeeCB.setBackground(new java.awt.Color(255, 204, 204));
        employeeCB.setSelectedIndex(-1);
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
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
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
                                            .addComponent(workdateDC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPosition1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(workdateDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelSalary1)
                                    .addComponent(timeINTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelStatus1)
                                    .addComponent(timeOutTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(attendancelogLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(atSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(atClrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(attendancelogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDateHired1)
                            .addComponent(otStatusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEmployeesDirectory1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        managerPanel.add(attendancelog, "card4");
        getContentPane().add(attendancelog, "attendancelog");

        getContentPane().add(managerPanel, "card4");

        employeePanel.setLayout(new java.awt.CardLayout());

        viewpayslip.setBackground(new java.awt.Color(255, 204, 204));

        dhNavPanel2.setBackground(new java.awt.Color(255, 204, 204));
        dhNavPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        dhNavPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dhNavPanel2KeyPressed(evt);
            }
        });

        vpViewPayslipBtn.setBackground(new java.awt.Color(255, 204, 204));
        vpViewPayslipBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        vpViewPayslipBtn.setForeground(new java.awt.Color(255, 102, 102));
        vpViewPayslipBtn.setText("View Payslip");
        vpViewPayslipBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        vpViewPayslipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpViewPayslipBtnActionPerformed(evt);
            }
        });

        vpRequestOTBtn.setBackground(new java.awt.Color(255, 204, 204));
        vpRequestOTBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        vpRequestOTBtn.setForeground(new java.awt.Color(255, 102, 102));
        vpRequestOTBtn.setText("Request Overtime");
        vpRequestOTBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        vpRequestOTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpRequestOTBtnjButton12ActionPerformed(evt);
            }
        });

        navLbl2.setBackground(new java.awt.Color(255, 102, 102));
        navLbl2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navLbl2.setForeground(new java.awt.Color(255, 102, 102));
        navLbl2.setText("Navigation Panel");

        adLogout6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        adLogout6.setForeground(java.awt.Color.red);
        adLogout6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adLogout6.setText("LOG-OUT");
        adLogout6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adLogout6)
                .addGap(38, 38, 38))
        );

        payslipTable.setBackground(new java.awt.Color(255, 153, 153));
        payslipTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pay Period", "Basic", "OT Pay", "13th Month", "Total Earnings ", "Tax", "Late Deduction", "Net Salary", "Status"
            }
        ));
        payslipTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        jScrollPane9.setViewportView(payslipTable);

        titlePanel2.setBackground(new java.awt.Color(255, 204, 204));
        titlePanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        titleLbl2.setBackground(new java.awt.Color(0, 51, 255));
        titleLbl2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLbl2.setForeground(new java.awt.Color(255, 102, 102));
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
                .addGap(0, 19, Short.MAX_VALUE))
        );

        overviewLbl2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        overviewLbl2.setForeground(new java.awt.Color(255, 102, 102));
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
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)))
        );
        viewpayslipLayout.setVerticalGroup(
            viewpayslipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpayslipLayout.createSequentialGroup()
                .addComponent(titlePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewpayslipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dhNavPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(viewpayslipLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(overviewLbl2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(104, Short.MAX_VALUE))))
        );

        employeePanel.add(viewpayslip, "card2");
        getContentPane().add(viewpayslip, "viewpayslip");

        requestOt.setBackground(new java.awt.Color(255, 204, 204));
        requestOt.setForeground(new java.awt.Color(255, 102, 102));

        navPanelGP2.setBackground(new java.awt.Color(255, 204, 204));
        navPanelGP2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));

        roPayslipBtn.setBackground(new java.awt.Color(255, 204, 204));
        roPayslipBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        roPayslipBtn.setForeground(new java.awt.Color(255, 102, 102));
        roPayslipBtn.setText("View Payslip");
        roPayslipBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        roPayslipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roPayslipBtnActionPerformed(evt);
            }
        });

        roRequestOvertimeBtn.setBackground(new java.awt.Color(255, 204, 204));
        roRequestOvertimeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        roRequestOvertimeBtn.setForeground(new java.awt.Color(255, 102, 102));
        roRequestOvertimeBtn.setText("Request Overtime");
        roRequestOvertimeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 4, true));
        roRequestOvertimeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roRequestOvertimeBtnActionPerformed(evt);
            }
        });

        navGP2.setBackground(new java.awt.Color(255, 102, 102));
        navGP2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        navGP2.setForeground(new java.awt.Color(255, 102, 102));
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
                        .addGap(63, 63, 63)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adLogout7)
                .addGap(45, 45, 45))
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
                .addGap(119, 119, 119)
                .addComponent(jLabelGPHeader2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gpHeader2Layout.setVerticalGroup(
            gpHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gpHeader2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabelGPHeader2)
                .addContainerGap())
        );

        jLabelGeneratePayroll2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelGeneratePayroll2.setForeground(new java.awt.Color(255, 102, 102));
        jLabelGeneratePayroll2.setText("REQUEST OVERTIME ");

        jLabel1.setText("Date:");

        jLabel3.setText("OT Hours");

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setText("REQUEST");

        javax.swing.GroupLayout requestOtLayout = new javax.swing.GroupLayout(requestOt);
        requestOt.setLayout(requestOtLayout);
        requestOtLayout.setHorizontalGroup(
            requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gpHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(requestOtLayout.createSequentialGroup()
                .addComponent(navPanelGP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGeneratePayroll2)
                    .addGroup(requestOtLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner1)))
                    .addGroup(requestOtLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton1)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        requestOtLayout.setVerticalGroup(
            requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestOtLayout.createSequentialGroup()
                .addComponent(gpHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navPanelGP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(requestOtLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelGeneratePayroll2)
                        .addGap(18, 18, 18)
                        .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(requestOtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(235, Short.MAX_VALUE))))
        );

        employeePanel.add(requestOt, "card3");
        getContentPane().add(requestOt, "requestOt");

        getContentPane().add(employeePanel, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void msSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msSaveBtnActionPerformed

        String studentID = studentid.getSelectedItem().toString().split(" - ")[0];
        String courseID = positionCB.getSelectedItem().toString().split(" - ")[0];
        String selectedSemester = statusCB.getSelectedItem().toString();
        String sy = salaryTxt.getText();

        if (sy.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter School Year");
            return;
        }

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String serverName = "jdbc:sqlserver://localhost:1433;" +
            "databaseName = TestDB;" +
            "user = sa;" +
            "password = 12345;"+
            "encypt = true;"+
            "trustServerCertificate = true;";

            Connection con = DriverManager.getConnection(serverName);

            String sql = "INSERT INTO Enrollment (student_id, course_id, semester, year) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, studentID);
            pst.setString(2, courseID);
            pst.setString(3, selectedSemester);
            pst.setString(4, sy);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Course Assigned Successfully!");
            loadEnrollment();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }

    }//GEN-LAST:event_msSaveBtnActionPerformed

    private void msClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msClrBtnActionPerformed
        // TODO add your handling code here:
        studentid.setSelectedIndex(-1);
        positionCB.setSelectedIndex(-1);
        statusCB.setSelectedIndex(-1);
        salaryTxt.setText("");
    }//GEN-LAST:event_msClrBtnActionPerformed

    private void msGeneratePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msGeneratePayrollActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "generatepayroll");
    }//GEN-LAST:event_msGeneratePayrollActionPerformed

    private void msManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msManageStaffActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "managestaff");
    }//GEN-LAST:event_msManageStaffActionPerformed

    private void msAdminDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msAdminDashboardActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "adminDashboard");
    }//GEN-LAST:event_msAdminDashboardActionPerformed

    private void generatePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePayrollActionPerformed
        // TODO add your handling code here:
        String Ccode = coursecode.getText();
        String CTitle = coursetitle.getText();
        String Cunit = units.getText();

        if (Ccode.isEmpty() || CTitle.isEmpty() || Cunit.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Please fill up all fields");
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String serverName = "jdbc:sqlserver://localhost:1433;" +
            "databaseName = TestDB;" +
            "user = sa;" +
            "password = 12345;"+
            "encypt = true;"+
            "trustServerCertificate = true;";

            Connection con = DriverManager.getConnection(serverName);

            String sql = "INSERT INTO coursetable (course_code, course_title, units) VALUES ( ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, coursecode.getText());
            pst.setString(2, coursetitle.getText());
            pst.setString(3, units.getText());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Course Saved!");
            loadCourse();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_generatePayrollActionPerformed

    private void finalizePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizePayrollActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "viewpayslip");
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
    }//GEN-LAST:event_atAttendanceBtnActionPerformed

    private void atOTRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atOTRequestBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "otrequest");
    }//GEN-LAST:event_atOTRequestBtnActionPerformed

    private void atClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atClrBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atClrBtnActionPerformed

    private void atSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atSaveBtnActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_vpViewPayslipBtnActionPerformed

    private void vpRequestOTBtnjButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpRequestOTBtnjButton12ActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "requestOt");
    }//GEN-LAST:event_vpRequestOTBtnjButton12ActionPerformed

    private void roPayslipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roPayslipBtnActionPerformed
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "viewpayslip");
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
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout1MouseClicked

    private void adLogout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout2MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout2MouseClicked

    private void adLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogoutMouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogoutMouseClicked

    private void adLogout3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout3MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout3MouseClicked

    private void adLogout4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout4MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout4MouseClicked

    private void adLogout5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout5MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout5MouseClicked

    private void adLogout6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout6MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout6MouseClicked

    private void adLogout7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adLogout7MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), "login");
    }//GEN-LAST:event_adLogout7MouseClicked
    public void loadStudents(){
         try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           
           String url = "jdbc:sqlserver://localhost:1433;" +
                               "databaseName = TestDB;" +
                               "user = sa;" +
                               "password = 12345;"+
                               "encypt = true;"+
                               "trustServerCertificate = true;";
           Connection con = DriverManager.getConnection(url);
           
           String loadQuery = "SELECT student_id, first_name, last_name, program, year_level FROM students";
           PreparedStatement ps = con.prepareStatement(loadQuery);
           ResultSet rs = ps.executeQuery();
           DefaultTableModel model = (DefaultTableModel)studtable.getModel();
           model.setRowCount(0);
          
           while(rs.next()){
               String[]data = {rs.getString("student_id"),rs.getString("first_name"),rs.getString("last_name"), rs.getString("program"), rs.getString("year_level")};           
               model.addRow(data);
           }
        
     }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String serverName = "jdbc:sqlserver://localhost:1433;" +
                            "databaseName=TestDB;" +
                            "user=sa;" +
                            "password=12345;" +
                            "encrypt=true;" +
                            "trustServerCertificate=true;";

        Connection con = DriverManager.getConnection(serverName);

        String loadQuery = "SELECT e.student_id, s.first_name, e.course_id, c.course_title, e.semester, e.year " +
                           "FROM enrollment e " +
                           "JOIN Students s ON e.student_id = s.student_id " +
                           "JOIN coursetable c ON e.course_id = c.course_id";

        PreparedStatement ps = con.prepareStatement(loadQuery);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        model.setRowCount(0);

        while (rs.next()) {

            String studentDisplay = rs.getString("student_id") + " - " + rs.getString("first_name");
            String courseDisplay = rs.getString("course_id") + " - " + rs.getString("course_title");

            String[] data = {
                studentDisplay,
                courseDisplay,
                rs.getString("semester"),
                rs.getString("year")
            };

            model.addRow(data);
        }

        // Load Students
        ResultSet rsStud = con.createStatement().executeQuery("SELECT student_id, first_name FROM Students");
        while (rsStud.next()) {
            studentid.addItem(rsStud.getString("student_id") + " - " + rsStud.getString("first_name"));
        }

        // Load Courses
        ResultSet rsCourse = con.createStatement().executeQuery("SELECT course_id, course_title FROM coursetable");
        while (rsCourse.next()) {
            positionCB.addItem(rsCourse.getString("course_id") + " - " + rsCourse.getString("course_title"));
        }

        // Semester
        statusCB.addItem("1st Semester");
        statusCB.addItem("2nd Semester");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}

        public void loadCourse(){
                 try {
                   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                   String serverName = "jdbc:sqlserver://localhost:1433;" +
                                       "databaseName = TestDB;" +
                                       "user = sa;" +
                                       "password = 12345;"+
                                       "encypt = true;"+
                                       "trustServerCertificate = true;";
                   Connection con = DriverManager.getConnection(serverName);

                   String loadQuery = "SELECT course_id, course_code, course_title, units FROM coursetable";
                   PreparedStatement ps = con.prepareStatement(loadQuery);
                   ResultSet rs = ps.executeQuery();
                   DefaultTableModel model = (DefaultTableModel)payrollTable.getModel();
                   model.setRowCount(0);

                   while(rs.next()){
                       String[]data = {rs.getString("course_id"),rs.getString("course_code"),rs.getString("course_title"), rs.getString("units")};           
                       model.addRow(data);
                   }

             }catch(Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage());
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
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
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
    private javax.swing.JSpinner jSpinner1;
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
    private javax.swing.JButton msGeneratePayroll;
    private javax.swing.JPanel msHeader;
    private javax.swing.JPanel msHeader1;
    private javax.swing.JButton msManageStaff;
    private javax.swing.JButton msSaveBtn;
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
    private javax.swing.JButton orAttendanceBtn;
    private javax.swing.JButton orDashboardBtn;
    private javax.swing.JPanel orNavPanel;
    private javax.swing.JButton orOTRequestBtn;
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
    private javax.swing.JPanel requestOt;
    private javax.swing.JButton roPayslipBtn;
    private javax.swing.JButton roRequestOvertimeBtn;
    private javax.swing.JComboBox<String> roleCB;
    private javax.swing.JTextField salaryTxt;
    private com.toedter.calendar.JDateChooser selectDate;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JTable studtable;
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
    private com.toedter.calendar.JDateChooser workdateDC;
    // End of variables declaration//GEN-END:variables

}
