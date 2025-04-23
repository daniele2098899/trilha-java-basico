public class ContaTerminal {
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Bem-vindo ao Etherbanck!");

        System.out.print("Por favor, digite seu nome!: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco Etherbanck, sua agência é "
                        + numeroAgencia + " , conta " + numeroConta + " e seu saldo de " + saldo
                        + " já está disponível para saque.");

        System.out.println("Sua jornada financeira começa aqui. Seja bem-vindo ao Etherbanck!");

        scanner.close();

    }
}
