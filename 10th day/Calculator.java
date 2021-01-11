import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton subButton;
    JButton addButton;
    JButton clearButton;

    String oldValue;
    String op;
    float res;
    //int n=10;
    boolean atButtonClick=false;
    Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,100);
        jf.getContentPane().setBackground(Color.darkGray);
    

        displayLabel=new JLabel();
        displayLabel.setBounds(30,20,530,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Italic", Font.PLAIN, 20));
        jf.add(displayLabel);

        sevenButton=new JButton("7");
        sevenButton.setBounds(30,80,80,80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);
 
        eightButton=new JButton("8");
        eightButton.setBounds(150,80,80,80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(260,80,80,80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30,180,80,80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(150,180,80,80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(260,180,80,80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30,280,80,80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(150,280,80,80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(260,280,80,80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);
        
        dotButton=new JButton(".");
        dotButton.setBounds(30,380,80,80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(150,380,80,80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton=new JButton("=");
        equalButton.setBounds(260,380,80,80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton=new JButton("/");
        divButton.setBounds(370,80,80,80);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divButton.addActionListener(this);
        jf.add(divButton);

        mulButton=new JButton("x");
        mulButton.setBounds(370,180,80,80);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
        mulButton.addActionListener(this);
        jf.add(mulButton);

        subButton=new JButton("-");
        subButton.setBounds(370,280,80,80);
        subButton.setFont(new Font("Arial", Font.PLAIN, 40));
        subButton.addActionListener(this);
        jf.add(subButton);

        addButton=new JButton("+");
        addButton.setBounds(370,380,80,80);
        addButton.setFont(new Font("Arial", Font.PLAIN, 40));
        addButton.addActionListener(this);
        jf.add(addButton);

        
        clearButton=new JButton("C");
        clearButton.setBounds(480,80,80,80);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
        clearButton.addActionListener(this);
        jf.add(clearButton);
        

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== sevenButton){
            if(atButtonClick){
                displayLabel.setText("7");
                atButtonClick=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"7");
            }
        }
        else if(e.getSource()== eightButton){
            if(atButtonClick){
                displayLabel.setText("8");
                atButtonClick=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"8");
            }
        }
        else if(e.getSource()== nineButton){
            if(atButtonClick){
                displayLabel.setText("9");
                atButtonClick=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"9");
            }
        }
        else if(e.getSource()== fourButton){
            if(atButtonClick){
                displayLabel.setText("4");
                atButtonClick=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"4");
            }
        }
        else if(e.getSource()== fiveButton){
            if(atButtonClick){
                displayLabel.setText("5");
                atButtonClick=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"5");
            }
        }
        else if(e.getSource()== sixButton){
            if(atButtonClick){
                displayLabel.setText("6");
                atButtonClick=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"6");
            }
        }
        else if(e.getSource()== oneButton){
            if(atButtonClick){
                displayLabel.setText("1");
                atButtonClick=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"1");
            }
        }
        else if(e.getSource()== twoButton){
            if(atButtonClick){
                displayLabel.setText("2");
                atButtonClick=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"2");
            }
        }
        else if(e.getSource()== threeButton){
            if(atButtonClick){
                displayLabel.setText("3");
                atButtonClick=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"3");
            }
        }
        else if(e.getSource()== dotButton){
            displayLabel.setText(displayLabel.getText()+".");
        }
        else if(e.getSource()== zeroButton){
            if(atButtonClick){
                displayLabel.setText("0");
                atButtonClick=false;
            }
            displayLabel.setText(displayLabel.getText()+"0");
        }
        else if(e.getSource()== equalButton){
            String newValue=displayLabel.getText();
            float oldValuef=Float.parseFloat(oldValue);
            float newValuef=Float.parseFloat(newValue);
            
            if(op == "+"){
                res=oldValuef + newValuef;
            }else if(op== "-"){
                res=oldValuef-newValuef;
            }else if(op== "*"){
                res=oldValuef*newValuef;
            }else if(op== "/"){
                res=oldValuef/newValuef;
            }
            displayLabel.setText(res+"");
            
        }
        else if(e.getSource()== divButton){
            atButtonClick=true;
            oldValue=displayLabel.getText();
            op="/";
            displayLabel.setText("/");
        }
        else if(e.getSource()== mulButton){
            atButtonClick=true;
            oldValue=displayLabel.getText();
            op="*";
            displayLabel.setText("x");
        }
        else if(e.getSource()== subButton){
            atButtonClick=true;
            oldValue=displayLabel.getText();
            op="-";
            displayLabel.setText("-");
        }
        else if(e.getSource()== addButton){
            atButtonClick=true;
            oldValue=displayLabel.getText();
            op="+";
            displayLabel.setText("+");
        }
        else if(e.getSource()== clearButton){
            displayLabel.setText("");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
