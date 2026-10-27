import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import models.Estudiante;

public class App {
    //David Baroja
    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        //runEjemplosObjetos();
        //runComparators();
        runComparatorsObj();
        runCompartorsObj2();
        

    //Metodos
    }
    private static void runCompartorsObj2() {
        Estudiante el = new Estudiante("Juan",10 );
        Estudiante[] estudiantes = {el,
                                    new Estudiante("Maria", 7),
                                    new Estudiante("Diego",3.5),
                                    new Estudiante("Pedro", 6.8),
        };

        Comparator.naturalOrder();
        Comparator.reverseOrder();

        /**Crear variable con claee Comparator con funcion landa 
        *e -> e  es igual a metodo public double getNota(Estudiante e)
        *                               return e.getNota()
        **/                               
        Comparator<Estudiante> compararNota = Comparator.comparingDouble(e -> e.getNota());
        Arrays.sort(estudiantes, compararNota);

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }

        List <Estudiante> estudiantesLista = new ArrayList<> (List.of(el,
                                    new Estudiante("Maria", 7),
                                    new Estudiante("Diego",3.5),
                                    new Estudiante("Pedro", 6.8)));

        estudiantesLista.sort(compararNota);
        System.out.println(estudiantesLista);
        }

    

    private static void runComparatorsObj() {
        List <Integer> numeros = new ArrayList<>(List.of(5, 6, 4, 1, 2, 3));

        //Orden de menor a mayor
        // Metodo sort es statico - nesecita una instancia
        numeros.sort(Comparator.naturalOrder());
        numeros.sort(null);
        System.out.println("Orden de Menor a Mayor");
        System.out.println(numeros);

        //Orden mayor a menor
        numeros.sort(Comparator.reverseOrder());
        System.out.println("Orden de Mayor a Menor");
        System.out.println(numeros);
        

    }

    private static void runComparators() {
        Integer[] original = {5,6,4,1,2,3};
        
        //Arrays.sort - ordena arreglos por su orden natural
        Arrays.sort(original);
        for(int i=0; i < original.length; i++) {
            System.out.println(original[i]);

        }
        System.out.println("---------------"); 
        Arrays.sort(original,Comparator.reverseOrder());
          for(int i=0; i < original.length; i++) {
            System.out.println(original[i]);

        }     
    }

    private static void runEjemplosPrimitivos() {  
    }

    private static void runEjemplosObjetos() {
        Estudiante el = new Estudiante("Juan",10 );
        Estudiante[] estudiantes = {el,
                                    new Estudiante("Maria", 7),
                                    new Estudiante("Diego",3.5),
                                    new Estudiante("Pedro", 6.8),
        };


        Bubble bubble = new Bubble();
        bubble.sortEstudiantes(estudiantes);

    }

    public static void printArreglo(){
        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        //USAR METODO DEL ARCHIVO (clase) BUBBLE
        //INSTANCIAR el archivo BUBBLE
        //INSTANCIA la clase Bubble
        Bubble bubble = new Bubble();

        // EJECUTAR CODIGO DEL ARCHIVO BUBBLE USO LA INSTANCIA
        System.out.println("Metodo Bubble Sort");

        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        //Instanciar seleccion 
        System.out.println("---Metodo Selection Sort---");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        //Instanciar insercion
        System.out.println("Metodo Insertion Sort");
        Insertionsort insertion = new Insertionsort();
        System.out.println("Original");
        printArreglo(d);
        insertion.sort(d);
        System.out.println("Ordenado Des");
        printArreglo(d);

    
    }

    public static void printArreglo(int[] args) {
        for (int i = 0; i < args.length; i++) 
            System.out.print(args[i] + "-");
            System.out.println();
        }
    public static void printEstudiante(Estudiante[] estudiante) {
        for (int i = 0; i < estudiante.length; i++) 
            System.out.print(estudiante[i] + "-");
            System.out.println();
        }
    
}

