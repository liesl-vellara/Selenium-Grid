# Selenium-Grid
1. We write a large code in our local machine (slave) and connect with node machine (different machines with different configuration) through a hub
2. for synchronization, we can run different tests simultaneously on different machine like browser stack (git is a source code management and does not use tests)

![image](https://user-images.githubusercontent.com/81107111/173003367-ee06767f-326e-4c31-adb5-227b82158bde.png)

1. working on virtual machines
2. Slave is the local machine where we write the code
3. Hubs is a server
4. We have to create a node
5. node can be a different machine

# How to create a hub
1. `java -jar selenium-server-standalone-3.141.59 -role hub`
2. the above line is given in the command prompt in downloads
3. this creates a hub, in the local machine
4. A hub will always use a code called 5555
5. A node will be using a code called 4444
6. hub connects the port 
7. hub is a server that registers the node

# how to create a node
1. nodes are the different configurations
2. We can run configuration in the US while sitting in India
3. We can create a node and a hub in bangalore as long as we are in the same network
4. We can have atleast five to six nodes
5. `ipconfig` will give the IP of my local machine
6. We can connect with a website or a different IP address with `ping`
7. `ping www.google.come`
8. node has the capability of a browser and execute the code
9. node is the exact machine that runs the code
10. `java -Dwebdriver.chrome.driver = path of the chrome driver file -jar selenium-server-standalone-3.141.59 -role webdriver -hub IP address from the hub`
11. webdriver means node
12. The node will be registered in the hub
13. the hub will show that a node is registered to it
14. Clients and nodes are the same thing

# Running on a node machine (IDE)
1. Selenium server stand alone should be there in the node machine too
2. Which ever browser we should use, it should be there in the node and local machine
3. the version has to be the same for chrome
4. eclipse is not required for the node
5. we will have a server which we will connect with and our private network
6. that server connection will be there for everyone
