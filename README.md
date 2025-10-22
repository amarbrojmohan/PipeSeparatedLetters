# PipeSeparatedLetters

A simple Java program that reads a text file line by line and writes a new file  
where every character in each line is separated by a pipe (`|`) symbol.

---

## Description

This program demonstrates basic **file input/output (I/O)** operations in Java.  
It uses `BufferedReader` and `BufferedWriter` to process text files efficiently.

For every line in the input file:
- Each character is separated by a `|` symbol.  
- The transformed line is then written to an output file.  

Example:
input.txt 
Hello World

output.txt
H|e|l|l|o| |W|o|r|l|d


---

## Requirements
- Java 8 or later  
- A text file named `input.txt` (or modify the path in the code)

---

## How to Use

1. **Clone or download** this repository:
   ```bash
   git clone https://github.com/your-username/PipeSeparatedLetters.git

2. Navigate to the project directory
   cd PipeSeparatedLetters

3. Edit file paths in PipeSeparatedLetters.java
String inputFile = "H:\\xxx xxxxx\\input.txt";
String outputFile = "H:\\xxx xxxxx\\output.txt";

4. Compile and run:
   javac PipeSeparatedLetters.java
   java PipeSeparatedLetters
5. Check the output file — you’ll find each character separated by |.

# Example
### Input file (input.txt):
Hello World

### Input file (output.txt):
H|e|l|l|o| |W|o|r|l|d
