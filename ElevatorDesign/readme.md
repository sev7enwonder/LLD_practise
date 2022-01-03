- Use Cases Generation: Gather all the possible use cases

- Constraints and Analysis: How many users, how much data etc.

- Basic Design: Most basic design. Few users case.

- Bottlenecks: Find the bottlenecks and solve them.

- Scalability: A large number of users. 4 and 5 step will go in loop till we get a satisfactory answer



Read about these Design Patterns

- Observer Design Pattern
- Composite Design Pattern
- State Design Pattern
- Singleton Design Pattern


Requirements

1. The elevator can go up and down in a real-world fashion.
   1. When elevator is going up or down, it will stop at all the floors that the users requested.
   2. if the elevator received a request of going down while it is going up, the elevator will go to the highest floor in the current requests, and then go down.
2. Users can send requests to the elevator from both outside and inside the elevator.


elevator system should server request not by timestamp

elevator is at -> 1

A -> 4 first

B -> 2 then B