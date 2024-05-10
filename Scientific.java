import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scientific implements ActionListener
{
    JFrame frame = new JFrame(("Scientific Calculator"));
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
    JButton equal = new JButton("=");
    JButton div = new JButton("/");
    JButton mul = new JButton("x");
    JButton add = new JButton("+");
    JButton sub = new JButton("-");

    JButton rec = new JButton("1/x");
    JButton sq = new JButton("x\u00B2");
    JButton cube = new JButton("x\u00B3");
    JButton tenp = new JButton("<html>10<sup>x</sup></html>");
    JButton fact = new JButton("!x");
    JButton sqrt = new JButton("\u221A");
    JButton xpy = new JButton("<html>x<sup>y</sup></html>");
    JButton log = new JButton("log");
    JButton sin = new JButton("sin");
    JButton cos = new JButton("cos");
    JButton tan = new JButton("tan");
    JButton ln = new JButton("ln");
    JButton cosec = new JButton("cosec");
    JButton sec = new JButton("sec");
    JButton cot = new JButton("cot");
    JButton pi = new JButton("\u03C0");
    JButton epx = new JButton("<html>e<sup>x</sup></html>");
    JButton back = new JButton("BACK");
    JButton percentage = new JButton("%");

    double num1 = 0, num2 = 0, result = 0;
    int calculation = 0;


    Scientific()
    {
        prepareGui();
        addComponents();
        disable();
        addActionListener();
    }

    public void prepareGui()
    {
        frame.setSize(760,520);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.decode("#CCFFCC"));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents()
    {
        label.setBounds(20,0,705,50);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setForeground(Color.black);
        frame.add(label);

        textField.setBounds(20,40,705,50);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setBackground(Color.white);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        epx.setBounds(20, 130, 75, 50);
        epx.setSelected(false);
        epx.setFont(new Font("Calibri", Font.BOLD, 18));
        epx.setBackground(Color.decode("#99FFCC"));
        epx.setForeground(Color.black);
        frame.add(epx);

        percentage.setBounds(110, 130, 75, 50);
        percentage.setSelected(false);
        percentage.setFont(new Font("Calibri", Font.BOLD, 18));
        percentage.setBackground(Color.decode("#99FFCC"));
        percentage.setForeground(Color.black);
        frame.add(percentage);

        back.setBounds(200, 130, 165, 50);
        back.setSelected(false);
        back.setFont(new Font("Calibri", Font.BOLD, 18));
        back.setBackground(Color.RED);
        back.setForeground(Color.white);
        frame.add(back);

        rec.setBounds(20, 200, 75, 50);
        rec.setFont(new Font("Calibri", Font.BOLD, 18));
        rec.setBackground(Color.decode("#99FFCC"));
        rec.setForeground(Color.black);
        frame.add(rec);

        sq.setBounds(110, 200, 75, 50);
        sq.setSelected(false);
        sq.setFont(new Font("Calibri", Font.BOLD, 18));
        sq.setBackground(Color.decode("#99FFCC"));
        sq.setForeground(Color.black);
        frame.add(sq);

        cube.setBounds(200, 200, 75, 50);
        cube.setSelected(false);
        cube.setFont(new Font("Calibri", Font.BOLD, 18));
        cube.setBackground(Color.decode("#99FFCC"));
        cube.setForeground(Color.black);
        frame.add(cube);

        tenp.setBounds(290, 200, 75, 50);
        tenp.setSelected(false);
        tenp.setFont(new Font("Calibri", Font.BOLD, 18));
        tenp.setBackground(Color.decode("#99FFCC"));
        tenp.setForeground(Color.black);
        frame.add(tenp);

        fact.setBounds(20, 270, 75, 50);
        fact.setFont(new Font("Calibri", Font.BOLD, 18));
        fact.setBackground(Color.decode("#99FFCC"));
        fact.setForeground(Color.black);
        frame.add(fact);

        sqrt.setBounds(110, 270, 75, 50);
        sqrt.setSelected(false);
        sqrt.setFont(new Font("Calibri", Font.BOLD, 18));
        sqrt.setBackground(Color.decode("#99FFCC"));
        sqrt.setForeground(Color.black);
        frame.add(sqrt);

        xpy.setBounds(200, 270, 75, 50);
        xpy.setSelected(false);
        xpy.setFont(new Font("Calibri", Font.BOLD, 18));
        xpy.setBackground(Color.decode("#99FFCC"));
        xpy.setForeground(Color.black);
        frame.add(xpy);

        log.setBounds(290, 270, 75, 50);
        log.setSelected(false);
        log.setFont(new Font("Calibri", Font.BOLD, 18));
        log.setBackground(Color.decode("#99FFCC"));
        log.setForeground(Color.black);
        frame.add(log);

        sin.setBounds(20, 340, 75, 50);
        sin.setFont(new Font("Calibri", Font.BOLD, 18));
        sin.setBackground(Color.decode("#99FFCC"));
        sin.setForeground(Color.black);
        frame.add(sin);

        cos.setBounds(110, 340, 75, 50);
        cos.setSelected(false);
        cos.setFont(new Font("Calibri", Font.BOLD, 18));
        cos.setBackground(Color.decode("#99FFCC"));
        cos.setForeground(Color.black);
        frame.add(cos);

        tan.setBounds(200, 340, 75, 50);
        tan.setSelected(false);
        tan.setFont(new Font("Calibri", Font.BOLD, 18));
        tan.setBackground(Color.decode("#99FFCC"));
        tan.setForeground(Color.black);
        frame.add(tan);

        ln.setBounds(290, 340, 75, 50);
        ln.setSelected(false);
        ln.setFont(new Font("Calibri", Font.BOLD, 18));
        ln.setBackground(Color.decode("#99FFCC"));
        ln.setForeground(Color.black);
        frame.add(ln);

        cosec.setBounds(20, 410, 75, 50);
        cosec.setFont(new Font("Calibri", Font.BOLD, 17));
        cosec.setBackground(Color.decode("#99FFCC"));
        cosec.setForeground(Color.black);
        frame.add(cosec);

        sec.setBounds(110, 410, 75, 50);
        sec.setSelected(false);
        sec.setFont(new Font("Calibri", Font.BOLD, 18));
        sec.setBackground(Color.decode("#99FFCC"));
        sec.setForeground(Color.black);
        frame.add(sec);

        cot.setBounds(200, 410, 75, 50);
        cot.setSelected(false);
        cot.setFont(new Font("Calibri", Font.BOLD, 18));
        cot.setBackground(Color.decode("#99FFCC"));
        cot.setForeground(Color.black);
        frame.add(cot);

        pi.setBounds(290, 410, 75, 50);
        pi.setSelected(false);
        pi.setFont(new Font("Calibri", Font.BOLD, 18));
        pi.setBackground(Color.decode("#99FFCC"));
        pi.setForeground(Color.black);
        frame.add(pi);

        start.setBounds(380, 130, 75, 50);
        start.setFont(new Font("Calibri", Font.BOLD, 15));
        start.setBackground(Color.blue);
        start.setForeground(Color.white);
        frame.add(start);

        close.setBounds(470, 130, 75, 50);
        close.setSelected(false);
        close.setFont(new Font("Calibri", Font.BOLD, 15));
        close.setBackground(Color.blue);
        close.setForeground(Color.white);
        frame.add(close);

        delete.setBounds(560, 130, 75, 50);
        delete.setSelected(false);
        delete.setFont(new Font("Calibri", Font.BOLD, 16));
        delete.setBackground(Color.blue);
        delete.setForeground(Color.white);
        frame.add(delete);

        clear.setBounds(650, 130, 75, 50);
        clear.setSelected(false);
        clear.setFont(new Font("Calibri", Font.BOLD, 18));
        clear.setBackground(Color.blue);
        clear.setForeground(Color.white);
        frame.add(clear);

        seven.setBounds(380, 200, 75, 50);
        seven.setFont(new Font("Calibri", Font.BOLD, 18));
        seven.setBackground(Color.black);
        seven.setForeground(Color.white);
        frame.add(seven);

        eight.setBounds(470, 200, 75, 50);
        eight.setSelected(false);
        eight.setFont(new Font("Calibri", Font.BOLD, 18));
        eight.setBackground(Color.black);
        eight.setForeground(Color.white);
        frame.add(eight);

        nine.setBounds(560, 200, 75, 50);
        nine.setSelected(false);
        nine.setFont(new Font("Calibri", Font.BOLD, 18));
        nine.setBackground(Color.black);
        nine.setForeground(Color.white);
        frame.add(nine);

        div.setBounds(650, 200, 75, 50);
        div.setSelected(false);
        div.setFont(new Font("Calibri", Font.BOLD, 18));
        div.setBackground(Color.decode("#0000FF"));
        div.setForeground(Color.white);
        frame.add(div);

        four.setBounds(380, 270, 75, 50);
        four.setFont(new Font("Calibri", Font.BOLD, 18));
        four.setBackground(Color.black);
        four.setForeground(Color.white);
        frame.add(four);

        five.setBounds(470, 270, 75, 50);
        five.setSelected(false);
        five.setFont(new Font("Calibri", Font.BOLD, 18));
        five.setBackground(Color.black);
        five.setForeground(Color.white);
        frame.add(five);

        six.setBounds(560, 270, 75, 50);
        six.setSelected(false);
        six.setFont(new Font("Calibri", Font.BOLD, 18));
        six.setBackground(Color.black);
        six.setForeground(Color.white);
        frame.add(six);

        mul.setBounds(650, 270, 75, 50);
        mul.setSelected(false);
        mul.setFont(new Font("Calibri", Font.BOLD, 19));
        mul.setBackground(Color.decode("#0000FF"));
        mul.setForeground(Color.white);
        frame.add(mul);

        one.setBounds(380, 340, 75, 50);
        one.setFont(new Font("Calibri", Font.BOLD, 18));
        one.setBackground(Color.black);
        one.setForeground(Color.white);
        frame.add(one);

        two.setBounds(470, 340, 75, 50);
        two.setSelected(false);
        two.setFont(new Font("Calibri", Font.BOLD, 18));
        two.setBackground(Color.black);
        two.setForeground(Color.white);
        frame.add(two);

        three.setBounds(560, 340, 75, 50);
        three.setSelected(false);
        three.setFont(new Font("Calibri", Font.BOLD, 18));
        three.setBackground(Color.black);
        three.setForeground(Color.white);
        frame.add(three);

        sub.setBounds(650, 340, 75, 50);
        sub.setSelected(false);
        sub.setFont(new Font("Calibri", Font.BOLD, 26));
        sub.setBackground(Color.decode("#0000FF"));
        sub.setForeground(Color.white);
        frame.add(sub);

        point.setBounds(380, 410, 75, 50);
        point.setFont(new Font("Calibri", Font.BOLD, 22));
        point.setBackground(Color.black);
        point.setForeground(Color.white);
        frame.add(point);

        zero.setBounds(470, 410, 75, 50);
        zero.setSelected(false);
        zero.setFont(new Font("Calibri", Font.BOLD, 18));
        zero.setBackground(Color.black);
        zero.setForeground(Color.white);
        frame.add(zero);

        equal.setBounds(560, 410, 75, 50);
        equal.setSelected(false);
        equal.setFont(new Font("Calibri", Font.BOLD, 22));
            equal.setBackground(Color.decode("#0000FF"));
        equal.setForeground(Color.white);
        frame.add(equal);

        add.setBounds(650, 410, 75, 50);
        add.setSelected(false);
        add.setFont(new Font("Calibri", Font.BOLD, 20));
        add.setBackground(Color.decode("#0000FF"));
        add.setForeground(Color.white);
        frame.add(add);

        ButtonGroup group = new ButtonGroup();
        group.add(start);
        group.add(close);
        group.add(delete);
        group.add(clear);
        group.add(seven);
        group.add(eight);
        group.add(nine);
        group.add(div);
        group.add(four);
        group.add(five);
        group.add(six);
        group.add(mul);
        group.add(one);
        group.add(two);
        group.add(three);
        group.add(sub);
        group.add(point);
        group.add(zero);
        group.add(equal);
        group.add(add);
        group.add(percentage);
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
        div.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        mul.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        sub.addActionListener(this);
        point.addActionListener(this);
        zero.addActionListener(this);
        equal.addActionListener(this);
        add.addActionListener(this);
        rec.addActionListener(this);
        sq.addActionListener(this);
        cube.addActionListener(this);
        tenp.addActionListener(this);
        fact.addActionListener(this);
        sqrt.addActionListener(this);
        xpy.addActionListener(this);
        log.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        ln.addActionListener(this);
        cosec.addActionListener(this);
        sec.addActionListener(this);
        cot.addActionListener(this);
        pi.addActionListener(this);
        epx.addActionListener(this);
        back.addActionListener(this);
        percentage.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==start)
        {
            enable();
        }
        else if (e.getSource()==close)
        {
            disable();
        }
        else if(e.getSource()==back)
        {
            frame.setVisible(false);
            Calculator cal = new Calculator();
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
        else if (e.getSource() == rec)
        {
            num1 = Double.parseDouble(textField.getText());
            result = 1/num1;
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        else if (e.getSource() == sq)
        {
            num1 = Double.parseDouble(textField.getText());
            result = num1 * num1;
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        else if (e.getSource() == cube)
        {
            num1 = Double.parseDouble(textField.getText());
            result = num1 * num1 * num1;
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        else if (e.getSource() == tenp)
        {
            num1 = Double.parseDouble(textField.getText());
            result = Math.pow(10,num1);
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        else if (e.getSource() == fact)
        {
            num1 = Double.parseDouble(textField.getText());
            result = factorial((int)num1);
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        else if (e.getSource() == sqrt)
        {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sqrt(num1);
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        else if (e.getSource() == xpy)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 5;
            textField.setText("");
            label.setText(str + "^");
        }
        else if (e.getSource() == log)
        {
            num1 = Double.parseDouble(textField.getText());
            result = Math.log10(num1);
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        else if (e.getSource() == sin)
        {
            label.setText("Degree");
            num1 = Double.parseDouble(textField.getText());
            double r = Math.toRadians(num1);
            result = Math.sin(r);
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            num1 = result;
        }
        else if (e.getSource() == cos)
        {
            label.setText("Degree");
            num1 = Double.parseDouble(textField.getText());
            double r = Math.toRadians(num1);
            result = Math.cos(r);
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            num1 = result;
        }
        else if (e.getSource() == tan)
        {
            label.setText("Degree");
            num1 = Double.parseDouble(textField.getText());
            double r = Math.toRadians(num1);
            result = Math.tan(r);
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            num1 = result;
        }
        else if (e.getSource() == ln)
        {
            num1 = Double.parseDouble(textField.getText());
            result = Math.log(num1);
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        else if (e.getSource() == cosec)
        {
            label.setText("Degree");
            num1 = Double.parseDouble(textField.getText());
            double r = Math.toRadians(num1);
            double res = Math.sin(r);
            result = 1/res;
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            num1 = result;
        }
        else if (e.getSource() == sec)
        {
            label.setText("Degree");
            num1 = Double.parseDouble(textField.getText());
            double r = Math.toRadians(num1);
            double res = Math.cos(r);
            result = 1/res;
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            num1 = result;
        }
        else if (e.getSource() == cot)
        {
            label.setText("Degree");
            num1 = Double.parseDouble(textField.getText());
            double r = Math.toRadians(num1);
            double res = Math.tan(r);
            result =1/res;
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            num1 = result;
        }
        else if (e.getSource() == pi)
        {
            num1 = Math.PI;
            textField.setText(Double.toString(num1));
        }
        else if (e.getSource() == epx)
        {
            num1 = Double.parseDouble(textField.getText());
            result = Math.exp(num1);
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            num1 = result;
        }
        else if (e.getSource() == percentage)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 6;
            textField.setText("");
            label.setText(str + "%");
        }
        else if(e.getSource()==zero)
        {
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
            textField.setText(textField.getText()+"1");
        }
        else if (e.getSource() == two)
        {
            textField.setText(textField.getText() + "2");
        }
        else if (e.getSource() == three)
        {
            textField.setText(textField.getText() + "3");
        }
        else if (e.getSource() == four)
        {
            textField.setText(textField.getText() + "4");
        }
        else if (e.getSource() == five)
        {
            textField.setText(textField.getText() + "5");
        }
        else if (e.getSource() == six)
        {
            textField.setText(textField.getText() + "6");
        }
        else if (e.getSource() == seven)
        {
            textField.setText(textField.getText() + "7");
        }
        else if (e.getSource() == eight)
        {
            textField.setText(textField.getText() + "8");
        }
        else if (e.getSource() == nine)
        {
            textField.setText(textField.getText() + "9");
        }
        else if (e.getSource() == point)
        {
            if (textField.getText().contains("."))
            {
                return;
            }
            else {
                textField.setText(textField.getText()+".");
            }
        }
        else if (e.getSource() == add)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        }
        else if (e.getSource() == sub)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        }
        else if (e.getSource() == mul)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "*");
        }
        else if (e.getSource() == div)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        }
        else if (e.getSource() == equal)
        {
            String str = textField.getText();
            if (!str.isEmpty())
            {
                num2 = Double.parseDouble(str);
            }
            else
            {
                if (calculation==6 || calculation==3 ||calculation==4 ||calculation==5)
                {
                    num2=1;
                }
            }
            if (calculation == 0)
            {
                result = num2;
            }
            switch(calculation)
            {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                case 5:
                    result = Math.pow(num1,num2);
                    break;
                case 6:
                    result = num1 * (num2/100);
                    break;
            }
            if(Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else
            {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
    }

    public int factorial(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public void enable()
    {
        start.setEnabled(true);
        close.setEnabled(true);
        zero.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        point.setEnabled(true);
        clear.setEnabled(true);
        delete.setEnabled(true);
        equal.setEnabled(true);
        div.setEnabled(true);
        mul.setEnabled(true);
        add.setEnabled(true);
        sub.setEnabled(true);
        rec.setEnabled(true);
        sq.setEnabled(true);
        cube.setEnabled(true);
        tenp.setEnabled(true);
        fact.setEnabled(true);
        sqrt.setEnabled(true);
        xpy.setEnabled(true);
        log.setEnabled(true);
        sin.setEnabled(true);
        cos.setEnabled(true);
        tan.setEnabled(true);
        ln.setEnabled(true);
        cosec.setEnabled(true);
        sec.setEnabled(true);
        cot.setEnabled(true);
        pi.setEnabled(true);
        epx.setEnabled(true);
        back.setEnabled(true);
        percentage.setEnabled(true);
    }

    public void disable()
    {
        start.setEnabled(true);
        close.setEnabled(true);
        zero.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        point.setEnabled(false);
        clear.setEnabled(false);
        delete.setEnabled(false);
        equal.setEnabled(false);
        div.setEnabled(false);
        mul.setEnabled(false);
        add.setEnabled(false);
        sub.setEnabled(false);
        rec.setEnabled(false);
        sq.setEnabled(false);
        cube.setEnabled(false);
        tenp.setEnabled(false);
        fact.setEnabled(false);
        sqrt.setEnabled(false);
        xpy.setEnabled(false);
        log.setEnabled(false);
        sin.setEnabled(false);
        cos.setEnabled(false);
        tan.setEnabled(false);
        ln.setEnabled(false);
        cosec.setEnabled(false);
        sec.setEnabled(false);
        cot.setEnabled(false);
        pi.setEnabled(false);
        epx.setEnabled(false);
        back.setEnabled(true);
        percentage.setEnabled(false);
    }

    public static void main(String[] args)
    {
        Scientific scalc = new Scientific();
    }
}
