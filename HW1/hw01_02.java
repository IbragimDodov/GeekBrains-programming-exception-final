package HW1;
import java.util.Arrays;

/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не 
равны, необходимо как-то оповестить пользователя. */

public class hw01_02 {
 
 public static void main(String[] args) {
    int [] array1={5,9,8,7,5,6,4,0,3,7};
    int [] array2={15,97,0,8,5,1,4,0,3,57};
    int [] result = getDiv(array1,array2);
    System.out.println(Arrays.toString(result));
 } 

private static int[] getDiv (int [] arr1, int [] arr2){
    if (arr1==null || arr2==null){
        throw new RuntimeException("Someone of the arrays is equal to NULL.");
    } else if (arr1.length!=arr2.length){
        throw new RuntimeException("Lengths of the arrays should be equal. Lengths are different.");
    }
    int [] result = new int [arr1.length];
    for (int i = 0; i<arr1.length;i++){
        if (arr2[i]==0){
            throw new RuntimeException("Division by zero is prohibited.");
        }
        result[i]=arr1[i]/arr2[i];
    }
    return result;
    
}
}