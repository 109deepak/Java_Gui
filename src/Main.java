
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

