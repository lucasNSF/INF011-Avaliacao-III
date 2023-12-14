package service;

import models.Perfil;

public interface Classificador {
  NivelPerfil nivel();
  Perfil getPerfil();
}
