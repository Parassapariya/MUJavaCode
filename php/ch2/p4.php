<?php
// 1. strlen() - Returns the length of a string
$string = "Hello, World!";
$length = strlen($string);
echo "The length of the string '$string' is: $length\n"; // Output: 13

// Explanation: 
// `strlen()` takes a string as input and returns the total number of characters in that string, including spaces and punctuation.

// 2. strpos() - Finds the position of the first occurrence of a specific word or letter in a string
$word = "World";
$position = strpos($string, $word);
if ($position !== false) {
    echo "The word '$word' was found in '$string' at position: $position\n"; // Output: 7
} else {
    echo "The word '$word' was not found in '$string'\n";
}

// Explanation: 
// `strpos()` finds the first occurrence of a substring (in this case, "World") in a string ("Hello, World!"). 
// It returns the position of the first character of the substring if found, otherwise it returns `false`.

// 3. str_word_count() - Counts the number of words in a string
$wordCount = str_word_count($string);
echo "The string '$string' has $wordCount words\n"; // Output: 2

// Explanation: 
// `str_word_count()` returns the total number of words in a string. Words are defined as sequences of alphabetic characters separated by spaces or punctuation.

// 4. strrev() - Reverses a string
$reversed = strrev($string);
echo "The reverse of the string '$string' is: '$reversed'\n"; // Output: !dlroW ,olleH

// Explanation: 
// `strrev()` reverses the string by flipping the order of its characters. For example, "Hello, World!" becomes "!dlroW ,olleH".

// 5. str_replace() - Replaces all occurrences of a word in a string with another word
$replace = str_replace("World", "Universe", $string);
echo "After replacement: '$replace'\n"; // Output: Hello, Universe!

// Explanation: 
// `str_replace()` replaces all instances of a specific word or substring ("World") in the original string with another word ("Universe").
// The function takes 3 parameters: the word to find, the word to replace it with, and the original string.

// 6. strtolower() - Converts a string to lowercase
$lowercase = strtolower($string);
echo "The string '$string' in lowercase is: '$lowercase'\n"; // Output: hello, world!

// Explanation: 
// `strtolower()` converts all characters of a string to lowercase, making it case-insensitive.

// 7. strtoupper() - Converts a string to uppercase
$uppercase = strtoupper($string);
echo "The string '$string' in uppercase is: '$uppercase'\n"; // Output: HELLO, WORLD!

// Explanation: 
// `strtoupper()` converts all characters of a string to uppercase, making it fully capitalized.
?>
