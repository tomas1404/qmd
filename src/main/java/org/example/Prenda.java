package org.example;
import org.example.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Prenda {
    private Tipo tipo;
    private Categoria categoria;
    private Material material;
    private Color color_primario; //RGB
    private Color color_secundario; //RGB

    public Prenda (Tipo tipo,Categoria categoria,Material material,
                   Color color_primario)  throws Prenda_Excepcion {
        if ((tipo == null)){
            throw new Prenda_Excepcion("tipo es obligatorio");
        }
        if ((categoria == null)) {
            throw new Prenda_Excepcion("categoria es obligatorio");
        }
        if ((material == null)) {
            throw new Prenda_Excepcion("material es obligatorio");
        }
        if ((color_primario == null)) {
            throw new Prenda_Excepcion("color primario es obligatorio");
        }
        if (categoria.admiteTipo(tipo)) {
            throw new Prenda_Excepcion("el tipo y la categoria no coinside");
        }
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.color_primario = color_primario;
    }

    public Prenda (Tipo tipo,Categoria categoria,Material material,
                   Color color_primario,Color color_secundario)  throws Prenda_Excepcion {
        if ((tipo == null)){
            throw new Prenda_Excepcion("tipo es obligatorio");
        }
        if ((categoria == null)) {
            throw new Prenda_Excepcion("categoria es obligatorio");
        }
        if ((material == null)) {
            throw new Prenda_Excepcion("material es obligatorio");
        }
        if ((color_primario == null)) {
            throw new Prenda_Excepcion("color primario es obligatorio");
        }
        if (categoria.admiteTipo(tipo)) {
            throw new Prenda_Excepcion("el tipo y la categoria no coinside");
        }
            this.tipo = tipo;
            this.categoria = categoria;
            this.material = material;
            this.color_primario = color_primario;
            this.color_secundario = color_secundario;
        }
    }
