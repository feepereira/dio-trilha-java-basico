package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1550.5);
        analisarCandidato(2000.0);
        analisarCandidato(5490.0);
    }
    
        static void analisarCandidato (double salarioPretendido)
            {
            double salarioBase = 2000.0;

            System.out.println("Salário pretendido: " + salarioPretendido);
            
                if (salarioBase > salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO.");
                }
                else if (salarioBase == salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA.");
                }
                else {
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
                }
            }
}