## Interaction Based Testing / Mocking Frameworks with Mockito

### What  
A test that, tests the interaction between the ComponentUnderTest (CUT) and its Collaborators.  
CUT => is just a class, we set a expected behavior on this CUT and verify interaction pattern between CUT and its Collaborators.  
Collaborators of CUT => are immediate objects with which the CUT exchange messages.  

### When to use Interaction Based Testing / Mocking Frameworks
1) TDD => Test Driven Development is a type of design style  
It's way of designing the behavior of the Collaborators of CUT, which will help us to create the abstraction layer of CUT. When there is no Collaborators exist, we can mock the and set the expected behavior and define the sequence of messages.  
2) Mock Frameworks => Used to isolate the CUT from its Collaborators (like mocking the database or network socket connection Collaborators from the CUT). So that we can focus on testing the CUT.  

### Properties of Interaction Based Testing  
It should be simple and focused.(to test only on that method)  
Readable and Maintainable as the code base grows test cases are the only part to verify the existing codes. Tests shouldn't have flow / control statements.  

### Don't of Interaction Based Testing
1) Don't mock the Value objects as typically it don't have behaviors. If we have a case of mocking the Value objects we should consider refactor the code.  
2) Don't mock the Types you don't own. (in the event of modification of the external API's then the test case will pass as we assumed that it will behave like this way, but actual production code might have a chance to fail)  
3) Don't mock everything (because mocks are not real things, they are called as test doubles)  

### Test Doubles
#### Manual =>	Things implement by ourself, those are dummies, fake and stubs. None of these types are subjects of the Mocking Frameworks.  
1) Dummy	=> 	Empty object (like implementing an interface by ourselves without calling actual implementation, so that the test code can compile)  
2) Fake		=>  Actual/Real object but with simplified implementation. (like using in-memory database for testing, it's still real DB and will provide similar functionality like actual DB)  
3) STUB		=> 	Its an object we implement ourselves and has a hard coded behavior, just to confirm to our tests.  

#### Automatic => Mocking Frameworks typically deal with Mocks and Spies.  
1) Mocks	=>	It's fundamental core Test Doubles concept, any mocking framework can supports. It's essentially an object that allow us to sets/specify an expected behavior and allows us to verify that behavior is actually met. (Set expected behaviors and verify expectations)  
2) Spy		=> 	It's a proxy to real objects where some of the methods are STUB and some of the methods are real.  
	
### Why Mockito	=> (Alternatives are EasyMock, TestNG and JMockito)  
Very little boilerplate and easy to set and verify behaviors  
Stable Mature Framework  
Large Community  
Simple & Elegant  
Easy to setup  










