<?php
// Prompt the user to input a list of numbers or strings separated by commas
echo "Enter elements of the array separated by commas: ";
$input = trim("banana, apple, orange, mango"); // Get input from the user

// Convert the input string into an array
$array = explode(',', $input);

// Trim any whitespace from the elements
$array = array_map('trim', $array);

// Sort the array
sort($array); // Sort in ascending order

// Display the sorted array
echo "Sorted Array: \n";
print_r($array);
?>
