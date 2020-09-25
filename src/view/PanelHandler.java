package view;

import control.MainController;
import model.Employee;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHandler {
    private JPanel panel;
    private JButton MainButton;
    private JLabel firstname;
    private JLabel lastname;
    private JLabel age;
    private JLabel einschränkungen;
    private JLabel workyears;
    private JLabel workyearsLabel;
    private JLabel ageLabel;
    private JLabel sex;
    private JLabel sexLabel;
    private JTextField firstnameField;
    private JTextField lastnameField;
    private JButton sexButton;
    private JTextField einschränkungsField;
    private JButton workyearsButton;
    private JButton olderButton;
    private JLabel birthyear;
    private JLabel birtheyearLabel;
    private JButton firstnameButton;
    private JLabel firstnameLabel;
    private JButton lastnameButton;
    private JLabel lastnameLabel;
    private JButton einschränkungenButton;
    private JLabel einschränkungenLabel;
    private MainController mainController;
    private Employee employee;

    public PanelHandler(MainController mainController,Employee employee) {
        this.employee=employee;
        this.mainController=mainController;
        createButtons();
        updateGUI();

    }

    private void createButtons(){
        sexButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                employee.setSex();
                updateGUI();
            }
        });
        olderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                employee.setAge();
                updateGUI();
            }
        });
        workyearsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                employee.setWorkyears();
                updateGUI();
            }
        });
        firstnameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                employee.setName(firstnameField.getText());
                firstnameField.setText("");
                updateGUI();
            }
        });
        lastnameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                employee.setLastname(lastnameField.getText());
                lastnameField.setText("");
                updateGUI();
            }
        });
        einschränkungenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                employee.setEinschränkungen(einschränkungsField.getText());
                einschränkungsField.setText("");
                updateGUI();
            }
        });
    }
    private void updateGUI(){
       // outpud.setText(mainController.getS());
        sexLabel.setText(employee.getSex());
        ageLabel.setText(String.valueOf(employee.getAge()));
        birtheyearLabel.setText(String.valueOf(employee.getBirthyear()));
        workyearsLabel.setText(String.valueOf(employee.getWorkyears()));
        firstnameLabel.setText(employee.getName());
        lastnameLabel.setText(employee.getLastname());
        einschränkungenLabel.setText(employee.getEinschränkungen());
    }

    public JPanel getPanel(){
        return panel;
    }
}
