class Application {
    private String appName;
    private String userName;
    private String password;
    // Constructor overloading
    Application(){}
    Application(String appName){
        this.appName = appName;
    }
    Application(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    // setData is an overloading method
    public void setData(String appName){
        this.appName = appName;
    }
    public void setData(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public String getAppName(){
        return appName;
    }
    public String getUsername(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    

}
public class MethodAndConstructorOverloading {
    public static void main(String[] args) {
        Application application = new Application();
        System.out.println("============================================================================");
        System.out.println("Constructor Overloading");
        Application application1 = new Application("CodeSmashers");
        Application application2 = new Application("Muhammad Tayyab Bhutto" + "qwe123");
        System.out.println("App Name: " + application1.getAppName() + " \nUser Name: " + application2.getUsername());
        System.out.println("============================================================================");
        System.out.println("Method Overloading");
        application.setData("My App");
        application.setData("Muhammad Tayyab Bhutto", "asd123");
    
        System.out.println("App Name: " + application.getAppName() + " \nUser Name: " + application.getUsername());
    }
}
