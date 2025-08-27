package candidatura;

public class ListaCandidatos 
{

public static void main(String[] args) 
{
imprimirSelecionados ();
}

    static void imprimirSelecionados ()
    {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println ("\nImprimindo a lista de candidatos informando o índice do elemento\n");

        for (int indice = 0; indice < candidatos.length; indice ++)
        {
            System.out.println ("O candidato de N°" + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println ("\nFORMA ABREVIADA DE INTERAÇÃO 'FOR EACH'\n");

        for (String candidato: candidatos) //OPÇÃO PARA QUANDO O ÍNDICE NÃO É NECESSÁRIO
        {
        System.out.println ("O candidato selecionado foi " + candidato);
        }

    }

}
