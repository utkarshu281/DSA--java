package striver.Basics.BasicHashing;
import java.util.HashMap;
/*
* Array when the problem explicitly says:
lowercase English letters
uppercase English letters
digits 0–9
small bounded range
HashMap when:
the range is unknown,
values can be very large,
keys are arbitrary characters or strings.
*
* */
public class CharacterHashing {
    public static void main(String[] args) {
        String charArray="Utkarsh Upadhyay AsDfGb";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<charArray.length();i++){
            char currentChar = charArray.charAt(i);
            if(Character.isLetter(currentChar)){
                /*
                *  map.put(ch, map.getOrDefault(ch, 0) + 1);
                * the body below thiscomment can be replaced by this
                * */
                if(map.containsKey(currentChar)){
                    int value=map.get(currentChar);
                    value=value+1;
                  map.put(currentChar,value);
                }else{
                    map.put(currentChar,1);
                }
            }
        }
        for(Character charr : map.keySet()){
            System.out.println(charr+":"+map.get(charr));
        }
    }
    
}
