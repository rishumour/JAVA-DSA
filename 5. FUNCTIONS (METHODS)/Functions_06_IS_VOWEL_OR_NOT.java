public class Functions_06_IS_VOWEL_OR_NOT {
    public static boolean isVowel(char ch){
        boolean vowel = false;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            vowel = true;
        }else{
            vowel = false;
        }
        return vowel;
    }    
    public static void main(String[] args) {
        System.out.println("char is " + isVowel('a'));
    }
}
