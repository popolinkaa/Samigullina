package pr6;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double absComplex(double real, double imag) {
        return Math.sqrt(real * real + imag * imag);
    }

    // Дополнительный метод: длина окружности
    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}
