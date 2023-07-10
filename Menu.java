package menu_ejercicio;

public class Menu {
    
    private Consola c;
    private persona poblacion[];
    private int contador_personas;

    public Menu(){
        this.c = new Consola();
        this.poblacion = new persona[3];
        this.contador_personas = 0;
    }
    
    public void MostrarMenu(){
        
        int ciclo;
        do{
           
            System.out.println("1 - ingresar persona");
            System.out.println("2 - buscar persona por documento");
            System.out.println("3 - listar personas ingresadas");
            System.out.println("0 - salir");
            
            ciclo = c.leerInt("elija una opcion: ");
           
           switch(ciclo){
               case 0:
                   System.out.println("fin del programa");
               break;
               case 1:
                       String Nom = c.leerString("ingresar nombre: ");
                       String Ape = c.leerString("ingresar apellido: ");
                       int DNI = c.leerInt("ingresar Dni: ");
                       
                       this.poblacion[this.contador_personas] = new persona(); //esta linea crea a la persona
                       
                       this.poblacion[this.contador_personas].setNombre(Nom);
                       this.poblacion[this.contador_personas].setApellido(Ape);
                       this.poblacion[this.contador_personas].setDni(DNI);
                       
                   this.contador_personas++;
               break;
               case 2:
                   int dni_aux = c.leerInt("ingresar dni de la persona a buscar:" );
                   for(int i=0;i<this.contador_personas;i++){
                       this.poblacion[i].getDni();
                       if(this.poblacion[i].getDni()==dni_aux){
                           System.out.println(this.poblacion[i].getNombre());
                           System.out.println(this.poblacion[i].getApellido());
                       }
                   }
               break;
               case 3:
                   for(int i=0;i<this.contador_personas;i++){
                       System.out.println(this.poblacion[i].getNombre());
                       System.out.println(this.poblacion[i].getApellido());
                       System.out.println(this.poblacion[i].getDni());
                   }
                   c.leerString("");
               break;
           }
           
        }while(ciclo != 0);
    }
}
