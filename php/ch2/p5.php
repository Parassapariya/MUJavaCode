<?php
// Initial variable with a string value
$var = "12345";

// Display the original type of the variable
echo "Original value: $var\n";
echo "Original type: " . gettype($var) . "\n";  // Output: string

// 1. Changing the type to integer using settype()
settype($var, "integer");
echo "After settype to integer, value: $var\n";
echo "Type after settype to integer: " . gettype($var) . "\n";  // Output: integer

// 2. Changing the type to float using settype()
settype($var, "float");
echo "After settype to float, value: $var\n";
echo "Type after settype to float: " . gettype($var) . "\n";  // Output: double (float)

// 3. Changing the type to boolean using settype()
settype($var, "boolean");
echo "After settype to boolean, value: $var\n";
echo "Type after settype to boolean: " . gettype($var) . "\n";  // Output: boolean

// 4. Changing the type back to string using settype()
settype($var, "string");
echo "After settype to string, value: $var\n";
echo "Type after settype to string: " . gettype($var) . "\n";  // Output: string
?>
