import javax.swing.JOptionPane;
public class TesteLivroDeNotas{
    static public void main(String... abc){
        int op = Integer.parseInt(JOptionPane.showInputDialog("1 - RH\n2 - ADS\n"));

        //new: operador de contrução de objetos
        //isso é a contrução de um objeto
        //new LivroDeNotas();
        switch(op){
            case 1:  
                LivroDeNotas livroDeNotas = new LivroDeNotas();
                livroDeNotas.nomeDoCurso = "ADS";
                livroDeNotas.exibirMensagem();
                break;
            case 2:  
                LivroDeNotas livroDeNotasRh = new LivroDeNotas(); //1.construir um segundo objeto livro de notas
                livroDeNotasRh.nomeDoCurso = "RH"; //2.ele é do curso de RH
                livroDeNotasRh.exibirMensagem(); //3.exibir a mensagem de boas vindas
                break;

             default: System.out.println("Escolha um número válido!!!");
        }
    }
}
