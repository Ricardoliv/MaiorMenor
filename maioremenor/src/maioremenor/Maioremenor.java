package maioremenor;
import java.util.Scanner;
/**
 *
 * @author Ric
 */
public class Maioremenor 
{

    
    public static void main(String[] args) 
    {
       Scanner valor = new Scanner(System.in);
       //System.out.println("Digite o 1º número:"); 
       System.out.println("Digite de 1 a 20");
       int maior = valor.nextInt();
       int menor = maior;
      
        for (int i = 1; i < 20; i++)
        {
           
       //System.out.println("Digite o próximo número:");
            int num = valor.nextInt(); 
        
            if (maior <= num)
            {
                maior = num; 
            }
            if (menor >= num)
            {
                menor = num;
            }
      

        }
        
        
       System.out.println( " número maior: "+maior+" e o número menor: " +menor);
       
      
       
    }
}
