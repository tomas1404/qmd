package org.example;
import java.util.Arrays;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Prenda {
    private Tipo tipo;
    private Categoria categoria;
    private String tela_material;
    private String color_primario;
    private String color_secundario;

    public Prenda (Tipo tipo,Categoria categoria,String tela_material,String color_primario,String color_secundario)  throws Prenda_Excepcion {
        if (categoria.perteneceCategoria(tipo)) {
            this.tipo = tipo;
            this.categoria = categoria;
            this.tela_material = tela_material;
            this.color_primario = color_primario;
            this.color_secundario = color_secundario;
        }else{
            throw new Prenda_Excepcion("el tipo y la categoria no coinside");
        }
    }
}