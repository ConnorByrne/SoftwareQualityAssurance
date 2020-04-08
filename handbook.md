# Task Estimation

## What is it?
Task esimation is the process in which software engineers and project managers will evaluate the scope of an upcoming project in order to accurately predict the amount of effort and resources that will be needed to complete the project.

Resources, in this situation, refers to the amount of time the project will take, how many specialist need to be involved, and the money that the project will cost from begining to completion.

These estimations are usualy performed based on each aspect of the project indivdualy to gain an understanding of what is required by each module, and then cumulated to give a holistic view of the project as a whole.

## Why is it important?
Firstly, it is important to gain an understanding of the requirments of a project before commiting oneself to it. There are many aspects of projects that will contribute to the amount of time or other resources that may not be recodnised at a cursory glance, for example:

1. interaction with other non technical teams for various needs that may slow down the progress of the project.

2. the need for software engineers to upskill in a certain area or even gain an understanding of an entirely new technology for the system to function correctly.

3. The likley hood of unforseen problems in development, such as unexpected bugs, or other barricades preventing the project from continuing at a steady pace. This ties closley into the nedd for engineers

4. The possibility of scope creep, or in other words, the likleyhood that stake holders of the project are going to want to include vital functionailty to development after the project is underway, that was not included in the orginal project specification.

Taking all of these factors into consideration, both as a project manager as a team member, are important for coming up with realistic time frames for when the project can feasibly be delivered.

The process of task estimation itself provides a valuable opportunity to examine the project from a high angle, and understand all its variables.

Not only can gaining this undertanding contribute to accurate projections for project completion, which can then be communicated to stake holders. But also, examining the projects by a task-by-task basis can help reduce the project time as a whole, and lead to a more streamlined process. One in which all possible obsticals have been accounted for, and even the possibilty of unforseen obsticals has been considered, allowing for a more certain, lower stress, more streamlined, and faster process altogether.

## How to do it

### 1. Clarify exactly what is required.

Start by oulining all the tasks that must be completed before the project can be considered completed. Begin in broad strokes such as: "Connect to database", then gradualy break up the tasks into a more granular form eg. "Create database","Estantiate table for customers", et cetera. try to break down each task as small and granular as possible. It will assit later on when estimates and predictions muts be made about these tasks.

### 2. Make estimatations about each of these tasks.

list all activities that you have identified in the previous step in order that they need to be completed

attempt to come to an accurate estimation of how many man hours each of these tasks will take. Define key milestones and checkpoints. Double check that all the tools and resources needed to complete these tasks are at hand.

remember to make allowances for the following:

* Administrative requiremnets
* Emergencys and unpredictable situations
* Issues with equipment
* Communication with stakeholders
* Meetings
* Training requirments
* holidays and sick leave
* Debugging
* other parrallel projects with shared teammembers.

### 3. Choose who is involved

Examine what skills are requiered for each of the activities that you have layed out. For each  of these skills, create a list of colleuges that posses these skills.

Of skill requiements that no available colleauges posses, begin considering which colleuges skill set can be considered closest to these skills, and therefor can be up-skilled the easiest. if there are no colleauge viable to be educated in this area, consider ousourcing this activity to another deparment, or even a third party company if there is no one in our organisation that can handle this task, and it is essential to the success of the project. Discuss this possibility with you project manager and suporvisor before taking any action.

Employee ckills have been considered, you can compile a list of the indivduals whos skills overlapp into multiple areas of the project. You can even begin ordering the list from most desirable indivduals to least desireables, depending the scope of the project that each would be able to contribute too. You can then work downwards through this list, cross referencing the project timeline against colleauges scheduals, until you have amassed a team that you are confident will be able to complete the required tasks within the project timeline.

### 4. Estimate costs of each task

This step is primarily for project managers.
Te monitary cost of each task can be determined by considering the wages of all employees involved, training materials for any required skills missing from the team, and the cost of hardware and software that will be required to complete the project.

### 5. Review your estimation after launch.

Task estimation, like any skill, can be honed and improved over time. 

To this end, when your project finaly reaches it conclusion it is important to have a retrospective review of your estimation. During your review, try to recognise where your estimation was accurate, and where you missed the mark. Helpful questions to ask yourself include:

* Where were you over-optimistic about how quickly as task could be completed?
* Where did you could you have perhapse picked better staff for a job?
* Where should you have attempted to understand the requirments of a task more completely before attempting to add it to a timeline?
* Where there any unforseen barracades? Could you have predicted these if you had known what to look for? How will this effect your planning for your next project.
* Was there scope-creep? How did it effect the development of the project? How will you prepare for this in the futre? Is there a certain point that you should have refused to add anymore functionality to the current itteration and instead promised to add it in later versions?

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