import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener
{
    static Container c;
    static JLabel jl1,jl2,jl3;
    static JTextField jt1,jt2;
    static JButton add,sub,mul,div,back;
    public Calculator()
    {
        setTitle("simple calculator");
        setSize(300,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c= getContentPane();
        c.setLayout(null);

        jl1 = new JLabel("First No.");
        jl1.setBounds(10,20,100,20);
        c.add(jl1);

        jt1 = new JTextField();
        jt1.setBounds(100,20,100,20);
        c.add(jt1);

        jl2 = new JLabel("Second No.");
        jl2.setBounds(10,50,100,20);
        c.add(jl2);

        jt2 = new JTextField();
        jt2.setBounds(100,50,100,20);
        c.add(jt2);

        // for add button
        add = new JButton("+");
        add.setBounds(10,90,50,30);
        c.add(add);

        // for sub button
        sub = new JButton("-");
        sub.setBounds(70,90,50,30);
        c.add(sub);

        // for mul button
        mul = new JButton("*");
        mul.setBounds(130,90,50,30);
        c.add(mul);

        // for div button
        div = new JButton("/");
        div.setBounds(190,90,50,30);
        c.add(div);

        // for back button
        back = new JButton("Back");
        back.setBounds(10,250,70,30);
        c.add(back);

        jl3 = new JLabel("Result is ");
        jl3.setBounds(10,150,190,30);
        c.add(jl3);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        back.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            if(e.getSource() == add)
            {
                int a = Integer.parseInt(jt1.getText()); // scanner
                int b = Integer.parseInt(jt2.getText());
                int c = a+b;
                jl3.setText("Result is "+c);
            }
            if(e.getSource() == sub)
            {
                int a = Integer.parseInt(jt1.getText());
                int b = Integer.parseInt(jt2.getText());
                int c = a-b;
                jl3.setText("Result is "+c);
            }
            if(e.getSource() == mul)
            {
                int a = Integer.parseInt(jt1.getText());
                int b = Integer.parseInt(jt2.getText());
                int c = a*b;
                jl3.setText("Result is "+c);
            }
            if(e.getSource() == div)
            {
                int a = Integer.parseInt(jt1.getText());
                int b = Integer.parseInt(jt2.getText());
                int c = a/b;
                jl3.setText("Result is "+c);
            }
        }
        catch(Exception f)
        {
            jl3.setText("Result is Infinity");
        }
        if(e.getSource() == back)
        {
            this.dispose();
            ToolBox.tool_f.setVisible(true);
        }
    }
}
