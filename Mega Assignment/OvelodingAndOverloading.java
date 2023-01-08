// Overloading and Overriding and two different kinds
// Overloading: when two or more methods having same name and different parameters is know as overloading it is compile time pollymorphism
// Overriding: when two or more methods having same name and same parameters is know as overriding it is run time pollymorphism
class Application {
    private String appName;
    private String userName;
    private String password;

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
class Profile extends Application{
    private String userName;
    // Overriding
    public void setData(String userName){
        this.userName = userName;
    }
    public String getUsername(){
        return userName;
    }
}
public class OvelodingAndOverloading {
    public static void main(String[] args) {
        Application application = new Application();
        Profile profile = new Profile();
        application.setData("My App");
        application.setData("Muhammad Tayyab Bhutto", "asd123");
        profile.setData("muhammad-tayyab-bhutto");
        System.out.println("App Name: " + application.getAppName() + " \nUser Name: " + application.getUsername());
        System.out.println("Profile id: " + profile.getUsername());
    }
}
