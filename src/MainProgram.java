import control.MainController;
import model.Employee;
import view.MainFrame;

import java.awt.*;

public class MainProgram {

    public static void main (String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainProgram.setup();
                    }
                });
    }

    private static void setup(){
        MainController mainController = new MainController();
        Employee employee=new Employee("m",1991,2020,2010);
        MainFrame mainFrame = new MainFrame(mainController, "GUI-Vorlage",50,50,1200,900,employee);
    }

}
