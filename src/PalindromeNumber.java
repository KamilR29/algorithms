
public class PalindromeNumber {

    static class Solution {

        static public boolean isPalindrome(int x) {
            int counter = 0;
            int[] array;
            if(x<0){
                return false;
            }else{

                int j = 0;
                int tmp = x;
                while (x != 0) {
                    x = (x - x%10) /10;
                    j++;
                }
                int f=0;
                array = new int[j];
                while (tmp != 0) {
                    array[f]=tmp%10;
                    tmp = (tmp - tmp%10) /10;
                    f++;
                }

                int k = array.length-1;
                for(int i = 0; i<array.length/2; i++){
                    if(array[i]==array[k--]){

                        counter++;
                    }else{

                        return false;
                    }
                }



            }

            return counter == array.length / 2;
        }
    }

    public static void main(String[] args) {

        int number = 121;

        System.out.println(Solution.isPalindrome(number));

    }
}
