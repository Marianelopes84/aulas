import javax.lang.model.util.ElementScanner6;

public class fibo_par {
    public static void main(String[] args){
        int num1 = 1;
         
        System.out.print(num1);
        System.out.println("Impar");

        int num2 = 1
            
        System.out.print(num2);
        System.out.println("Par");

        int total;

        for(int cont = 3; cont<= 30; cont++){
            total = num1 + num2;
            num2 = num1 - num2;
            System.out.println(total);
        
        if (total%2 == 0);
            System.out.println("par")
        else 
        
        System.out.println("impar");


            }
}
}