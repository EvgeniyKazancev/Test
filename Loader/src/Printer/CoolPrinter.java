package Printer;
import java.util.ArrayList;
import java.util.Formatter;
/**public class CoolPrinter  {
    public static String testString = "";
    private static ArrayList<String> lines = new ArrayList<String>();

    public static void add(String line){
        lines.add(line);
        CoolPrinter.print(new Formatter(){
            public String format(String s){
                return "** " + s + " **";
            }
        });
    }
    public static void print(Formatter formatter){

        if (!testString.equals(""))
            System.out.println(testString);
        if (formatter == null){
            print();
            return;
        }
        for (String line : lines){
            System.out.println(formatter.format(line));
        }
        if (!formatter.getClass().isAnonymousClass()) {
            System.out.println("BUT FORMATTER'S CLASS IS NOT ANONYMOUS...");
        }
    }
    public static void clear(){
        lines.clear();
    }
    public static void print(){
        System.out.println("No Formatter - no print!");
    }
    }

**/
