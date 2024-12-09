package zooAnimales;

public class Ave extends Animal {
    private static Ave[] listado = new Ave[100];
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorPlumas = color;
        totalAnimales += 1;
        for (Ave m: listado){
            if (m!=null){
                m = this;
                break;
            }
        }
    }
    public Ave(){totalAnimales += 1;
        for (Ave m: listado){
            if (m!=null){
                m = this;
                break;
            }
        }
    }

    public void setColorPlumas(String color){this.colorPlumas = color;}

    public String getColorPlumas(){return this.colorPlumas;}

    public static int cantidadAves(){
        int c = 0;
        for (Animal i: listado){
            if (i != null){
                c += 1;
            }
        }
        return c;
    }

    public String movimiento(){return "volar";}

    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave che = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        halcones += 1;
        return che;
    }
    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave fede = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        aguilas += 1;
        return fede;
    }
}
