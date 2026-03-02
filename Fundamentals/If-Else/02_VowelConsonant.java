// Write a Program to Check Whether a Character is Vowel or Consonant.

// && → AND → both conditions must be true
// || → OR → at least one condition must be true

class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is a consonant.");
        }
    }
