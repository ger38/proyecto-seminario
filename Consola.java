package menu_ejercicio;

import java.util.Scanner;

public class Consola{
    private Scanner sc;
    
    public Consola(){
    this.sc = new Scanner(System.in);
    }

    public String leerString(String msg){
        System.out.println(msg);
        return this.sc.next();
    }

    public int leerInt(String msg){
        System.out.println(msg);
        return this.sc.nextInt();
    }
    
    public float leerFloat(String msg){
        System.out.println(msg);
        return this.sc.nextFloat();
    }
    
    public boolean leerBooleanInt(String msg){
        System.out.print(msg);
        System.out.println(" (1/0)");
        int var = this.sc.nextInt();
        if(var == 1){
            return true;
        }else{
            return false;
        }
    }
    
    
   
    public boolean leerBooleanString(String msg){
        System.out.print(msg);
        System.out.println(" (S/N)");
        String data = this.sc.nextLine();
        
        return false;
    }
    
    public boolean leerBoolean(String msg){
        System.out.println(msg);
        return this.sc.nextBoolean();
    }
    
}

