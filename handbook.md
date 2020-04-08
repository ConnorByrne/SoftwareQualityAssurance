# Task Estimation

## What is it?
Task estimation is the process in which software engineers and project managers will evaluate the scope of an upcoming project in order to accurately predict the amount of effort and resources that will be needed to complete the project.

Resources, in this situation, refers to the amount of time the project will take, how many specialists need to be involved, and the money that the project will cost from beginning to completion.

These estimations are usually performed based on each aspect of the project individually to gain an understanding of what is required by each module, and then cumulated to give a holistic view of the project as a whole.

## Why is it important?
Firstly, it is important to gain an understanding of the requirements of a project before committing oneself to it. There are many aspects of projects that will contribute to the amount of time or other resources that may not be recognised at a cursory glance, for example:

1. interaction with other non-technical teams for various needs that may slow down the progress of the project.

2. the need for software engineers to upskill in a certain area or even gain an understanding of an entirely new technology for the system to function correctly.

3. The likelihood of unforeseen problems in development, such as unexpected bugs, or other barricades preventing the project from continuing at a steady pace. This ties closely into the need for engineers

4. The possibility of scope creep, or in other words, the likelihood that stake holders of the project are going to want to include vital functionality to development after the project is underway, that was not included in the original project specification.

Taking all of these factors into consideration, both as a project manager as a team member, are important for coming up with realistic time frames for when the project can feasibly be delivered.

The process of task estimation itself provides a valuable opportunity to examine the project from a high angle, and understand all its variables.

Not only can gaining this understanding contribute to accurate projections for project completion, which can then be communicated to stake holders. But also, examining the projects by a task-by-task basis can help reduce the project time as a whole, and lead to a more streamlined process. One in which all possible obstacles have been accounted for, and even the possibility of unforeseen obstacles has been considered, allowing for a more certain, lower stress, more streamlined, and faster process altogether.

## How to do it

### 1. Clarify exactly what is required

Start by outlining all the tasks that must be completed before the project can be considered completed. Begin in broad strokes such as: "Connect to database", then gradually break up the tasks into a more granular form eg. "Create database”, instantiate table for customers", et cetera. try to break down each task as small and granular as possible. It will assist later on when estimates and predictions must be made about these tasks.

### 2. Make estimations about each of these tasks

list all activities that you have identified in the previous step in order that they need to be completed

attempt to come to an accurate estimation of how many man hours each of these tasks will take. Define key milestones and checkpoints. Double check that all the tools and resources needed to complete these tasks are at hand.

remember to make allowances for the following:

* Administrative requirements
* Emergency’s and unpredictable situations
* Issues with equipment
* Communication with stakeholders
* Meetings
* Training requirements
* holidays and sick leave
* Debugging
* other parallel projects with shared team members.

### 3. Choose who is involved

Examine what skills are required for each of the activities that you have laid out. For each of these skills, create a list of colleagues that possess these skills.

Of skill requirements that no available colleagues possess, begin considering which colleagues’ skill set can be considered closest to these skills, and therefor can be upskilled the easiest. if there are no colleague viable to be educated in this area, consider outsourcing this activity to another department, or even a third-party company if there is no one in our organisation that can handle this task, and it is essential to the success of the project. Discuss this possibility with you project manager and supervisor before taking any action.

Employee skills have been considered; you can compile a list of the individuals whose skills overlap into multiple areas of the project. You can even begin ordering the list from most desirable individuals to least desirables, depending the scope of the project that each would be able to contribute too. You can then work downwards through this list, cross referencing the project timeline against colleagues’ schedules, until you have amassed a team that you are confident will be able to complete the required tasks within the project timeline.

### 4. Estimate costs of each task

This step is primarily for project managers.
The monetary cost of each task can be determined by considering the wages of all employees involved, training materials for any required skills missing from the team, and the cost of hardware and software that will be required to complete the project.

### 5. Review your estimation after launch

Task estimation, like any skill, can be honed and improved over time.

To this end, when your project finally reaches its conclusion it is important to have a retrospective review of your estimation. During your review, try to recognise where your estimation was accurate, and where you missed the mark. Helpful questions to ask yourself include:

* Where were you over-optimistic about how quickly as task could be completed?
* Where did you could you have perhaps picked better staff for a job?
* Where should you have attempted to understand the requirements of a task more completely before attempting to add it to a timeline?
* Where there any unforeseen barricades? Could you have predicted these if you had known what to look for? How will this affect your planning for your next project.
* Was there scope-creep? How did it effect the development of the project? How will you prepare for this in the future? Is there a certain point that you should have refused to add anymore functionality to the current iteration and instead promised to add it in later versions?

