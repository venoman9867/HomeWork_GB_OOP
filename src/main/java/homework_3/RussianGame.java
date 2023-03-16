package homework_3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        try(FileReader reader = new FileReader("src/main/resources/russian.txt")){
            StringBuilder str=new StringBuilder();
            int c;
            while((c=reader.read())!=-1){
                str.append((char)c);
            }
            String[] strings=str.toString().split("\n");
            String string = strings[(int) (Math.random() * strings.length)];
            char[] chars=string.toCharArray();
            String[] charsResult=new String[chars.length];
            for(int i=0;i<chars.length;i++){
                charsResult[i]=String.valueOf(chars[i]);
            }
            return Arrays.asList(charsResult);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
