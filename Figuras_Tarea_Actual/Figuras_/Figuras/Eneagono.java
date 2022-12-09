package Figuras;

import java.util.Scanner;

public class Eneagono extends Figuras
{
    private double base;
    private double altura;
    private double lados;
    private double tamañoLados;
    private double total;
    private double apotema;
    private double totalEneagono;
    Scanner leer = new Scanner(System.in);
    public Eneagono(double base, double altura, double lados, double tamañoLados, double total, double apotema,
            double totalEneagono) {
        this.base = base;
        this.altura = altura;
        this.lados = lados;
        this.tamañoLados = tamañoLados;
        this.total = total;
        this.apotema = apotema;
        this.totalEneagono = totalEneagono;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public double getTamañoLados() {
        return tamañoLados;
    }

    public void setTamañoLados(double tamañoLados) {
        this.tamañoLados = tamañoLados;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getTotalEneagono() {
        return totalEneagono;
    }

    public void setTotalEneagono(double totalEneagono) {
        this.totalEneagono = totalEneagono;
    }

    @Override
    public void calcularPerimeto() 
    {
        System.out.println("Registre los lados que desea sumar para el perimetro:");
        setLados(leer.nextDouble());
        System.out.println("Digite el valor de los lados iguales que desea sumar para el perimetro:");
        setTamañoLados(leer.nextDouble());
        setTotal(getLados()*getTamañoLados());        
        System.out.println("El perimetro de la figura es: "+getTotal()+"");
        
    }

    @Override
    public void calcularArea() 
    {
        System.out.println("Por favor ingrese el apotema de la figura:");
        setApotema(leer.nextDouble());
        setTotalEneagono((getTotal()*getApotema()/2));
        System.out.println("El area de la figura es de: "+getTotalEneagono()+"");
    }

    @Override
    public void mostrarDatos() 
    {
        System.out.println("El perimetro del eneagono es: "+getTotal()+" y el area es: "+getTotalEneagono()+"");
    }
}
