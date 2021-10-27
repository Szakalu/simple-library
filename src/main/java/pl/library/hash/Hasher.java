package pl.library.hash;

public class Hasher {
    
    //Very Simple Hashing
    public static String hash(char [] password){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < password.length; i++){
            result.append((int) password[i]);
            password[i] = 'a';
        }
        return result.toString();
    }
}
