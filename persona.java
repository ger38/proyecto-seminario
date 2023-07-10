package menu_ejercicio;

public class persona{
    private String nombre;
    private String apellido;
    private int dni;
    
    public persona(){
        this.nombre = "";
        this.apellido = "";
    }
    
    public persona(String n,String a, int d){
        this.nombre = n;
        this.apellido = a;
        this.dni = d;
    }

    public int getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    
    public void setNombre(String Nom){
        this.nombre = Nom;
    }
    public void setApellido(String Ape){
        this.apellido = Ape;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    
    @Override
    public String toString(){
       String salida = "persona {";
       
       salida += "nombre: "+this.nombre+", ";
       salida += "apellido: "+this.apellido+", ";
       salida += "dni: "+this.dni+"}";    
    
       //"persona {"nombre": "felix","apellido": "bengoa","dni": "43741814"}"
       return salida;
    }

}

