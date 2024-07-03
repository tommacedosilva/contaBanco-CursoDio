public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 15;
        double valorSolicitado = 22;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;            
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("O saldo da sua conta é: " + saldo);
    }   
}
