import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexandros Oikonomou, Stelios Panagiotopoulos, Ioannhs Xypteras.
 */
public class TicTacToeCode extends javax.swing.JFrame {
    
    /**
     * Creates new form TicTacToeCode
     */
    
    private String startGame = "X";
    private int XCount = 0;
    private int OCount = 0;
    
    public TicTacToeCode() {
        initComponents();
    }

    private void gameScore(){
        ScoreX.setText(String.valueOf(XCount));
        ScoreO.setText(String.valueOf(OCount));
    }
    
    private void ChooseAPlayer(){
        if(startGame.equalsIgnoreCase("X")) {
            startGame = "O";
         }
        else {
            startGame = "X";
         }
    }
    
    public int winningflag = 0;
    public  int BCount = 0;
    
    private void winningGame() {
        String Button1 = btn1.getText();
        String Button2 = btn2.getText();
        String Button3 = btn3.getText();
        String Button4 = btn4.getText();
        String Button5 = btn5.getText();
        String Button6 = btn6.getText();
        String Button7 = btn7.getText();
        String Button8 = btn8.getText();
        String Button9 = btn9.getText();
        
        BCount++;
        
        //"X" Tic Tac Toe Conditions.
        //ΟΡΙΖΟΝΤΙΑ: <<---
        if(Button1==("X") && Button2==("X") && Button3==("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            winningflag = 1;
            BCount = 0;
        }
        if(Button4==("X") && Button5==("X") && Button6==("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore(); 
            winningflag = 1;
            BCount = 0;
        } 
        if(Button7==("X") && Button8==("X") && Button9==("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            winningflag = 1;
            BCount = 0;
        }
        //ΚΑΤΑΚΟΡΥΦΑ: <<---
        if(Button1==("X") && Button4==("X") && Button7==("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            winningflag = 1;
            BCount = 0;
        }
        if(Button2==("X") && Button5==("X") && Button8==("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            winningflag = 1;
            BCount = 0;
        } 
        if(Button3==("X") && Button6==("X") && Button9==("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();  
            winningflag = 1;
            BCount = 0;
        }      
        //ΠΛΑΓΙΑ: <<---
        if(Button1==("X") && Button5==("X") && Button9==("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            winningflag = 1;
            BCount = 0;
        }
        if(Button3==("X") && Button5==("X") && Button7==("X")) {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            winningflag = 1;
            BCount = 0;
        } 
        
        ///////////////////////////////////////////////////////
        
        //"O" Tic Tac Toe Conditions.
        //ΟΡΙΖΟΝΤΙΑ: <<---
        if(Button1==("O") && Button2==("O") && Button3==("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();  
            winningflag = 1;
            BCount = 0;
        }
        if(Button4==("O") && Button5==("O") && Button6==("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            winningflag = 1;
            BCount = 0;
        } 
        if(Button7==("O") && Button8==("O") && Button9==("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();  
            winningflag = 1;
            BCount = 0;
        }
        //ΚΑΤΑΚΟΡΥΦΑ: <<---
        if(Button1==("O") && Button4==("O") && Button7==("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();  
            winningflag = 1;
            BCount = 0;
        }
        if(Button2==("O") && Button5==("O") && Button8==("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore(); 
            winningflag = 1;
            BCount = 0;
        } 
        if(Button3==("O") && Button6==("O") && Button9==("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore(); 
            winningflag = 1;
            BCount = 0;
        }
        //ΠΛΑΓΙΑ: <<---
        if(Button1==("O") && Button5==("O") && Button9==("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            winningflag = 1;
            BCount = 0;
        }
        if(Button3==("O") && Button5==("O") && Button7==("O")) {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            winningflag = 1;
            BCount = 0;
        }
        
        if(winningflag == 1){
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText(""); 
            
            winningflag = 0;
        }
        
        if(BCount==9){
            JOptionPane.showMessageDialog(this, "Nobody Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText(""); 
            BCount = 0;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        GamePanel = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        GeneralPanel = new javax.swing.JPanel();
        ScorePanel = new javax.swing.JPanel();
        PlayerO = new javax.swing.JLabel();
        PlayerX = new javax.swing.JLabel();
        ScoreO = new javax.swing.JLabel();
        ScoreX = new javax.swing.JLabel();
        ControlPanel = new javax.swing.JPanel();
        NewGameButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        TurnDisplay = new javax.swing.JTextField();
        TitlePanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        BackgroundPanel.setBackground(new java.awt.Color(0, 0, 0));

        GamePanel.setBackground(new java.awt.Color(0, 0, 0));
        GamePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 111)); // NOI18N
        btn1.setFocusable(false);
        btn1.setMaximumSize(new java.awt.Dimension(200, 200));
        btn1.setMinimumSize(new java.awt.Dimension(200, 200));
        btn1.setPreferredSize(new java.awt.Dimension(200, 200));
        btn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn1FocusLost(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 111)); // NOI18N
        btn2.setFocusable(false);
        btn2.setMaximumSize(new java.awt.Dimension(200, 200));
        btn2.setMinimumSize(new java.awt.Dimension(200, 200));
        btn2.setPreferredSize(new java.awt.Dimension(200, 200));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 111)); // NOI18N
        btn3.setFocusable(false);
        btn3.setMaximumSize(new java.awt.Dimension(200, 200));
        btn3.setMinimumSize(new java.awt.Dimension(200, 200));
        btn3.setPreferredSize(new java.awt.Dimension(200, 200));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 111)); // NOI18N
        btn4.setFocusable(false);
        btn4.setMaximumSize(new java.awt.Dimension(200, 200));
        btn4.setMinimumSize(new java.awt.Dimension(200, 200));
        btn4.setPreferredSize(new java.awt.Dimension(200, 200));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 111)); // NOI18N
        btn5.setFocusable(false);
        btn5.setMaximumSize(new java.awt.Dimension(200, 200));
        btn5.setMinimumSize(new java.awt.Dimension(200, 200));
        btn5.setPreferredSize(new java.awt.Dimension(200, 200));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 111)); // NOI18N
        btn6.setFocusable(false);
        btn6.setMaximumSize(new java.awt.Dimension(200, 200));
        btn6.setMinimumSize(new java.awt.Dimension(200, 200));
        btn6.setPreferredSize(new java.awt.Dimension(200, 200));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 111)); // NOI18N
        btn7.setFocusable(false);
        btn7.setMaximumSize(new java.awt.Dimension(200, 200));
        btn7.setMinimumSize(new java.awt.Dimension(200, 200));
        btn7.setPreferredSize(new java.awt.Dimension(200, 200));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 111)); // NOI18N
        btn8.setFocusable(false);
        btn8.setMaximumSize(new java.awt.Dimension(200, 200));
        btn8.setMinimumSize(new java.awt.Dimension(200, 200));
        btn8.setPreferredSize(new java.awt.Dimension(200, 200));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 111)); // NOI18N
        btn9.setFocusable(false);
        btn9.setMaximumSize(new java.awt.Dimension(200, 200));
        btn9.setMinimumSize(new java.awt.Dimension(200, 200));
        btn9.setPreferredSize(new java.awt.Dimension(200, 200));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GamePanelLayout = new javax.swing.GroupLayout(GamePanel);
        GamePanel.setLayout(GamePanelLayout);
        GamePanelLayout.setHorizontalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );
        GamePanelLayout.setVerticalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        GeneralPanel.setBackground(new java.awt.Color(0, 0, 0));
        GeneralPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        ScorePanel.setBackground(new java.awt.Color(0, 0, 0));
        ScorePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        PlayerO.setFont(new java.awt.Font("Tempus Sans ITC", 0, 66)); // NOI18N
        PlayerO.setForeground(new java.awt.Color(255, 0, 255));
        PlayerO.setText("Player O:");

        PlayerX.setFont(new java.awt.Font("Tempus Sans ITC", 0, 66)); // NOI18N
        PlayerX.setForeground(java.awt.Color.green);
        PlayerX.setText("Player X:");

        ScoreO.setFont(new java.awt.Font("Tempus Sans ITC", 0, 66)); // NOI18N
        ScoreO.setForeground(new java.awt.Color(255, 255, 0));
        ScoreO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScoreO.setText("0");

        ScoreX.setFont(new java.awt.Font("Tempus Sans ITC", 0, 66)); // NOI18N
        ScoreX.setForeground(new java.awt.Color(255, 255, 0));
        ScoreX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScoreX.setText("0");

        javax.swing.GroupLayout ScorePanelLayout = new javax.swing.GroupLayout(ScorePanel);
        ScorePanel.setLayout(ScorePanelLayout);
        ScorePanelLayout.setHorizontalGroup(
            ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ScorePanelLayout.createSequentialGroup()
                        .addComponent(PlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)
                        .addComponent(ScoreX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ScorePanelLayout.createSequentialGroup()
                        .addComponent(PlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(ScoreO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ScorePanelLayout.setVerticalGroup(
            ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorePanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ScorePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ScoreX, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(17, 17, 17)))
                .addGap(3, 3, 3)
                .addGroup(ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ScorePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ScoreO, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(17, 17, 17))))
        );

        ControlPanel.setBackground(new java.awt.Color(0, 0, 0));
        ControlPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        NewGameButton.setBackground(new java.awt.Color(0, 0, 0));
        NewGameButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 68)); // NOI18N
        NewGameButton.setForeground(new java.awt.Color(0, 255, 255));
        NewGameButton.setMnemonic('N');
        NewGameButton.setText("New Game");
        NewGameButton.setDisplayedMnemonicIndex(-1);
        NewGameButton.setFocusable(false);
        NewGameButton.setMaximumSize(new java.awt.Dimension(200, 200));
        NewGameButton.setMinimumSize(new java.awt.Dimension(200, 200));
        NewGameButton.setPreferredSize(new java.awt.Dimension(200, 200));
        NewGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 70)); // NOI18N
        ExitButton.setForeground(java.awt.Color.red);
        ExitButton.setMnemonic('E');
        ExitButton.setText("Exit");
        ExitButton.setDisplayedMnemonicIndex(-1);
        ExitButton.setFocusable(false);
        ExitButton.setMaximumSize(new java.awt.Dimension(200, 200));
        ExitButton.setMinimumSize(new java.awt.Dimension(200, 200));
        ExitButton.setPreferredSize(new java.awt.Dimension(200, 200));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        TurnDisplay.setEditable(false);
        TurnDisplay.setBackground(new java.awt.Color(0, 0, 0));
        TurnDisplay.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        TurnDisplay.setForeground(java.awt.Color.green);
        TurnDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TurnDisplay.setText("Player X");
        TurnDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 30), new java.awt.Color(255, 255, 0))); // NOI18N
        TurnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TurnDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addComponent(NewGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(TurnDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(NewGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout GeneralPanelLayout = new javax.swing.GroupLayout(GeneralPanel);
        GeneralPanel.setLayout(GeneralPanelLayout);
        GeneralPanelLayout.setHorizontalGroup(
            GeneralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(GeneralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        GeneralPanelLayout.setVerticalGroup(
            GeneralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(ScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TitlePanel.setBackground(new java.awt.Color(0, 0, 0));
        TitlePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Title.setFont(new java.awt.Font("Tempus Sans ITC", 0, 70)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Tic Tac Toe ");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addGap(318, 318, 318))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 70, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addComponent(GeneralPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60))))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GeneralPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );

        getContentPane().add(BackgroundPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private JFrame frame;
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(btn1.getText().isEmpty()) { 
            btn1.setText(startGame);
            if(btn1.getText()==("X")){
                btn1.setForeground(Color.GREEN);
            }
            else
                btn1.setForeground(Color.MAGENTA);
            if(startGame.equalsIgnoreCase("X")){
                TurnDisplay.setText("Player O");
                TurnDisplay.setForeground(Color.MAGENTA);
            }
            else{
                TurnDisplay.setText("Player X");
                TurnDisplay.setForeground(Color.GREEN);
            }
            ChooseAPlayer();
            winningGame();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(btn3.getText().isEmpty()) { 
            btn3.setText(startGame);
            if(btn3.getText()==("X")){
                btn3.setForeground(Color.GREEN);
            }
            else
                btn3.setForeground(Color.MAGENTA);
            if(startGame.equalsIgnoreCase("X")){
                TurnDisplay.setText("Player O");
                TurnDisplay.setForeground(Color.MAGENTA);
            }
            else{
                TurnDisplay.setText("Player X");
                TurnDisplay.setForeground(Color.GREEN);
            }
            ChooseAPlayer();
            winningGame(); 
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(btn2.getText().isEmpty()) { 
            btn2.setText(startGame);
            if(btn2.getText()==("X")){
                btn2.setForeground(Color.GREEN);
            }
            else
                btn2.setForeground(Color.MAGENTA);
            if(startGame.equalsIgnoreCase("X")){
                TurnDisplay.setText("Player O");
                TurnDisplay.setForeground(Color.MAGENTA);
            }
            else{
                TurnDisplay.setText("Player X");
                TurnDisplay.setForeground(Color.GREEN);
            }
            ChooseAPlayer();
            winningGame();
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void NewGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameButtonActionPerformed
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        ScoreX.setText("0");
        ScoreO.setText("0");
        
        XCount = 0;
        OCount = 0;
        BCount = 0;
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText(""); 
    }//GEN-LAST:event_NewGameButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Tic Tac Toe"
        , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(btn4.getText().isEmpty()) { 
            btn4.setText(startGame);
            if(btn4.getText()==("X")){
                btn4.setForeground(Color.GREEN);
            }
            else
                btn4.setForeground(Color.MAGENTA);
            if(startGame.equalsIgnoreCase("X")){
                TurnDisplay.setText("Player O");
                TurnDisplay.setForeground(Color.MAGENTA);
            }
            else{
                TurnDisplay.setText("Player X");
                TurnDisplay.setForeground(Color.GREEN);
            }
            ChooseAPlayer();
            winningGame();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(btn5.getText().isEmpty()) { 
            btn5.setText(startGame);
            if(btn5.getText()==("X")){
                btn5.setForeground(Color.GREEN);
            }
            else
                btn5.setForeground(Color.MAGENTA);
            if(startGame.equalsIgnoreCase("X")){
                TurnDisplay.setText("Player O");
                TurnDisplay.setForeground(Color.MAGENTA);
            }
            else{
                TurnDisplay.setText("Player X");
                TurnDisplay.setForeground(Color.GREEN);
            }
            ChooseAPlayer();
            winningGame();
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(btn6.getText().isEmpty()) { 
            btn6.setText(startGame);
            if(btn6.getText()==("X")){
                btn6.setForeground(Color.GREEN);
            }
            else
                btn6.setForeground(Color.MAGENTA);
            if(startGame.equalsIgnoreCase("X")){
                TurnDisplay.setText("Player O");
                TurnDisplay.setForeground(Color.MAGENTA);
            }
            else{
                TurnDisplay.setText("Player X");
                TurnDisplay.setForeground(Color.GREEN);
            }
            ChooseAPlayer();
            winningGame();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(btn7.getText().isEmpty()) { 
            btn7.setText(startGame);
            if(btn7.getText()==("X")){
                btn7.setForeground(Color.GREEN);
            }
            else
                btn7.setForeground(Color.MAGENTA);
            if(startGame.equalsIgnoreCase("X")){
                TurnDisplay.setText("Player O");
                TurnDisplay.setForeground(Color.MAGENTA);
            }
            else{
                TurnDisplay.setText("Player X");
                TurnDisplay.setForeground(Color.GREEN);
            }
            ChooseAPlayer();
            winningGame();
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(btn8.getText().isEmpty()) { 
            btn8.setText(startGame);
            if(btn8.getText()==("X")){
                btn8.setForeground(Color.GREEN);
            }
            else
                btn8.setForeground(Color.MAGENTA);
            if(startGame.equalsIgnoreCase("X")){
                TurnDisplay.setText("Player O");
                TurnDisplay.setForeground(Color.MAGENTA);
            }
            else{
                TurnDisplay.setText("Player X");
                TurnDisplay.setForeground(Color.GREEN);
            }
            ChooseAPlayer();
            winningGame();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(btn9.getText().isEmpty()) { 
            btn9.setText(startGame);
            if(btn9.getText()==("X")){
                btn9.setForeground(Color.GREEN);
            }
            else
                btn9.setForeground(Color.MAGENTA);
            if(startGame.equalsIgnoreCase("X")){
                TurnDisplay.setText("Player O");
                TurnDisplay.setForeground(Color.MAGENTA);
            }
            else{
                TurnDisplay.setText("Player X");
                TurnDisplay.setForeground(Color.GREEN);
            }
            ChooseAPlayer();
            winningGame();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void TurnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TurnDisplayActionPerformed

    private void btn1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn1FocusGained
        btn1.setBorderPainted(true);
    }//GEN-LAST:event_btn1FocusGained

    private void btn1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn1FocusLost
        btn1.setBorderPainted(false);
    }//GEN-LAST:event_btn1FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel GamePanel;
    private javax.swing.JPanel GeneralPanel;
    private javax.swing.JButton NewGameButton;
    private javax.swing.JLabel PlayerO;
    private javax.swing.JLabel PlayerX;
    private javax.swing.JLabel ScoreO;
    private javax.swing.JPanel ScorePanel;
    private javax.swing.JLabel ScoreX;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JTextField TurnDisplay;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    // End of variables declaration//GEN-END:variables
}
