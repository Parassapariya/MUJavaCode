<?php
// Numeric Array for Days (Monday to Saturday)
$days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

// Associative Array for Months and Total Days
$months = [
    "January" => 31,
    "February" => 28,
    "March" => 31,
    "April" => 30,
    "May" => 31,
    "June" => 30,
    "July" => 31,
    "August" => 31,
    "September" => 30,
    "October" => 31,
    "November" => 30,
    "December" => 31
];

// Multidimensional Array for Laptops (Company, Model, and Price)
$laptops = [
    "Dell" => [
        "model" => "XPS 13",
        "price" => 1200
    ],
    "Apple" => [
        "model" => "MacBook Air",
        "price" => 999
    ]
];

// Displaying the Arrays
echo "Numeric Array for Days: \n";
print_r($days);

echo "\nAssociative Array for Months and Total Days: \n";
print_r($months);

echo "\nMultidimensional Array for Laptops (Company, Model, and Price): \n";
print_r($laptops);
?>
