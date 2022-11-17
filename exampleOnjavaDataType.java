import java.awt.*;

public class Main{
public static void main(String[] args){
  Point addis =new Point(23,88);
  Point adama = addis;
  System.out.println(addis);
 System.out.println(adama);
 addis.x =45;
 addis.y =99;
 System.out.println(adama);
//StringBuffer is muteable
  StringBuffer name =new StringBuffer("abel ");
 StringBuffer fName =name;
 name.append("Kebede");
  System.out.println(name);
  System.out.println(fName);
 }
}


public class Main{
 public static void main(String[] args){
  //String is immutable
  String name = "abel";
  String fName = name;
  name ="zerihun";
  System.out.println(fName;
  
 }
}
                     
                     
import java.util.Arrays;

public class Main{
 public static void main(String[] args){
  String name ="abel";
  System.out.println(name.toUpperCase());
  System.out.println(name.charAt(2));
  System.out.println(name.length());
  System.out.println(name.replace("el","al"));

  String name2;
  name2 ="Zerihun";

  String[] nameOfStudents = new String[5];
  nameOfStudents[0] ="hanna";
  nameOfStudents[1] ="abel";
  nameOfStudents[2] ="hailu";
  nameOfStudents[3] ="dav";
  nameOfStudents[4] ="seni";
  System.out.println(Arrays.toString(nameOfStudents));

  int[] numbers ={2,3,43,4,14,34,54,43};
  System.out.println(Arrays.toString(numbers));
  System.out.println(nameOfStudents[2]);
  System.out.println(numbers.length);
  Arrays.sort(numbers);
  System.out.println(Arrays.toString(numbers));

 }
}
                     
