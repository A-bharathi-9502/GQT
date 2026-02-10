package SwingExample;

import javax.swing.*;
import java.awt.*;

public class JavaQuizUI {

    JFrame frame;
    JLabel questionLabel, rewardLabel;
    JRadioButton a,b,c,d;
    ButtonGroup group;
    JButton submit, audience, fifty;

    int index = 0;
    String userName;

    public JavaQuizUI() {

        userName = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showInputDialog("Enter your age");

        frame = new JFrame("Java Quiz");
        frame.setSize(600,450);
        frame.setLayout(null);

        questionLabel = new JLabel();
        questionLabel.setBounds(40,30,500,40);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        questionLabel.setForeground(Color.BLUE);

        a = new JRadioButton();
        b = new JRadioButton();
        c = new JRadioButton();
        d = new JRadioButton();

        a.setBounds(40,90,300,25);
        b.setBounds(40,120,300,25);
        c.setBounds(40,150,300,25);
        d.setBounds(40,180,300,25);

        group = new ButtonGroup();
        group.add(a); group.add(b); group.add(c); group.add(d);

        submit = new JButton("Submit");
        submit.setBounds(40,230,100,30);

        audience = new JButton("Audience");
        audience.setBounds(160,230,120,30);

        fifty = new JButton("50 / 50");
        fifty.setBounds(300,230,100,30);

        rewardLabel = new JLabel("Reward : ₹0");
        rewardLabel.setBounds(40,280,200,30);
        rewardLabel.setForeground(Color.GREEN);

        frame.add(questionLabel);
        frame.add(a); frame.add(b); frame.add(c); frame.add(d);
        frame.add(submit); frame.add(audience); frame.add(fifty);
        frame.add(rewardLabel);

        loadQuestion();

        submit.addActionListener(e -> checkAnswer());
        audience.addActionListener(e -> useAudience());
        fifty.addActionListener(e -> useFifty());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    void loadQuestion() {
        if(index==10){
            JOptionPane.showMessageDialog(frame,
                "🎉 Congratulations "+userName+
                "\nYou won ₹"+RewardSystem.reward);
            System.exit(0);
        }

        questionLabel.setText("Q"+(index+1)+": "+QuestionBank.questions[index]);

        String[] o = QuestionBank.options[index];
        a.setText(o[0]); b.setText(o[1]); c.setText(o[2]); d.setText(o[3]);

        a.setVisible(!o[0].equals(""));
        b.setVisible(!o[1].equals(""));
        c.setVisible(!o[2].equals(""));
        d.setVisible(!o[3].equals(""));

        a.setForeground(Color.BLACK);
        b.setForeground(Color.BLACK);
        c.setForeground(Color.BLACK);
        d.setForeground(Color.BLACK);

        group.clearSelection();
    }

    void checkAnswer() {
        char ans;

        if(a.isSelected()) ans='a';
        else if(b.isSelected()) ans='b';
        else if(c.isSelected()) ans='c';
        else if(d.isSelected()) ans='d';
        else {
            JOptionPane.showMessageDialog(frame,"Select an option");
            return;
        }

        if(AnswerValidate.isCorrect(ans, QuestionBank.answers[index])) {
            highlightCorrect();
            RewardSystem.giveReward();
            rewardLabel.setText("Reward : ₹"+RewardSystem.reward);

            JOptionPane.showMessageDialog(frame,"✔ Correct Answer!");
            index++;
            loadQuestion();
        }
        else {
            highlightCorrect();
            JOptionPane.showMessageDialog(frame,
                "❌ Wrong Answer\nYou won ₹"+RewardSystem.reward);
            System.exit(0);
        }
    }

    void highlightCorrect() {
        char cAns = QuestionBank.answers[index];
        if(cAns=='a') a.setForeground(Color.GREEN);
        if(cAns=='b') b.setForeground(Color.GREEN);
        if(cAns=='c') c.setForeground(Color.GREEN);
        if(cAns=='d') d.setForeground(Color.GREEN);
    }

    void useAudience() {
        if(LifeLines.audienceUsed || index==9){
            JOptionPane.showMessageDialog(frame,"Audience Poll not available");
            return;
        }
        JOptionPane.showMessageDialog(frame,
            "Audience suggests option : "+QuestionBank.answers[index]);
        LifeLines.audienceUsed=true;
        questionLabel.setForeground(Color.MAGENTA);
    }

    void useFifty() {
        if(LifeLines.fiftyUsed || index==9){
            JOptionPane.showMessageDialog(frame,"50/50 not available");
            return;
        }
        LifeLines.fiftyFifty(
            QuestionBank.options[index],
            QuestionBank.answers[index]
        );
        LifeLines.fiftyUsed=true;
        loadQuestion();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JavaQuizUI::new);
    }
}
