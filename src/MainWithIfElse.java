import javax.swing.JOptionPane;

public class MainWithIfElse {

    public static float sqrtOne(float a, float b, float c) {
        // Ensure correct order of operations
        return (-b + (float)Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public static float sqrtTwo(float a, float b, float c) {
        // Ensure correct order of operations
        return (-b - (float)Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public static void main(String[] args) {
        try {
            float a = Float.parseFloat(JOptionPane.showInputDialog("Enter a: "));
            float b = Float.parseFloat(JOptionPane.showInputDialog("Enter b: "));
            float c = Float.parseFloat(JOptionPane.showInputDialog("Enter c: "));

            float discriminant = (float)Math.pow(b, 2) - 4 * a * c;

            if (discriminant >= 0) {
                float resultOne = sqrtOne(a, b, c);
                float resultTwo = sqrtTwo(a, b, c);

                JOptionPane.showMessageDialog(null, "Answer for r1 is: " + resultOne + ". Answer for r2 is: " + resultTwo);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has complex roots.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter numbers only.");
        }
    }
}
