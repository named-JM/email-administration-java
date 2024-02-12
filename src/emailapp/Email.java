
package emailapp;

import java.util.Scanner;

public class Email {
    //declare variables and we gona use encapsulation
    private final String firstname;
    private final String lastname;
    private String password;
    private String department;
    private String alternateEmail;
    private String email;
    private String companySuffix = "abcompany.com";
    private int mailboxCapacity=500;
    //set the length!
    private int defaultPasswordLength =10; //define the length to randomize what is the limit long characters
    
    //main = constructor i think
    //constructor to recieve the first name and last name
    public Email (String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);
    
        //calll a method asking for the dept. - return the department
        this.department = setDepartment();
        System.out.println("Dept: " + this.department );
        
        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        
        
       //combine elements to generate email
       
       email = firstname.toLowerCase() + "" + lastname.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is " + email);
    }

    //ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1. for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter dept code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        //orange is just warning or suggestion
        switch (deptChoice) {
            case 1: 
                return "sales";
            case 2:
                return "Dev";
            case 3:
                return "acct";
            default:
                return "";
        }
    
    }
    //generate a random password
    private String randomPassword(int length){
        //define what were gonna choose from
        String passwordSet = "ABCDEFGHIJKLMNPQRSTUVWXYZ!@#$%"; //WE GONNA LOOK THIS LIKE ARRAY
        char[] password = new char[length];
        //iterate through value of the length
        
        for (int i=0; i<length; i++){
            //we'll cast it as an interger
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }//once regenerate
        //pass the characters(password)
        return new String(password);
    }
    //set the mailbox capacity
    //public API 
    public void setMailbocCapacity(int capacity){
        
        this.mailboxCapacity = capacity;
    }
    
    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    
    
    //change the password
    public void changePassword(String password){
        this.password = password;
    }
    //public method that going to access the property 
    public int getMailbox(){ return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}
    
    public String showInfo(){
        return "\nDISPLAY NAME: " + firstname + " " + lastname + 
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPCITY: " + mailboxCapacity + "mb";
    }
}
