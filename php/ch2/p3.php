<?php
// Function 1: array_change_key_case
// This function changes all keys in an array to either lowercase or uppercase.

echo "1. array_change_key_case:\n";
$array1 = [
    "JANUARY" => 31,
    "FEBRUARY" => 28,
    "MARCH" => 31,
];
$lowercaseKeys = array_change_key_case($array1, CASE_LOWER); // Change keys to lowercase
$uppercaseKeys = array_change_key_case($array1, CASE_UPPER); // Change keys to uppercase

echo "Lowercase Keys:\n";
print_r($lowercaseKeys);
echo "Uppercase Keys:\n";
print_r($uppercaseKeys);

// Function 2: array_chunk
// This function splits an array into chunks of smaller arrays, each with a specified size.

echo "\n2. array_chunk:\n";
$months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
$chunkedArray = array_chunk($months, 4); // Split the array into chunks of 4 months

echo "Chunked Array (4 months each):\n";
print_r($chunkedArray);

// Function 3: array_count_values
// This function counts all the values of an array and returns an associative array with values as keys and their count as values.

echo "\n3. array_count_values:\n";
$array2 = ["apple", "banana", "apple", "orange", "banana", "apple"];
$countedValues = array_count_values($array2); // Count occurrences of each value

echo "Counted Values:\n";
print_r($countedValues);

// Function 4: array_combine
// This function creates an associative array by using one array as keys and another as values.

echo "\n4. array_combine:\n";
$keys = ["name", "age", "city"];
$values = ["John", 25, "New York"];
$combinedArray = array_combine($keys, $values); // Combine $keys and $values into an associative array

echo "Combined Array:\n";
print_r($combinedArray);

// Function 5: array_pop
// This function removes and returns the last element of an array.

echo "\n5. array_pop:\n";
$fruits = ["apple", "banana", "orange", "mango"];
$poppedElement = array_pop($fruits); // Removes the last element ("mango")

echo "Popped Element: $poppedElement\n";
echo "Array after pop:\n";
print_r($fruits);

// Function 6: array_push
// This function adds one or more elements to the end of an array.

echo "\n6. array_push:\n";
array_push($fruits, "grape", "pineapple"); // Add elements to the end of the array

echo "Array after push:\n";
print_r($fruits);

// Function 7: array_unshift
// This function adds one or more elements to the beginning of an array.

echo "\n7. array_unshift:\n";
array_unshift($fruits, "strawberry", "blueberry"); // Add elements to the beginning of the array

echo "Array after unshift:\n";
print_r($fruits);

// Function 8: array_shift
// This function removes and returns the first element of an array.

echo "\n8. array_shift:\n";
$shiftedElement = array_shift($fruits); // Removes the first element ("strawberry")

echo "Shifted Element: $shiftedElement\n";
echo "Array after shift:\n";
print_r($fruits);
?>
