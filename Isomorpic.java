import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextInt();
        String t=sc.nextInt();
        if(s.length() != t.length()){
            return false;
        }
       public boolean isIsomorpic(String s,String t){

        HashMap<String,String> map1=new HashMap<>();
        HashMap<String,String> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.CharAt(i);
            char b=t.CharAt(i);
        }
        
        if(map1.containsKey(a)){
            if(b!=map1.get(a)){
                return false;
            }
            else{
                if(map2.containsKey(b)){
                    return false;
                }
                map1.put(a,b);
                map2.put(a,b);
            }
        }
        System.out.println("Yes");
    }
}
}
