import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Server extends JFrame{
    private JTextArea jt = new JTextArea();
    public static void main(String[] args) {
        new Server();
    }
    public Server(){
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(jt), BorderLayout.CENTER);
        this.setTitle("Server");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(450,300));
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        try{
            ServerSocket server = new ServerSocket(8000);
            jt.append("Server started at"+new Date()+'\n');

            Socket s = server.accept();

            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            while(true){
                double radius = in.readDouble();
                double area = radius*radius*Math.PI;
                out.writeDouble(area);
                jt.append("Radius recieved from client: "+radius+'\n');
                jt.append("Area found: "+area+'\n');
            }
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
}
