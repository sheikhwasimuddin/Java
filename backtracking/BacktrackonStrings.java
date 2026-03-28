
public class BacktrackonStrings {
    public static void changeStr(StringBuilder str, int i, char val, int n) {
        //base case
        if(i == n) {
            System.out.println(str.toString());
            return;
        }

        //recursion (choose)
        str.append(val);
        changeStr(str, i+1, (char)(val+1), n); //fnx call
        //backtracking step (un-choose)
        str.deleteCharAt(str.length() - 1);
    }

    public static void main(String args[]) {
        StringBuilder str = new StringBuilder();
        changeStr(str, 0, 'a', 5);
        System.out.println(str.toString());
    }
}