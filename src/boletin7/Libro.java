/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author acomesanavila
 */
public class Libro {
    private String titulo,autor;
    private int exemplares,prestados;
           
    public Libro (){
        
    }
    public Libro(String titulo,String autor, int exemplares,int prestados){
        titulo=null;
        autor=null;
        exemplares=0;
        prestados=0;
    }
    public void setAutor(String autor){
         this.autor=autor;
    }
    public void setTitulo(String titulo){
         this.titulo=titulo;
    }
    public void setExemplares(int exemplares){
         this.exemplares=exemplares;
    }
    public void setPrestados(int prestados){
         this.prestados=prestados;
    }
    public int getPrestados(){
         return prestados;
    }
    public int getExemplares(){
        return exemplares;
    }
    public String getAutor(){
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public void prestamo(){
        if(exemplares>0)
        prestados=prestados++;
        else
            System.out.println("error");
    }
    public void devolucion(){
        if (prestados>0)
            prestados=prestados--;
        else
            System.out.println("error");
    }
}
