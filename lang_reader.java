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
      int gender_adv = option_handler.nextInt();
      int prep = options_handler.nextInt();
      int post = options_handler.nextInt();
      int article = options_handler.nextInt();
      String[255] roots;
      String[255] rgender;
    } catch(IOException e){
      System.out.println("\033[31mError[1]:Input/Output Failure");
    } catch(Exception e){
      System.out.println("\033[31mError[0]:Something Failed");
    }
  }
}
