def number1 = getCustomFieldValue("1st Number"); // get value for first number field
def number2 = getCustomFieldValue("2nd Number"); // get value from second number field
def opType = getCustomFieldValue("Operation Type"); // how to calculate the two numbers

switch(opType.toString()){
    case "Add": return number1  + number2
    case "Minus": return number1 - number2
    case "Divide": return number1 / number2
    case "Multiply": return number1 * number2
}
