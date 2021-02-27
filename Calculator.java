import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.*;

public class Calculator implements ActionListener {
    double num1;
    double num2;
    double total;
    JFrame frame;
    JTextField textField1;
    JTextField textField2;
    JLabel label;
    JButton btnAdd;
    JButton btnMinus;
    JButton btnMultiply;
    JButton btnDivide;
    JButton btnMod;
    JPanel panel;
    JLabel lnum1;
    JLabel lnum2;
    JButton btnClear;
    
        Calculator() {

           frame = new JFrame("Basic Calculator"); 
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setLayout(new FlowLayout());
           frame.setResizable(false);
           frame.getContentPane().setBackground(Color.blue);

           ImageIcon icon = new ImageIcon("D:/VSCODE PROJECTS/iconcal.png");
           
           lnum1 = new JLabel("Num1:");
           lnum1.setFont(new Font("Calibri", Font.BOLD, 20));
           lnum2 = new JLabel("Num2:");
           lnum2.setFont(new Font("Calibri", Font.BOLD, 20));
           lnum1.setForeground(Color.green);
           lnum2.setForeground(Color.green);

           textField1 = new JTextField();
           textField1.setPreferredSize(new Dimension(100,50));
           textField1.setBackground(Color.gray);
           textField1.getCaret().setVisible(true);

           textField2 = new JTextField();
           textField2.setPreferredSize(new Dimension(100,50));
           textField2.setBackground(Color.gray);

           label = new JLabel();
           label.setPreferredSize(new Dimension(250, 50));
           label.setForeground(Color.green);
           label.setFont(new Font("Calibri", Font.BOLD, 20));
           //label.setBackground(Color.gray);
           Border border = BorderFactory.createLineBorder(Color.gray);
           label.setBorder(border);


            // button text and font
           btnAdd = new JButton("+");
           btnAdd.setFont(new Font("Arial", Font.PLAIN, 25));
          
           btnMinus = new JButton("−");
           btnMinus.setFont(new Font("Arial", Font.PLAIN, 25));

           btnMultiply = new JButton("✕");
           
           btnDivide = new JButton("÷");
           btnDivide.setFont(new Font("Arial", Font.PLAIN, 25));

           btnMod = new JButton("%");
           btnMod.setFont(new Font("Arial", Font.PLAIN, 15));
           //button size
           
           btnAdd.setPreferredSize(new Dimension(50,50));
           btnMinus.setPreferredSize(new Dimension(50,50));
           btnMultiply.setPreferredSize(new Dimension(50,50));
           btnDivide.setPreferredSize(new Dimension(50,50));
           btnMod.setPreferredSize(new Dimension(50,50));

           btnAdd.setForeground(Color.green);
           btnAdd.setBackground(Color.darkGray);

           btnMinus.setForeground(Color.green);
           btnMinus.setBackground(Color.darkGray);

           btnDivide.setForeground(Color.green);
           btnDivide.setBackground(Color.darkGray);
           
           btnMultiply.setForeground(Color.green);
           btnMultiply.setBackground(Color.darkGray);
           
           btnMod.setForeground(Color.green);
           btnMod.setBackground(Color.darkGray);
           // adding action listeners
           btnAdd.addActionListener(this);
           btnMinus.addActionListener(this);
           btnMultiply.addActionListener(this);
           btnDivide.addActionListener(this);
           btnMod.addActionListener(this);

           btnClear = new JButton("Clear");
           btnClear.setFont(new Font("Arial", Font.PLAIN, 25));
           btnClear.setForeground(Color.green);
           btnClear.setBackground(Color.darkGray);
           btnClear.addActionListener(this);


           panel = new JPanel();
           panel.setBackground(new Color(34,50,60));
        
        panel.add(lnum1);
        panel.add(textField1);
        panel.add(lnum2);
        panel.add(textField2);
        panel.add(btnAdd);
        panel.add(btnMinus);
        panel.add(btnDivide);
        panel.add(btnMultiply);
        panel.add(btnMod);
        panel.add(label);
        panel.add(btnClear);


    
        frame.add(panel);

        frame.setIconImage(icon.getImage());
        frame.pack();
        frame.setVisible(true);
        }

      public void actionPerformed(ActionEvent e) {
        try {    
        if (e.getSource() == btnAdd) {
                num1 = Double.parseDouble(textField1.getText()); 
                num2 = Double.parseDouble(textField2.getText()); 
                total = num1 + num2;
                label.setText("Sum: " + String.valueOf(total));
               
            }
            else if (e.getSource() == btnMinus) {
                num1 = Integer.parseInt(textField1.getText()); 
                num2 = Integer.parseInt(textField2.getText()); 
                total = num1 - num2;
                label.setText("Difference: " + String.valueOf(total));
            }
            else if (e.getSource() == btnMultiply) {
                num1 = Integer.parseInt(textField1.getText()); 
                num2 = Integer.parseInt(textField2.getText()); 
                total = num1 * num2;
                label.setText("Product: " + String.valueOf(total));
             }
            else if (e.getSource() == btnDivide) {
                num1 = Integer.parseInt(textField1.getText()); 
                num2 = Integer.parseInt(textField2.getText()); 
                total = num1 / num2;
                label.setText("Quotient: " + String.valueOf(total));
            }
            else if (e.getSource() == btnMod) {
                num1 = Integer.parseInt(textField1.getText()); 
                num2 = Integer.parseInt(textField2.getText()); 
                total = num1 % num2;
                label.setText("Modulus: " + String.valueOf(total));
            } 
            else if (e.getSource() == btnClear) {
                textField1.setText(null);
                textField2.setText(null);
                label.setText(null);
            }
        } catch (Exception a) {
            JOptionPane.showMessageDialog(null, a.getMessage(), "Error",JOptionPane.WARNING_MESSAGE);
        }
        
        
        
          
      }
      public static void main(String [] args) {
          new Calculator();
      }
    
    
}
