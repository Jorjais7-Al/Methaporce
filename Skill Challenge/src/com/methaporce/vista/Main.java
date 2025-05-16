package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

public class Main {
    public static void main(String[] args) {

        GestorPelicula gestionarPeliculas = new GestorPelicula();

        //Metodo agregar peliculas
        gestionarPeliculas.agregarPelicula(new Pelicula(1, "Hercules", true));
        gestionarPeliculas.agregarPelicula(new Pelicula(2, "Cars", true));
        gestionarPeliculas.agregarPelicula(new Pelicula(3, "Toy Story", false));
        gestionarPeliculas.agregarPelicula(new Pelicula(4, "Minecraft", false));
        gestionarPeliculas.agregarPelicula(new Pelicula(5, "Robocop", false));

        //Metodo Obtener peliculas
        System.out.println("Lista de Peliculas");
        System.out.println(gestionarPeliculas.mostrarPeliculas()+"\n");

        //Metodo Eliminar pelicula
        gestionarPeliculas.eliminarPelicula(3);
        System.out.println("\n");

        //Metodo Obtener peliculas disponibles
        System.out.println("Peliculas disponibles:");
        System.out.println(gestionarPeliculas.obtenerPeliculasDisponibles());
        System.out.println("\n");

        //Metodo Obtener peliculas no disponibles
        System.out.println("Peliculas no disponibles:");
        System.out.println(gestionarPeliculas.obtenerPeliculasNoDisponibles());
        System.out.println("\n");

        //Metodo Marcar pelicula como disponible
        gestionarPeliculas.marcarPeliculaComoDisponible(5);
        System.out.println("\n");

        //Mostrando de nuevo las peliculas con los cambios
        System.out.println("Lista de Peliculas");
        System.out.println(gestionarPeliculas.mostrarPeliculas());

    }
}