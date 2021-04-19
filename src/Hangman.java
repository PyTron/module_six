public class Hangman {
    private String secWord;
    private String disWord;
    private int numGuess;
    private int numBadGuess;
public void setSecretWord(String a){
    secWord = a.toLowerCase();
    disWord = "";
    numGuess = 0;
    numBadGuess = 0;
    for(int i=0;i<secWord.length();i++){
        disWord=disWord + '?';
    }
}
public void MakeGuess(char c){
    Boolean badGuess=true;
    char[] mutateString = new char[secWord.length()];
    for(int i=0; i<secWord.length();i++){
        if(secWord.charAt(i)==c){
            mutateString[i] = c;
            badGuess=false;
        }
        else if(disWord.charAt(i)!='?')
            mutateString[i] = secWord.charAt(i);
        else
            mutateString[i] = '?';
    }
    disWord = "";
    for(int i=0; i<mutateString.length; i++){
        disWord = disWord + mutateString[i];
    }
    numGuess++;
    if(badGuess)
        numBadGuess++;
}
public String getDisguisedWord(){
    return disWord;
}
public String getSecretWord(){
    return secWord;
}
public int getGuessCount(){
    return numGuess;
}
public int getBadGuessCount(){
    return numBadGuess;
}
public Boolean stillPlaying(){
    for(int i=0;i<secWord.length();i++){
        if(disWord.charAt(i)=='?')
            return true;
    }
    return false;
}
}
