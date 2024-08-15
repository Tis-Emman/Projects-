import java.util.InputMismatchException;
import java.util.Scanner;

public class bankingproject{
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Simple Temperature Converter!");
        System.out.println("What temperature do you want to convert?");
        System.out.println("*************************");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        int choices = scanner.nextInt();
        
        try{
            switch (choices) {
            case 1:
            System.out.println("Into what? ");
            System.out.println("******************");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Kelvin");

            int f_choice = scanner.nextInt();

                switch (f_choice) {
                    case 1:
                        System.out.println("Enter the Celsius: ");
                        double Celcius_choice = scanner.nextDouble();
                        double C_calculate = (Celcius_choice * 9/5);
                        double C2_calculate = (C_calculate + 32);
                        System.out.println("The Fahrenheit is: " + C2_calculate);
                        break;
                    case 2:
                        System.out.println("Enter the Celsius: ");
                        double C2_Celsius_choice = scanner.nextDouble();
                        double C21_calculate = (C2_Celsius_choice + 273.15);
                        System.out.println("The Kelvin is: " + C21_calculate);
                        break;
                    default:
                        System.out.println("Input not recognized!");
                        break;
                }
                break;
            case 2:
            System.out.println("Into what? ");
            System.out.println("******************");
            System.out.println("1. Celsius"); //Fahrenheit
            System.out.println("2. Kelvin");

            int s_choice = scanner.nextInt();

                switch (s_choice) {
                    case 1:
                    System.out.println("Enter the Fahrenheit: ");
                    double Fahrenheit_Choice = scanner.nextDouble();
                    double F_calculate = (Fahrenheit_Choice - 32);
                    double F2_calculate = (F_calculate * 5/9);
                    System.out.println("The Celsius is: " + F2_calculate);
                        break;
                    case 2:
                    System.out.println("Enter the Fahrenheit: ");
                    double Fahrenheit2_Choice = scanner.nextDouble();
                    double Converter1 = (Fahrenheit2_Choice - 32);
                    double Converter2 = (Converter1 * 5/9);
                    double Converter3 = (Converter2  + 273.15);
                    System.out.println("The Kelvin is: " + Converter3);
                        break;
                    default:
                        System.out.println("Input not recognized!");
                        break;
                }
                break;
            case 3:
            System.out.println("Into what? ");
            System.out.println("******************");
            System.out.println("1. Celsius");
            System.out.println("2.Fahrenheit");

            int t_choice = scanner.nextInt();
            switch (t_choice) {
                case 1:
                    System.out.println("Enter the Kelvin: ");
                    double K_choice = scanner.nextDouble();  
                    double K_Converter = (K_choice - 273.15);
                    System.out.println("The Celsius is: " + K_Converter);
                    break;
                case 2:
                System.out.println("Enter the Kelvin: ");
                double K2_choice = scanner.nextDouble();
                double K2_Converter = (K2_choice - 273.15); // Convert Kelvin to Celsius
                double K21_Converter = (K2_Converter * 9 / 5); // Convert Celsius to Fahrenheit
                double K22_Converter = (K21_Converter + 32); // Add 32 to get final Fahrenheit value
                System.out.println("The Fahrenheit is: " + K22_Converter);
                    break;
                default:
                    System.out.println("Input not recognized!");
                    break;
            }
                break;
            default:
                System.out.println("Input not recognized!");
                break;
        }
        } catch(InputMismatchException e){
            System.out.println("Input not recognized!");
        }
        
   }
    
   

}
 
    

    


