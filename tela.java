import javax.swing.*;
import java.awt.*;




public class tela extends JPanel{

    public tela(){
        JFrame jf = new JFrame();
        jf.setSize(800,500);
        jf.setTitle("Faturamento");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setResizable(false);

        JLabel text = new JLabel("Digite aqui:");
        text.setBounds(100, 100, 100, 100);
        text.setFont(new Font("Arial", Font.BOLD, 15));


        jf.add(text);
        jf.setVisible(true);
        
    }
}
