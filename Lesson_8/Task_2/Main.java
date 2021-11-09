
public class Main {
    public static boolean verification(String login, String password, String confirmPassword)throws WrongPasswordException, WrongLoginException{

        try {
            login(login);
            password(password, confirmPassword);
            return true;
        }catch (WrongPasswordException | WrongLoginException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static void login(String login) throws WrongLoginException {
        if(login == null || login.isEmpty()){
            throw new WrongLoginException("Login is empty!");
        }
        if(login.length() > 20){
            throw new WrongLoginException("Login > 20");
        }
        if(!login.matches("\\w+")){
            throw new WrongLoginException("Only latin letters, numbers, underscore!");
        }
    }
    public static void password(String password, String confirmPassword) throws WrongPasswordException {
        if(password == null || password.isEmpty()){
            throw new WrongPasswordException("Password is empty!");
        }
        if(password.length() > 20){
            throw new WrongPasswordException("Password > 20");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Password != confirmPassword");
        }
        if(!password.matches("\\w+")){
            throw new WrongPasswordException("Only latin letters, numbers, underscore!");
        }
    }
    public static void main(String[] args) throws Exception {

        System.out.println(verification("Marina", "1234", "1234"));
    }
}
