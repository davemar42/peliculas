import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Mispelis extends JFrame {
    private JPanel Panel1;
    private JLabel label;
    private JTextField textoedit;
    private JButton agregar;
    private JLabel Pelislabel;
    private JComboBox combopeliculas;
    private ArrayList<String>mispeliculas=new ArrayList<String>();
    private String peli;

    public Mispelis( ) {

        setContentPane(Panel1);

        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 yoagrego(mispeliculas,peli,combopeliculas);
            }
        });
    }
    public ArrayList<String> yoagrego(ArrayList<String>mispeliculas,String peli,JComboBox combopeliculas){
        peli=textoedit.getText();
        textoedit.setText("");
        combopeliculas.addItem(peli);
        return mispeliculas;
    }

}
