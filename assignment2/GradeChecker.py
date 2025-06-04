"""
sol 1. Grade Checker - app.
Take a score as input and print the grade based on basic if else statement to carry out marks and all
"""
class StudentGarde:
      def __init__(self):
          self.marks=float(input("\nEnter the marks : "))
      
      def computeGrade(self) :
          if self.marks >= 90:
             return "A"
          
          elif self.marks >= 80 and self.marks <= 89:
             return "B"
      
          elif self.marks >= 70 and self.marks <= 79:
             return "C"
      
          elif self.marks >= 60 and self.marks <= 69:
              return "D"
          
          else :
              return "F"

x=StudentGarde()
print("\nGrade for the student : ",x.computeGrade())