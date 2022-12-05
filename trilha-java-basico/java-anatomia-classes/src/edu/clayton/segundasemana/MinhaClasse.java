package edu.clayton.segundasemana;
public class MinhaClasse {
  public static void main(String [] args){
    /*String meuNome    = "Clayton";
    int anoFabricacao = 2022;
    boolean verdadeira  = true;
    anoFabricacao = 2018;*/

    String
      primeiroNome  = "Clayton", 
      segundoNome   = "Nascimento",
      nomeCompleto  = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
  }  

  public static String nomeCompleto(String primeiroNome, String segundoNome){
    return "Resultado do método "+ primeiroNome.concat(" ").concat(segundoNome);
  }
}
