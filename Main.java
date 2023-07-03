package com.jirawut.mod.inmod;
import javax.swing.*;     //นำเข้าการใช้งาน GUI
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        //ส่วนของการกำหนด GUI
        JFrame frame = new JFrame("Harm Gun Jon Jer");    //ชื่อหัว GUI
        frame.setSize(255, 190);    //กำหนดขนาดกว้าง * ยาว
        frame.setLayout(null);    //ถ้าค่าว่าง ต้องการที่จะ Set เอง

        //ส่วนของการสร้าง Input ของ GUI
        JTextField inputTextField = new JTextField();  //กำหนดตัวแปร JTextinput
        inputTextField.setBounds(20,20,200, 30);   //กำหนดขนาด InputText
        frame.add(inputTextField); //Add inputText เข้า Frame

        //ส่วนของการสร้าง Output ของ GUI
        JLabel outputLabel = new JLabel("Harn Gun Jon Jer");
        outputLabel.setBounds(20, 50, 200, 30);
        frame.add(outputLabel);  //Add Label เข้า Frame

        //ส่วนของการสร้าง Button ของ GUI
        JButton button = new JButton("Calulate");
        button.setBounds(20,80,200,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputTextField.getText();
                int inputNumber = Integer.parseInt(inputText);
                String output = Calculator.getDivisibleOutput(inputNumber);
                outputLabel.setText(output);
            }
        });
        frame.add(button);  //Add button เข้า Frame

        /*
        * อธิบายส่วนต่างๆของ javax.swing
        * JFrame คือ ส่วนของ GUI หรือ Frame
        * JTextField คือ บล็อก Input ที่มาจากคีบอร์ด
        * JLabel คือ ตัวอักษรต่างๆ
        * JButton คือ ปุ่มกด
        */

        //ส่วนของการสั่งโชว์และปิด GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //เมื่อปิด GUI จะออกจากการ Run
        frame.setVisible(true); //ทำให้ปรากฏ ต้องใส่ True
    }
}