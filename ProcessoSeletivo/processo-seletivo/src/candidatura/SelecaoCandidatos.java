package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class SelecaoCandidatos {
    public static void main(String[] args) {
        selecaoCandidatos ();
    }
    
         static void selecaoCandidatos ()
            {
                String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

                int candidatosSelecionados = 0;
                int candidatosAtual = 0;
                double salarioBase = 2000.0;

                while(candidatosSelecionados <5 && candidatosAtual < candidatos.length)
                    {
                    String candidato = candidatos [candidatosAtual];
                    double salarioPretendido = valorPretendido ();

                    System.out.println ("O candidato " + candidato + " solicitou o valor de " + salarioPretendido + " salário");

                    if (salarioBase >= salarioPretendido)
                    {
                        System.out.println ("O candidato " + candidato + " foi selecionado para a vaga");
                        candidatosSelecionados++;
                    }

                    candidatosAtual++;

                    }
            }
                    static double valorPretendido()
                    {
                        return ThreadLocalRandom.current().nextDouble(1800,2200);
                    }
}