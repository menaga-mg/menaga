class Alphabet {

    public static void main(String[] args) {

        char c = 'A';
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + "   alphabet."
                : c + " not alphabet.";
        
        System.out.println(output);
    }
}
