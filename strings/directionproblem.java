public class directionproblem {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("shortest distance: " + getFinalDirection(str));
    }
    public static float getFinalDirection(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
            
        }
        System.out.println("Current Position: (" + x + ", " + y + ")"); 
        return (float)Math.sqrt(x*x+y*y);
    }
}
