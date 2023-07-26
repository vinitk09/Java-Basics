// here is a list of programs we will create in this lesson.
// 1. string comparison using ==
// 2. Number of vowels present in a string.
// 3. Check if a substring exists.

// 01.
// class main {
// public static void main(String[] args) {

// // create string
// String str1 = "Learn Java";
// String str2 = "Learn Java";

// if(str1 == str2) {
// System.out.println("Equal Strings");
// }
// else {
// System.out.println("Non-equal Strings");
// }
// }
// }

// // Output: Equal Strings

// 02.
// class main {
// public static void main(String[] args) {

// String str = "Java is fun";

// boolean isLowerVowel, isUpperVowel;
// int vowelCount = 0;

// for (int i = 0; i < str.length(); ++i) {

// // get index i character
// char ch = str.charAt(i);

// // true if the character is a lowercase vowel
// isLowerVowel = (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u');

// // true if the character is an uppercase vowel
// isUpperVowel = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch ==
// 'U');

// if (isLowerVowel || isUpperVowel) {
// ++vowelCount;
// }
// }
// System.out.println("Vowel Count: " + vowelCount);
// }
// }

// // Output: Vowel Count: 4

// 03.
// class main {
// public static void main(String[] args) {

// // create string
// String text = "This is Java Programming.";
// String subString = "Java";

// // check if subString is present in text
// boolean result = text.contains(subString);

// if (result) {
// System.out.println("Substring is present.");
// }
// else {
// System.out.println("Substring is not present.");
// }
// }
// }

// // Output: Substring is present.