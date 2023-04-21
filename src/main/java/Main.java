import org.example.Atuendo;
import org.example.Categoria;
import org.example.Prenda;
import org.example.Prenda_Excepcion;
import org.example.Tipo;

import java.util.Scanner;
public class Main {
  public static void main(String [] args) throws Prenda_Excepcion {
    Scanner scanner = new Scanner(System.in);
      //declaracion de tipos
      Tipo zapatos = new Tipo();
      Tipo zapatillas = new Tipo();
      Tipo remeraMangaCorta = new Tipo();
      Tipo remeraMangaLarga = new Tipo();
      Tipo pantalon = new Tipo();
      Tipo buzo = new Tipo();
      Tipo gorra = new Tipo();
      Tipo pulsera = new Tipo();
      //declaracion de categoria
      Categoria accesorio = new Categoria(gorra,pulsera);
      Categoria parteSuperior = new Categoria(remeraMangaCorta,remeraMangaLarga,buzo);
      Categoria parteBaja = new Categoria(pantalon);
      Categoria calzado = new Categoria(zapatos,zapatillas);
      //declaracion de prenda
      Prenda zapatos_marones  = new Prenda(zapatos,calzado,"gamuza","marron","negro");
      Prenda remera_negra = new Prenda(remeraMangaLarga,parteSuperior,"tela","negro","negro");
      Prenda pantalon_azul = new Prenda(pantalon,parteBaja,"algodon","rojo","negro");
      Prenda gorra_verde = new Prenda(gorra,accesorio,"algodon","rojo","negro");
      //declaracion de atuendo
      Atuendo invierno = new Atuendo(zapatos_marones,pantalon_azul,remera_negra,gorra_verde);

  }
  }

