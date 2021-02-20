package ru.geekbrains.Lesson8;

import javax.swing.*;
import java.awt.*;

public class BorderLayout2 extends JFrame {


    static public class MyWindow extends JFrame {

        public MyWindow() {
            setBounds(500, 500, 500, 300);
            setTitle("BoxLayoutDemo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JButton[] jbs = new JButton[10];
            setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
 //           setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
            for (int i = 0; i < jbs.length; i++) {
                jbs[i] = new JButton("#" + i);
                jbs[i].setAlignmentY((Component.BOTTOM_ALIGNMENT));
                add(jbs[i]);
            }
            setVisible(true);

        }


    }

    public static void main(String[] args) {


        new  MyWindow();
//        MyWindow window = new MyWindow();
    }

}
