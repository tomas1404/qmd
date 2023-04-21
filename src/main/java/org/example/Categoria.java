package org.example;

import java.util.List;

public class Categoria {
  List<Tipo> tipos;
  public Categoria(List<Tipo> tipos){
    this.tipos = tipos;
  }
  public Boolean perteneceCategoria(Tipo tipo) {
      return this.tipos.contains(tipo);
  }
}
