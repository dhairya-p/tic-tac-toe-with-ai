class Complex {

    double real;
    double image;

    // write methods here
    public void add(Complex num) {
        image += num.image;
        real += num.real;
    }

    public void subtract(Complex num) {
        real -= num.real;
        image -= num.image;
    }
}