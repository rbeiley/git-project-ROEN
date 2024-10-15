# git-project-ROEN
1. Did you code stage() / how well does it work?
I coded stage. I think it works fine.

2.  Did you code commit() / how well does it work?
I coded commit. I think it works well and follows the steps of the project. I just didn't get the staging the same file twice edge case.

3. Did you do checkout / how well does it work?
I did to checkout. I think it works like it should.

4. What bugs did find / which of em did you fix?
Worked on fixing a bug where if i deleted a directory in order to checkout a past commit, when I deleted the files in the directory, they didn't exists and it threw an error. I fixed this by checking for if a file existed, and if it didn't, didn't try to delete it.

Functionality:
The way I tested things works through multiple files. Git.java sets up the initial files and folders and tests basic functionality. CommitTester.java then sets up the first commit and tests the functionality of commiting.
FinalTester tests the interface of git. It tests staging, committing, and checking out all in a row to make sure everything works.