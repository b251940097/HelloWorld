package lab13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class DensityCalculator extends JFrame {
 
    private JTextField massField;
    private JTextField volumeField;
    private JTextField densityField;
    private JComboBox<String> massUnit;
    private JComboBox<String> volumeUnit;
    private JComboBox<String> densityUnit;
    private JComboBox<String> sigFigs;
    private JLabel answerLabel;
 
    public DensityCalculator() {
        setTitle("Density Calculator");
        setSize(480, 380);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        buildUI();
    }
 
    private void buildUI() {
        Color bgColor = new Color(210, 225, 240);
        JPanel main = new JPanel(new BorderLayout(8, 8));
        main.setBackground(bgColor);
        main.setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 14));
 
 
        JLabel title = new JLabel("Density Calculator", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        title.setForeground(new Color(30, 60, 110));
        title.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(160, 180, 210), 1, true),
            BorderFactory.createEmptyBorder(6, 0, 6, 0)
        ));
        title.setOpaque(true);
        title.setBackground(new Color(220, 232, 245));
 
   
        JLabel formula = new JLabel("<html><i><b>p = m / V</b></i></html>", SwingConstants.CENTER);
        formula.setFont(new Font("Serif", Font.ITALIC, 20));
        formula.setForeground(new Color(30, 60, 110));
        formula.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 0));
 
      
        JPanel fields = new JPanel(new GridLayout(3, 4, 6, 8));
        fields.setOpaque(false);
 
        String[] massUnits    = {"g", "kg", "lb", "mg"};
        String[] volumeUnits  = {"cm³", "mL", "m³", "L", "ft³"};
        String[] densityUnits = {"g/cm³", "g/mL", "kg/m³", "lb/ft³", "kg/cm³"};
 
        densityField = new JTextField("calculated density");
        densityField.setEditable(false);
        densityField.setForeground(Color.GRAY);
        densityUnit  = new JComboBox<>(densityUnits);
 
        massField   = new JTextField();
        massField.setToolTipText("mass");
        massUnit    = new JComboBox<>(massUnits);
 
        volumeField  = new JTextField();
        volumeField.setToolTipText("volume");
        volumeUnit   = new JComboBox<>(volumeUnits);
 
     
        fields.add(makeRowLabel("density  p ="));
        fields.add(densityField);
        fields.add(makeRowLabel("units"));
        fields.add(densityUnit);
 
      
        fields.add(makeRowLabel("mass  m ="));
        fields.add(massField);
        fields.add(new JLabel());
        fields.add(massUnit);

        fields.add(makeRowLabel("volume  V ="));
        fields.add(volumeField);
        fields.add(new JLabel());
        fields.add(volumeUnit);
 

        JPanel sigRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 0));
        sigRow.setOpaque(false);
        sigRow.add(new JLabel("Significant Figures"));
        sigFigs = new JComboBox<>(new String[]{"auto", "1", "2", "3", "4", "5"});
        sigRow.add(sigFigs);
 
        JPanel btnPanel = new JPanel(new BorderLayout(8, 0));
        btnPanel.setOpaque(false);
        JButton clearBtn = new JButton("Clear");
        JButton calcBtn  = new JButton("Calculate");
        styleButton(clearBtn, new Color(200, 215, 235), new Color(30, 60, 110));
        styleButton(calcBtn,  new Color(200, 215, 235), new Color(30, 60, 110));
        clearBtn.addActionListener(e -> clearFields());
        calcBtn.addActionListener(e  -> calculate());
        btnPanel.add(clearBtn, BorderLayout.WEST);
        btnPanel.add(calcBtn,  BorderLayout.EAST);
 
  
        JPanel answerPanel = new JPanel(new BorderLayout());
        answerPanel.setBackground(Color.WHITE);
        answerPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(160,180,210), 1),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        answerLabel = new JLabel("Answer:");
        answerLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        answerPanel.add(answerLabel);
 
        // Center panel
        JPanel center = new JPanel(new GridLayout(4, 1, 0, 8));
        center.setOpaque(false);
        center.add(fields);
        center.add(sigRow);
        center.add(btnPanel);
        center.add(answerPanel);
 
        main.add(title,   BorderLayout.NORTH);
        main.add(formula, BorderLayout.CENTER);
 
        JPanel south = new JPanel(new BorderLayout(0, 8));
        south.setOpaque(false);
        south.add(center);
        main.add(south, BorderLayout.SOUTH);
 
        add(main);
    }
 
    private JLabel makeRowLabel(String text) {
        JLabel l = new JLabel(text);
        l.setForeground(new Color(50, 80, 130));
        l.setFont(new Font("SansSerif", Font.PLAIN, 13));
        return l;
    }
 
    private void styleButton(JButton btn, Color bg, Color fg) {
        btn.setBackground(bg);
        btn.setForeground(fg);
        btn.setFont(new Font("SansSerif", Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(160,180,210), 1, true),
            BorderFactory.createEmptyBorder(6, 18, 6, 18)
        ));
    }
 
    private void calculate() {
        try {
            String massText   = massField.getText().trim();
            String volumeText = volumeField.getText().trim();
 
            if (massText.isEmpty() || volumeText.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Масс болон эзлэхүүний утгыг оруулна уу!",
                    "Оролтын алдаа", JOptionPane.WARNING_MESSAGE);
                return;
            }
 
            double mass   = Double.parseDouble(massText);
            double volume = Double.parseDouble(volumeText);
 
            if (volume == 0) {
                throw new ArithmeticException("Эзлэхүүн 0 байж болохгүй (тэгд хуваах алдаа)!");
            }
            if (mass < 0 || volume < 0) {
                JOptionPane.showMessageDialog(this,
                    "Масс болон эзлэхүүн сөрөг байж болохгүй!",
                    "Утгын алдаа", JOptionPane.WARNING_MESSAGE);
                return;
            }
 
 
            double massG = switch ((String) massUnit.getSelectedItem()) {
                case "kg" -> mass * 1000;
                case "lb" -> mass * 453.592;
                case "mg" -> mass / 1000;
                default   -> mass;
            };
 
    
            double volCm3 = switch ((String) volumeUnit.getSelectedItem()) {
                case "mL" -> volume;
                case "m³" -> volume * 1e6;
                case "L"  -> volume * 1000;
                case "ft³"-> volume * 28316.8;
                default   -> volume;
            };
 
            double density = massG / volCm3;
 
     
            double result = switch ((String) densityUnit.getSelectedItem()) {
                case "g/mL"    -> density;
                case "kg/m³"   -> density * 1000;
                case "lb/ft³"  -> density * 62.428;
                case "kg/cm³"  -> density / 1000;
                default        -> density;
            };
 
         
            String formatted;
            String sf = (String) sigFigs.getSelectedItem();
            if ("auto".equals(sf)) {
                formatted = String.valueOf(result);
            } else {
                int digits = Integer.parseInt(sf);
                formatted = String.format("%." + digits + "f", result);
            }
 
            densityField.setText(formatted);
            densityField.setForeground(new Color(30, 60, 110));
            answerLabel.setText("Answer: " + formatted + " " + densityUnit.getSelectedItem());
 
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Буруу оролт! Масс болон эзлэхүүнд зөвхөн тоон утга оруулна уу.\n" +
                "Жишээ: 10.5, 200 гэх мэт.",
                "NumberFormatException", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,
                ex.getMessage(),
                "ArithmeticException", JOptionPane.ERROR_MESSAGE);
        }
    }
 
    private void clearFields() {
        massField.setText("");
        volumeField.setText("");
        densityField.setText("calculated density");
        densityField.setForeground(Color.GRAY);
        answerLabel.setText("Answer:");
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DensityCalculator().setVisible(true));
    }
}