
public class Exception_handling {
    double d = 10.9;

    public void Eccept() throws ArithmeticException {
        System.out.println("Here Occuring Givenm Exception: ");
        try {
            System.out.println(d / 0);
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            // System.out.println(this.n);
            System.out.println("The Value of a is : " + this.d);
            System.out.println("Is Always Axcutable block: ");
        }

    }

    public static void main(String[] args) {
        Exception_handling ex = new Exception_handling();
        ex.Eccept();
    }
}
