# Tries_contacts
Make a Contacts application! The application must perform two types of operations:
1) add name, where  is a string denoting a contact name. This must store  as a new contact in the application.
2) find partial, where  is a string denoting a partial name to search the application for. It must count the number of contacts starting with  and print the count on a new line.
Given  sequential add and find operations, perform each operation in order.

_Input Format_

The first line contains a single integer, , denoting the number of operations to perform. 
Each line  of the  subsequent lines contains an operation in one of the two forms defined above
It is guaranteed that  and  contain lowercase English letters only.
The input doesn't have any duplicate  for the  operation.
 

For each find partial operation, print the number of contact names starting with  on a new line.


_Sample Input_

4
add Bill
add Bi
find Bi
find Bee

_Sample Output_

2
0