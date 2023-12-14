package questao02;

import models.Documento;

// Concrete Decorator em Decorator
public class DiasAteValidadeRG extends BaseDocument {
  public DiasAteValidadeRG(Documento documento) {
    super(documento);
  }
  
  @Override
  public boolean validar() {
//    TODO: Aplicar lógica de cálculo de dias até o fim da validade do documento
    return true;
  }
}
