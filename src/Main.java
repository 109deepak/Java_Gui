
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Main extends JFrame  {

    List<Details> list = new ArrayList<Details>();
    DefaultTableModel model;
    JScrollPane scrollpane;
    Object[][] data;


    JLabel jLaddress, jLaname, jLhome, jLoffice;
    JPanel jPanel1;
    JScrollPane jScrollPane1;
    JTextArea jTextArea1; // Variables declaration - do not modify
    JTextField JTName, jThome, jToffice;
    JButton jButton1, jButton2;
    JCheckBox jCHome, jCOffice;



    // Constructor
    public Main() {
        initComponents();
        //Set the visibility of the two text field as false
        jLoffice.setEnabled(false);
        jToffice.setEnabled(false);
        jLhome.setEnabled(false);
        jThome.setEnabled(false);

    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jLaname = new JLabel();
        JTName = new JTextField();
        jThome = new JTextField();
        jLhome = new JLabel();
        jCHome = new JCheckBox();
        jCOffice = new JCheckBox();
        jLaddress = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLoffice = new JLabel();
        jToffice = new JTextField();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compute Geeks Pizza Shop");

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLaname.setText("Name");

        jLhome.setText("Enter Home  Address");

        jCHome.setText("Home Address");
        jCHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCHomeActionPerformed(evt);
            }
        });

        jCOffice.setText("Office Address");
        jCOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCOfficeActionPerformed(evt);
            }
        });

        jLaddress.setText("Select Address");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLoffice.setText("Enter Office  Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLoffice, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jToffice)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLhome, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLaname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLaddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                                                .addGap(18, 46, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(JTName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jCHome)
                                                                .addGap(50, 50, 50)
                                                                .addComponent(jCOffice))
                                                        .addComponent(jThome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(32, 32, 32))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLaname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JTName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCHome)
                                        .addComponent(jCOffice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLhome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jThome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLoffice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jToffice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    //method to display the details
    private void jCHomeActionPerformed(java.awt.event.ActionEvent evt) {
        if(jCHome.isSelected()==true){
            jLhome.setEnabled(true);
            jThome.setEnabled(true);
        }else{
            jLhome.setEnabled(false);
            jThome.setEnabled(false);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        reset();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        save_the_details();
    }
    private void jCOfficeActionPerformed(java.awt.event.ActionEvent evt) {
        if(jCOffice.isSelected()==true){
            jToffice.setEnabled(true);
            jLoffice.setEnabled(true);
        }else{
            jToffice.setEnabled(false);
            jLoffice.setEnabled(false);
        }
    }

    private void save_the_details() {

        String name = JTName.getText();
        String Home = jThome.getText();
        String Office = jToffice.getText();


        list.add(new Details(name, Home, Office));
        addRows();


    }
//method to reset the details
    private void reset(){
        JTName.setText("");
        jThome.setText("");
        jToffice.setText("");
        jThome.setEnabled(false);
        jToffice.setEnabled(false);
        jCOffice.setSelected(false);
        jCHome.setSelected(false);
}

    public void addRows() {
        Object[] row =null;
        Details str = list.get(list.size()-1);
        String string =str.Name + "," + str.OfficeAddress + "," + str.HomeAddress ;
        jTextArea1.setText(string);
        row =string.split(",");
        model.insertRow(0, row);

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


}

class Details {
    String Name;
    String OfficeAddress;
    String HomeAddress;


    Details(String name, String Haddress, String Oaddress) {
        this.Name = name;
        this.OfficeAddress = Haddress;
        this.HomeAddress = Oaddress;


    }
}

