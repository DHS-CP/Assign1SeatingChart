import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The KilgoreTrout class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 */
public class DonnaPrince extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the KilgoreTrout class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public DonnaPrince(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
        numStudents++;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public DonnaPrince() {
        firstName = "Donna";
        lastName = "Prince";
        myRow = 3;
        mySeat = 5;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                myHobby("I like to garden!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
            }
            else {
                answerQuestion();
                sitDown();
            }
                    
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */
    public void answerQuestion(){
        String q=Greenfoot.ask("What would you like to know?");
        boolean check = true;
        
        while(check)
        {
            if (q.contains("summer")||q.contains("homework")){
                q=Greenfoot.ask("2D Arrays,Linear Search,Selection Sort,Static vs Instance Variables and Binary Search...May I sit down? ");
                if (q.contains("yes")||q.contains("YES")||q.contains("Yes")||q.contains("OK")||q.contains("ok")||q.contains("Ok")){
                   check = false;
                   sitDown();
                   break;
                   }
                }
                if (q.contains("2D arrays")){
                 q=Greenfoot.ask("In a 2D array elements are arranged in rows and columns. Similar to an array a 2D array is collection of data of the same type, that can be given a name, it is accessed using indexes; its row and column index. Ex: x = a[row][col];.May I sit down??");
                 if (q.contains("yes")||q.contains("YES")||q.contains("Yes")||q.contains("OK")||q.contains("ok")||q.contains("Ok")){
                    check = false;
                    sitDown();
                    break;
                    }
                }
                if (q.contains("linear search")){
                   q=Greenfoot.ask("Linear Search is used to search for a key element an array, and returns its index position if it is found. If the element is not found, it will return -1.May I sit down??");
                   if (q.contains("yes")||q.contains("YES")||q.contains("Yes")||q.contains("OK")||q.contains("ok")||q.contains("Ok")){
                      check = false;
                      sitDown();
                      break;
                   }
                }
                if (q.contains("selection sort")){
                   q=Greenfoot.ask("Selection Sort, sorts an array by repeatedly finding the minimum element from the unsorted part and putting it in the beginning.May I sit down?");
                   if (q.contains("yes")||q.contains("YES")||q.contains("Yes")||q.contains("OK")||q.contains("ok")||q.contains("Ok")){
                      check = false;
                      sitDown();
                      break;
                   }
                }
                if (q.contains("static vs instance variables")){
                   q=Greenfoot.ask("Instance variables only scope within the curly braces defining a class.On the other hand static variables scope is the entire program. May I sit down?");
                   if (q.contains("yes")||q.contains("YES")||q.contains("Yes")||q.contains("OK")||q.contains("ok")||q.contains("Ok")){
                      check = false;
                      sitDown();
                      break;
                   }
                }
                if (q.contains("binary search")){
                   q=Greenfoot.ask("Binary search is done by searching a sorted array ,by searching the sort interval in half. Binary search is faster than linear search.May I sit down?");
                   if (q.contains("yes")||q.contains("YES")||q.contains("Yes")||q.contains("OK")||q.contains("ok")||q.contains("Ok")){
                      check = false;
                      sitDown();
                      break;
                   }
                }
                
                
                if (q.contains("How many students are in the class?")){
                   //int number= getWorld().numberOfObjects();
                   q=Greenfoot.ask("There are "+numStudents+" students in the class ...May I sit down?");
                   if (q.contains("yes")||q.contains("YES")||q.contains("Yes")){
                      check = false;
                      sitDown();
                      break;
                   }
                }
                
            else{
                q=Greenfoot.ask("Sorry, I did not understand the question......May I sit down?");
                if (q.contains("yes")||q.contains("YES")||q.contains("Yes")){
                    check = false;
                    sitDown();
                    break;
                }
                else{
                   q=Greenfoot.ask("What would you like to know? ");
                }
                }
            }
            
            Greenfoot.delay(10);
        }
 
          
    /**
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You can write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
         //setLocation(4,3);
         Greenfoot.delay(10);
         GreenfootImage image = getImage();
         image.scale(300,300);
         
         int [][]img_loc = new int [5][7]; 
         for(int row=0; row < img_loc.length ;row++){
            for(int col=0; col < img_loc.length ;col++){
                setLocation((int)(row * Math.random()*3), (int)(col * Math.random()*3));
                turn(Greenfoot.getRandomNumber(45));
                Greenfoot.delay(3);
            }
        }
           image.scale(100,125);
           Greenfoot.delay(20);
           setRotation(0);
           returnToSeat();
    }
     public void myHobby(String s) {
         System.out.println(s);
     }

}