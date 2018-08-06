package beans;

public class Rectangulo {
    
    private int base = 5;
    private int altura = 10;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getArea() {
        return base * altura;
    }
}
