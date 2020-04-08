# Coding Standards<a name = "intro"></a>
In Software Development there are certain coding standards that are needed for successful software development. A Coding standard makes sure that all the developers working on the project are following certain specified guidelines. This consistency has an overall positive impact on the quality of the program produced.

## 1. Naming Conventions
You should avoid ambiguous and small names which are hard to understand. These names should be descriptive such that it should tell what the method/function is about. The following are some rules for naming conventions.

* **Class** – A class name should start with a capital letter then it should follow camel-case.  
  _*Wrong names*_ – library, Student_class, Searchhistory  
  _*Correct names*_ – Library, StudentClass, SearchHistory  
* **Variable** – Only change this time is that the variable should start with a small letter.    
  _*Wrong names*_ – Library, Student_class, Searchhistory  
  _*Correct names*_ – library, studentClass, searchHistory   
* **Method** – Rules for naming methods are the same as the variable. A method should do what its name says.  
  _*Wrong names*_ – void getSeachHistory(), int setMyAge()  
  _*Correct names*_ – List getSearchHistory(), void setMyAge(int age)   
* **Constants** – A constant must be upper case. Its words should be separated by underscores.    
  _*Wrong names*_ – minDepositAmount, MINDEPOSITAMOUNT  
  _*Correct names*_ – MIN_DEPOSIT_AMOUNT    
* **Package** – All letters of a package should be lower case. Within a package, multiple packages can be created.     
  _*Correct names*_ – com.project.databasemodel 

## 2. Indentation
Correct indentation is very important to increase the readability of your code. For making the code readable, you should use white spaces properly. Some spacing conventions include the below:

* There should be a space after giving a comma between two function arguments.   
 _*Incorrect spacing*_ – private void incorrectSpacing (String example){}  
 _*Correct spacing*_ – private void correctSpacing(String example2){}
 
* Each nested block should be properly indented and spaced.  
* Proper Indentation should be there at the beginning and at the end of each block in the program.  
* All braces should start from a new line and the code following the end of braces also start from a new line.  

## 2. Error Handling
Errors and exceptions will always be thrown for medium to large scale software and even for the simplest of programs. Good applications contain code that will recover from exceptions when possible. Handling and logging exceptions is very important. Never do a "catch exception and do nothing" If you hid an exception, you will never know if the exception happened or not. Always try give a friendly message to the user but log the error. 

## 3. Comments/Documentation
Documentation comments are intended for anyone who is likely to consume your source code. Comments regarding the statements increase the understandability of the code. It is a good practice to comment while writing code. It is also worth noting that clarification comments, those comments intended for anyone maintaining your code (Including your future self) is a code smell. It tells you that your code is too complex. The syntax for comments differs with each programming language an example in java is below.  

  _*Single Line Comment in Java*_  
  //This is a single line comment  
  
  _*Multi Line Comment in Java*_   
  /*  
    Multi line comment  
    Multi line comment  
  */
  
## 4. Portability
Your program code should not contain hard-coded (literal) values referring to environmental parameters, such as file names, IP addresses and absolute file paths. It is good practise to parameterise such variables and configure them for a hosting environment outside of the application e.g. in a database or application server.  

## Further Reading

Naming Conventions best programming concepts    
<https://www.codeproject.com/Articles/8971/C-Coding-Standards-and-Best-Programming-Practices>

Advice on how to format indentation properly  
<https://www.multidots.com/importance-of-code-quality-and-coding-standard-in-software-development/>

Explaining how to correctly comment your code    
<https://www.nws.noaa.gov/oh/hrl/developers_docs/General_Software_Standards.pdf/>

The importance of Portability  
<https://www.perforce.com/blog/qac/9-coding-standards-best-practices>

Following Language specific conventions  
<https://levelup.gitconnected.com/write-better-code-with-coding-standards-546faf3fd4d1>