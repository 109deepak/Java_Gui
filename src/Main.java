import java.awt.event.ActionListener;
import  javax.swing.*;


public class Main extends JFrame implements ActionListener {

    //Declare variables to be used
    JLabel PizzaTittle, nameLabel, addressLabel, contactLabel;
    JTextField idField, nameField, addressField, contactField;
    JButton save, clear;
    //List to hold the details
    List<Details> list = new ArrayList<Details>();

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
}
