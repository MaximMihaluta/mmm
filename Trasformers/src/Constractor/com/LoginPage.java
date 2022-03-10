package Constractor.com;

public class LoginPage {
    String username;
    String pasword;
    String signIn;
    boolean isDiplated;

    public LoginPage(String username,String pasword,String signIn){
        this.username = username;
        this.pasword = pasword;
        this.signIn = signIn;

    }

    public void EnterUser(){
        System.out.println(this.username);
    }
    LoginPage(){
        this.isDiplated = false;
    }
    public void Enterpass(){
        System.out.println(this.pasword);
    }
    public void SignIn(){
        System.out.println(this.signIn);
    }
    public void  LoginMethod(){
        EnterUser();
        Enterpass();
        SignIn();
    }




}
