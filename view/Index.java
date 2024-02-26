package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame{

    Index(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("홈페이지");
        this.setLayout(new GridLayout(3, 3, 10, 10));
        JButton joinButton = new JButton("회원가입");
        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(joinButton);

        JButton accountButton = new JButton("통장생성");
        accountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(accountButton);

        JButton listButton = new JButton("목록보기");
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.add(listButton);

        setSize(600, 600);
        setLocation(100, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Index();
    }
}
