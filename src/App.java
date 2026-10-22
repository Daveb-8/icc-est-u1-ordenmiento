public class App {
      //David Baroja, Walter Loza
    public static void main(String[] args) throws Exception {
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

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + "-");
            System.out.println();
    }
 }
    

