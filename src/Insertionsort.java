public class Insertionsort {
    
    public void sort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i-1;
            while (j >= 0 && arreglo[j] < key) {
                arreglo[j+1] = arreglo[j];
                j--;
                
            }
            arreglo[j+1] = key;

            if ((j+1)!= i) {
                System.out.println("El aux = " + arreglo[j+1] + " se inserta en posicion: " + (j+1) );

            }
            

        }

    }
}
