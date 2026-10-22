public class Bubble {
    //David Baroja, Walter Loza
    public int[] sort(int[]arreglo){
        int cambios = 0;
        int comparaciones = 0;
        for(int i = 0; i < arreglo.length -1 ; i++) {
            System.out.println("Pasada" + i);
            boolean combinaciones = false;
            for(int j = 1; j < arreglo.length   ; j++) {
                comparaciones ++;
                //COMPARACION IF
                if (arreglo[j-1] > arreglo[j]) {
                    cambios++;
                    combinaciones = true;
                    //INTERCAMBIO
                    int temp = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
            if(!combinaciones){
                break;
            }
            System.out.println("Cambios:" + cambios);
            System.out.println("Comparaciones:" + comparaciones);
        
        
        }
        System.out.println("Cambios:" + cambios);
        System.out.println("Comparaciones:" + comparaciones);
        return arreglo;
  
    
    }
}