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
    private Trama trama = Trama.LISA;
    private Color color_primario; //RGB
    private Color color_secundario; //RGB

    public Prenda PrendaTipo(Tipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public Prenda Aspectos_Materiales(Material material,Trama trama, Color primario, Color secundario) throws Prenda_Excepcion{
        if (this.tipo != null) {
            throw new Prenda_Excepcion("Primero va el tipo");
        }
        this.color_secundario = secundario;
        this.material = material;
        this.trama = trama;
        this.color_primario = primario;
        return this;
    }

    public Prenda PrendaCategoria(Categoria categoria){
        this.categoria = categoria;
        return this;
    }
    public Prenda Aspectos_Materiales(Material material,Trama trama, Color primario) throws Prenda_Excepcion{
        if (this.tipo != null) {
            throw new Prenda_Excepcion("Primero va el tipo");
        }
        this.material = material;
        this.trama = trama;
        this.color_primario = primario;
        return this;
    }

    public Prenda (Tipo tipo,Categoria categoria,Material material,
                   Color color_primario, Trama trama)  throws Prenda_Excepcion {
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
        if (trama != null)
            this.trama = trama;
    }

    public Prenda (Tipo tipo,Categoria categoria,Material material,
                   Color color_primario,Color color_secundario,Trama trama)  throws Prenda_Excepcion {
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
            if (trama != Trama.LISA)
                this.trama = trama;
        }

        public Prenda Crear_Prenda() throws Prenda_Excepcion {
            return new Prenda(this.tipo,this.categoria,
                this.material,this.color_primario,
                this.color_secundario,this.trama);
        }
    }
