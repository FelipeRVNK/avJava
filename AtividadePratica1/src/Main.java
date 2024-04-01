public class Main {
    
    public static void main(String[] args) {
        int opcao;

        FolhaPagamento f1 = new FolhaPagamento();
        do {
            System.out.println("\nMENU INTERATIVO");
            System.out.println("1) Calcular a folha de pagamento");
            System.out.println("0) Sair");
            System.out.print("Sua opção: ");
            opcao = Console.lerInt();
            switch (opcao){
                case 1:
                    System.out.print("digite o nome do funcionario: ");
                    f1.setNomeFuncionario(Console.lerString());
                    System.out.print("digite o numero de horas trabalhadas: ");
                    f1.setHorasTrabalhadas(Console.lerFloat());
                    System.out.print("digite o valor da hora trabalhada: ");
                    f1.setValorHora(Console.lerFloat());
                    System.out.println("FOLHA DE PAGAMENTO DO(A): " + f1.getNomeFuncionario());
                    System.out.println("SALARIO BRUTO: " + f1.salarioBruto());
                    System.out.println("IR: " + f1.ir());
                    System.out.println("INSS: " + f1.inss());
                    System.out.println("FGTS: " + f1.fgts());
                    System.out.println("SALARIO LIQUIDO: " + f1.salarioLiquido());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        } while (opcao != 0);
        

    }
}
