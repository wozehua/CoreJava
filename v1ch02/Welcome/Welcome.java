/**
 * This program displays a greeting for the readerr.
 * @version 1.30 2026年4月11日
 * @author czh
 */
class Welcome {

    public  static  void main(String[] args){
        String greeting="Welcome to Core Java!";
        System.out.println(greeting);
        for (int i=0;i<greeting.length();i++)
            System.out.print("=");
            System.out.println();
    }
}
