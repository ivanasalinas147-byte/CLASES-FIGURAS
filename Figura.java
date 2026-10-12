class Figura {

    public double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    
    //Metodo - Area del triangulo
    public double calcularArea(double base, double altura){
        return base * altura / 2;
    }
    
    //Metodo - area rectangulo
    public double calcularArea(int base, int altura){
        return base * altura;
    }
    
    //Metodo- perimetro del Circulo 
     public double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
    
    //Metodo - perimetro del triangulo
    public double calcularPerimetro(double base, double altura) {
        return 3 * base;
    }
    
    //Metodo - perimetro del rectangulo
    public int calcularPerimetro(int base, int altura) { 
        return 2 * base + 2 * altura;
    }
     
    
    /* public double calcularPerimetro() {
        return ;
    }*/
    
}