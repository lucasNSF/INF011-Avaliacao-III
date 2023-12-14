package models;

import java.util.regex.Pattern;
public class Email implements Documento {
  public static final String REGEX = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";
  
  public String conta;
  
  public Email(String conta) {
    super();
    this.conta = conta;
  }
  
  @Override
  public String formatar() {
    
    return "E-MAIL\n" + this.conta;
  }
  
  @Override
  public boolean validar() {
    return Pattern.compile(Email.REGEX)
      .matcher(this.conta)
      .matches();
  }
  
  @Override
  public Integer pontuar() {
    return this.validar() ? 1 : 0;
  }
  
  public static String getRegex() {
    return REGEX;
  }
  
  public String getConta() {
    return conta;
  }
}
