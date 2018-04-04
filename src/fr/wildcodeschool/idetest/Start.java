package fr.wildcodeschool.idetest;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class Start {
    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("https://i3.cpcache.com/product/1088057318/codemonkeycafepress_square_sticker_3_x_3.jpg?width=550&height=550&Filters=%5b%7b%22name%22%3a%22background%22%2c%22value%22%3a%22F2F2F2%22%2c%22sequence%22%3a2%7d%5d"))));
        jf.pack();
        jf.setVisible(true);
    }
}
