#pratima kandel
#I PLEDGE
#GPA calculator
#In this program , you can calculate your GPA for this term and for other terms as well.
print("Welcome to the GPA calculator")
cal_gpa = str(input("Would you like to calculate your GPA for a term? Enter Y/N:"))
if cal_gpa == "y" or cal_gpa == "Y":
    def main():
        #Declare the variables
        count = 0
        hrs  = 0
        course_name = ""
        numberofclasses =0
        totalhours = 0
        totalPoints = 0.0
        gpa = 0.0
        sumtotalqualitypoint = 0 
        credits_1=[]
        grade_1=[]
        course_1name=[]
        totalqualitypoint_1=[]
        toptopic=[]
        #Ask the user for the number of classes taking
        numberofclasses = int(input("How many courses did you take in the term :"))
        
        #use for to loop
        for count in range(count, numberofclasses):
            #This is to keep track of the number of classes
            print("For class ", count+1)
            course_name= input("Enter the course name:")
            
        #Ask the user for number of number of credit hours per class
            hrs = int(input("Enter the number of credits associated with that course: "))
            #Prompt user to enter the letter grade
            grade = input("Enter the grade for the course:  ")

            #make a list for the credits taken , grade and the course
            credits_1.append(hrs)
            grade_1.append(grade)
            course_1name.append(course_name)
             #Use if statement to check the grade and increment points and total hours

            if grade == 'A' or grade == 'a':
                totalqualitypoint = hrs * 4 
                totalPoints = totalPoints + (hrs * 4)
                totalhours = totalhours + hrs
            elif grade == 'A-' or grade == 'a-':
                totalqualitypoint = hrs * 3.7
                totalPoints = totalPoints + (hrs * 3.7)
                totalhours += hrs 
            elif grade == 'B+' or grade == 'b+':
                totalqualitypoint = hrs * 3.3
                totalPoints += (hrs * 3.3)
                totalhours += hrs 
            elif grade == 'B' or grade == 'b':
                totalqualitypoint = hrs * 3.0
                totalPoints += (hrs * 3.0)
                totalhours += hrs
            elif grade == 'B-' or grade == 'b-':
                totalqualitypoint = hrs * 2.7
                totalPoints += (hrs * 2.7)
                totalhours += hrs
            elif grade == 'C+' or grade == 'c+':
                toalqualitypoint = hrs * 2.3
                totalPoints += (hrs * 2.3)
                totalhours += hrs 
            elif grade == 'C' or grade == 'c':
                totalqualitypoint = hrs * 2.0 
                totalPoints += (hrs * 2.0)
                totalhours += hrs
            elif grade == 'C-' or grade == 'c-':
                totalqualitypoint = hrs * 1.7
                totalPoints += (hrs * 1.7)
                totalhours += hrs
            elif grade == 'D+' or grade == 'd+':
                totalqualitypoint = hrs * 1.3
                totalPoints += (hrs * 1.3)
                totalhours += hrs 
            elif grade == 'D' or grade == 'd':
                totalqualitypoint = hrs * 1.0 
                totalPoints += (hrs * 1.0)
                totalhours += hrs
            elif grade == 'F' or grade == 'f':
                totalqualitypoint = hrs * 0.0
                totalPoints += (hrs * 0.0)
                totalhours += hrs
                #If not A,B, C, D and so on . You can write validation to check in other lettes
            else:
                totalqualitypoint=  hrs * 0.0 
                totalPoints += (hrs * 0.0)
                totalhours += hrs

                #make a list record the total quality point and sum the numbers in the list 

            totalqualitypoint_1.append(totalqualitypoint)
            sumtotalqualitypoints = sum(totalqualitypoint_1)
            
            
            #Calculate GPA based on the total points and total hours
        gpa = totalPoints / totalhours
        print("This term you have earned:")

        #set the list as the heading for the report

        toptopic= ['Course', 'Credits', 'Grade', 'Qualitypoints']

        #define a function for the lists , In this function the arguments are the various list to be printed out as an semester report


        def list_of_lists(toptopic1, credits_11,grade_11,course_11name,totalqualitypoint_11):
            print('   '.join(toptopic1))
            for credits_2,grade_2,course_name2,totalqualitypoint_2 in zip(credits_11,grade_11,course_11name,totalqualitypoint_11):
                
                print(course_name2,'      ', credits_2 , '      ', grade_2 , '      ' , round(totalqualitypoint_2, 1))

        list_of_lists(toptopic,credits_1,grade_1,course_1name,totalqualitypoint_1)

        print("Total earned credits this term : " , totalhours)
        print ("You earned " , round(sumtotalqualitypoints , 1 ), "total quality points and a GPA of" , round(gpa , 1) ,"for the term ")

        print()



        #ask the user if they want to calculate gpa for another term
        anothercal_gpa = str(input("Would you like to calculate your GPA for another term.Enter Y/N:"))
        print()
        if anothercal_gpa == "Y" or anothercal_gpa == "y":
            main()

        else:
            print("Your overall earned credits :", totalhours)
            print("Your overall GPA :" ,round(gpa, 1))
            print("Thank you for using my software")

main()


            










