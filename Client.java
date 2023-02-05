import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;
public class Client extends JFrame{
    private JTextField jtf = new JTextField();
    private JTextArea jt = new JTextArea();
    private DataInputStream fromServer;
    private DataOutputStream toServer;
    public static void main(String[] args) {
        new Client();
    }
    public Client(){
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(new JLabel("Enter radius"), BorderLayout.WEST);
        p.add(jtf, BorderLayout.CENTER);
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        this.setLayout(new BorderLayout());
        this.add(p, BorderLayout.NORTH);
        this.add(new JScrollPane(jt), BorderLayout.CENTER);
        jtf.addActionListener(new ButtonListener());
        this.setTitle("Client");
        this.setPreferredSize(new Dimension(450,300));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        try{
            Socket socket = new Socket("localhost", 8000);
            fromServer = new DataInputStream(socket.getInputStream());
            toServer= new DataOutputStream(socket.getOutputStream());
        }
        catch(IOException e){
            jt.append(e.toString()+'\n');
        }
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                double radius = Double.parseDouble(jtf.getText().trim());
                toServer.writeDouble(radius);
                toServer.flush();
                double area = fromServer.readDouble();
                jt.append("Radius is " +radius + '\n');
                jt.append("Area received from server is "+area+ "\n");
            }
            catch(IOException ex){
                System.err.println(ex);
            }
        }
    }
}
