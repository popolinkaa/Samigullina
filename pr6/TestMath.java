package pr6;

public class TestMath {
    public static void main(String[] args) {
        MathCalculable math = new MathFunc();

        double base = 2;
        double exp = 5;
        System.out.println(base + "^" + exp + " = " + math.pow(base, exp));

        double re = 3;
        double im = 4;
        System.out.println("Модуль комплексного числа (3 + 4i) = " + math.absComplex(re, im));

        MathFunc func = new MathFunc();
        double r = 5;
        System.out.println("Длина окружности радиуса " + r + " = " + func.circleLength(r));
    }
}
