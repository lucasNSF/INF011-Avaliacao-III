package questao01;

import models.*;


import java.time.LocalDate;

// Client em Builder
public class App01 {
  public static void main(String[] args) {
    Builder perfilBuilder = new PerfilBuilder();
    
    Perfil perfil = perfilBuilder
//      .reset("Lucas")
      .addCartaoCredito(new CartaoCredito("nubank", "000101", "123", LocalDate.now()))
      .addRG(new RG(
        "Lucas",
        "20152019-26",
        "SSP/BA",
        LocalDate.of(2025, 12, 12))
      )
      .addEmail(new Email("lucas123@gmail.com"))
      .build("Lucas");
    
    System.out.println(perfil);
    perfil.documentos().forEach(System.out::println);
  }
}
