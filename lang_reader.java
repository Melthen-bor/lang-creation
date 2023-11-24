import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.random;
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
      String[255][255] affixes;
      String[] consonants = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
      String[] vowels = {"a","e","i","o","u"};
      int ex = 1;
      int set;
      Random gen = new Random();
      int randindex;
      if(encode_pos==0){
        if(gender_no_pos==0){
          set = 0;
        } else{
          set = 1;
        }
      } else{
        set = 2;
      }
      int z = 0;
      int y = 0;
      int w;
      String x = '';
      while(ex==1){
        try{
          w=gen.nextInt();
          while(w>0){
            randindex = gen.nextInt(consonants.length);
            x=concate(x,consonants[randindex]);
            randindex = gen.nextInt(vowels.length);
            x=concate(x,vowels[randindex]);
            w-=1;
          }
          roots[z] = x;
          z += 1;
          x = "",
        } catch(Exception e){
          z=0;
          ex=0;
        }
      }
      if(set==0){
        while(ex==1){
        }
      } else if(set==1){
        while(ex==1){
        }
      } else if(set==2){
        while(ex==1){
        }
      } else{
        throw new SettingBoundsException();
      }
    } catch(IOException e){
      System.out.println("\033[31mError[1]:Input/Output Failure");
    } catch(SettingBoundsEception e){
      System.out.println("\033[31mError[2]:Setting variable has a value that it should not be able to");
    } catch(Exception e){
      System.out.println("\033[31mError[0]:Something Failed");
    }
  }
}
