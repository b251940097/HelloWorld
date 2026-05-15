package lab12;

import javax.swing.*;
import java.awt.*;

public class CalculatorApp {
    private JTextField firstOperandField;
    private JTextField secondOperandField;
    private JLabel resultLabel;
    private Calculator calculator;

    public CalculatorApp() {
        calculator = new Calculator();
        buildUI();
    }

    private void buildUI() {
        JFrame frame = new JFrame("Тооны машин");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 180);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel main = new JPanel(new GridLayout(3, 1, 5, 5));
        main.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

 
        JPanel labelRow = new JPanel(new GridLayout(1, 2, 5, 0));
        labelRow.add(new JLabel("Нэгдүгээр операнд"));
        labelRow.add(new JLabel("Хоёрдугаар операнд"));

  
        JPanel fieldRow = new JPanel(new GridLayout(1, 2, 5, 0));
        firstOperandField = new JTextField();
        secondOperandField = new JTextField();
        fieldRow.add(firstOperandField);
        fieldRow.add(secondOperandField);


        JPanel btnRow = new JPanel(new GridLayout(1, 4, 5, 0));
        String[] labels = {"+", "-", "*", "÷"};
        String[] ops    = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            final String op = ops[i];
            JButton btn = new JButton(labels[i]);
            btn.addActionListener(e -> {
                try {
                    double a = Double.parseDouble(firstOperandField.getText().trim());
                    double b = Double.parseDouble(secondOperandField.getText().trim());
                    double r = calculator.calculate(a, b, op);
                    resultLabel.setText("Хариу: " + r);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Хариу: Буруу тоо!");
                } catch (ArithmeticException ex) {
                    resultLabel.setText("Хариу: " + ex.getMessage());
                }
            });
            btnRow.add(btn);
        }

    
        JPanel resultRow = new JPanel(new BorderLayout());
        resultLabel = new JLabel("Хариу: ");
        resultRow.add(resultLabel, BorderLayout.WEST);
        resultRow.setBorder(BorderFactory.createEtchedBorder());

        JPanel top = new JPanel(new GridLayout(2, 1, 0, 3));
        top.add(labelRow);
        top.add(fieldRow);

        main.add(top);
        main.add(btnRow);
        main.add(resultRow);

        frame.add(main);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorApp::new);
    }
}