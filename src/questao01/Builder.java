package questao01;

import models.*;

// Builder em Builder
public interface Builder {
  Builder reset(String name);
  Builder reset(String name, String user);
  Builder reset(String name, String user, String pwd);
  Perfil build(String name);
  Perfil build(String name, String user);
  Perfil build(String name, String user, String pwd);
  Builder addCartaoCredito(CartaoCredito cartao);
  Builder addCPF(CPF cpf);
  Builder addEmail(Email email);
  Builder addRG(RG rg);
}
