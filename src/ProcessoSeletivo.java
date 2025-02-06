public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.00);
        analisarCandidato(2200.00);
        analisarCandidato(2000.00);

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Rafael", "Cristian", "Ana", "Daniela" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
