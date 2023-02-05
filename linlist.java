import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class linlist {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100 + 1);
            list.add(num);
        }

        JFrame frame = new JFrame();
        frame.setTitle("PROJECT");
        frame.setSize(550, 500);
        JLabel label = new JLabel("LIST");

        label.setPreferredSize(new Dimension(100, 30));
        label.setFont(new Font("Monospace", Font.BOLD, 20));
        label.setAlignmentX(FlowLayout.CENTER);
        frame.add(label);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 15));

        JTextField field = new JTextField();

        field.setPreferredSize(new Dimension(400, 100));
        field.setFont(new Font("Monospace", Font.BOLD, 20));

        field.setEditable(false);

        field.setBackground(Color.RED);

        field.setHorizontalAlignment(JTextField.CENTER);

        StringBuffer str = new StringBuffer();

        str.append("{ ");
        for (int i = 0; i < list.size(); i++) {
            str.append(list.get(i) + ", ");
        }
        str.deleteCharAt(str.length() - 2);

        str.append("}");

        field.setText(str.toString());

        JRadioButton stack = new JRadioButton("STACK");
        stack.setPreferredSize(new Dimension(100, 70));
        stack.setBackground(Color.pink);
        stack.setFont(new Font("Serif", Font.BOLD, 20));

        JRadioButton queue = new JRadioButton("QUEUE");
        queue.setPreferredSize(new Dimension(100, 70));
        queue.setBackground(Color.cyan);
        queue.setFont(new Font("serif", Font.BOLD, 20));

        ButtonGroup group = new ButtonGroup();
        group.add(stack);
        group.add(queue);

        // creating JButtons for operations
        JButton push = new JButton("Push");
        JButton pop = new JButton("Pop");
        JButton add = new JButton("Add");
        JButton delete = new JButton("Delete");

        // setting size and dimension for buttons
        push.setPreferredSize(new Dimension(100, 50));
        pop.setPreferredSize(new Dimension(100, 50));
        add.setPreferredSize(new Dimension(100, 50));
        delete.setPreferredSize(new Dimension(100, 50));

        // setting text and fonts in buttons
        push.setFont(new Font("serif", Font.BOLD, 20));
        push.setBackground(Color.pink);
        pop.setFont(new Font("serif", Font.BOLD, 20));
        pop.setBackground(Color.pink);
        add.setFont(new Font("serif", Font.BOLD, 20));
        add.setBackground(Color.cyan);
        delete.setFont(new Font("serif", Font.BOLD, 20));
        delete.setBackground(Color.cyan);

        // creating a JText field to show status
        JTextField status = new JTextField("Status");
        status.setPreferredSize(new Dimension(400, 50));
        status.setBackground(Color.orange);
        status.setFont(new Font("serif", Font.BOLD, 20));
        status.setHorizontalAlignment(JTextField.CENTER);
        status.setEditable(false);

        push.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stack.isSelected()) {
                    try {
                        int value = (int) Math.floor(Math.random() * 100);
                        ;

                        list.add(value);

                        // updating text field
                        StringBuffer str1 = new StringBuffer();
                        str1.append("{ ");
                        for (int i = 0; i < list.size(); i++) {
                            str1.append(list.get(i) + ", ");
                        }
                        str1.deleteCharAt(str1.length() - 2);
                        // Removing last extra comma
                        str1.append("}");
                        field.setText(str1.toString());
                        status.setText(" Pushed " + (value) + " to List");

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid Entry", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    // showing error option in case of invalid choice
                    JOptionPane.showMessageDialog(null, "Error!\nSelect Stack For Push Operation", "Error Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        pop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stack.isSelected()) {
                    int value = list.removeLast();

                    StringBuffer str1 = new StringBuffer();
                    str1.append("{  ");
                    for (int i = 0; i < list.size(); i++) {
                        str1.append(list.get(i) + ", ");
                    }
                    str1.deleteCharAt(str1.length() - 2);

                    str1.append("}");
                    field.setText(str1.toString());
                    status.setText(" Popped " + value + " from List");
                } else {

                    JOptionPane.showMessageDialog(null, "Error!\nSelect Stack for Pop Operation", "Error Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (queue.isSelected()) {
                    try {
                        int value = (int) Math.floor(Math.random() * 100);
                        ;
                        list.add(value);

                        StringBuffer str1 = new StringBuffer();
                        str1.append("{ ");
                        for (int i = 0; i < list.size(); i++) {
                            str1.append(list.get(i) + ", ");
                        }
                        str1.deleteCharAt(str1.length() - 2);

                        str1.append("}");
                        field.setText(str1.toString());
                        status.setText(" Added " + value + " to List");

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid Entry", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Error!\nSelect Queue for Add Operation", "Error Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (queue.isSelected()) {
                    int value = list.removeFirst();

                    StringBuffer str1 = new StringBuffer();
                    str1.append("{  ");
                    for (int i = 0; i < list.size(); i++) {
                        str1.append(list.get(i) + ", ");
                    }
                    str1.deleteCharAt(str1.length() - 2);

                    str1.append("}");
                    field.setText(str1.toString());

                    status.setText(" Deleted " + value + " from List");
                } else {

                    JOptionPane.showMessageDialog(null, "Error!\nSelect Queue for Delete Operation", "Error Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.add(field);
        frame.add(stack);
        frame.add(queue);
        frame.add(push);
        frame.add(add);
        frame.add(pop);
        frame.add(delete);
        frame.add(status);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
