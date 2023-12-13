package questao01;

import models.CPF;
import models.CartaoCredito;
import models.Perfil;

import java.time.LocalDate;

public class Questao01 {
  public static void main(String[] args) {
    Builder perfilBuilder = new PerfilBuilder();
    
    Perfil perfil = perfilBuilder
      .reset("Lucas")
      .addCartaoCredito(new CartaoCredito("nubank", "000101", "123", LocalDate.now()))
      .addCPF(new CPF("Lucas", "123.123.123-12"))
      .build();
    
    System.out.println(perfil);
  }
}
