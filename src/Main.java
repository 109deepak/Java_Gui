
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Main extends JFrame implements ActionListener {

    List<Details> list = new ArrayList<Details>();
    DefaultTableModel model;
    JScrollPane scrollpane;
    Object[][] data;
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

