import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] alphabet = {
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'
        };

        String data = "солнце";

        ArrayList<Integer> n = save_numbers(data, alphabet);

        reverse_alphabet(alphabet);

        output_result(alphabet, n);
    }


    public static void reverse_alphabet(char[] ch){
        //переварачиваем алфавит
        for (int i =0; i< ch.length/2;i++) {
            char tmp = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = tmp;
        }
    }


    public static void output_result(char[] alphabet, ArrayList<Integer> number){
        //String r = new String();
        //ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i <number.size();i++){
            try{

                System.out.print(alphabet[number.get(i)]);
            }
            catch (NullPointerException erro){
                System.out.print(" ");
            }
        }
        // return r;
    }

    public static ArrayList<Integer> save_numbers(String parts, char[] alphabet){
        ArrayList<Integer> n = new ArrayList<>();


        for(int j=0;j<parts.length();j++){
            //запоминаем позицию в алфавите каждой буквы в слове
            for(int k=0;k<alphabet.length;k++){
                if(parts.charAt(j) == alphabet[k])
                    n.add(k);
            }
        }

        return n;
    }
}