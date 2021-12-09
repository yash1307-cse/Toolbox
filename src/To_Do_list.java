import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class To_Do_list implements ActionListener {
    JFrame tdl_f; // tdl_f (full form) = to do list frame
    JPanel tdl_p1, tdl_p2; // tdl_p1 (full form) = to do list panel 1
    JLabel tdl_l1, tdl_l2, tdl_l3, tdl_l4, tdl_l5, tdl_l6; // tdl_l1 (full form) = to do list label 1
    JTextField tdl_tf1, tdl_tf2, tdl_tf3, tdl_tf4, tdl_tf5, tdl_tf6; // tdl_tf1 (full form) = to do list text field 1
    JButton tdl_b1, tdl_b2, tdl_b3, tdl_b4; // tdl_b1 (full form) = to do list button 1
    JTextArea tdl_ta; // tdl_ta (full form) = to do list text area

    public To_Do_list() {
        // for frame
        tdl_f = new JFrame("To-do List");
        tdl_f.setLayout(null);
        tdl_f.setSize(800, 600);
        tdl_f.setLocationRelativeTo(null);
        tdl_f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tdl_f.setResizable(false);

        // for first panel
        tdl_p1 = new JPanel();
        tdl_p1.setBackground(Color.GREEN);
        tdl_p1.setBounds(0, 0, 800, 50);
        tdl_p1.setLayout(new FlowLayout());
        tdl_f.add(tdl_p1);

        // for first label in panel 1
        tdl_l1 = new JLabel();
        tdl_l1.setText("To-do List");
        tdl_l1.setFont(new Font("Aerial", Font.PLAIN + Font.BOLD, 24));
        tdl_p1.add(tdl_l1);
        tdl_f.add(tdl_p1);

        // for panel 2
        tdl_p2 = new JPanel();
        tdl_p2.setLayout(null);
        tdl_p2.setBounds(0, 60, 800, 540);
        tdl_p2.setBackground(Color.CYAN);
        tdl_f.add(tdl_p2);

        // for label 1 in panel 2
        tdl_l2 = new JLabel();
        tdl_l2.setText("Enter Task");
        tdl_l2.setBounds(20, 20, 130, 50);
        tdl_l2.setFont(new Font("Aerial", Font.BOLD, 18));
        tdl_p2.add(tdl_l2);
        tdl_f.add(tdl_p2);

        // for text field 1 in panel 2
        tdl_tf1 = new JTextField();
        tdl_tf1.setBounds(20, 80, 100, 30);
        tdl_p2.add(tdl_tf1);
        tdl_f.add(tdl_p2);

        // for label 2 in panel 2
        tdl_l3 = new JLabel();
        tdl_l3.setText("Enter Date");
        tdl_l3.setBounds(160, 20, 120, 50);
        tdl_l3.setFont(new Font("Aerial", Font.BOLD, 18));
        tdl_p2.add(tdl_l3);
        tdl_f.add(tdl_p2);

        // for text field 2 in panel 2
        tdl_tf2 = new JTextField();
        tdl_tf2.setBounds(160, 80, 70, 30);
        tdl_p2.add(tdl_tf2);
        tdl_f.add(tdl_p2);


        // for label 4 in panel 2
        tdl_l4 = new JLabel();
        tdl_l4.setText("Enter completed task and date");
        tdl_l4.setBounds(20, 170, 270, 50);
        tdl_l4.setFont(new Font("Aerial", Font.BOLD, 18));
        tdl_p2.add(tdl_l4);
        tdl_f.add(tdl_p2);

        // for third text field in panel 2
        tdl_tf3 = new JTextField();
        tdl_tf3.setBounds(20, 240, 100, 30);
        tdl_p2.add(tdl_tf3);
        tdl_f.add(tdl_p2);

        // for text field 4 in panel 2
        tdl_tf4 = new JTextField();
        tdl_tf4.setBounds(160, 240, 100, 30);
        tdl_p2.add(tdl_tf4);
        tdl_f.add(tdl_p2);

        // for button 1 in panel 2
        tdl_b1 = new JButton();
        tdl_b1.setText("Add");
        tdl_b1.setFont(new Font("Aerial", Font.BOLD, 20));
        tdl_b1.setBounds(20, 120, 100, 30);
        tdl_p2.add(tdl_b1);

        // for button 2 in panel 2
        tdl_b2 = new JButton();
        tdl_b2.setText("Done");
        tdl_b2.setFont(new Font("Aerial", Font.BOLD, 20));
        tdl_b2.setBounds(20, 290, 100, 30);
        tdl_p2.add(tdl_b2);
        tdl_f.add(tdl_p2);

        // for label 5 in panel 2
        tdl_l5 = new JLabel();
        tdl_l5.setText("For seeing completed task enter date");
        tdl_l5.setBounds(20, 340, 330, 50);
        tdl_l5.setFont(new Font("Aerial", Font.BOLD, 18));
        tdl_p2.add(tdl_l5);
        tdl_f.add(tdl_p2);

        // for text field 5 in panel 2
        tdl_tf5 = new JTextField();
        tdl_tf5.setBounds(20, 410, 100, 30);
        tdl_p2.add(tdl_tf5);
        tdl_f.add(tdl_p2);

        // for third button in panel 2
        tdl_b3 = new JButton();
        tdl_b3.setText("Done");
        tdl_b3.setFont(new Font("Aerial", Font.BOLD, 20));
        tdl_b3.setBounds(160, 410, 100, 30);
        tdl_p2.add(tdl_b3);
        tdl_f.add(tdl_p2);

        // for sixth label in panel2
        tdl_l6 = new JLabel();
        tdl_l6.setText("For seeing incompleted task enter date");
        tdl_l6.setBounds(410, 340, 350, 50);
        tdl_l6.setFont(new Font("Aerial", Font.BOLD, 18));
        tdl_p2.add(tdl_l6);
        tdl_f.add(tdl_p2);

        // for sixth text field in panel 2
        tdl_tf6 = new JTextField();
        tdl_tf6.setBounds(410, 410, 100, 30);
        tdl_p2.add(tdl_tf6);
        tdl_f.add(tdl_p2);

        // for fourth button  in panel 2
        tdl_b4 = new JButton();
        tdl_b4.setText("Done");
        tdl_b4.setFont(new Font("Aerial", Font.BOLD, 20));
        tdl_b4.setBounds(550, 410, 100, 30);
        tdl_p2.add(tdl_b4);
        tdl_f.add(tdl_p2);

        // for first text field in panel 2
        tdl_ta = new JTextArea();
        tdl_ta.setBounds(410, 10, 300, 300);
        tdl_p2.add(tdl_ta);
        tdl_f.add(tdl_p2);


        tdl_b1.addActionListener(this);
        tdl_b2.addActionListener(this);
        tdl_b3.addActionListener(this);
        tdl_b4.addActionListener(this);
        tdl_f.setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tdl_b1) {
            try {
                Connection con = ConnectionProvider.getConnection();
                String tasks = tdl_tf1.getText();
                String get_date = tdl_tf2.getText();
                int task_date = Integer.parseInt(get_date);

                String s = "insert into task(tasks,task_date) values(?,?)";
                PreparedStatement pstmt = con.prepareStatement(s);
                pstmt.setString(1, tasks);
                pstmt.setString(2, Integer.toString(task_date));

                pstmt.executeUpdate();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Added Successfully");
        }
        if (e.getSource() == tdl_b2) {
            try {
                Connection con = ConnectionProvider.getConnection();
                String tasks = tdl_tf3.getText();
                String get_date = tdl_tf4.getText();
                int task_date = Integer.parseInt(get_date);

                String del_s = "delete from task where tasks = ? and task_date = ?";
                PreparedStatement pstmt = con.prepareStatement(del_s);
                pstmt.setString(1, tasks);
                pstmt.setString(2, Integer.toString(task_date));
                pstmt.executeUpdate();
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
        if (e.getSource() == tdl_b2) {
            try {
                Connection con = ConnectionProvider.getConnection();
                String tasks = tdl_tf3.getText();
                String get_date = tdl_tf4.getText();
                int tasks_date = Integer.parseInt(get_date);

                String del_s = "insert into remaining_tasks(tasks,tasks_date) values(?,?)";
                PreparedStatement pt = con.prepareStatement(del_s);
                pt.setString(1, tasks);
                pt.setString(2, Integer.toString(tasks_date));

                pt.executeUpdate();
            } catch (Exception exce) {
                exce.printStackTrace();
            }
        }
        if (e.getSource() == tdl_b3) {
            try {
                Connection con = ConnectionProvider.getConnection();
                String get_date = tdl_tf5.getText();
                int tasks_date = Integer.parseInt(get_date);

                String query = "select * from remaining_tasks where tasks_date = ?";

                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, Integer.toString(tasks_date));

                ResultSet set = pstmt.executeQuery();
                if (set.next()) {
                    String get_task = set.getString(1);

                    tdl_ta.setText("Task -> " + get_task);
                }
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        if (e.getSource() == tdl_b4) {
            try {
                Connection con = ConnectionProvider.getConnection();

                String get_date = tdl_tf6.getText();
                int task_date = Integer.parseInt(get_date);

                String query = "select * from task where task_date = ?";

                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, Integer.toString(task_date));

                ResultSet set = pstmt.executeQuery();
                if (set.next()) {
                    String get_task = set.getString(1);

                    tdl_ta.setText("Task -> " + get_task);
                }

            } catch (Exception ec) {
                ec.printStackTrace();
            }
        }
    }
}
