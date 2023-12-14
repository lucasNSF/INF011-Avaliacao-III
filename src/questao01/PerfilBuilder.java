package questao01;

import models.*;

import java.util.ArrayList;
import java.util.List;

// Concrete Builder em Builder
public class PerfilBuilder implements Builder {
  private Perfil perfil = new Perfil("Example", null, null);
  private final List<Documento> cartoes = new ArrayList<>();
  private final List<Documento> emails = new ArrayList<>();
  private Documento cpf = null;
  private Documento RG = null;
  
  @Override
  public Builder reset(String name) {
    this.perfil = new Perfil(name, name, name);
    return this;
  }
  
  @Override
  public Builder reset(String name, String user) {
    this.perfil = new Perfil(name, user, name);
    return this;
  }
  
  @Override
  public Builder reset(String name, String user, String pwd) {
    this.perfil = new Perfil(name, user, pwd);
    return this;
  }
  
  public Perfil build(String name) {
    Perfil perfil = this.perfil == null ? new Perfil(name, name, name) : this.perfil;
    this.reset(name);
    return perfil;
  }
  
  public Perfil build(String name, String user) {
    Perfil perfil = this.perfil == null ? new Perfil(name, user, name) : this.perfil;
    this.reset(name, user);
    return perfil;
  }
  
  public Perfil build(String name, String user, String pwd) {
    Perfil perfil = this.perfil == null ? new Perfil(name, user, pwd) : this.perfil;
    this.reset(name, user, pwd);
    return perfil;
  }
  
  @Override
  public Builder addCartaoCredito(CartaoCredito cartao) {
    if (this.cartoes.size() < 3 && cartao.validar()) {
      this.perfil.adicionar(cartao);
      this.cartoes.add(cartao);
    }
    return this;
  }
  
  @Override
  public Builder addCPF(CPF cpf) {
    if (this.cpf == null && cpf.validar()) {
      this.cpf = cpf;
      this.perfil.adicionar(cpf);
    }
    return this;
  }
  
  @Override
  public Builder addEmail(Email email) {
    if (this.emails.size() < 2 && email.validar()) {
      this.emails.add(email);
      this.perfil.adicionar(email);
    }
    return this;
  }
  
  @Override
  public Builder addRG(RG rg) {
    if (this.RG == null && rg.validar()) {
      this.RG = rg;
      this.perfil.adicionar(rg);
    }
    return this;
  }
}
