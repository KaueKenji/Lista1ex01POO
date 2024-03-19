
public class Main {
  public static void main(String[] args) {

    //criar pessoa
    Pessoa p = new Pessoa();

    //alimentar
    System.out.println("Qual o Nome da Pessoa?");
    p.nome = System.console().readLine();

    System.out.println("Qual o Sexo da Pessoa?");
    p.sexo = System.console().readLine();

    System.out.println("Qual a Idade da Pessoa?");
    p.idade = Integer.parseInt(System.console().readLine());
    
    System.out.println("A Pessoa é Vegetariana?");
    p.vegetariana = Boolean.parseBoolean(System.console().readLine());
  
  //chamar Churrasco
    Churrasco c = new Churrasco(p.idade, p.vegetariana);

    //exibir
    System.out.println(p.nome + " consumiu " + c.verificarConsumo() + "kg de Carne");
    
  
  }

 
}