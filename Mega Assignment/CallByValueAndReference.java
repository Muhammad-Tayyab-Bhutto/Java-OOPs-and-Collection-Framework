public class CallByValueAndReference {
    private String name;
    private int id;
    private CallByValueAndReference obj;
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setValue(CallByValueAndReference obj){
        obj.name = "Muhammad Tayyab Bhutto";
        obj.id = 286; 
        this.obj = obj;
    }
    public CallByValueAndReference getValue(){
        return obj;
    }

    public static void main(String[] args) {
        CallByValueAndReference obj = new CallByValueAndReference();
        obj.setName("Muhammad Muzammil Bhutto");
        obj.setId(786);
        System.out.println("Call By Value. " + obj.getName() +"  "+ obj.getId());
        obj.setValue(obj);
        System.out.println("Call By Reference. " + obj.name + "  "+obj.id);
    }
}
