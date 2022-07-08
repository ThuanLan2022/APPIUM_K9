package lesson_09_02;

public abstract class LoginPage {


    public void login() {
        System.out.println(usernameLocator());
        System.out.println(passwordLocator());
        System.out.println(lobinBtnLocator());
    }

    protected abstract String usernameLocator();

    protected abstract String passwordLocator();

    protected abstract String lobinBtnLocator();


}
