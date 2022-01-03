Design in-memory file system

two aspects:

Files and Folders

characteristics of **Folders**:

Name
time folder created
time folder updated
Parent folder
size of folder
file and folder int it
A folder can be renamed
folder can be deleted

characteristics of **Files**:
Name
time when file created
time when file created
parent folder
size of file
contetnt of file
file can be deleted
full path of file

Common in both
size
name
created at
last time update
Delete
rename


Now Implement Linux FIle System


Implement the FileSystem class:

FileSystem() Initializes the object of the system.

Here are few Problems
1. List<String> ls(String path):
   If path is a file path, returns a list that only contains this file's name.
   If path is a directory path, returns the list of file and directory names in this directory. The answer should in lexicographic order.

2. void addContentToFile(String filePath, String content)
   If filePath does not exist, creates that file containing given content.
   If filePath already exists, appends the given content to original content.

3. void mkdir(String path) Makes a new directory according to the given path. The given directory path does not exist. If the middle directories in the path do not exist, you should create them as well.

4. String readContentFromFile(String filePath) Returns the content in the file at filePath.

