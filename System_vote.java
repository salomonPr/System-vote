import java.time.LocalDate;
import java.util.Scanner;

public class System_vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome in the system vote");
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter second name: ");
        String secondName = scanner.nextLine();

        System.out.println("hello "+firstName+" "+secondName);

        System.out.println("Enter year you were born : ");
        int year = scanner.nextInt();

        int age = LocalDate.now().minusYears(year).getYear();



        System.out.println("here your age  : "+age);

        if(age>=18){
            System.out.println("welcome in vote Room ");

            System.out.println("enter you identification card number : ");
            long id = scanner.nextLong();
            System.out.println("thank you");

            System.out.println("here your candidate, choose one of your choice ");
            System.out.println("1:NKurunziza Salomon");
            System.out.println("2:Muvunyi Fiston ");
            System.out.println("3:Mugiraneza Honnore ");
            System.out.println("4:Byukusenge Emmanuel");
            System.out.println("5:Rugwiza kevin");

            int candidate = scanner.nextInt();

            switch (candidate){
                case 1:
                    System.out.println("1:NKurunziza Salomon");
                    break;
                case 2:
                    System.out.println("2:Muvunyi Fiston ");
                    break;
                case 3:
                    System.out.println("3:Mugiraneza Honnore ");
                    break;
                case 4:
                    System.out.println("4:Byukusenge Emmanuel");
                    break;
                case 5:
                    System.out.println("5:Rugwiza kevin");
                    break;
                default:
                    System.out.println("wrong choice try again please ");
            }

            System.out.println("thank you for your vote, recorded");


        }
        else{
            System.out.println("you are not elligible to vote ");
        }



    }
}
