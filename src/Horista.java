public class Horista extends Empregado {
    private double horas;

    public Horista(String n, String e, double h) {
        super(n, e);
        horas = h;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double h) {
        horas = h;

    }

    
    public void calcularSalario() {
        salario = horas * 50;
    }
    
}
