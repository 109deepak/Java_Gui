
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class Main extends JFrame implements  {

    List<Details> list = new ArrayList<Details>();
    DefaultTableModel model;
    JScrollPane scrollpane;
    Object[][] data;

    // Variables declaration - do not modify
    JTextField JTName,jThome,jToffice;
    JButton jButton1, jButton2;
    JCheckBox jCHome, jCOffice;

    JLabel jLaddress, jLaname, jLhome, jLoffice;
    JPanel jPanel1;
    JScrollPane jScrollPane1;
    JTextArea jTextArea1; // Variables declaration - do not modify
    JTextField JTName,jThome,jToffice;
    JButton jButton1, jButton2;
    JCheckBox jCHome, jCOffice;

    JLabel jLaddress, jLaname, jLhome, jLoffice;
    JPanel jPanel1;
    JScrollPane jScrollPane1;
    JTextArea jTextArea1;
    public NewJFrame() {
        initComponents();

        //Set the visibility of the two text field as false

        jLoffice.setEnabled(false);
        jToffice.setEnabled(false);
        jLhome.setEnabled(false);
        jThome.setEnabled(false);



    }

}

    class Details {
        String Name;
        String OfficeAddress;
        String HomeAddress;


        Details(String name, String Haddress, String Oaddress) {
            this.Name = id;
            this.OfficeAddress = name;
            this.HomeAddress = Oaddress;


        }
    }

