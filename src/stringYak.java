/**
 * Created by miser on 10/11/2016.
 */
public class stringYak {

    public static String stringYak(String str){
        StringBuilder newWord = new StringBuilder("");
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) != 'Y' && str.charAt(i + 1) != 'a' && str.charAt(i + 2) != 'k'){
                newWord.append(str.charAt(i));
            }
        }
        String yakLess = newWord.toString();
        return yakLess;
    }


    public static void main(String[] args){
        String newWord = stringYak("yak123ya");
        System.out.println(newWord);
    }
}
