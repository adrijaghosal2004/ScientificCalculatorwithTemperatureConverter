import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConvert implements ActionListener
{
    JFrame frame = new JFrame("Temperature Converter");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();

    JButton start = new JButton("START");
    JButton close = new JButton("CLOSE");
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton point = new JButton(".");
    JButton clear = new JButton("C");
    JButton delete = new JButton("DEL");
    JButton back = new JButton("BACK");
    JButton ctof = new JButton("C \u2192 F");
    JButton ctok = new JButton("C \u2192 K");
    JButton ktoc = new JButton("K \u2192 C");
    JButton ktof = new JButton("K \u2192 F");
    JButton ftoc = new JButton("F \u2192 C");
    JButton ftok = new JButton("F \u2192 K");

    double num;

    TempConvert()
    {
        prepareGui2();
        addComponents();
        disable();
        addActionListener();
    }
    public void prepareGui2()
    {
        frame.setSize(400,600);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.decode("#E0E0E0"));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addComponents()
    {
        label.setBounds(20,0,335,50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(20,40,345,50);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setBackground(Color.white);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        start.setBounds(20, 130, 75, 50);
        start.setFont(new Font("Calibri", Font.BOLD, 15));
        start.setBackground(Color.decode("#0080FF"));
        start.setForeground(Color.white);
        frame.add(start);

        close.setBounds(110, 130, 75, 50);
        close.setSelected(false);
        close.setFont(new Font("Calibri", Font.BOLD, 15));
        close.setBackground(Color.decode("#0080FF"));
        close.setForeground(Color.white);
        frame.add(close);

        delete.setBounds(200, 130, 75, 50);
        delete.setSelected(false);
        delete.setFont(new Font("Calibri", Font.BOLD, 16));
        delete.setBackground(Color.decode("#0080FF"));
        delete.setForeground(Color.white);
        frame.add(delete);

        clear.setBounds(290, 130, 75, 50);
        clear.setSelected(false);
        clear.setFont(new Font("Calibri", Font.BOLD, 18));
        clear.setBackground(Color.decode("#0080FF"));
        clear.setForeground(Color.white);
        frame.add(clear);

        seven.setBounds(20, 200, 75, 50);
        seven.setFont(new Font("Calibri", Font.BOLD, 18));
        seven.setBackground(Color.white);
        seven.setForeground(Color.black);
        frame.add(seven);

        eight.setBounds(110, 200, 75, 50);
        eight.setSelected(false);
        eight.setFont(new Font("Calibri", Font.BOLD, 18));
        eight.setBackground(Color.white);
        eight.setForeground(Color.black);
        frame.add(eight);

        nine.setBounds(200, 200, 75, 50);
        nine.setSelected(false);
        nine.setFont(new Font("Calibri", Font.BOLD, 18));
        nine.setBackground(Color.white);
        nine.setForeground(Color.black);
        frame.add(nine);

        ctok.setBounds(290, 200, 75, 50);
        ctok.setSelected(false);
        ctok.setFont(new Font("Calibri", Font.BOLD, 17));
        ctok.setBackground(Color.decode("#0080FF"));
        ctok.setForeground(Color.white);
        frame.add(ctok);

        four.setBounds(20, 270, 75, 50);
        four.setFont(new Font("Calibri", Font.BOLD, 18));
        four.setBackground(Color.white);
        four.setForeground(Color.black);
        frame.add(four);

        five.setBounds(110, 270, 75, 50);
        five.setSelected(false);
        five.setFont(new Font("Calibri", Font.BOLD, 18));
        five.setBackground(Color.white);
        five.setForeground(Color.black);
        frame.add(five);

        six.setBounds(200, 270, 75, 50);
        six.setSelected(false);
        six.setFont(new Font("Calibri", Font.BOLD, 18));
        six.setBackground(Color.white);
        six.setForeground(Color.black);
        frame.add(six);

        ctof.setBounds(290, 270, 75, 50);
        ctof.setSelected(false);
        ctof.setFont(new Font("Calibri", Font.BOLD, 17));
        ctof.setBackground(Color.decode("#0080FF"));
        ctof.setForeground(Color.white);
        frame.add(ctof);

        one.setBounds(20, 340, 75, 50);
        one.setFont(new Font("Calibri", Font.BOLD, 18));
        one.setBackground(Color.white);
        one.setForeground(Color.black);
        frame.add(one);

        two.setBounds(110, 340, 75, 50);
        two.setSelected(false);
        two.setFont(new Font("Calibri", Font.BOLD, 18));
        two.setBackground(Color.white);
        two.setForeground(Color.black);
        frame.add(two);

        three.setBounds(200, 340, 75, 50);
        three.setSelected(false);
        three.setFont(new Font("Calibri", Font.BOLD, 18));
        three.setBackground(Color.white);
        three.setForeground(Color.black);
        frame.add(three);

        ftoc.setBounds(290, 340, 75, 50);
        ftoc.setSelected(false);
        ftoc.setFont(new Font("Calibri", Font.BOLD, 17));
        ftoc.setBackground(Color.decode("#0080FF"));
        ftoc.setForeground(Color.white);
        frame.add(ftoc);

        point.setBounds(20, 410, 75, 50);
        point.setFont(new Font("Calibri", Font.BOLD, 22));
        point.setBackground(Color.white);
        point.setForeground(Color.black);
        frame.add(point);

        zero.setBounds(110, 410, 75, 50);
        zero.setSelected(false);
        zero.setFont(new Font("Calibri", Font.BOLD, 18));
        zero.setBackground(Color.white);
        zero.setForeground(Color.black);
        frame.add(zero);

        ktoc.setBounds(200, 410, 75, 50);
        ktoc.setSelected(false);
        ktoc.setFont(new Font("Calibri", Font.BOLD, 17));
        ktoc.setBackground(Color.decode("#0080FF"));
        ktoc.setForeground(Color.white);
        frame.add(ktoc);

        ftok.setBounds(290, 410, 75, 50);
        ftok.setSelected(false);
        ftok.setFont(new Font("Calibri", Font.BOLD, 17));
        ftok.setBackground(Color.decode("#0080FF"));
        ftok.setForeground(Color.white);
        frame.add(ftok);

        back.setBounds(20, 480, 265, 50);
        back.setSelected(false);
        back.setFont(new Font("Calibri", Font.BOLD, 18));
        back.setBackground(Color.decode("#0080FF"));
        back.setForeground(Color.white);
        frame.add(back);

        ktof.setBounds(290, 480, 75, 50);
        ktof.setSelected(false);
        ktof.setFont(new Font("Calibri", Font.BOLD, 17));
        ktof.setBackground(Color.decode("#0080FF"));
        ktof.setForeground(Color.white);
        frame.add(ktof);

        ButtonGroup group = new ButtonGroup();
        group.add(start);
        group.add(close);
        group.add(delete);
        group.add(clear);
        group.add(seven);
        group.add(eight);
        group.add(nine);
        group.add(four);
        group.add(five);
        group.add(six);
        group.add(one);
        group.add(two);
        group.add(three);
        group.add(point);
        group.add(zero);
        group.add(back);
        group.add(ctof);
        group.add(ctok);
        group.add(ktoc);
        group.add(ktof);
        group.add(ftoc);
        group.add(ftok);
    }
    public void addActionListener()
    {
        start.addActionListener(this);
        close.addActionListener(this);
        delete.addActionListener(this);
        clear.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        point.addActionListener(this);
        zero.addActionListener(this);
        back.addActionListener(this);
        ctof.addActionListener(this);
        ctok.addActionListener(this);
        ktoc.addActionListener(this);
        ktof.addActionListener(this);
        ftoc.addActionListener(this);
        ftok.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==start)
        {
            enable();
        }
        else if(e.getSource()==close)
        {
            disable();
        }
        else if(e.getSource()==back)
        {
            frame.setVisible(false);
            Calculator calc = new Calculator();
        }
        else if(e.getSource()==clear)
        {
            label.setText("");
            textField.setText("");
        }
        else if(e.getSource()==delete)
        {
            label.setText("");
            int len = textField.getText().length();
            int number = len-1;
            if (len >0)
            {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith(" "))
            {
                label.setText("");
            }
        }
        else if(e.getSource()==zero)
        {
            label.setText("");
            if (textField.getText().equals("0"))
            {
                return;
            }
            else {
                textField.setText(textField.getText()+"0");
            }
        }
        else if(e.getSource()==one)
        {
            label.setText("");
            textField.setText(textField.getText()+"1");
        }
        else if (e.getSource() == two)
        {
            label.setText("");
            textField.setText(textField.getText() + "2");
        }
        else if (e.getSource() == three)
        {
            label.setText("");
            textField.setText(textField.getText() + "3");
        }
        else if (e.getSource() == four)
        {
            label.setText("");
            textField.setText(textField.getText() + "4");
        }
        else if (e.getSource() == five)
        {
            label.setText("");
            textField.setText(textField.getText() + "5");
        }
        else if (e.getSource() == six)
        {
            label.setText("");
            textField.setText(textField.getText() + "6");
        }
        else if (e.getSource() == seven)
        {
            label.setText("");
            textField.setText(textField.getText() + "7");
        }
        else if (e.getSource() == eight)
        {
            label.setText("");
            textField.setText(textField.getText() + "8");
        }
        else if (e.getSource() == nine)
        {
            label.setText("");
            textField.setText(textField.getText() + "9");
        }
        else if (e.getSource() == point)
        {
            label.setText("");
            if (textField.getText().contains("."))
            {
                return;
            }
            else {
                textField.setText(textField.getText()+".");
            }
        }
        else if (e.getSource() == ctok)
        {
            String str = textField.getText();
            double celsius = Double.parseDouble(str);
            double kelvin = celsius + 273.15;
            label.setText("Kelvin");
            label.setFont(new Font("Arial", Font.BOLD, 16));
            label.setForeground(Color.BLACK);
            label.setHorizontalAlignment(SwingConstants.RIGHT);
            if(Double.toString(kelvin).endsWith(".0"))
            {
                textField.setText(Double.toString(kelvin).replace(".0",""));
            }
            else
            {
                double kel = Math.round(kelvin * 100.0) / 100.0;
                textField.setText(String.format("%.2f", kel));
            }
        }
        else if (e.getSource() == ctof)
        {
            String str = textField.getText();
            double celsius = Double.parseDouble(str);
            double fahrenheit = ((double) 9 / 5 * celsius) + 32;
            label.setText("Fahrenheit");
            label.setFont(new Font("Arial", Font.BOLD, 16));
            label.setForeground(Color.BLACK);
            label.setHorizontalAlignment(SwingConstants.RIGHT);
            if(Double.toString(fahrenheit).endsWith(".0"))
            {
                textField.setText(Double.toString(fahrenheit).replace(".0",""));
            }
            else
            {
                double f = Math.round(fahrenheit * 100.0) / 100.0;
                textField.setText(String.format("%.2f", f));
            }
        }
        else if (e.getSource() == ktoc)
        {
            String str = textField.getText();
            double kelvin = Double.parseDouble(str);
            double celsius = kelvin-273.15;
            label.setText("\u00B0Celsius");
            label.setFont(new Font("Arial", Font.BOLD, 16));
            label.setForeground(Color.BLACK);
            label.setHorizontalAlignment(SwingConstants.RIGHT);
            if(Double.toString(celsius).endsWith(".0"))
            {
                textField.setText(Double.toString(celsius).replace(".0",""));
            }
            else
            {
                double c = Math.round(celsius * 100.0) / 100.0;
                textField.setText(String.format("%.2f", c));
            }
        }
        else if (e.getSource() == ktof)
        {
            String str = textField.getText();
            double kelvin = Double.parseDouble(str);
            double fahrenheit = (kelvin-273.15) * 1.8 + 32;
            label.setText("Fahrenheit");
            label.setFont(new Font("Arial", Font.BOLD, 16));
            label.setForeground(Color.BLACK);
            label.setHorizontalAlignment(SwingConstants.RIGHT);
            if(Double.toString(fahrenheit).endsWith(".0"))
            {
                textField.setText(Double.toString(fahrenheit).replace(".0",""));
            }
            else
            {
                double f = Math.round(fahrenheit * 100.0) / 100.0;
                textField.setText(String.format("%.2f", f));
            }
        }
        else if (e.getSource() == ftoc)
        {
            String str = textField.getText();
            double fahrenheit = Double.parseDouble(str);
            double celsius = ((fahrenheit-32) * 5)/9;
            label.setText("\u00B0Celsius");
            label.setFont(new Font("Arial", Font.BOLD, 16));
            label.setForeground(Color.BLACK);
            label.setHorizontalAlignment(SwingConstants.RIGHT);
            if(Double.toString(celsius).endsWith(".0"))
            {
                textField.setText(Double.toString(celsius).replace(".0",""));
            }
            else
            {
                double c = Math.round(celsius * 100.0) / 100.0;
                textField.setText(String.format("%.2f", c));
            }
        }
        else if (e.getSource() == ftok)
        {
            String str = textField.getText();
            double fahrenheit = Double.parseDouble(str);
            double kelvin = (fahrenheit-32) * ((double) 5 /9) + 273.15;
            label.setText("Kelvin");
            label.setFont(new Font("Arial", Font.BOLD, 16));
            label.setForeground(Color.BLACK);
            label.setHorizontalAlignment(SwingConstants.RIGHT);
            if(Double.toString(kelvin).endsWith(".0"))
            {
                textField.setText(Double.toString(kelvin).replace(".0",""));
            }
            else
            {
                double kel = Math.round(kelvin * 100.0) / 100.0;
                textField.setText(String.format("%.2f", kel));
            }
        }
    }
    public void enable()
    {
        start.setEnabled(true);
        close.setEnabled(true);
        delete.setEnabled(true);
        clear.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        zero.setEnabled(true);
        back.setEnabled(true);
        ctof.setEnabled(true);
        ctok.setEnabled(true);
        ktoc.setEnabled(true);
        ktof.setEnabled(true);
        ftoc.setEnabled(true);
        ftok.setEnabled(true);
    }
    public void disable() {
        start.setEnabled(true);
        delete.setEnabled(false);
        clear.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        zero.setEnabled(false);
        back.setEnabled(true);
        ctof.setEnabled(false);
        ctok.setEnabled(false);
        ktoc.setEnabled(false);
        ktof.setEnabled(false);
        ftoc.setEnabled(false);
        ftok.setEnabled(false);
    }
    public static void main(String[] args)
    {
        TempConvert tempConvert = new TempConvert();
    }
}
