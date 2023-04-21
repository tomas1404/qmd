package org.example;

import java.util.List;

public class Categoria {
  List<Tipo> tipos;
  public Categoria(Tipo... tipos){
    this.tipos = List.of(tipos);
  }
  public Boolean perteneceCategoria(Tipo tipo) {
      return this.tipos.contains(tipo);
  }
}
