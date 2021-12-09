
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


class Chant_Counter extends JFrame implements ActionListener, KeyListener
{
    // Declaring variables
    protected static JLabel jl;
    protected static JLabel jl1;
    protected static JButton jb1;
    protected static JButton jb2;
    protected static JButton jb3;
    protected static JButton back;
    protected static JTextField jtf;
    protected static JTextField jtf1;
    protected static JPanel jp1;
    protected int i=0;
    protected int j=0;
    public Chant_Counter()
    {
        // For Frame

        this.setTitle("Chant Counter");
        this.setSize(300,260);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        Container c = getContentPane();
        c.setLayout(null);

        // For Label
        jl = new JLabel("Counts");
        jl.setBounds(20,100,80,30);
        jl.setFont(new Font("Segoe UI",Font.BOLD,18));
        c.add(jl);


        // For Panel
        jp1 = new JPanel();
        jp1.setBounds(0,0,300,40);
        JLabel jl2 = new JLabel("Chant Counter");
        jl2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        jp1.setBackground(Color.YELLOW);
        jp1.add(jl2);
        c.add(jp1);

        // For Label 1
        jl1 = new JLabel("Rounds");
        jl1.setBounds(20,50,80,30);
        jl1.setFont(new Font("Segoe UI",Font.BOLD,18));
        c.add(jl1);

        // For TextField
        jtf = new JTextField("0");
        jtf.setBounds(110,100,50,30);
        jtf.setFocusable(false);
        jtf.setBackground(Color.GREEN);
        c.add(jtf);

        // For TextFiled 1
        jtf1 = new JTextField("0");
        jtf1.setBounds(110,50,50,30);
        jtf1.setFocusable(false);
        jtf1.setBackground(Color.CYAN);
        c.add(jtf1);

        // For Buttons
        jb1 = new JButton("<");
        jb2 = new JButton(">");
        jb3 = new JButton("Reset");
        back = new JButton("Back");
        jb3.setFont(new Font("Verdana",Font.BOLD,15));

        // set the color for buttons
        jb1.setBackground(Color.WHITE);
        jb2.setBackground(Color.WHITE);
        jb3.setBackground(Color.WHITE);
        back.setBackground(Color.WHITE);

        jb1.setBounds(170,100,50,30);
        jb2.setBounds(230,100,50,30);
        jb3.setBounds(95,150,100,30);
        back.setBounds(10,190,100,30);

        // Adding Buttons in Frame
        c.add(jb1);
        c.add(jb2);
        c.add(jb3);
        c.add(back);
        c.setBackground(Color.PINK);

        // set the ActionListener
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        back.addActionListener(this);

        jb1.addKeyListener(this);
        jb2.addKeyListener(this);
        jb3.addKeyListener(this);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == jb1)
        {
            i--;
            jtf.setText(Integer.toString(i));
            if( i == -1)
            {
                jb1.setEnabled(false);
                jtf.setText(null);
                jtf.setText(null);
            }
        }
        else if(e.getSource() == jb2)
        {
            if(i++ != 108)
            {
                jb1.setEnabled(true);
            }
            jtf.setText(Integer.toString(i));
            if(i == 109)
            {
                i=0;
                jtf.setText(Integer.toString(i));
                j = j+1;
                jtf1.setText(Integer.toString(j));
            }
            else
            {
                jtf.setText(Integer.toString(i));
            }
        }
        else if(e.getSource() == jb3)
        {
            i=0;j=0;
            jtf.setText(Integer.toString(i));
            jtf1.setText(Integer.toString(j));
        }
        if(e.getSource() == back)
        {
            this.dispose();
            ToolBox.tool_f.setVisible(true);
        }
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        if(ke.getKeyCode() == KeyEvent.VK_LEFT)
        {
            if(i == 0)
            {
                jtf.setText(null);
                jb1.setEnabled(false);
            }
            else if(true)
            {
                i--;
                jtf.setText(Integer.toString(i));
                if (i == -1)
                {
                    jb1.setEnabled(false);
                    jtf.setText(null);
                    jtf.setText(null);
                }
            }
        }
        else if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            super.setAutoRequestFocus(true);
            if(i++ != 108)
            {
                jb1.setEnabled(true);
            }
            jtf.setText(Integer.toString(i));
            if(i == 109)
            {
                i=0;
                jtf.setText(Integer.toString(i));
                j = j+1;
                jtf1.setText(Integer.toString(j));
            }
            else
            {
                jtf.setText(Integer.toString(i));
            }
        }
        else if(ke.getKeyCode() == KeyEvent.VK_ENTER)
        {
            i=0;j=0;
            jtf.setText(Integer.toString(i));
            jtf1.setText(Integer.toString(j));
        }
    }

    @Override
    public void keyTyped(KeyEvent ke)
    {

    }

    @Override
    public void keyReleased(KeyEvent ke)
    {

    }
}
