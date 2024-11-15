package exercicioAula3;

public class Ex02 {
	 public static void main(String[] args) {
	        int[] numeros = {5, 3,1,12, 8, 4, 2};
	        bubbleSort(numeros);
	        for (int num : numeros) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void bubbleSort(int[] array) {
	        //trocaElementos(array, 1, 3);  // Troca os elementos nos índices 1 e 3
	        for (int i = 0; i < array.length - 1; i++) {
	            for (int j = 0; j < array.length - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j+1] = temp;
	                }
	            }
	        }
	    }
	    
	    /*
	    public static void trocaElementos(int[] array, int indice1, int indice2) {
	        int temp = array[indice1];
	        array[indice1] = array[indice2];
	        array[indice2] = temp;
	    }
		*/
}
