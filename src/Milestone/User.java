package Milestone;

public abstract class User {

    private  String userId;
    private String name;
    private String contactInfo;


    abstract void displayDashboard();

    abstract boolean canBorrowBooks();


    public  User(){
       this.userId=userId;

   }
   public User (User user){
       this.userId= user.userId;

   }
   final int  generateUniqueId(){
       return 0;
    }
   public User(String name1, String contactInfo1){
       this.name=name1;
       this.contactInfo=contactInfo1;

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
