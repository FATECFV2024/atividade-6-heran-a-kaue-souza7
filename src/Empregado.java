public class Empregado {
    protected String nome;
    protected String endereco;
    protected Double salario;

    
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: " + salario);
    }

    public double calcularIRPF() {
        double desconto_salario = salario - calcularINSS();
    
        if (desconto_salario < 2259.21) {
            return 0; // Isento de IRPF

        } else if (desconto_salario >= 2259.21 && desconto_salario < 2826.66) {
            return (desconto_salario * 0.075) - 158.40;

        } else if (desconto_salario >= 2826.66 && desconto_salario < 3751.06) {
            return (desconto_salario * 0.15) - 381.44;

        } else if (desconto_salario >= 3751.06 && desconto_salario < 4664.69) {
            return (desconto_salario * 0.225) - 662.77;

        } else {
            return (desconto_salario * 0.275) - 896.00;
        }
    }
    

     public double calcularINSS() {
        if (salario < 1412.01) {
            return salario * 0.075;

        } else if (salario >= 1412.01 && salario < 2666.69) {
            return salario * 0.09;

        } else if (salario >= 2666.69 && salario < 4000.04) {
            return salario * 0.12;

        } else if (salario >= 4000.04 && salario <= 7786.03) {
            return salario * 0.14;

        } else {
            return 7786.03 * 0.14; // Maximum limit
        }
    }
    

}
