public class Principal {

    public static void main (String [] args){

        Aluno aluno = new Aluno(); //CRIOU UM OBJETO, CHAMADO aluno

        aluno.nomeAluno = "Cindy";
        aluno.email = "flor12@gmail.com";
        aluno.endereco = "Avenida Presidente";
        aluno.telefone = "62 998561473";
        aluno.matricula = 12345698;

        System.out.printf(" Nome do aluno: %s\n E-mail: %s\n Endereco: %s\n Telefone: %s\n " +
                "Matricula: %s\n",aluno.nomeAluno,aluno.email,aluno.endereco,aluno.telefone,aluno.matricula);



    }
}
