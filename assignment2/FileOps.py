"""
sol 3. Write to a File : Using File functions Write a program to create a text file and write some content to it.
sol 4. Read from a File : Using File functions Write a program to open in read mode and file to read and print to display.
"""

class FileOps:
      
      def __init__(self):
          self.fileName=input("\nEnter the txt File Name : ")

      def createAndWriteDataToFile(self):
          self.__fileObj=open(self.fileName+".txt","w+")
          print(f"\n{self.fileName}.txt file has been created.")
          self.writeDataValue=input("\nEnter the content to write into file : ")
          self.__fileObj.write(self.writeDataValue)
          print("\nWritting completed..")

      def readDataFromFile(self):
          self.__fileObj=open(self.fileName+".txt","r+")
          print(f"\nContent Of the {self.fileName}.txt file : ")
          print("*********************************************")
          print(self.__fileObj.read())          
          self.__fileObj.close()
          print("\nFile has been close..")

def fileOptsToDoItems(inpArgs):
    match inpArgs:
        case 'R':
             x.readDataFromFile()

        case 'W':
             x.createAndWriteDataToFile()

        case default:
            print("\nWrong!!.. choice.. please try again.")

print("\nChoose Options from Menu : ");
print("\n****************************");
print("Enter 'R' - read File.")
print("Enter 'W' - write File.")
inpDat=input("\nEnter your choice : ")
inpDat=inpDat[0].capitalize()
x=FileOps()
fileOptsToDoItems(inpDat)