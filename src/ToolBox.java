import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBox extends JFrame implements ActionListener
{
    static JFrame tool_f;
    static JPanel tool_p,tool_p1,tool_p2,tool_p3,tool_p4,tool_p5,tool_p6,tool_p7,tool_p8,tool_p9;
    static JLabel tool_l1,tool_l2,tool_l3,tool_l4,tool_l5,tool_l6,tool_l7,tool_l8,tool_l9;
    static  JButton tool_b1,tool_b2,tool_b3,tool_b4,tool_b5,tool_b6,tool_b7,tool_b8,tool_b9;
    public ToolBox()
    {
        tool_f = new JFrame("Tool Box");
        tool_f.setSize(482,388);
        tool_f.setLayout(null);
        tool_f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tool_f.setResizable(false);
        tool_f.setLocationRelativeTo(null);

        // for default panel
        tool_p = new JPanel();
        tool_p.setBounds(0,0,470,568);
        tool_p.setLayout(null);
        tool_p.setBackground(Color.BLACK);
        tool_f.add(tool_p);

        // for first panel
        tool_p1 = new JPanel();
        tool_p1.setBounds(0,0,230,170);
        tool_p1.setLayout(null);
        tool_p1.setBackground(Color.MAGENTA);
        tool_p.add(tool_p1);
        tool_f.add(tool_p);

        // for first label in panel 1
        tool_l1 = new JLabel();
        tool_l1.setText("Calculator");
        tool_l1.setBounds(70,50,100,30);
        tool_l1.setFont(new Font("Aerial",Font.PLAIN+Font.BOLD,20));
        tool_p1.add(tool_l1);
        tool_p.add(tool_p1);
        tool_f.add(tool_p);

        // for first button in panel 1
        tool_b1 = new JButton("Open");
        tool_b1.setBounds(70,100,100,30);
        tool_p1.add(tool_b1);
        tool_p.add(tool_p1);
        tool_f.add(tool_p);

        // for second panel
        tool_p2 = new JPanel();
        tool_p2.setBounds(240,0,230,170);
        tool_p2.setLayout(null);
        tool_p2.setBackground(Color.YELLOW);
        tool_p.add(tool_p2);
        tool_f.add(tool_p);

        // for second label in panel 2
        tool_l2 = new JLabel();
        tool_l2.setText("Chant Counter");
        tool_l2.setBounds(50,50,160,30);
        tool_l2.setFont(new Font("Aerial",Font.PLAIN+Font.BOLD,20));
        tool_p2.add(tool_l2);
        tool_p.add(tool_p2);
        tool_f.add(tool_p);

        // for second button in panel 2
        tool_b2 = new JButton("Open");
        tool_b2.setBounds(70,100,100,30);
        tool_p2.add(tool_b2);
        tool_p.add(tool_p2);
        tool_f.add(tool_p);

        // for third panel
        tool_p4 = new JPanel();
        tool_p4.setBounds(0,180,230,170);
        tool_p4.setLayout(null);
        tool_p4.setBackground(Color.CYAN);
        tool_p.add(tool_p4);
        tool_f.add(tool_p);

        // for third label in third panel
        tool_l4 = new JLabel();
        tool_l4.setText("To-Do List");
        tool_l4.setBounds(70,50,100,30);
        tool_l4.setFont(new Font("Aerial",Font.PLAIN+Font.BOLD,20));
        tool_p4.add(tool_l4);
        tool_p.add(tool_p4);
        tool_f.add(tool_p);

        // for third button in third panel
        tool_b4 = new JButton("Open");
        tool_b4.setBounds(70,100,100,30);
        tool_p4.add(tool_b4);
        tool_p.add(tool_p4);
        tool_f.add(tool_p);

        // for fourth panel
        tool_p3 = new JPanel();
        tool_p3.setBounds(240,180,230,170);
        tool_p3.setLayout(null);
        tool_p3.setBackground(Color.GREEN);
        tool_p.add(tool_p3);
        tool_f.add(tool_p);

        // for fourth label in panel 4
        tool_l3 = new JLabel();
        tool_l3.setText("Counter");
        tool_l3.setBounds(70,50,100,30);
        tool_l3.setFont(new Font("Aerial",Font.PLAIN+Font.BOLD,20));
        tool_p3.add(tool_l3);
        tool_p.add(tool_p3);
        tool_f.add(tool_p);

        // for fourth button in panel 4
        tool_b3 = new JButton("Open");
        tool_b3.setBounds(70,100,100,30);
        tool_p3.add(tool_b3);
        tool_p.add(tool_p3);
        tool_f.add(tool_p);




       /* // for fifth panel
        tool_p5 = new JPanel();
        tool_p5.setBounds(240,180,230,170);
        tool_p5.setLayout(null);
        tool_p5.setBackground(Color.WHITE);
        tool_p.add(tool_p5);
        tool_f.add(tool_p);

        // for fifth label in panel 5
        tool_l5 = new JLabel();
        tool_l5.setText("Mirror");
        tool_l5.setBounds(90,50,100,30);
        tool_l5.setFont(new Font("Aerial",Font.PLAIN+Font.BOLD,20));
        tool_p5.add(tool_l5);
        tool_p.add(tool_p5);
        tool_f.add(tool_p);

        // for fifth button in fifth panel
        tool_b5 = new JButton("Open");
        tool_b5.setBounds(70,100,100,30);
        tool_p5.add(tool_b5);
        tool_p.add(tool_p5);
        tool_f.add(tool_p);

        // for sixth panel
        tool_p6 = new JPanel();
        tool_p6.setBounds(480,180,230,170);
        tool_p6.setLayout(null);
        tool_p6.setBackground(Color.CYAN);
        tool_p.add(tool_p6);
        tool_f.add(tool_p);

        // for sixth label in sixth panel
        tool_l6 = new JLabel();
        tool_l6.setText("Unit Convertor");
        tool_l6.setBounds(50,50,150,30);
        tool_l6.setFont(new Font("Aerial",Font.PLAIN+Font.BOLD,20));
        tool_p6.add(tool_l6);
        tool_p.add(tool_p6);
        tool_f.add(tool_p);

        // for sixth button in sixth panel
        tool_b6 = new JButton("Open");
        tool_b6.setBounds(70,100,100,30);
        tool_p6.add(tool_b6);
        tool_p.add(tool_p6);
        tool_f.add(tool_p);

        // for seventh panel
        tool_p7 = new JPanel();
        tool_p7.setBounds(0,360,230,170);
        tool_p7.setLayout(null);
        tool_p7.setBackground(Color.GREEN);
        tool_p.add(tool_p7);
        tool_f.add(tool_p);

        // for seventh label in seventh panel
        tool_l7 = new JLabel();
        tool_l7.setText("Notes");
        tool_l7.setBounds(90,50,100,30);
        tool_l7.setFont(new Font("Aerial",Font.PLAIN+Font.BOLD,20));
        tool_p7.add(tool_l7);
        tool_p.add(tool_p7);
        tool_f.add(tool_p);

        // for seventh button in seventh panel
        tool_b7 = new JButton("Open");
        tool_b7.setBounds(70,100,100,30);
        tool_p7.add(tool_b7);
        tool_p.add(tool_p7);
        tool_f.add(tool_p);

        // for 8th panel
        tool_p8 = new JPanel();
        tool_p8.setBounds(240,360,230,170);
        tool_p8.setLayout(null);
        tool_p8.setBackground(Color.YELLOW);
        tool_p.add(tool_p8);
        tool_f.add(tool_p);

        // for 8th label in 8th panel
        tool_l8 = new JLabel();
        tool_l8.setText("Unit Convertor");
        tool_l8.setBounds(40,50,140,30);
        tool_l8.setFont(new Font("Aerial",Font.PLAIN+Font.BOLD,20));
        tool_p8.add(tool_l8);
        tool_p.add(tool_p8);
        tool_f.add(tool_p);

        // for 8th button in 8th panel
        tool_b8 = new JButton("Open");
        tool_b8.setBounds(70,100,100,30);
        tool_p8.add(tool_b8);
        tool_p.add(tool_p8);
        tool_f.add(tool_p);

        // for nineth panel
        tool_p9 = new JPanel();
        tool_p9.setBounds(480,360,230,170);
        tool_p9.setLayout(null);
        tool_p9.setBackground(Color.MAGENTA);
        tool_p.add(tool_p9);
        tool_f.add(tool_p);

        //for 9th label in 9th panel
        tool_l9 = new JLabel();
        tool_l9.setText("Encrypt & Decrypt");
        tool_l9.setBounds(20,50,190,30);
        tool_l9.setFont(new Font("Aerial",Font.PLAIN+Font.BOLD,20));
        tool_p9.add(tool_l9);
        tool_p.add(tool_p9);
        tool_f.add(tool_p);

        // for 9th button in 9th panel
        tool_b9 = new JButton("Open");
        tool_b9.setBounds(70,100,100,30);
        tool_p9.add(tool_b9);
        tool_p.add(tool_p9);
        tool_f.add(tool_p);*/

        tool_b1.addActionListener(this);
        tool_b2.addActionListener(this);
        tool_b3.addActionListener(this);
        tool_b4.addActionListener(this);
        tool_f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new ToolBox();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == tool_b1)
        {
            tool_f.dispose();
            new Calculator();
        }
        if(e.getSource() == tool_b2)
        {
            tool_f.dispose();
            new Chant_Counter();
        }
        if(e.getSource() == tool_b3)
        {
            tool_f.dispose();
            new Counter();
        }
        if(e.getSource() == tool_b4)
        {
            tool_f.dispose();
            new To_Do_list();
        }
    }
}
