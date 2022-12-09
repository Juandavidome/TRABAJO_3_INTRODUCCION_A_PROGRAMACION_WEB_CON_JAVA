package Figuras;
import java.util.Scanner;

public class Deltoide extends Figuras
{
    private double base;
    private double altura;
    private double lados;
    private double tamañoLados;
    private double total;
    private double diagonalMayor;
    private double diagonalMenor;
    private double totalDeltoide;
    Scanner leer = new Scanner(System.in);

    public Deltoide(double base, double altura, double lados, double tamañoLados, double total, double diagonalMayor,
            double diagonalMenor, double totalDeltoide) {
        this.base = base;
        this.altura = altura;
        this.lados = lados;
        this.tamañoLados = tamañoLados;
        this.total = total;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.totalDeltoide = totalDeltoide;
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
    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    public double getTotalDeltoide() {
        return totalDeltoide;
    }
    public void setTotalDeltoide(double totalDeltoide) {
        this.totalDeltoide = totalDeltoide;
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
        System.out.println("Ingrese el diagonal mayor del deltoide:");
        setDiagonalMayor(leer.nextDouble());
        System.out.println("Ingrese el diagonal menor del deltoide:");
        setDiagonalMenor(leer.nextDouble());
        setTotalDeltoide((getDiagonalMayor()*getDiagonalMenor())/2);
        System.out.println("El area del deltoide es de: "+getTotalDeltoide()+"");
    }
    @Override
    public void mostrarDatos() 
    {
        System.out.println("El perimetro del deltoide es: "+getTotal()+" y el area es: "+getTotalDeltoide()+"");
    }
}
