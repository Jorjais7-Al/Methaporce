package com.methaporce.modelo;

import java.util.ArrayList;

public class GestorPelicula {

    ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();

    public void agregarPelicula(Pelicula pelicula){
        listaDePeliculas.add(pelicula);
    }

    public void eliminarPelicula(int id) {
        boolean encontrada = false;
        for (Pelicula pelicula : listaDePeliculas) {
            if (pelicula.getIdPelicula() == id) {
                listaDePeliculas.remove(pelicula);
                encontrada = true;
                System.out.println("La pelicula con el id:"+ id + " se elimino correctamente");
                break;
            }
        }
        if (!encontrada)
            System.out.println("La película con el id " + id + " no existe en la colección.");
    }

    public ArrayList<Pelicula> mostrarPeliculas(){
        return listaDePeliculas;
    }

    public ArrayList<Pelicula> obtenerPeliculasDisponibles() {
        ArrayList<Pelicula> peliculasDisponibles = new ArrayList<>();
        for (Pelicula pelicula : listaDePeliculas) {
            if (pelicula.isDisponible()) {
                peliculasDisponibles.add(pelicula);
            }
        }
        return peliculasDisponibles;
    }

    public ArrayList<Pelicula> obtenerPeliculasNoDisponibles() {
        ArrayList<Pelicula> peliculasNoDisponibles = new ArrayList<>();
        for (Pelicula pelicula : listaDePeliculas) {
            if (!pelicula.isDisponible()) {
                peliculasNoDisponibles.add(pelicula);
            }
        }
        return peliculasNoDisponibles;
    }

    public void marcarPeliculaComoDisponible(int id){
        boolean encontrada = false;
        for (Pelicula pelicula : listaDePeliculas){
            if(pelicula.getIdPelicula() == id){
                pelicula.setDisponible(true);
                encontrada = true;
                System.out.println("La pelicula con el id:"+ id +" fue marcada como disponible correctamente");
                break;
            }
        }
        if(!encontrada)
            System.out.println("La película con el id " + id + " no existe en la colección.");
    }

}

