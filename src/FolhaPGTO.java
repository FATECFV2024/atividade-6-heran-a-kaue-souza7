public class FolhaPGTO {

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hor1, hor2;

        // Empregados mensalistas
        men1 = new Mensalista("João", "Rua abc", "Junior");
        men1.calcularSalario();
        System.out.println(
            "Nome: " + men1.getNome()
        );
        System.out.println(
            "Endereço: " + men1.getEndereco()
        );
        System.out.println(
            "Salário: " + men1.getSalario()
        );

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        System.out.println(
            "Nome: " + men2.getNome()
        );
        System.out.println(
            "Endereço: " + men2.getEndereco()
        );
        System.out.println(
            "Salário: " + men2.getSalario()
        );

        // Empregados horistas
        hor1 = new Horista("Carlos", "Rua xyz", 20);
        hor1.calcularSalario();
        System.out.println(
            "Nome: " + hor1.getNome()
        );
        System.out.println(
            "Endereço: " + hor1.getEndereco()
        );
        System.out.println(
            "Salário: " + hor1.getSalario()
        );

        hor2 = new Horista("Cristina", "Rua do centro", 100);
        hor2.calcularSalario();
        System.out.println(
            "Nome: " + hor2.getNome()
        );
        System.out.println(
            "Endereço: " + hor2.getEndereco()
        );
        System.out.println(
            "Salário: " + hor2.getSalario()
        );
    }
}
