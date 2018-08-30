
PROJECT TITLE: AP CSA Assignment 1 (An interactive seating chart using Greenfoot)

PURPOSE OF PROJECT: The purpose of this assignment is to visually work with classes and subclasses, abstract classes, and interfaces, and to familiarize yourself with the basics of the GIT command line.  As a side effect, it will help your instructor learn your names!

VERSION or DATE: 08/13/2018

HOW TO START THIS PROJECT:  To start this project, assuming that you have Greenfoot installed, click on the greenfoot project file within the top level of the assignment directory.  If greenfoot is correctly installed, you will see a green foot icon just to the left of "project".

AUTHORS:                    Mr. Kaehms and CSA students

CONTRIBUTERS:               Kilgore Trout
                            (Add you name here once your code 
                             is added and correct)

USER INSTRUCTIONS:


1) Start git bash

2) Move to a directory where you want to keep your work. For instance, cd c:/ then cd Users/YourName/Documents/Assignments

3) Clone the repository into the directory where git bash is pointing:

    git clone https://github.com/DHS-CP/Assign1SeatingChart.git

NOTE: This should set up all initial conditions for GIT and avoid a lot of confusion.

4) Open the greenfoot project file from within greenfoot and start editing.

5) Once tested and saved in Greenfoot, from the bash shell add any files that you want to put into the repository to the next git commit: (Note: File names are case sensitive!)

PLEASE DO NOT COMMIT YOUR FILES IF THEY DO NOT COMPILE LOCALLY!!!!!
=====================================================================

git add FirstLast.java
git add images/firstlast.jpg
git add sounds/firstlast.wav

6) Check to see what has been staged (from the git command line):

git status

7) Commit your changes from the git command line:

git commit -m “adding my files to the repository”

8) Push your changes to the remote repository:

PUSHING INSTRUCTIONS:

1) Create a new branch for your changes. Replace [name] with your last name

	git checkout -b [name]

2) Add and commit all changes

	git add -A
	git commit -m "[name] commit"

3) Push your changes to your new branch, enter login credentials if prompted

	git push --set-upstream origin [name]

4) Your changes are now published on a new branch. Wait for them to be merged by the build master.
