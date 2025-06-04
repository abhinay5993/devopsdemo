"""
sol 2. Student Grades.
Create a dictionary where the keys are student names and the values are their grades 
using dictionary and basic operations. Using if else.
"""

class StudentGardesFilter:
      __studGradeDict={}
      
      def __init__(self):
          self.nameKey=''
          self.gradeValue=''

      def addNewStudentAndGrade(self):
          self.nameKey=input("\nEnter the 'Name'     : ")
          self.gradeValue=input("\nEnter the 'Grade' : ")
          self.__studGradeDict[self.nameKey]=self.gradeValue
          print("\nNew Student Name & Grade added to dictionarty")

      def updateExistingStudentGrade(self):
          self.nameKey=input("\nEnter the 'Name' key to update : ")
          self.gradeValue=self.__studGradeDict[self.nameKey]
          newGradeValue=input("\nEnter the new Grade Value : ")
          if self.__studGradeDict.get(self.nameKey,'Student Not-Exists')=='Student Not-Exists':
             print("\nStudent Not-Exists can't update..")
          else:
              self.__studGradeDict[self.nameKey]=newGradeValue
              print(f"\nUpdated the Grade value to {newGradeValue} from {self.gradeValue} w.r.t to 'Name' Key: {self.nameKey}")
      
      def showAllStudentsGrade(self):
          print("\nList of all Existing grades : ")
          print("*********************************")
          for strKey,strGrades in self.__studGradeDict.items():
              print(f"\nKey : {strKey} <==> Value : {strGrades}")

def dictOpsMenuItems(inpArgs):
    x=StudentGardesFilter()
    match inpArgs:
        case 'A':
             x.addNewStudentAndGrade()

        case 'U':
             x.updateExistingStudentGrade()

        case 'S':
             x.showAllStudentsGrade()

        case default:
            print("\nWrong!!.. choice.. please try again.")

while True:
      print("\n***** Enter 'A'- Add elements , 'U' - update elements & 'S' - show elements")
      inpDat=input("\nPress 'Q' to Exit or Enter your choice : ")
      inpDat=inpDat[0].capitalize()
      if inpDat=='Q':
         break
      else:
         dictOpsMenuItems(inpDat)
