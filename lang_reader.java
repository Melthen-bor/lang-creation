import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class lang_reader{
  public static String Concate(Object o0,Object o1){
    return o0+""+o1;
  }
  public static void main(String[] args){
    try{
      File options = new File("options.txt");
      Scanner options_handler = new Scanner(options);
      int gender_nouns = options_handler.nextInt();
      int encode_pos = options_handler.nextInt();
      int gender_verbs = options_handler.nextInt();
      int gender_adjs = options_handler.nextInt();
      int gender_no_pos = options_handler.nextInt();
    } catch(Exception e){
      System.out.println("\033[31mError[0]:Something Failed");
    }
  }
}
