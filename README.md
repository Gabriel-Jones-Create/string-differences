# String Differences

Write a complete program in a single class called StringDifferences that does following:
Prompt the user to enter two strings:

```
Enter string one:
Enter string two:
```

Your program should assign each string to a String variable, say inputStr1 and inputStr2. Note that the strings may have different lengths. Also note that the strings may have more than one word. The comparison stops when either one of the strings has no more characters.

It should then output a report the positions (index number) and character values where the two strings differ. It should also keep a count of the number of times there is a difference and report on that. For example, if the strings are "dealer" and "dollars", your code should report this:

```
1 e o
2 a l
4 e a
Number of differences: 3
```

This says that at string location 1 (the second position in the strings) the first string holds an 'e', the second an 'o'; at position 2 the strings hold an 'a' and an 'l'; and at position 3 the strings hold an 'e' and an 'a'.

Notice that "dealer" is shorter than "dollars"; your code should only report differences where both strings hold characters. Thus if the strings are "boy" and "bozo the clown" your code should only print

```
2 y z
Number of differences: 1
```

Remember that string positions are zero-based in Java. Therefore, we are considering the first position of a string to be zero. So, if the inputs were "yowser" and "nothing", the correct output would be:

```
0 y n
2 w t
3 s h
4 e i
5 r n
Number of differences: 5
```

One other consideration: the set of characters in a string includes punctuation and space characters as well as letters and numbers. Your code does not have to worry about what type of character it encounters. All your program needs to do is compare the two characters and report if they are different according to the project requirements described above. Your code must work with strings that contain more than one word.

For example:

```
"go umass" and "amherst!"
0 g a
1 o m
2   h
3 u e
4 m r
5 a s
6 s t
7 s !
Number of differences: 8
```

Note: Umass is where Mr. DeVaughn-Brown and Mx. Collard went to graduate school.

## Tip: Scanner

Use [Scanner](https://www.w3schools.com/java/java_user_input.asp) to read from the keyboard.

If
`scan`

is a Scanner object, then
`String inputStr = scan.nextLine();`

will read an entire line from the keyboard, and copy it to the String inputStr.
