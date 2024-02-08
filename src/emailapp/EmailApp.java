
package emailapp;

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
                            //firstname, lasstname
        Email em1 = new Email("John", "Smith");
    }
    
}
