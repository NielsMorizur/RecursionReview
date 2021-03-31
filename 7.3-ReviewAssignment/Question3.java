class Question3 {
    public static void main(String[] args) {
        System.out.print(reverse("computer"));
    }
    
    public static String reverse(String word){
        if (word.length() == 1) return word;
        return word.substring(word.length()-1) + reverse(word.substring(0,word.length()-1));
    }
}
