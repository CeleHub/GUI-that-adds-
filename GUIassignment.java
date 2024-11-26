import javax.swing.JOptionPane;

public class GUIassignment{

    public static void main(String[] args) {
        int Num1;
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("What is the first number?"));
        int Num2;
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("What is the second number?"));
        int Num3;
        Num3 = Integer.parseInt(JOptionPane.showInputDialog("What is the third number?"));

        int Total;
        Total = Num1 + Num2 + Num3;
        
        JOptionPane.showMessageDialog(null, "The total is " + Total);
    }

}

// import javax.swing.JOptionPane;

// public class GUIassignment {

//     public static void main(String[] args) {
//         // Prompt user for the first number and convert it to int
//         int Num1 = Integer.parseInt(JOptionPane.showInputDialog("What is the first number?"));
        
//         // Prompt user for the second number and convert it to int
//         int Num2 = Integer.parseInt(JOptionPane.showInputDialog("What is the second number?"));
        
//         // Prompt user for the third number and convert it to int
//         int Num3 = Integer.parseInt(JOptionPane.showInputDialog("What is the third number?"));
        
//         // Calculate the total
//         int Total = Num1 + Num2 + Num3;
        
//         // Display the total in a dialog box
//         JOptionPane.showMessageDialog(null, "The total is " + Total);
//     }
// }
