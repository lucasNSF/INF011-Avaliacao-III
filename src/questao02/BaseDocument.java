package questao02;

import models.Documento;

// Base Decorator em Decorator
public class BaseDocument implements Documento {
  private Documento documento;
  
  public BaseDocument(Documento documento) {
    this.documento = documento;
  }
  
  @Override
  public String formatar() {
    return this.documento.formatar();
  }
  
  @Override
  public boolean validar() {
    return this.documento.validar();
  }
  
  @Override
  public Integer pontuar() {
    return this.documento.pontuar();
  }
}
