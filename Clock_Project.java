// Athur name: Aqsa
// 
import static java.awt.Color.BLACK;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Clock_Project {

    public void f1() {
    }

    public static void main(String[] args) {
        //frame...
        JFrame f = new JFrame("CLOCK");
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        Container contentPane = f.getContentPane();
        contentPane.setBackground(white);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //variables...
        SimpleDateFormat sd1 = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat sd2 = new SimpleDateFormat("EEE:LL:YYYY");
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        JLabel l3 = new JLabel();
        JLabel l4 = new JLabel();
        JLabel l5 = new JLabel();
        Font f1 = new Font("Arial", Font.BOLD, 20);
        Font f3 = new Font("Arial", Font.BOLD, 25);
        Font f2 = new Font("Arial", Font.BOLD, 12);
        String s1, s2;
        JButton darkmode = new JButton("Dark Mode");
        JButton lightmode = new JButton("Light Mode");

        //Set Components...
        l1.setText("Time");
        l2.setText("Date");
        l1.setBounds(125, 50, 50, 50);
        l1.setFont(f1);
        l2.setBounds(125, 150, 50, 50);
        l2.setFont(f1);
        l3.setBounds(75, 75, 200, 50);
        l3.setFont(f3);
        l4.setBounds(78, 175, 150, 50);
        l4.setFont(f3);
        l5.setBounds(100, 300, 100, 50);
        l5.setFont(f1);
        darkmode.setBounds(50, 250, 100, 30);
        darkmode.setFont(f2);
        lightmode.setBounds(150, 250, 100, 30);
        lightmode.setFont(f2);

        //set default color...
        contentPane.setBackground(white);
        l1.setForeground(black);
        l2.setForeground(black);
        l3.setForeground(black);
        l4.setForeground(black);
        l5.setForeground(black);

        darkmode.setBackground(black);
        darkmode.setForeground(white);

        lightmode.setBackground(white);
        lightmode.setForeground(BLACK);

        //Adding..
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(darkmode);
        f.add(lightmode);

        //logic
        //timer
        Timer timer = new Timer(1000, (ActionEvent e) -> {
            l3.setText(sd2.format(Calendar.getInstance().getTime()));
            l4.setText(sd1.format(Calendar.getInstance().getTime()));
        });
        timer.start();

        //dark and light mode
        darkmode.addActionListener((ActionEvent e) -> {
            try {
                contentPane.setBackground(BLACK);
                l1.setForeground(white);
                l2.setForeground(white);
                l3.setForeground(white);
                l4.setForeground(white);
                l5.setForeground(white);

                darkmode.setBackground(black);
                darkmode.setForeground(white);

                lightmode.setBackground(white);
                lightmode.setForeground(BLACK);

            } catch (Exception ex) {
                l5.setText("Something Went Wrong!");
            }
        });

        lightmode.addActionListener((ActionEvent e) -> {
            try {
                contentPane.setBackground(white);
                l1.setForeground(black);
                l2.setForeground(black);
                l3.setForeground(black);
                l4.setForeground(black);
                l5.setForeground(black);

                darkmode.setBackground(black);
                darkmode.setForeground(white);

                lightmode.setBackground(white);
                lightmode.setForeground(BLACK);

            } catch (Exception ex) {
                l5.setText("Something Went Wrong!");
            }
        });

    }

}
