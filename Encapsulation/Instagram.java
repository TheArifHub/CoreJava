class Account {

    private String email;
    private String password;
    private String confirmPassword;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getConfirmPassword() {
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public void register(String enteredEmail,String enteredPassword,String enteredConfirmPassword)
    {
        if(enteredPassword.equals(enteredConfirmPassword))
        {
            setPassword(enteredPassword);
            setConfirmPassword(enteredConfirmPassword);
            setEmail(enteredEmail);
            System.out.println("Registered successfully!");
        }else{
            System.out.println("Password and confirm Password Not Matching");
        }
    }

    public void sigin(String enteredEmail,String enteredPassword)
    {
        if(getEmail().equals(enteredEmail) && getPassword().equals(enteredPassword)){
            System.out.println("Sigin Successfully!");
        }else{
            System.out.println("Invalid Credentials");
        }
    }
    
}

public class Instagram {
    public static void main(String[] args) {
        
        Account account = new Account();

        account.register("arif@gmail.com", "arif$123", "arif$123");
        
        account.sigin("aaru@gmail.com", "153");
        account.sigin("arif@gmail.com", "arif$123");
    }
}
