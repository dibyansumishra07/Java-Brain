package Strings;

interface BaseI{
    public void method();
}
public class BalancedBraces {
    boolean isBalanced(String string){

        return true;
    }
    boolean isBalanced2(int i, int j){

        return true;
    }
    public void method(){
        System.out.println("BalanceBa");
    }
}
class B extends BalancedBraces implements BaseI{
    public static void main(String args[]){
        new B().method();
    }
}
