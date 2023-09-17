public class Main {
    public static void main(String[] args){
        int num=0;
        for (int i=0; i<=2000; i++){
            num=i;
            if (num%2==0)
                System.out.println(num + " ");
            if (num%2==1)
                System.out.print(num + " ");
        }
    }
}