import java.util.Scanner;
public class mini_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynum = (int)(Math.random()*100);
        int usernum = 0;

        do{
            System.out.println("guss my number:(1-100) :");
            usernum = sc.nextInt();
            if (usernum == mynum)
            {
                System.out.println("WOO,  CORRECT NUMBER!!!");
                break;
                
            }
            else if(usernum > mynum){
            
                System.out.println("number is too large");}
            else
            {
                System.out.println(" number too small");
            }
        }
        while(usernum>=0);
        System.out.println("MY no. is");
        System.out.println(mynum);
        sc.close();

        

    }
    
}
