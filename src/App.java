import java.util.Scanner;
class demos {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
        String firstname = sc.nextLine();
        String middlename = sc.nextLine();
        String lastname = sc.nextLine();
        String fullname = firstname + " " + middlename + " " + lastname;
        System.out.println(fullname);
        System.out.println("Enter three numbers to calculate their product:");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        int result= x*y*z;
        if(result<= 24){ System.out.println ("you loser");
    } else{System.out.println("next time");}
        System.out.println("result: "+ result);
        sc.close();
       

    }
}
