/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author saxss
 */
public class FuncionesDeRepaso {
    
    
    public static void crearArchivo(String nombre){
        try {
            String name = System.getProperty("user.dir");
            String ruta=(name+"/"+nombre);
            //String contenido = "Contenido de ejemplo";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            
    }
    catch(IOException e){
        System.out.println(e.getMessage());}
    }
    
    //public static void apendArchivo(String Archivo){
        
   // }
    
    
    public static String infoDeCierre(String cierre){
        //System.out.println(cierre+"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        double a = Double.parseDouble(cierre);
        //int[] valorin=[200,300,500,600];
        //String[] valortx=["MUY BAJO","BAJO","MEDIO","ALTO","MUY ALTO"]
        
        if (a<200) return "MUY BAJO";
        else if(200<=a && a<300) return "BAJO";
        else if(300<=a && a<500) return "MEDIO";
        else if(500<=a && a<600) return "ALTO";
        else if(600<=a) return "MUY ALTO";
        
       return "---" ;
        
    }
    
    
    public static void leerYSeparar(String ruta){
        String[] valores;
        Path direccion= Paths.get(ruta);
        List<String> lineas;
        crearArchivo("Punto1.txt");
        String name = System.getProperty("user.dir");
        String dir=(name+"/"+"Punto1.txt"),fechaHigh="",fechaLow="";
        try{
            lineas= Files.readAllLines(direccion);
            
            FileWriter fw = new FileWriter(dir);
            BufferedWriter bw = new BufferedWriter(fw);
            
            int i=0;
            double high=0,low=0;
            for(String lineaActual:lineas){
                if (i>0){
                valores= lineaActual.split(",");
                
                //String a=infoDeCierre(valores[4]);
                //System.out.println(valores[0]+"    "+a);
                //System.out.println(valores[0]+"    "+infoDeCierre(valores[4]));
                //escritor.println(valores[0]+"    "+infoDeCierre(valores[4]));
                bw.write(valores[0]+"    "+infoDeCierre(valores[4])+"\n");
                
                if(Double.parseDouble(valores[2])>high){
                    high=Double.parseDouble(valores[2]);
                    fechaHigh=valores[0];
                    if(i==1){low=high;}
                }
                
                if(Double.parseDouble(valores[3])<low){
                    low=Double.parseDouble(valores[3]);
                    fechaLow=valores[0];
                }
                }
                i++;
            }
            bw.close();
            System.out.println("El precio más alto alcanzado por la acción de Tesla durante el año y su fecha: "+fechaHigh+"  "+high);
            System.out.println("El precio más bajo alcanzado por la acción de Tesla durante el año y su fecha: "+fechaLow+"  "+low);

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
}
    
    
    
    public static void leerYSeparar10(String ruta){
        
        String[] valores;
        Path direccion= Paths.get(ruta);
        List<String> lineas;
        crearArchivo("Punto2.txt");
        String name = System.getProperty("user.dir");
        String dir=(name+"/"+"Punto2.txt");
        try{
            
            lineas= Files.readAllLines(direccion);
            
            FileWriter fw = new FileWriter(dir);
            BufferedWriter bw = new BufferedWriter(fw);
            
            int i=0;
            for(String lineaActual:lineas){
                
                if (i>0){
                    //System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    if(i%10==0){
                    valores= lineaActual.split(",");
                        //System.out.println(i+"      "+valores[0]);
                    //String a=infoDeCierre(valores[4]);
                    //System.out.println(valores[0]+"    "+a);
                    //System.out.println(valores[0]+"    "+infoDeCierre(valores[4]));
                    //escritor.println(valores[0]+"    "+infoDeCierre(valores[4]));
                    bw.write(valores[0]+"    "+infoDeCierre(valores[4])+"\n");

                //}
                }}
                i++;
                
            }
            bw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
}
    
    
}

