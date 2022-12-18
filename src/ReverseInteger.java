public class ReverseInteger {
    static class Solution {
        static public int reverse(int x) {


            int end = x;

            if (x < 0) {

                x *= -1;
            }
            if (x == 0){
                return 0;
            }
            int tmp = x;
            int counter = 0;
            while(tmp != 0){
                tmp = (tmp-tmp%10) / 10;
                counter++;
            }
            int[] array = new int[counter];
            counter = 0;
            while (x != 0){

                array[counter] =x%10;
                x = (x-x%10)/10;
                counter++;

            }
            long result = 0;
            int k= 0;
            for(int i = array.length-1; i >=0; i --){

                result += array[i]*Math.pow(10,k);
                k++;
            }
            if (result<-2147483648 ||result > 2147483647){
                return 0;
            } else if(end <0) {
                result = result * -1;
                return (int) result;
            }else {
                return (int)result;
            }



        }
    }

    public static void main(String[] args) {

        int number = -123;

        System.out.println(Solution.reverse(number));

    }
}
