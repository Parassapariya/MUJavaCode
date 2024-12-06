<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Calculator</title>
</head>
<body>
    <h2>Simple Calculator</h2>

    <!-- HTML form to take input from the user -->
    <form method="post">
        <label>First Number:</label>
        <input type="number" name="num1" required><br><br>

        <label>Second Number:</label>
        <input type="number" name="num2" required><br><br>

        <label>Operation:</label>
        <select name="operation" required>
            <option value="add">Addition (+)</option>
            <option value="subtract">Subtraction (-)</option>
            <option value="multiply">Multiplication (*)</option>
            <option value="divide">Division (/)</option>
        </select><br><br>

        <input type="submit" name="submit" value="Calculate">
    </form>

    <?php
    // User-defined function for the calculator
    function calculate($num1, $num2, $operation) {
        switch ($operation) {
            case 'add':
                return $num1 + $num2;
            case 'subtract':
                return $num1 - $num2;
            case 'multiply':
                return $num1 * $num2;
            case 'divide':
                if ($num2 != 0) {
                    return $num1 / $num2;
                } else {
                    return "Division by zero is not allowed.";
                }
            default:
                return "Invalid operation selected.";
        }
    }

    // Check if the form is submitted
    if (isset($_POST['submit'])) {
        // Get user input
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        $operation = $_POST['operation'];

        // Call the calculator function
        $result = calculate($num1, $num2, $operation);

        // Display the result
        echo "<h3>Result: $result</h3>";
    }
    ?>
</body>
</html>