# Code Review

In software Engineering, one of the most important task is to assure the quality of the code. Software engineering teams that are based on agile model highly depends on code review to ensure the software quality since the work in agile teams is generally decentralized accross the team members. It is highly possible in software engineering teams that other team members also know the specifics of different part of code other than the one they are working on. As per the article published in Atlassian, every team member of the agile team works on the specific feature of the whole product.  The programmers introduce new features, modify the code of the existing features or remove any problem or errors from the existing code.

## So what happens in Code Review

A software developer works on a particular feature or part of the whole software code and submits the code he/she worked on to be reviewed by other developers working on other parts of the code. The devlopers while reviewing the code look for logical errors in the code, determine whether the requirements are met or not, check the automated test cases for the code and see whether they will be enough to test the authenticity of the code.

## Benefits of Code Review

1. Knowledge Sharing:-
        One of the most important benefit of the code review is the knowledge sharing. Anyone in the team can take any task from the backlog as no one is made specific to particular code. For example, full stack developers can plan to work front end for some sprints while server side for some.

2. Estimation:-
        It is highly important to estimate the completion time for the product. Since the knowledge related to the product is equally shared among the team members, they are able to make better judgments. There is also a high chance that the code reviewers are introduced to code complexity, issues related to that particular part of the code.

3. New engineers:-
        Code Reviews helps the team to welcome new engineers as the experienced engineers already working on the project get a chance to mentor new batch of engineers. It helps in establishing the conversation between the engineers regarding the code. It also benefits the team as new engineers may give a completly new perspective or ideas to the part of the code which may be beneficial.

4. Load Sharing:-
        Every part of the main code which the developer has worked on is reviewed by atleast 2 engineers from the team before it is merged with the main code. The software developer selects other engineers from the team and 2 of them selected can review the code. This way it decentralizes the work and avoids any bottleneck. Any engineer with the knowledge and time can review the code and provide any insights that can benefit the code which may be taken into consideration by the developer of the code.

5. Identifying the errors:
        Code review helps in rectifying the errors or confusions that the software developer may have made while building the code. The problems can be related to the architecture the application, compilation errors, typos, requirements etc.. These problems can be avoided before the code is merged in the main application code. The code review will help in maintaining the authenticity and proper functioning of the applications.

## When to plan code review

Planning the time of code reviews is specific to each team. Some software engineers such as Buchino suggest that code reviews should be done in the initial stages or just after the design review so that all the team members can share the knowledge of the code. This way uniformity at the base level of code can be achieved and will encourage the team members to follow the similar coding practices while writing the code. While some engineers like QLogitek's Lalande suggests that code reviews can be done just when the developers feels confident and their code has successfully passed the automated unit test. 

## How to do Code Review

There are certain factors that need to be considered while reviewing the code so as to make it effective. Some factors are listed as below:-

1. Code Review should be done in fixed time slots and one should not try to review the whole code at once.
2. Several tools can be used to collaboratively review the code with other team members which increase the quality and simultaneously reduces the time taken in code review.
3. Appropriate metrics should be defined before starting the code review. The metrics can be "reducing the defects" not simply "rbug reduction" which doesn't imply much.
4. Criticism should be taken in a positive way given by the code reviewers and developers should try to learn and find this as a new opportunity to gain knowledge and identify any sort of weakness.

5. The process to fix bugs should be well defined and discuss in detail with the developer after the code review is done. All the changes made to the code should be verified before merging the code into the main application code.

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

Effort estimation in agile software development: a systematic literature review

<https://dl.acm.org/doi/abs/10.1145/2639490.2639503>

Recent Advances in Software Estimation Techniques

<https://dl.acm.org/doi/pdf/10.1145/143062.143155>

An Effort Estimation Model for Agile Software Development

<https://www.researchgate.net/profile/Zia_Ziauddin2/publication/268186219_An_Effort_Estimation_Model_for_Agile_Software_Development/links/56c3ce2308aee3dcd4167c78.pd>

Software Project Effort and Cost Estimation Techniques

<https://www.semanticscholar.org/paper/Software-Project-Effort-and-Cost-Estimation-Borade-Khalkar/fe621365d9d8caffeacddeaa910070fb496ab881>

Insights of code review and it's significance

https://dzone.com/articles/what-is-code-review-and-why-do-you-need-it

Code Reviews in Software Development Models

https://www.atlassian.com/agile/software-development/code-reviews

Executing an effective code-review

https://www.cio.com/article/2431557/running-an-effective-code-review.html

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

