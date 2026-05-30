# Introduction to Conditional Statements

Q: What are conditional statements in Java?
A: Conditional statements are control flow structures that allow a program to make decisions and execute different blocks of code depending on whether a specific condition evaluates to true or false. They form the core logic of dynamic programming.

Q: What type of expression must a Java conditional statement evaluate?
A: Java conditions must strictly evaluate to a boolean value (true or false). Unlike languages like C, C++, or JavaScript, Java does not support "truthy" or "falsy" values—you cannot use integers (like 0 or 1) or object references directly as conditions.

______________________________________________________________________________________________________________________________

# Types of Conditional Structures

Java offers three primary ways to handle conditional logic: if-else structures, the conditional (ternary) operator, and switch statements.

1. The if, else if, and else Ladder

Q: How does the standard if-else ladder function?
=> Java evaluates conditions sequentially from top to bottom. As soon as one condition tests true, its corresponding block runs, and the rest of the ladder is skipped.

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B"); // This block executes
        } else {
            System.out.println("Grade: C");
        }

2. The Ternary Operator (?:)

Q: What is the Ternary Operator and when should it be used?
A: The ternary operator is a shorthand, single-line alternative to a simple if-else statement that returns a value. It takes three operands: a condition, a value if true, and a value if false.

        // Syntax: variable = (condition) ? valueIfTrue : valueIfFalse;

        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";

3. The switch Statement & Modern Switch Expressions

Q: What is a switch statement and what data types does it support?
=> A switch statement tests a single variable against a list of explicit values (called cases). It traditionally supports byte, short, char, int, their respective wrapper classes (Byte, Character, etc.), Enums, and String.

Q: What is "fall-through" in a traditional switch statement?
=> In a traditional switch, if a break statement is omitted at the end of a case block, execution continues into the next case automatically, regardless of whether that case matches.

Q: What are modern Java Switch Expressions?
=> Modern versions of Java introduce an enhanced switch syntax using the arrow (->) operator. It eliminates fall-through entirely, requires no break keywords, and allows the switch to directly return a value.

        // Modern Switch Expression (No breaks required!)
        String dayType = switch (day) {
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Weekday";
        };