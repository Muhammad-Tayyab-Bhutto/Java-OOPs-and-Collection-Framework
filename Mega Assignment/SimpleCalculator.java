import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

class solveExpression {
    private String exp;
    protected int returnType = 0; /* 0, 1, 2 */ 
    protected String ans[] = {"Syntax Error !", "Math Error !", ""};
    
    private StringTokenizer element;
    private List<String> infix, prefix;
    
    protected solveExpression(String exp) {
        this.exp = exp;
        if (!error()) {
            infixToPrefix(); 
            calculatePrefix();
        }
    }
    
    protected String Answer() {
        return ans[returnType];
    }
    
    private boolean error() {
        element = new StringTokenizer(exp, "+-x/()*", true);
        infix = new ArrayList<String>();
        while (element.hasMoreElements()) 
            infix.add(new String(element.nextElement().toString()));
        
        for (int i = 0; i < infix.size(); i++) {
            String s = infix.get(i);
            if (s.equals("+") || s.equals("-") || s.equals("(")) {
                if (i == infix.size()-1) return true;
                String t = infix.get(i+1);
                if (t.equals("x") || t.equals("/") || t.equals(")")) return true;
                if (s.equals("+") || s.equals("-")) {
                    if (t.equals("+")) {
                        infix.remove(i+1);
                        i--;
                    }
                    else if (t.equals("-")) {
                        infix.set(i, s.equals("+") ? "-" : "+");
                        infix.remove(i+1);
                        i--;
                    }
                    else {
                        if (i == 0) {infix.add(i--, "0"); continue;}
                        String g = infix.get(i-1);
                        if (t.equals("(")) {
                            if (g.equals("x") || g.equals("/")) {
                                infix.set(i, s.equals("+") ? "1" : "-1");
                                infix.add(i+1, g);
                                i--;
                            }
                            else if (g.equals("(")) {
                                if (s.equals("+")) infix.remove(i--);
                                else infix.add(i--, "0");
                            }
                            continue;
                        }
                        if (g.equals("(") || g.equals("x") || g.equals("/")) {
                            if (s.equals("+")) infix.remove(i--);
                            else {
                                infix.remove(i);
                                StringBuilder num = new StringBuilder("-");
                                num.append(infix.get(i));
                                infix.set(i, new String(num));
                                i--;
                            }
                        }
                    }
                }
            }
            else if (s.equals("x") || s.equals("/")) {
                if (i == 0 || i == infix.size()-1) return true;
                String t = infix.get(i+1);
                if (t.equals("x") || t.equals("/") || t.equals(")")) return true;
            }
            else if (s.equals(")")) {
                if (i == 0) return true;
                if (i == infix.size()-1) continue;
                String t = infix.get(i+1);
                if (t.equals("+") || t.equals("-") || t.equals("x") || t.equals("/") || t.equals(")")) continue;
                if (t.equals("(")) {
                    infix.add(i+1, "x"); continue;
                }
                return true;
            }
            else {
                try {
                    double t = (double) Double.parseDouble(s);
                } 
                catch (NumberFormatException e) {
                    return true;
                }
                if (i == infix.size()-1) continue;
                String t = infix.get(i+1);
                if (t.equals("(")) infix.add(i+1, "x");
            }
        }
        return checkOpenClose();
    }
    
    private boolean checkOpenClose() {
        int cnt = 0;
        for (String s : infix) {
            if (s.equals("(")) cnt++;
            else if (s.equals(")")) {
                if (cnt == 0) return true;
                cnt--;
            }
        }
        for (; cnt > 0; cnt--) infix.add(")");
        return cnt == 0 ? false : true;
    }
    
    private int rank(String s) {
        if (s.equals("x") || s.equals("/")) return 2;
        if (s.equals("+") || s.equals("-")) return 1;
        return 0;
    }
    
