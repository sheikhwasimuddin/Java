public class DuplicateinString {
    public static void Duplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            //duplicate
            Duplicate(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            Duplicate(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String args[]){
        String str="sheikhwasimuddin";
        boolean map[]=new boolean[26];
        Duplicate(str, 0, new StringBuilder(""), map);
    }
}
