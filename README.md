# Characters
Understanding the char type in Java is fairly straightforward. The char is 16-bits wide, and
represents a single Unicode character. The values 0-127 represent the standard printable ASCII 
characters, but it can store any nonprintable Unicode character as well. 

The standard method for initializating follows the format
```
char variableName = '*?*';
```
where the question mark represents any character you want to store. You can only store one character
in a char variable, unlike Strings which are implemented as objects and can have unlimited length.

A less standard method of initializing a char follows the format
```
char variablename = *unicode_value*;
```
where *unicode_value* is the character's encoding in Unicode. Very rarely will you use this format, however.

Chars and Strings are frequently in conjunction with each other, because chars can be directly compared using
boolean operators, such as "==", ">=", and "!=", while Strings cannot be directly compared using these operators.
For this reason, getting the chars at each index in a String and comparing those is a very applicable use of chars.
Chars have many more uses however, which you'll discover as you become more accustomed to Java.

The main takeaway from this repository is that we use chars to store single characters, as opposed to Strings, which
store characters at any arbitrary length.
