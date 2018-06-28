Assuming you are in the directory containing this README:
## To clean:
ant -buildfile src/build.xml clean
-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all
-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=FIRST -Darg1=SECOND -Darg2=THIRD
-----------------------------------------------------------------------
## To create tarball for submission
ant -buildfile src/build.xml tarzip or tar -zcvf 
divya_kharbanda_assign_1.tar.gz 
divya_kharbanda_assign_1
-----------------------------------------------------------------------
"I have done this assignment completely on my own. I have not copied it, nor have I given my solution to nyone else. I understand that if I am involved in plagiarism or cheating I will have to sign an official form that I have cheated and that this form will be stored in my official university record. I also understand that I will receive a grade of 0 for the involved assignment for my first offense and that I will receive a grade of F for the course for any additional offense.

Validation on command Line arguements:
- I have checked the number of arguements
- I have checked validation on name of input and output file.
- I have valdation on input file is able to read and output file is able to create 
- Checked the range of debug level

For inout.txt file:
- I am inserting the new cars
- Changing the signal event to green and checking if only 2 cars are ale to pass if it is greater than 2 in number. and if it is less than 2, then it will let all the cars go.
- Similarly, I am changing signal event from Green to Red for m=valious directions.
[6/28/2018]
-----------------------------------------------------------------------

I took the reference on how to read and write the file, and URl for the same is Mentioned below
https://coderanch.com/t/527038/java/Reading-text-file-FileReader-BufferedReader
