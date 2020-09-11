import javax.swing.*;

public class afvink3_1 {

    public static void main(String[] args) {
        JFrame f= new JFrame("afvink 3");
        JTextField t1;
        t1= new JTextField(20);
        JLabel l1;
        l1= new JLabel("hallo neven");
        t1.setBounds(10,20, 200,30);
        l1.setBounds(10, 0, 200, 30);
        f.add(t1);
        f.add(l1);
        f.setSize(300,100);
        f.setLayout(null);
        f.setVisible(true);

    }
}
