import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator implements ActionListener
{
    JFrame frame = new JFrame(("Calculator"));
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
    JButton temp = new JButton("TEMPERATURE");
    JButton scientific = new JButton("SCIENTIFIC");

    private Stack<Double> numbers;
    private Stack<Character> operators;

    Calculator()
    {
        numbers = new Stack<>();
        operators = new Stack<>();
        prepareGui();
        addComponents();
        disable();
        addActionListener();
    }

    public void prepareGui()
    {
        frame.setSize(400,600);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents()
    {
        label.setBounds(250,0,50,50);
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
        start.setBackground(Color.RED);
        start.setForeground(Color.white);
        frame.add(start);

        close.setBounds(110, 130, 75, 50);
        close.setSelected(false);
        close.setFont(new Font("Calibri", Font.BOLD, 15));
        close.setBackground(Color.RED);
        close.setForeground(Color.white);
        frame.add(close);

        delete.setBounds(200, 130, 75, 50);
        delete.setSelected(false);
        delete.setFont(new Font("Calibri", Font.BOLD, 16));
        delete.setBackground(Color.RED);
        delete.setForeground(Color.white);
        frame.add(delete);

        clear.setBounds(290, 130, 75, 50);
        clear.setSelected(false);
        clear.setFont(new Font("Calibri", Font.BOLD, 18));
        clear.setBackground(Color.RED);
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

        div.setBounds(290, 200, 75, 50);
        div.setSelected(false);
        div.setFont(new Font("Calibri", Font.BOLD, 18));
        div.setBackground(Color.ORANGE);
        div.setForeground(Color.black);
        frame.add(div);

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

        mul.setBounds(290, 270, 75, 50);
        mul.setSelected(false);
        mul.setFont(new Font("Calibri", Font.BOLD, 19));
        mul.setBackground(Color.ORANGE);
        mul.setForeground(Color.black);
        frame.add(mul);

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

        sub.setBounds(290, 340, 75, 50);
        sub.setSelected(false);
        sub.setFont(new Font("Calibri", Font.BOLD, 26));
        sub.setBackground(Color.ORANGE);
        sub.setForeground(Color.black);
        frame.add(sub);

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

        equal.setBounds(200, 410, 75, 50);
        equal.setSelected(false);
        equal.setFont(new Font("Calibri", Font.BOLD, 22));
        equal.setBackground(Color.ORANGE);
        equal.setForeground(Color.black);
        frame.add(equal);

        add.setBounds(290, 410, 75, 50);
        add.setSelected(false);
        add.setFont(new Font("Calibri", Font.BOLD, 20));
        add.setBackground(Color.ORANGE);
        add.setForeground(Color.black);
        frame.add(add);

        temp.setBounds(20, 480, 165, 50);
        temp.setFont(new Font("Calibri", Font.BOLD, 18));
        temp.setBackground(Color.blue);
        temp.setForeground(Color.white);
        frame.add(temp);

        scientific.setBounds(200, 480, 165, 50);
        scientific.setSelected(false);
        scientific.setFont(new Font("Calibri", Font.BOLD, 18));
        scientific.setBackground(Color.blue);
        scientific.setForeground(Color.white);
        frame.add(scientific);

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
        group.add(temp);
        group.add(scientific);
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
        temp.addActionListener(this);
        scientific.addActionListener(this);
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
        else if (e.getSource() == temp)
        {
            frame.setVisible(false);
            TempConvert tempConvert = new TempConvert();
        }
        else if (e.getSource() == scientific)
        {
            frame.setVisible(false);
            Scientific scalc = new Scientific();
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
        else if (e.getSource() == point)
        {
            String t = textField.getText();
            int lastOperatorIndex = Math.max(t.lastIndexOf('+'), Math.max(t.lastIndexOf('-'),
                    Math.max(t.lastIndexOf('x'), t.lastIndexOf('/'))));
            int lastPointIndex = t.lastIndexOf('.');

            if (lastPointIndex > lastOperatorIndex)
            {
                return;
            }
            else
            {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        }

        else if (e.getSource() == one || e.getSource() == two || e.getSource() == three ||
            e.getSource() == four || e.getSource() == five || e.getSource() == six ||
            e.getSource() == seven || e.getSource() == eight || e.getSource() == nine ||
            e.getSource() == zero || e.getSource() == add || e.getSource() == sub || e.getSource() == mul ||e.getSource() == div)
        {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
                label.setText(textField.getText());
        }
        else if (e.getSource() == equal)
        {
            evaluateExpression();
        }
    }
    private void evaluateExpression() {
        String expression = label.getText();
        numbers.clear();
        operators.clear();

        StringBuilder numberBuilder = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch) || ch == '.')
            {
                numberBuilder.append(ch);
            }
            else
            {
                if (numberBuilder.length() > 0) {
                    numbers.push(Double.parseDouble(numberBuilder.toString()));
                    numberBuilder.setLength(0);
                }
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch))
                {
                    performOperation(operators.pop());
                }
                operators.push(ch);
            }
        }
        if (numberBuilder.length() > 0) {
            numbers.push(Double.parseDouble(numberBuilder.toString()));
        }
        while (!operators.isEmpty()) {
            performOperation(operators.pop());
        }
        double result = numbers.pop();
        if(Double.toString(result).endsWith(".0"))
        {
            textField.setText(Double.toString(result).replace(".0",""));
        }
        else
        {
            textField.setText(Double.toString(result));
        }
        label.setText("");
    }

    private void performOperation(char operation)
    {
        double operand2 = numbers.pop();
        double operand1 = numbers.pop();
        double result = 0.0;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case 'x':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    label.setText("");
                    textField.setText("Error");
                    return;
                }
                break;
        }
        numbers.push(result);

    }

    private int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == 'x' || op == '/') {
            return 2;
        }
        return 0;
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
        div.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        mul.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        sub.setEnabled(true);
        point.setEnabled(true);
        zero.setEnabled(true);
        equal.setEnabled(true);
        add.setEnabled(true);
        temp.setEnabled(true);
        scientific.setEnabled(true);
    }

    public void disable() {
        start.setEnabled(true);
        delete.setEnabled(false);
        clear.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        div.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        mul.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        sub.setEnabled(false);
        point.setEnabled(false);
        zero.setEnabled(false);
        equal.setEnabled(false);
        add.setEnabled(false);
        temp.setEnabled(false);
        scientific.setEnabled(false);
    }

    public static void main(String[] args)
    {
       Calculator calculator = new Calculator();
    }

}
