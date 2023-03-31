package first_java;

class Main {
    public static void main(String[] args) {
        Implements imp = new Implements("this is never the end is never the end is never the end");
        imp.exacuteAll(10, 10);
    }
}

public interface P8 {
    long add(long n1, long n2);
    long substract(long n1, long n2);
    long multiply(long n1, long n2);
    double divide(double n1, double n2);
}

abstract class Abstract implements P8 {
    String input = "123123";

    Abstract(String input) {
        this.input = input;
    }

    void usingInput(){
        System.out.println("printing setted input using substring(0, 15)");
        System.out.println(input.substring(0, 15));
    }

    public abstract double pow(long n1, long n2);
}

class Implements extends Abstract implements P8 {
    Implements(String input) {
        super(input);
    }

    void exacuteAll(long n1, long n2) {
        System.out.println(add(n1, n2));
        System.out.println(divide(n1, n2));
        System.out.println(multiply(n1, n2));
        System.out.println(substract(n1, n2));
        System.out.println(pow(n1, n2));
        usingInput();
    }

    @Override
    public long add(long n1, long n2) {
        return n1 + n2;
    }

    @Override
    public double divide(double n1, double n2) {
        return n1 / n2;
    }

    @Override
    public long multiply(long n1, long n2) {
        return n1 * n2;
    }

    @Override
    public long substract(long n1, long n2) {
        return n1 - n2;
    }
    
    @Override
    public double pow(long n1, long n2) {
    	return Math.pow(n1, n2);
    }
}
