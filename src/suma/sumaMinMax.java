package suma;
import java.util.ArrayList;

public class sumaMinMax {

	static void miniMaxSum(int[] arr, int n) {
        //arraylist que va almacenar los n numeros mayores
        ArrayList<Integer> mayores = new ArrayList<Integer>();
        //arraylist que va almacenar los n numeros menores
        ArrayList<Integer> menores = new ArrayList<Integer>();
        //llenar los arraylist con el arreglo arr    
        for(int i = 0; i < arr.length; i++){
                //si el arraylist es menor que n entonces vamos a llenar los arraylist
                if(mayores.size() < n){
                    mayores.add(arr[i]);
                    menores.add(arr[i]);
                }else{
                	System.out.println("----");
                    //si es que ya supero la capacidad n vamos a comparar y reemplazar 
                    if(arr[i] < menores.get(posMayor(menores))){                   
                        menores.set(posMayor(menores), arr[i]);
                    }
                    if (arr[i] > mayores.get(posMenor(mayores))) {
                        mayores.set(posMenor(mayores), arr[i]);
                    }
                }
                System.out.println(menores.toString()+" " +mayores.toString());
            }
        
        System.out.println(suma(menores)+" "+ suma(mayores));
    }
	//Devuelve el indice del numero menor del arreglo
    static int posMenor(ArrayList<Integer> arr){
        int min = arr.get(0);
        int i;
        for(i = 0; i < arr.size(); i++){
            if(arr.get(i) < min){
                min = arr.get(i);
            }
        }
        //System.out.println(arr.get(arr.indexOf(min)));
        return arr.indexOf(min);
    }
    static int posMayor(ArrayList<Integer> arr){
        int max = arr.get(0);
        int i;
        for( i = 0; i < arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);                
            }
        }
        return arr.indexOf(max);
    }
    static int suma(ArrayList<Integer> arr){
        int suma = 0;
        for(int i = 0; i < arr.size(); i++){
            suma = suma + arr.get(i);
        }
        return suma;
    }
    public static void main(String[] args) {

        int[] arreglo = {45, 26, 94, 13, 64, 27, 53, 91};
        
        miniMaxSum(arreglo, 4);
    }
	
}
