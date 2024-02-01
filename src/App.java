class Quadrado{
    // Atributos
    private int lado;

    // Métodos
    Quadrado(int lado){
        this.lado = lado;
    }

    public int getLado(){
        return lado;
    }

    public void setLado(int lado){
        this.lado= lado;
    }

    public int calcularArea(){
        return lado * 4;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado1 = new Quadrado(5);
        System.out.println("Lado do quadrado: " + quadrado1.getLado());
        System.out.println("Área do quadrado: " + quadrado1.calcularArea());

        quadrado1.setLado(10);
        System.out.println("Lado do quadrado: " + quadrado1.getLado());
        System.out.println("Área do quadrado: " + quadrado1.calcularArea());

    }
}
