package Figuras;

import java.util.Scanner;

public class Romboide extends Figuras
{
    private double base;
    private double altura;
    private double lados;
    private double tamañoLados;
    private double total;
    private double totalRomboide;
    Scanner leer = new Scanner(System.in);
    public Romboide(double base, double altura, double lados, double tamañoLados, double total, double totalRomboide) {
        this.base = base;
        this.altura = altura;
        this.lados = lados;
        this.tamañoLados = tamañoLados;
        this.total = total;
        this.totalRomboide = totalRomboide;
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
    public double getTotalRomboide() {
        return totalRomboide;
    }
    public void setTotalRomboide(double totalRomboide) {
        this.totalRomboide = totalRomboide;
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
        System.out.println("Registre la base para calcular el area");
        setBase(leer.nextInt());
        System.out.println("Registre la altura para calcular el area");
        setAltura(leer.nextDouble());
        setTotalRomboide(getBase()*getAltura());
        System.out.println("El area del Romboide es de: "+getTotalRomboide()+"");
        
    }
    @Override
    public void mostrarDatos() 
    {
        System.out.println("El perimetro del romboide es: "+getTotal()+" y el area es: "+getTotalRomboide()+"");

        
    }
    
}
