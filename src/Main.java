import javax.swing.JOptionPane;

public class Main {

    public static float sqrtOne(float a, float b, float c) {
        //Formula for the first solution, r1
        return (-b + (float)Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
    public static float sqrtTwo(float a, float b, float c) {
        //Formula for the second solution, r2
        return (-b - (float)Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public static void main(String[] args) {

        //Assuming a > 0 , b^2 >= 4*a*c, or else program will return Null
        float a = Float.parseFloat(JOptionPane.showInputDialog("Enter a: "));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Enter b: "));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Enter c: "));

        /*
        Call the static method sqrtOne and pass the parameters, assign
        the value returned to a float variable named resultOne
        */
        float resultOne = sqrtOne(a, b, c);

        /*
        Call the static method sqrtTwo and pass the parameters, assign
        the value returned to a float variable named resultTwo
        */
        float resultTwo = sqrtTwo(a, b, c);

        //If all conditions met, dialog box will show real number values for both solutions
        JOptionPane.showMessageDialog(null, "Answer for r1 is: " + resultOne + ". Answer for r2 is: " + resultTwo );
    }
}