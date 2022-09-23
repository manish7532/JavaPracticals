package justpractice;

import java.util.*;
public class Validate {
  public void xyz(String a , String b) {
    String username = "ABC";
    String password = "DEF";
    boolean c=false;
    if(a.equals(username) && b.equals(password))
    {
        c=true;
    }
    else{
        c=false;
    }
    System.out.println(c);
  }

public static void main(String[] args){
    
    Validate obj = new Validate();
    Scanner sc = new Scanner(System.in);
    String x = sc.nextLine();
    String y = sc.nextLine();
    obj.xyz(x,y);
    sc.close();
    
  }

}
