public class Students{
  String name,emailid;
  long mobile;
  Students(String name,long mobile,String emailid){
    this.name=name;
    this.mobile=mobile;
    this.emailid=emailid;
  }
  void display()
  {
    System.out.println(this.name + "\t" + this.mobile +"\t" + this.emailid +"\t");
  }
  public static void main(String[]args){
  Students s1=new Students("Alpha",8074970716L,"Alpha@gmail.com");
  Students s2=new Students("Beta",6304705505L,"Beta@gmail.com");
  s1.display();
  s2.display();
  }
}