    private void infixToPrefix() {
        Collections.reverse(infix);
        Deque<String> st = new LinkedList<String>();
        prefix = new ArrayList<String>();

        for (String t : infix) {
            if (t.equals("+") || t.equals("-") || t.equals("x") || t.equals("/")) {
                while (!st.isEmpty() && rank(st.peek()) > rank(t)) {
                    prefix.add(st.pop());
                }
                st.push(t);
            }
            else if (t.equals(")")) {
                st.push(t);
            }
            else if (t.equals("(")) {
                while (!st.isEmpty() && !st.peek().equals(")")) {
                    prefix.add(st.pop());
                }
                st.pop();
            }
            else {
                prefix.add(t);
            }
        }
        while (!st.isEmpty()) prefix.add(st.pop());
        Collections.reverse(prefix);
    }
    
    private void calculatePrefix() {
        Collections.reverse(prefix);
        Deque<Double> st = new LinkedList<Double>();
        for (String t : prefix) {
            if (t.equals("+") || t.equals("-") || t.equals("x") || t.equals("/")) {
                double a = st.pop(), b = st.pop();
                if (t.equals("+")) a += b;
                else if (t.equals("-")) a -= b;
                else if (t.equals("x")) a *= b;
                
                else {
                    if (Math.abs(b) <= Double.MIN_NORMAL) {
                        returnType = 1;
                        return ;
                    }
                    a /= b;
                }
                st.push(a);
            }
            else {
                st.push(Double.parseDouble(t));
            }
        }
        returnType = 2;
        ans[2] = st.pop().toString();
    }
}
public class SimpleCalculator extends JFrame {

    public SimpleCalculator() {
        this.initComponent();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initComponent() {
        labelCalculator = new JLabel();
        ScreenUserInterface = new JPanel();
        screenInput = new JTextField();
        screenOutput = new JTextField();
        ButtonUserInterface = new JPanel();
        copyright = new JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));
        setTitle("Calculator - Using Java Swing ");
        setFocusTraversalKeysEnabled(false);
        
        labelCalculator.setBackground(new Color(0, 0, 0));
        labelCalculator.setFont(new Font("Verdana", 1, 30)); 
        labelCalculator.setForeground(new Color(0, 255, 51));
        labelCalculator.setHorizontalAlignment(SwingConstants.CENTER);
        labelCalculator.setText("CALCULATOR");
        labelCalculator.setOpaque(true);
        labelCalculator.setPreferredSize(new Dimension(480, 50));
        getContentPane().add(labelCalculator);

        ScreenUserInterface.setPreferredSize(new java.awt.Dimension(450, 150));
        ScreenUserInterface.setLayout(new java.awt.GridLayout(2, 0, 0, 20));

        screenInput.setFont(new java.awt.Font("Courier New", Font.BOLD, 30)); 
        screenInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        screenInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        screenInput.setSelectedTextColor(Color.WHITE);
        screenInput.setSelectionColor(Color.DARK_GRAY);

        addScreenInputEvent();
        
        screenOutput.setEditable(false);
        screenOutput.setFont(new java.awt.Font("Courier New", Font.BOLD, 30)); 
        screenOutput.setForeground(new java.awt.Color(0, 51, 204));
        screenOutput.setOpaque(true);
        screenOutput.setBackground(Color.WHITE);
        screenOutput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        screenOutput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        screenOutput.setSelectedTextColor(Color.WHITE);
        screenOutput.setSelectionColor(Color.DARK_GRAY);
        
        ScreenUserInterface.add(screenInput);
        ScreenUserInterface.add(screenOutput);
        getContentPane().add(ScreenUserInterface);
        
        ButtonUserInterface.setPreferredSize(new java.awt.Dimension(420, 270));
        ButtonUserInterface.setLayout(new java.awt.GridLayout(0, 5, 10, 10));
        
        for (int i = 0; i < stringButton.length; i++) {
            b[i] = new JButton(stringButton[i]);
            b[i].setFont(new java.awt.Font("Verdana", 1, 25)); 
            b[i].setMargin(new java.awt.Insets(0, 0, 0, 0));
            b[i].setForeground(Color.black);
        }
        
