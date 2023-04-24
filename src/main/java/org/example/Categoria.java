package org.example;
import org.example.Tipo;
import java.util.List;
public enum Categoria implements Admite{

    CALZADO {
      private List<Tipo> accepta = List.of(Tipo.ZAPATOS);
      @Override
      public boolean admiteTipo(Tipo tipo) {
        return accepta.contains(tipo);
      }
    },
    PARTE_SUPERIOR {
      private List<Tipo> accepta = List.of(Tipo.ZAPATOS);
      @Override
      public boolean admiteTipo(Tipo tipo) {
        return accepta.contains(tipo);
      }
    },
    PARTE_INFERIOR {
      private List<Tipo> accepta = List.of(Tipo.ZAPATOS);
      @Override
      public boolean admiteTipo(Tipo tipo) {
        return accepta.contains(tipo);
      }
    },
    ACCESORIOS {
      private List<Tipo> accepta = List.of(Tipo.ZAPATOS);
      @Override
      public boolean admiteTipo(Tipo tipo) {
        return accepta.contains(tipo);
      }
    };
  }