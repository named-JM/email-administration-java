
package emailapp;

import java.util.Scanner;

/**
Email Application
* you are an it support administrator specialist and are charged
* with the task of creating email accounts for new hires.
* 
* - generate an email w foll syntax: firstname.lastname@department.company.com
* - determine the department(sales,development,accounting) if none leave blank
* - generate a random string for a password
* - have set methods to change the password, set the mailbox capacity, and define an alternate
* email address
* - have get methods to display the name, email, and mailbox capacity
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //code here 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Firstname: ");
        String firstname = scan.next();
        
        System.out.print("Enter your Lastname: ");
        String lastname = scan.next();
        
                            //firstname, lasstname
        Email em1 = new Email(firstname, lastname);
//        em1.setAlternateEmail("j@gmail.com");
//        System.out.println(em1.getAlternateEmail());
        scan.close();
        System.out.println(em1.showInfo());
    }
    
}
