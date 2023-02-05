import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class scheduling {
    JFrame frame;
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField at;
    JTextField bt;
    JButton jbt;
    int ch = 0;

    public scheduling() {

        panel = new JPanel(null);
        panel.setFocusable(false);
        panel.setPreferredSize(new Dimension(500, 450));

        label1 = new JLabel("Algorithm");
        label1.setBounds(25, 25, 160, 30);
        label1.setFont(new Font("Monospace", Font.BOLD, 20));
        panel.add(label1);

        String alg[] = { "Select an algorithm", "First Come First Serve, FCFS", "Shortest Job First, SJF (Premptive)",
                "Shortest Job First, SJF (Non-Premptive)" };

        JComboBox<String> jcb = new JComboBox<>(alg);
        jcb.setBounds(25, 75, 400, 40);
        jcb.setFont(new Font("Monospace", Font.BOLD, 20));
        jcb.setBackground(Color.WHITE);
        jcb.setFocusable(false);
        panel.add(jcb);

        label2 = new JLabel("Arrival Times");
        label2.setBounds(25, 140, 160, 30);
        label2.setFont(new Font("Monospace", Font.BOLD, 20));
        panel.add(label2);

        at = new JTextField("eg. 0 2 4 6 8");
        at.setBounds(25, 190, 400, 30);
        at.setFont(new Font("Monospace", Font.BOLD, 20));
        at.setBackground(Color.WHITE);
        at.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (at.getText().equals("eg. 0 2 4 6 8"))
                    at.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (at.getText().equals(""))
                    at.setText("eg. 0 2 4 6 8");
            }
        });
        panel.add(at);

        label3 = new JLabel("Burst Times");
        label3.setBounds(25, 255, 160, 30);
        label3.setFont(new Font("Monospace", Font.BOLD, 20));
        panel.add(label3);

        bt = new JTextField("eg. 2 4 6 8 10");
        bt.setBounds(25, 305, 400, 30);
        bt.setFont(new Font("Monospace", Font.BOLD, 20));
        bt.setBackground(Color.WHITE);
        bt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (bt.getText().equals("eg. 2 4 6 8 10"))
                    bt.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (bt.getText().equals(""))
                    bt.setText("eg. 2 4 6 8 10");
            }
        });
        panel.add(bt);

        jbt = new JButton("Solve");
        jbt.setBounds(25, 370, 70, 40);
        jbt.setBackground(Color.white);
        jbt.setFocusable(false);
        panel.add(jbt);

        jbt.addActionListener(e -> {
            ch = jcb.getSelectedIndex();
            if (ch == 0) {
                JOptionPane.showMessageDialog(panel, "Please Select Valid Algorithm",
                        "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String a = at.getText().trim();
            String b = bt.getText().trim();
            String[] x = a.split(" ", 10);
            String[] y = b.split(" ", 10);

            if (x.length != y.length) {
                JOptionPane.showMessageDialog(panel, "Please Enter Equal Number of Arrival Time and Burst Time",
                        "Alert", JOptionPane.ERROR_MESSAGE);

                return;
            }
            calculate(x, y, ch);
        });
        frame = new JFrame();
        frame.setTitle("INPUT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setFocusable(false);
        frame.setResizable(false);
        frame.add(panel);
        frame.pack();
    }

    void calculate(String a[], String b[], int c) {
        int[] arrivalTimes = new int[a.length];
        int[] burstTimes = new int[b.length];
        for (int i = 0; i < a.length; i++) {
            arrivalTimes[i] = Integer.parseInt(a[i]);
            burstTimes[i] = Integer.parseInt(a[i]);
        }
        if (c == 1)
            fcfs(arrivalTimes, burstTimes);
        else if (c == 2) {
            sjfp(arrivalTimes, burstTimes);
        } else if (c == 3) {
            sjpnp(arrivalTimes, burstTimes);
        }
    }

    void fcfs(int ar[], int bt[]) {
        int size = ar.length;
        int[] pid = new int[size];
        int[] ct = new int[size];
        int[] ta = new int[size];
        int[] wt = new int[size];
        int temp;
        float avgWt = 0, avgTa = 0;
        for (int i = 0; i < size; i++) {
            pid[i] = i + 1;
        }
        // sorting according to arrival times
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - (i + 1); j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;
                    temp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = temp;
                }
            }
        }
        // finding completion times
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                ct[i] = ar[i] + bt[i];
            } else {
                if (ar[i] > ct[i - 1]) {
                    ct[i] = ar[i] + bt[i];
                } else
                    ct[i] = ct[i - 1] + bt[i];
            }
            ta[i] = ct[i] - ar[i];
            wt[i] = ta[i] - bt[i];
            avgWt += wt[i];
            avgTa += ta[i];
        }
        makeTable(ar, bt, ct, ta, wt, avgTa / size, avgWt / size);
    }

    void sjfp(int[] at, int[] bt) {
        int size = at.length;
        int[] ct = new int[size];
        int[] ta = new int[size];
        int[] wt = new int[size];
        int[] f = new int[size];
        int[] k = new int[size];
        int i, st = 0, tot = 0;
        float avgWt = 0, avgTa = 0;
        for (i = 0; i < size; i++) {
            k[i] = bt[i];
            f[i] = 0;
        }
        while (true) {
            int min = 99, c = size;
            if (tot == size)
                break;
            for (i = 0; i < size; i++) {
                if ((at[i] <= st) && (f[i] == 0) && (bt[i] < min)) {
                    min = bt[i];
                    c = i;
                }
            }
            if (c == size)
                st++;
            else {
                bt[c]--;
                st++;
                if (bt[c] == 0) {
                    ct[c] = st;
                    f[c] = 1;
                    tot++;
                }
            }
        }
        for (i = 0; i < size; i++) {
            ta[i] = ct[i] - at[i];
            wt[i] = ta[i] - k[i];
            avgWt += wt[i];
            avgTa += ta[i];
        }
        makeTable(at, bt, ct, ta, wt, avgWt / size, avgTa / size);
    }

    void sjpnp(int[] at, int[] bt) {
        int size = at.length;
        int[] ct = new int[size];
        int[] ta = new int[size];
        int[] wt = new int[size];
        int[] f = new int[size];
        int st = 0, tot = 0;
        float avgWt = 0, avgTa = 0;
        for (int i = 0; i < size; i++) {
            f[i] = 0;
        }
        while (true) {
            int c = size, min = 999;
            if (tot == size)
                break;
            for (int i = 0; i < size; i++) {
                if ((at[i] <= st) && (f[i] == 0) && (bt[i] < min)) {
                    min = bt[i];
                    c = i;
                }
            }
            if (c == size)
                st++;
            else {
                ct[c] = st + bt[c];
                st += bt[c];
                ta[c] = ct[c] - at[c];
                wt[c] = ta[c] - bt[c];
                f[c] = 1;
                tot++;
            }
        }
        for (int i = 0; i < size; i++) {
            avgWt += wt[i];
            avgTa += ta[i];
        }
        makeTable(at, bt, ct, ta, wt, (avgTa / size), (avgWt / size));
    }

    void makeTable(int[] at, int[] bt, int[] ct, int[] ta, int[] wt, float avgTAT, float avgWT) {
        frame.dispose();
        JFrame result = new JFrame("OUTPUT");
        result.setLayout(null);
        result.setBounds(400, 200, 500, 450);
        String t[] = { "FCFS", "SJF-P", "SJF-NP" };
        JButton jbt1 = new JButton(t[ch - 1]);
        jbt1.setFont(new Font("Monospace", Font.BOLD, 20));
        jbt1.setBounds(380, 25, 60, 30);
        jbt1.setFocusable(false);
        jbt1.setBackground(Color.WHITE);
        jbt1.setBorder(null);
        result.add(jbt1);
        String[] column = { "JOB", "ARRIVAL TIME", "BURST TIME", "FINISH TIME",
                "TURN AROUND TIME", "WAITING TIME" };
        JTable table = new JTable();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(column);
        table.setModel(dtm);
        result.add(table);
        dtm.addRow(column);
        for (int i = 0; i < at.length; i++) {
            char c = (char) ((char) i + 65);
            String[] tempData = { String.valueOf(c), String.valueOf(at[i]), String.valueOf(bt[i]),
                    String.valueOf(ct[i]), String.valueOf(ta[i]), String.valueOf(wt[i]) };
            dtm.addRow(tempData);
        }
        table.setBounds(25, 80, 450, 180);
        frame.getComponentAt(20, 400);
        System.out.println(avgTAT);
        System.out.println(avgWT);
        JButton reset = new JButton("Reset");
        reset.setBounds(380, 350, 70, 40);
        reset.setBackground(Color.white);
        reset.setFocusable(false);
        result.add(reset);
        reset.addActionListener(e -> {
            result.dispose();
            new scheduling();
        });
        result.setVisible(true);
        result.getContentPane().setBackground(Color.white);
        result.setResizable(false);
        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        result.setVisible(true);
    }

    public static void main(String[] args) {
        new scheduling();
    }
}
