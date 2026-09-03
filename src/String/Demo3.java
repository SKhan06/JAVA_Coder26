package String;

public class Demo3 {
    public static void main(String [] args){
        String s1 = "Hello";
        String s2 = new String("World");
           s1 = s1.concat(s2);
        // System.out.println(s1);

        String s3 = "Hello";
        String s4 = new String(s3);
        // System.out.println(s4);

        char[] arr = {'S','O', 'H', 'A', 'I','L',' ','A' ,'L','A','M'};
        String s5 = new String(arr);
        // arr[0] = 'B';
        // System.out.println(s5);
        // System.out.println(arr);
        
        //Char array subset
        String s6 = new String(arr,0,6);
        // System.out.println(s6);

        byte[] s7 = new byte[]{97,98,99};
        String s8 = new String(s7,0,2);
        // System.out.println(s8);


        //StringBuilder and StringBuffer

        StringBuilder s9 = new StringBuilder("Hello");
        StringBuffer s10 = new StringBuffer("Wolrd");
        System.out.println(s9);
         System.out.println(s10);







    }
    
}
