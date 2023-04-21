package org.example;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Atuendo {
  private List<Prenda> prendas;
  public Atuendo(Prenda... prendas){
      this.prendas = List.of(prendas);
    }
  }

