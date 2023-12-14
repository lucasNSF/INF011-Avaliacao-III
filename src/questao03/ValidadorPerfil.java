package questao03;

import models.Perfil;
import service.Classificador;
import service.NivelPerfil;

//  Proxy em Proxy
public class ValidadorPerfil implements Classificador {
  private final Classificador classificadorPerfil;
  private final Perfil perfil;
  
  public ValidadorPerfil(Classificador classificador, String user, String pwd) {
    this.perfil = new Perfil(user, user, pwd);
    this.classificadorPerfil = classificador;
  }
  
  @Override
  public NivelPerfil nivel() {
    Perfil perfilDoClassificador = this.classificadorPerfil.getPerfil();
    Perfil perfilAtual = this.getPerfil();
    
    if (
      !perfilAtual.getUser().equals(perfilDoClassificador.getUser()) ||
      !perfilAtual.getPwd().equals(perfilDoClassificador.getPwd())
    ) {
      return NivelPerfil.DESCONHECIDO;
    }
    
    return this.classificadorPerfil.nivel();
  }
  
  @Override
  public Perfil getPerfil() {
    return this.perfil;
  }
}