        b[10].setForeground(new Color(0,50,162));
        b[11].setForeground(new Color(0,50,162));
        b[12].setForeground(new Color(0,50,162));
        b[19].setForeground(new Color(200, 0, 0));
        for(int i=13;i<=16;i++) b[i].setForeground(new Color(200, 0, 0));
        b[17].setForeground(Color.red);
        b[18].setForeground(Color.red);
        b[10].setFont(new java.awt.Font("Verdana", 1, 35));
        b[13].setFont(new java.awt.Font("Verdana", 1, 30));
        b[14].setFont(new java.awt.Font("Verdana", 1, 40));
        b[15].setFont(new java.awt.Font("Verdana", 1, 30));
        b[19].setFont(new java.awt.Font("Verdana", 1, 30));

        addButtonEvent();
        
        for (int i = 0; i < stringButton.length; i++) ButtonUserInterface.add(b[orderButtonDisplay[i]]);
        getContentPane().add(ButtonUserInterface);
        
        copyright.setBackground(new Color(0, 0, 0));
        copyright.setFont(new Font("Verdana", 1, 23)); 
        copyright.setForeground(new Color(0, 255, 0));
        copyright.setHorizontalAlignment(SwingConstants.CENTER);
        copyright.setText("Muhammad Tayyab Bhutto");
        copyright.setOpaque(true);
        copyright.setPreferredSize(new Dimension(480, 50));
        getContentPane().add(copyright);
    }
    
    private void updateScreenInput(String add) {
        StringBuilder cur = new StringBuilder(screenInput.getText());
        int pos = screenInput.getCaretPosition();
        cur.insert(pos, add);
        screenInput.setText(new String(cur));
        screenInput.setCaretPosition(pos+add.length());
    }
    
    private void addScreenInputEvent() {
        screenInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume();
                char c = e.getKeyChar(); 
                String sc = Character.toString(c);
                for (int i = 0; i < 17; i++) {
                    if (sc.equals(stringButton[i])) {
                        updateScreenInput(sc); break;
                    }
                }
                if (c == '*') updateScreenInput("x");
                if (c == '=' || c == KeyEvent.VK_ENTER) {
                    String exp = screenInput.getText();
                    screenOutput.setText(new solveExpression(exp).Answer());
                }
            }
        });
    }
    
    private void addButtonEvent() {
        for (int i = 0; i <= 16; i++) {
            String g = stringButton[i];
            b[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateScreenInput(g);
                }
            });
        }
        
        b[17].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenInput.setText("");
                screenOutput.setText("");
            }
        });
        
        b[18].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = screenInput.getText();
                if (s.length() == 0) return ;
                int pos = screenInput.getCaretPosition();
                if (pos == 0) return ;
                String t = s.substring(0, pos-1);
                screenInput.setText(t.concat(s.substring(pos, s.length())));
                screenInput.setCaretPosition(pos-1);
            }
        });
        
        b[19].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp = screenInput.getText();
                screenOutput.setText(new solveExpression(exp).Answer());
            }
        });
    }
    
    /* Variables declaration*/
    private javax.swing.JPanel ButtonUserInterface;
    private javax.swing.JPanel ScreenUserInterface;
    private javax.swing.JLabel labelCalculator;
    private javax.swing.JLabel copyright;
    private javax.swing.JTextField screenInput;
    private javax.swing.JTextField screenOutput;
    private String stringButton[] = {"0","1","2","3","4","5","6","7","8","9",
                                    ".","(",")","+","-","x","/","AC","DEL","="};
    private JButton b[] = new JButton[stringButton.length];
    private int orderButtonDisplay[] = {
        7,  8,  9,  18, 17,
        4,  5,  6,  15, 16,
        1,  2,  3,  13, 14,
        0,  10, 19, 11, 12,
    };

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
