public class RandomEmail {
    private String firstName;
    private String lastName;
    private int num;
    private String domain;
    private String extension;
    /** Default constructor initializes firstName to "George", lastName to "Washington", num to 1776 domain to "gmail", and extension to "com"
     */
    public RandomEmail(){
        firstName="George";
        lastName="Washington";
        num=1776;
        domain="gmail";
        extension="com";
    }
    /** Overloaded constructor that initializes this.firstName to firstName; this.lastName to lastName; this.domain to domain; this.extension to extension\
     * @param firstName - the first name provided by the user
     * @param lastName - the last name provided by the user
     * @param num - the number provided by the user
     * @param domain - the domain provided by the user
     * @param extension - the extension provided by the user
     */
    public RandomEmail(String firstName, String lastName, int num, String domain, String extension){
        this.firstName=firstName;
        this.lastName=lastName;
        this.num=num;
        this.domain=domain;
        this.extension=extension;
    }

    /** Get email address
     *
     * @return - the complete email address
     */
    public String toString(){
        return firstName+lastName+num+"@"+domain+"."+extension;
    }

    /**Provides different variations of your originally created email address by putting different parts of the email first or substring the first letter of the name to get the first initial
     *
     * @return - different variations of your original email address
     */
    public String emailVariation(){
        String defaultEmail=toString();
        String backwards=lastName+firstName+num+"@"+domain+"."+extension;
        String firstInitial="";
        String lastInitial="";
        if (firstName.length()>0){
            firstInitial=firstName.substring(0,1)+lastName+num+"@"+domain+"."+extension;
        }
        if(lastName.length()>0){
            lastInitial=firstName+lastName.substring(0,1)+num+"@"+domain+"."+extension;
        }
        return "Your email address variations: \n"+"Default: "+defaultEmail+"\nFirst Name Initial: "+firstInitial+"\nLast Name Initial: "+lastInitial+"\nLast Name First: "+backwards;
    }

    /** creates a randomly generated String by picking random numbers and converting them using the ASCII table (numbers and letters only)
     *
     * @param length - the length of the String
     * @return - the randomly generated String
     */
    public String random(int length){
        int randomNum;
        double ranNumSec;
        String randomGen="";
        for(int i=1; i<=length; i++){
            ranNumSec=(int)(Math.random()*(3)+1);
            if(ranNumSec==1){
                randomNum=(int)(Math.random()*(10)+48);
                randomGen+=Character.toString(randomNum);
            }else if(ranNumSec==2){
                randomNum=(int)(Math.random()*(26)+65);
                randomGen+=Character.toString(randomNum);
            }else{
                randomNum=(int)(Math.random()*(26)+97);
                randomGen+=Character.toString(randomNum);
            }

        }
        return randomGen;
    }

    /**Prints a random email address created using the random() method
     *
     */
    public void randomEmail(){
        System.out.println("Your generated email address: \n"+random(16)+"@"+domain+"."+extension);
    }

}

