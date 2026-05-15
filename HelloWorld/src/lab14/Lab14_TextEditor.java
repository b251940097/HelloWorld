package lab14;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
 

class fileedit {
 
    private String currentFileName = ""; 

    public void setFileName(String fname) {
        this.currentFileName = fname;
    }
 

    public void printfile(String text) {
        try {
            PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter(currentFileName)));
            print.print(text);
            print.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                "Файл бичихэд алдаа гарлаа:\n" + e.getMessage(),
                "Алдаа", JOptionPane.ERROR_MESSAGE);
        }
    }
 

    public String readfile(String fname) {
        StringBuilder content = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fname));
            String line;
            while ((line = in.readLine()) != null) {
                content.append(line).append("\n");
            }
            in.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                "Файл унших явцад алдаа гарлаа:\n" + e.getMessage(),
                "Алдаа", JOptionPane.ERROR_MESSAGE);
        }
        return content.toString();
    }
}
 

public class Lab14_TextEditor extends JFrame implements ActionListener {
 
    private JTextArea textArea;
    private JButton clearBtn, saveBtn, openBtn;
    private JScrollPane scrollPane;
    private fileedit fe;
 
    public Lab14_TextEditor() {
        fe = new fileedit();
        buildGUI();
    }
 
    private void buildGUI() {
        setTitle("Энгийн Текст Засварлагч - Lab 14");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
 
        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
 
        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
 
        clearBtn = new JButton("Clear");
        saveBtn  = new JButton("Save");
        openBtn  = new JButton("Open");
 
        Dimension btnSize = new Dimension(80, 28);
        clearBtn.setPreferredSize(btnSize);
        saveBtn.setPreferredSize(btnSize);
        openBtn.setPreferredSize(btnSize);
 
        clearBtn.addActionListener(this);
        saveBtn.addActionListener(this);
        openBtn.addActionListener(this);
 
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 8));
        btnPanel.add(clearBtn);
        btnPanel.add(saveBtn);
        btnPanel.add(openBtn);
 
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
 
        setVisible(true);
    }
 

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
 
        if (src == clearBtn) {
         
            textArea.setText("");
 
        } else if (src == saveBtn) {
   
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Файл хадгалах");
            int result = fileChooser.showSaveDialog(this);
 
            if (result == JFileChooser.APPROVE_OPTION) {
                String fname = fileChooser.getSelectedFile().getAbsolutePath();
                String content = textArea.getText();
 
                if (content.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                        "Бичигдсэн текст байхгүй байна!",
                        "Анхааруулга", JOptionPane.WARNING_MESSAGE);
                } else {
               
                    fe.setFileName(fname);
                    fe.printfile(content);
                    JOptionPane.showMessageDialog(this,
                        "Файл амжилттай хадгалагдлаа:\n" + fname,
                        "Амжилттай", JOptionPane.INFORMATION_MESSAGE);
                }
            }
 
        } else if (src == openBtn) {
         
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Файл нээх");
            int result = fileChooser.showOpenDialog(this);
 
            if (result == JFileChooser.APPROVE_OPTION) {
                String fname = fileChooser.getSelectedFile().getAbsolutePath();
                String content = fe.readfile(fname);
                textArea.setText(content);
            }
        }
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Lab14_TextEditor());
    }
}