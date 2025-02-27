abstract class Forma {
    protected Color color;
    
    public Forma(Color color) {
        this.color = color;
    }
    
    public abstract String dibujar();
}
        

class Circulo extends Forma {
    private int x, y, radio;
    
    public Circulo(int x, int y, int radio, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    
    @Override
    public String dibujar() {
        return "Círculo de color " + color.colorear() + 
               " en posición (" + x + "," + y + ") con radio " + radio;
    }
}

class Cuadrado extends Forma {
    private int x, y, lado;
    
    public Cuadrado(int x, int y, int lado, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.lado = lado;
    }
    
    @Override
    public String dibujar() {
        return "Cuadrado de color " + color.colorear() + 
               " en posición (" + x + "," + y + ") con lado " + lado;
    }
}

interface Color {
    String colorear();
}


class Rojo implements Color {
    public String colorear() {
        return "rojo";
    }
}

class Azul implements Color {
    public String colorear() {
        return "azul";
    }
}


class DemoFormasYColores {
    public static void main(String[] args) {
      
        Color rojo = new Rojo();
        Color azul = new Azul();
    
        Forma circuloRojo = new Circulo(10, 20, 30, rojo);
        Forma cuadradoAzul = new Cuadrado(5, 15, 25, azul);
        

        System.out.println(circuloRojo.dibujar());
        System.out.println(cuadradoAzul.dibujar());
    
        Forma circuloAzul = new Circulo(15, 25, 35, azul);
        System.out.println(circuloAzul.dibujar());
    }
}
