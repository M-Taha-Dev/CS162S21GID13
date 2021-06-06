/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class BloodBankFrame extends javax.swing.JFrame {

    /**
     * Objects with which the frame will interact
     * BloodRequestLog, DonorLog, TransfusionLog
     */
    
    
    /**
     * functions  to populate tables
     */
    
    void createBloodRequesttable(Stack<BloodRequest> bloodrequestStack)
    {
        if(bloodrequestStack.isEmpty())
        {
            Object rowData[] = new Object[5]; 
            DefaultTableModel model = (DefaultTableModel) this.BloodRequestTable.getModel();
            model.getDataVector().removeAllElements();
            
            rowData[1] = "No Data";
            rowData[2] = "Available";
            
            model.addRow(rowData);
                   
        }
        else
        {
            Object rowData[] = new Object[5];
            DefaultTableModel model = (DefaultTableModel) this.BloodRequestTable.getModel();
            model.getDataVector().removeAllElements();
            for (int i = 0; i < bloodrequestStack.size(); i++) 
            {
                BloodRequest req = bloodrequestStack.pop();
                
                rowData[0] = req.getReciepientName();
                rowData[1] = req.getBloodType();
                rowData[2] = req.getAmountofBlood();
                rowData[3] = req.getTimestamp() + "";
                rowData[4] = req.getStatus();
                
                model.addRow(rowData);
            }
        }
    }
    
    
    void createTransfusionTable(Stack<Transfusion> stack)
    {
        if(stack.isEmpty())
        {
            Object rowData[] = new Object[7]; 
            DefaultTableModel model = (DefaultTableModel) this.BloodRequestTable.getModel();
            model.getDataVector().removeAllElements();
            
            rowData[1] = "No Data";
            rowData[2] = "Available";
            
            model.addRow(rowData);
                   
        }
        else
        {
            Object rowData[] = new Object[7];
            DefaultTableModel model = (DefaultTableModel) this.BloodRequestTable.getModel();
            model.getDataVector().removeAllElements();
            for (int i = 0; i < stack.size(); i++) 
            {
                Transfusion req = stack.pop();
                rowData[0] = "" + (i+1);
                rowData[1] = req.getDonor().getName();
                rowData[2] = req.getDonor().getCnic();
                rowData[3] = req.getDonor().getBloodType();
                rowData[4] = req.getDonor().getPhoneNumber();
                rowData[5] = req.getTimeofTransfusion();
                rowData[6] = req.getReciepientName();
                model.addRow(rowData);
            }
        }
    }
    
    
    
    /**
     * Input validation Functions
     */
    
    public boolean CNICinput(String str)
    {
        boolean valid = false;
		
		if(str.length() == 13)
		{
			char array [] = str.toCharArray();
			
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] >= '0' && array[i] <= '9')
				{
					valid = true;
				}
				else
				{
					valid = false;
					break;
				}
			}
		}
                
                else
               {
                   JOptionPane.showMessageDialog(null, "Invalid Input! \n You Have Entered Wrong Input!", "Input CNIC Failure", 0);
               }
		
		
		return valid;
    }
    
    public boolean emailInput(String str)
    {
        boolean valid = false;
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        
        Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(str);
        
        valid = matcher.find();
        
        if(!valid)
        {
            JOptionPane.showMessageDialog(null, "Invalid Input! \n You Have Entered Wrong Format! \n Please Enter a Valid Email Address", "Input Email Failure", 0);
        }

        return valid;
    }
    
    public boolean PhoneNumInput(String str)
    {
        boolean valid = false;
        char [] array = str.toCharArray();
        
        if(array.length == 11)
        {
            if(array[0] == '0')
            {
                for (int i = 1; i < array.length; i++) 
                {
                    if(array[i] >= '0' && array[i] <= '9')
                    {
                        valid = true;
                    }
                    else
                    {
                        valid = false;
                        break;
                    }

                }
            }
            else
            {
                valid = false;
            }
            
            
        }
        else
        {
            valid = false;
        }
        
        
        
        if(!valid)
        {
            JOptionPane.showMessageDialog(null, "Invalid Input! \n You Have Entered Wrong Format!", "Input Phone Number Failure", 0);
        }
        
        
        return valid;
    }
        
    public boolean BloodGroupInput(String str)
    {
        boolean valid = false;
        
        if(str.equals("A+") || str.equals("A-") || str.equals("B+") || str.equals("B-") || str.equals("O+") || str.equals("O-")
                || str.equals("AB+") || str.equals("AB-"))
        {
            valid = true;
        }
        
        if(!valid)
        {
            JOptionPane.showMessageDialog(null, "Invalid Input! \n You Have Entered Wrong Format!", "Input ID Failure", 0);
        }
        
        return valid;
    }   
    
    public boolean nameInput(String str)
    {
        boolean valid = false;
        char [] arr = str.toCharArray();
        
        for (int i = 0; i < arr.length; i++) 
        {
            if( (arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z') || arr[i] == ' ' )
            {
                valid = true;
            }
            else
            {
                valid = false;
                break;
            }
        }
        if(!valid)
        {
            JOptionPane.showMessageDialog(null, "Invalid Input! \n Only Characters and Space is allowed", "Input Name Failure", 0);
        }
        
        return valid;
    }
    
    /**
     * Creates new form BloodBankFrame
     */
    public BloodBankFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BloodReqPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TransfusionHistoryPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TransfusionHistoryLabel = new javax.swing.JLabel();
        AddDonorPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BloodRequestTable = new javax.swing.JTable();
        ApproveRequestPanel = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        DenyRequestPanel = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        lastnameField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        SignUpBtn = new javax.swing.JButton();
        PhoneNumField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        CNICField = new javax.swing.JTextField();
        BloodGroupField = new javax.swing.JTextField();
        FirstnameField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressField = new javax.swing.JTextArea();
        jSeparator24 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TransfusionTable = new javax.swing.JTable();
        donornameSearchField = new javax.swing.JTextField();
        searchTransfusion_ByDonor = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs162s21gid13/Github icon_1.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 84));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Home");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 73));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 390, -1));

        BloodReqPanel.setBackground(new java.awt.Color(255, 0, 0));
        BloodReqPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BloodReqPanelMouseClicked(evt);
            }
        });
        BloodReqPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs162s21gid13/RequestIcon.png"))); // NOI18N
        BloodReqPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 84));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Blood Requests");
        BloodReqPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 190, 73));

        jPanel3.add(BloodReqPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 390, -1));

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Logout");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 200, 73));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs162s21gid13/Logout Rounded Up icon.png"))); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 84));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 390, -1));

        TransfusionHistoryPanel.setBackground(new java.awt.Color(255, 0, 0));
        TransfusionHistoryPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransfusionHistoryPanelMouseClicked(evt);
            }
        });
        TransfusionHistoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs162s21gid13/TransfusionHistoryIcon.png"))); // NOI18N
        TransfusionHistoryPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 84));

        TransfusionHistoryLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TransfusionHistoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        TransfusionHistoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransfusionHistoryLabel.setText("Transfusion History");
        TransfusionHistoryPanel.add(TransfusionHistoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 240, 73));

        jPanel3.add(TransfusionHistoryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 390, -1));

        AddDonorPanel.setBackground(new java.awt.Color(255, 0, 0));
        AddDonorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddDonorPanelMouseClicked(evt);
            }
        });
        AddDonorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs162s21gid13/addDonor.png"))); // NOI18N
        AddDonorPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 84));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Add Donor");
        AddDonorPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 200, 73));

        jPanel3.add(AddDonorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 480, 390, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 900));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Home");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 170, 110));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 935, -1));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel23MousePressed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setText("Search Donor");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs162s21gid13/SearchIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(101, 101, 101))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addGap(49, 49, 49))
        );

        jPanel2.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 380, 260));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel24MousePressed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs162s21gid13/InboxIcon.png"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel42.setText("Inbox");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel42)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel42)
                .addGap(45, 45, 45)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 386, 260));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 840));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(51, 102, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Blood Request");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 190, 110));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 935, -1));

        BloodRequestTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Recipient Name", "Blood Group", "Quantity", "Date and Time", "Status"
            }
        ));
        BloodRequestTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BloodRequestTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(BloodRequestTable);

        jPanel9.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 580, 640));

        ApproveRequestPanel.setBackground(new java.awt.Color(255, 255, 255));
        ApproveRequestPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));
        ApproveRequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApproveRequestPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ApproveRequestPanelMousePressed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel40.setText("Approve Request");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs162s21gid13/Approval icon.png"))); // NOI18N

        javax.swing.GroupLayout ApproveRequestPanelLayout = new javax.swing.GroupLayout(ApproveRequestPanel);
        ApproveRequestPanel.setLayout(ApproveRequestPanelLayout);
        ApproveRequestPanelLayout.setHorizontalGroup(
            ApproveRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApproveRequestPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ApproveRequestPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addGap(71, 71, 71))
        );
        ApproveRequestPanelLayout.setVerticalGroup(
            ApproveRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApproveRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(ApproveRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        DenyRequestPanel.setBackground(new java.awt.Color(255, 255, 255));
        DenyRequestPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));
        DenyRequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DenyRequestPanelMousePressed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel44.setText("Deny Request");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs162s21gid13/Cancel icon 2.png"))); // NOI18N

        javax.swing.GroupLayout DenyRequestPanelLayout = new javax.swing.GroupLayout(DenyRequestPanel);
        DenyRequestPanel.setLayout(DenyRequestPanelLayout);
        DenyRequestPanelLayout.setHorizontalGroup(
            DenyRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DenyRequestPanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(40, 40, 40))
            .addGroup(DenyRequestPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DenyRequestPanelLayout.setVerticalGroup(
            DenyRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DenyRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(DenyRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 580, 260, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        jTabbedPane1.addTab("tab2", jPanel8);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameFieldActionPerformed(evt);
            }
        });
        jPanel21.add(lastnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 240, 50));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Last Name");
        jPanel21.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, 28));

        jPanel22.setBackground(new java.awt.Color(51, 102, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Add Donor");
        jPanel22.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 170, 110));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 940, 110));

        SignUpBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SignUpBtn.setText("Sign Up");
        SignUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpBtnMouseClicked(evt);
            }
        });
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });
        jPanel21.add(SignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 720, 159, 64));

        PhoneNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumFieldActionPerformed(evt);
            }
        });
        jPanel21.add(PhoneNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 240, 50));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Blood Group");
        jPanel21.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, 28));

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        jPanel21.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 240, 50));

        CNICField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNICFieldActionPerformed(evt);
            }
        });
        jPanel21.add(CNICField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 240, 50));

        BloodGroupField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodGroupFieldActionPerformed(evt);
            }
        });
        jPanel21.add(BloodGroupField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 240, 50));

        FirstnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnameFieldActionPerformed(evt);
            }
        });
        jPanel21.add(FirstnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 240, 50));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("First Name");
        jPanel21.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 28));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Email");
        jPanel21.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 28));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("CNIC");
        jPanel21.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, 28));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("Phone Number");
        jPanel21.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, 28));

        jSeparator17.setBackground(new java.awt.Color(51, 102, 255));
        jPanel21.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 240, 17));

        jSeparator18.setBackground(new java.awt.Color(51, 102, 255));
        jPanel21.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 630, 260, 20));

        jSeparator19.setBackground(new java.awt.Color(51, 102, 255));
        jPanel21.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 240, 17));

        jSeparator20.setBackground(new java.awt.Color(51, 102, 255));
        jPanel21.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 240, 17));

        jSeparator21.setBackground(new java.awt.Color(51, 102, 255));
        jPanel21.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 240, 17));

        jSeparator22.setBackground(new java.awt.Color(51, 102, 255));
        jPanel21.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 240, 17));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Address");
        jPanel21.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, 28));

        AddressField.setColumns(20);
        AddressField.setRows(5);
        jScrollPane1.setViewportView(AddressField);

        jPanel21.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 260, 210));

        jSeparator24.setBackground(new java.awt.Color(51, 102, 255));
        jPanel21.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 240, 20));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel11);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(51, 102, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Transfusion History");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 240, 110));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 935, -1));

        TransfusionTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sr No.", "Name", "CNIC", "Blood Group", "Contact Number", "Date and Time", "Recipient Namel"
            }
        ));
        TransfusionTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TransfusionTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(TransfusionTable);

        jPanel16.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 680, 270));

        donornameSearchField.setText("Search Donor");
        donornameSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donornameSearchFieldActionPerformed(evt);
            }
        });
        jPanel16.add(donornameSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 260, 40));

        searchTransfusion_ByDonor.setText("Search");
        searchTransfusion_ByDonor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTransfusion_ByDonorMouseClicked(evt);
            }
        });
        jPanel16.add(searchTransfusion_ByDonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 110, 40));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel14);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(51, 102, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Inbox");
        jPanel19.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 190, 110));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 935, -1));

        jButton7.setText("Mark All as Read");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 140, 43));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Message", "Time"
            }
        ));
        jTable5.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(jTable5);

        jPanel18.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, 240));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel15);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 930, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void BloodReqPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BloodReqPanelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        this.createBloodRequesttable(BloodrequestLog.getInstance().viewBloodRequestLog());
    }//GEN-LAST:event_BloodReqPanelMouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void lastnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameFieldActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void PhoneNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void CNICFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNICFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNICFieldActionPerformed

    private void BloodGroupFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodGroupFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodGroupFieldActionPerformed

    private void FirstnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameFieldActionPerformed

    private void TransfusionHistoryPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransfusionHistoryPanelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        createTransfusionTable(TransfusionLog.getInstance().viewTransfusionHistory());
    }//GEN-LAST:event_TransfusionHistoryPanelMouseClicked

    private void AddDonorPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddDonorPanelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_AddDonorPanelMouseClicked

    private void jPanel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel23MousePressed

    private void jPanel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel24MousePressed

    private void donornameSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donornameSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donornameSearchFieldActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ApproveRequestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApproveRequestPanelMousePressed
       
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_ApproveRequestPanelMousePressed

    private void DenyRequestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DenyRequestPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenyRequestPanelMousePressed

    private void SignUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpBtnMouseClicked
        
      boolean inputsValid = false;
      
      inputsValid = this.nameInput(this.FirstnameField.getText());
      
        if(inputsValid)
        {
            inputsValid = this.nameInput(this.lastnameField.getText());
            
            if(inputsValid)
            {
                inputsValid = this.emailInput(this.emailField.getText());
                
                if(inputsValid)
                {
                    inputsValid = this.CNICinput(this.CNICField.getText());
                    
                    if(inputsValid)
                    {
                        inputsValid = this.PhoneNumInput(this.PhoneNumField.getText());
                        
                        if(inputsValid)
                        {
                            inputsValid = BloodGroupInput(this.BloodGroupField.getText());
                            
                            if(inputsValid)
                            {
                                Donor donor = new Donor();
                                
                                donor.setName(this.FirstnameField.getText() + this.lastnameField.getText());
                                donor.setAddress(this.AddressField.getText());
                                
                                donor.setEmail(this.emailField.getText());
                                donor.setPhoneNumber(this.PhoneNumField.getText());
                                
                                donor.setBloodType(this.BloodGroupField.getText());
                                donor.setCnic(this.CNICField.getText());
                            }
                        }
                    }
                    
                }
            }
        }
      
      
    }//GEN-LAST:event_SignUpBtnMouseClicked

    private void searchTransfusion_ByDonorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTransfusion_ByDonorMouseClicked
        String donorName = this.donornameSearchField.getText();
        
        Stack<Transfusion> stack = new Stack<Transfusion>();
        
        for (int i = 0; i < TransfusionLog.getInstance().getTransfusionLog().size(); i++) 
        {
            Transfusion get = TransfusionLog.getInstance().getTransfusionObj(i);
            if (get.getDonor().getName().equals(donorName)) 
            {
                stack.push(get);
            }
        }
        
        createTransfusionTable(stack);
        
    }//GEN-LAST:event_searchTransfusion_ByDonorMouseClicked

    private void ApproveRequestPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApproveRequestPanelMouseClicked
        
    }//GEN-LAST:event_ApproveRequestPanelMouseClicked

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
            java.util.logging.Logger.getLogger(BloodBankFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodBankFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodBankFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodBankFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodBankFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddDonorPanel;
    private javax.swing.JTextArea AddressField;
    private javax.swing.JPanel ApproveRequestPanel;
    private javax.swing.JTextField BloodGroupField;
    private javax.swing.JPanel BloodReqPanel;
    private javax.swing.JTable BloodRequestTable;
    private javax.swing.JTextField CNICField;
    private javax.swing.JPanel DenyRequestPanel;
    private javax.swing.JTextField FirstnameField;
    private javax.swing.JTextField PhoneNumField;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JLabel TransfusionHistoryLabel;
    private javax.swing.JPanel TransfusionHistoryPanel;
    private javax.swing.JTable TransfusionTable;
    private javax.swing.JTextField donornameSearchField;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JButton searchTransfusion_ByDonor;
    // End of variables declaration//GEN-END:variables
}
