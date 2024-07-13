import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class tela extends JPanel{

    public tela(){
        JFrame jf = new JFrame();
        jf.setSize(800,500);
        jf.setTitle("Faturamento");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setBackground(new Color(9,9,9));

        JLabel text = new JLabel("Digite aqui:");
        text.setBounds(100, 100, 100, 100);
        text.setFont(new Font("Arial", Font.BOLD, 15));


        jf.add(text);
        jf.setVisible(true);
        
    }
}
