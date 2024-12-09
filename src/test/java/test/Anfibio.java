package zooAnimales;

public class Anfibio extends Animal {
    private static Anfibio[] listado = new Anfibio[100];
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean veneno){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorPiel = color;
        this.venenoso = veneno;
        totalAnimales += 1;
        for (Anfibio m: listado){
            if (m!=null){
                m = this;
                break;
            }
        }
    }
    public Anfibio(){totalAnimales += 1;
        for (Anfibio m: listado){
            if (m!=null){
                m = this;
                break;
            }
        }
    }
