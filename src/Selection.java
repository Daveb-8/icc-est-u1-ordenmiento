public class Selection {

    public void sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;
        for(int i = 0 ; i < arreglo.length ; i ++) {
            int min = i;
            System.out.println("Pasada" + i);

            for (int j = i + 1 ; j < arreglo.length ; j++) {
                comparaciones ++;
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                    cambios ++;
            

                }
            //Intercambio
            int temp = arreglo[min];
            arreglo[min] = arreglo [i];
            arreglo[i] = temp;

            }
       
            System.out.println("Cambios:" + cambios);
            System.out.println("Comparaciones:" + comparaciones);
             
        }
        System.out.println("Cambios:" + cambios);
        System.out.println("Comparaciones:" + comparaciones);
      
    

    }
    
}
