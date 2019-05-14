import java.util.Scanner;
import java.util.Random;

public class MagicWorld1 {

   public static void main (String [] args) {
      Scanner kb = new Scanner (System.in);
      String name,grade="-1";
      int num, gradescore=0,levelscore=0;
      
      String [] player = {"Player1","Player2","Player3"};//new String [3];
      int [] player0 = {0,0,0,0};
      int [] player1 = {0,0,0,0};
      int [] player2 = {0,0,0,0};

      Intro();
      int playerindex=0;
      while (grade.equals("-1")) {
         if (playerindex>2)
            playerindex=0;         
          
   	   System.out.print("\nPlease enter your name: ");
         
   	   player[playerindex]= kb.next();
         

	      System.out.print("\nPlease enter your grade: ");
	      grade = kb.next();
         System.out.println();

	      while (!grade.equals("-1")) {
	      	if (grade.equals("0")){
               System.out.print("See you next time!\n");
               break;//To end the game
            }

            else if (grade.equals("1")) {
               gradescore = 0;	         	
               levelscore=AdditionG1();
               gradescore+=levelscore;               
               levelscore=SubtractionG1();
               gradescore+=levelscore;
               levelscore=OperatorG1();
               gradescore+=levelscore;
               levelscore=ProblemG1 ();
               gradescore+=levelscore;             
               
               if (playerindex==0) {
                  player0[0] = gradescore;
               }
	         	else if (playerindex==1) {
                  player1 [0] = gradescore;
               }
               else {
                  player2 [0] = gradescore;
               }
	      	   System.out.println("End of the grade");

            }
	      	else if (grade.equals("2")) {
               gradescore = 0;
	         	levelscore=AdditionG2();
               gradescore+=levelscore;
               levelscore=SubtractionG2();
               gradescore+=levelscore;
               levelscore=OperatorG2();
               gradescore+=levelscore;
               levelscore=ProblemG2 ();
               gradescore+=levelscore;
               if (playerindex==0) {
                  player0 [1] = gradescore;
               }
               else if (playerindex==1) {
                  player1 [1] = gradescore;
               }
               else {
                  player2 [1] = gradescore;
               }
	            System.out.println("End of the grade");
            }
	      	else if (grade.equals("3")) {            
               gradescore = 0;
	            levelscore=MultiplicationG3();
               gradescore+=levelscore;
               levelscore=DivisionG3();
               gradescore+=levelscore;
               levelscore=OperatorG3();
               gradescore+=levelscore;
               levelscore=ProblemG3 ();
               gradescore+=levelscore;
	         	if (playerindex==0) {
                  player0 [2] = gradescore;
               }
               else if (playerindex==1) {
                  player1 [2] = gradescore;
               }
               else {
                  player2 [2] = gradescore;
               }
	      	   System.out.println("End of the grade");
            }
		      else if(grade.equals("4")) {
               gradescore = 0;
               levelscore=MultiplicationG4();
               gradescore+=levelscore;
               levelscore=DivisionG4();
               gradescore+=levelscore;
               levelscore=OperatorG4();
               gradescore+=levelscore;
               levelscore=ProblemG4 ();
               gradescore+=levelscore;
               if (playerindex==0) {
                  player0 [3] = gradescore;
               }
               else if (playerindex==1) {
                  player1 [3] = gradescore;
               }
               else {
                  player2 [3] = gradescore;
               }
		         System.out.println("End of the grade");
            }
            else {
               System.out.println("Sorry,please enter a number between -1 to 4");
            }      
	      	System.out.println("\n\nPlease choose to : ");
            System.out.println("1) Enter a grade number to continue a grade\n2) Enter -1 to quit this player\n3) Enter 0 to quit this game ");
	         grade = kb.next();
            System.out.println("\n");
            	         
         }
         System.out.println("name         score");//To print out all players' score
         for(int i=0;i<=2;i++){
            System.out.print(player[i]+"       ");
            if (i==0) {
               for (int j=0;j<4;j++) {
                  System.out.print("G"+(j+1)+": "+"\t");
                  System.out.print(player0[j]+"\t");
               }
               System.out.println();
            }
            if (i==1) {
               for (int j=0;j<4;j++) {
                  System.out.print("G"+(j+1)+": "+"\t");
                  System.out.print(player1[j]+"\t");
               }
               System.out.println();
            }
            if (i==2) {
               for (int j=0;j<4;j++) {
                  System.out.print("G"+(j+1)+": "+"\t");
                  System.out.print(player2[j]+"\t");
               }
               System.out.println();
            }
         }
         if (grade.equals(-1))
            playerindex++;
	   }
   }
   public static void Intro () {
      System.out.println("Welcome to Magic Math World!\n"+
      "\nIn the world of magic math, you are learning magic using mathematicises."+
      "You will be able to become a powerful wizard through learning varieties of mathematical skills. Over here, you can choose to become a wizard with different power."+ 
      "\nGrade 1 - Water Wizard (Addition(0-10), Subtraction(0-10), Operator, Real-world Problem);"+
      "\nGrade 2 - Thunder Wizard (Addition(0-20), Subtraction(0-20), Operator, Real-world Problem;"+
      "\nGrade 3 - Fire Wizard (Addition & Subtraction(0-100), Operator, Multiplication(0-10), Division(0-10), Real-world Problem);"+
      "\nGrade 4 - Ice Wizard (Multiplication(0-100), Division(0-100), Operator, Real-world Problem).\n"+
      "\nSounds good? Let's get started!\n");
   }   
   public static int AdditionG1 () {
      int add1, add2, score=0, count=0, levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 1 - Addition (You have 5 chances to try)\n");
      while (count<5) {
         for (int i=1;i<=10;i++) {
            add1 = randomnum.nextInt(10);
            add2 = randomnum2.nextInt(10);
            System.out.print(i+") "+add1+" + "+add2+" = ");
            String inputsum = ""+ kb.next();
            String add=(add1+add2)+"";
            if (inputsum.equals(add)) {
               score++;
               System.out.println("Good Job!"+"    "+score+"/10");
            }
            else  {
               System.out.println("Sorry, the correct answer is: "+(add1+add2)+"    "+score+"/10");
            }
            System.out.println();
         }
         System.out.println();
         if (score>=6) {
            System.out.println("You've got "+score+"/10, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5){
               System.out.println("Oops, you need to review the session.");
            }
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            
            score = 0;
         }
      }
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
     
      return levelscore;
   }
   
   public static int SubtractionG1 () {
      int op1, op2, score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println();
      System.out.println("Level 2 - Subtraction (You have 5 chances to try)\n");
      while (count<=5) {
         for (int i=1;i<=10;i++) {
            
            op1 = randomnum.nextInt(10);
            op2 = randomnum2.nextInt(10);
            System.out.print(i+") "+Math.max(op1,op2)+" - "+Math.min(op1,op2)+" = ");
            String inputsum = ""+ kb.next();
            String op=(Math.max(op1,op2)-Math.min(op1,op2))+"";

            if (inputsum.equals(op)) {
               score++;
               System.out.println("Great!"+"    "+score+"/10");
            }
            else  {
               System.out.println("Sorry, the correct answer is: "+(Math.max(op1,op2)-Math.min(op1,op2))+"    "+score+"/10");
            }
            System.out.println();

         }
         if (score>=4) {
            System.out.println("You've got "+score+"/10, good job! Level up!");
            count = 6;
         }
         else {
            
            count++;
            if (count == 5)
               System.out.println("Oops, you need to review the session.");
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            System.out.println();
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }
      }
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;           
   }

   
   public static int OperatorG1 () {
      int op1, op2,order, minus1, minus2, count=0, score=0,levelscore=0,t=1;
      String plus="+", inputsign="", minus="-";
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Random randomnum3 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 3 - Operator (You have 5 chances to try)\n");
      while (count<=5) {
         for (int i=0;i<6;i++){
            order=randomnum3.nextInt(2);
            if (order==0){

               op1 = randomnum.nextInt(10);
               op2 = randomnum2.nextInt(10);
               System.out.print(t+") "+op1+" _ "+op2+" = "+(op1+op2)+" ");
               inputsign=kb.next();
               t++;
               if (op2 == 0) {
                  if (inputsign.equals("+")||inputsign.equals("-")) {
                     score++;
                     System.out.println("Awesome!"+"    "+score+"/6");
                  }
               }
               else if (inputsign.equals("+")) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
               }
               else {
                  System.out.println("Sorry, the correct answer is: +"+"    "+score+"/6");
               }
               System.out.println();
            } 
         
            else {
               op1 = randomnum.nextInt(10);
               op2 = randomnum2.nextInt(10);
               System.out.print(t+") "+Math.max(op1,op2)+" _ "+Math.min(op1,op2)+" = "+(Math.max(op1,op2)-Math.min(op1,op2))+" ");
               inputsign=kb.next();
               t++;
               if (op2 == 0) {
                  if (inputsign.equals("+")||inputsign.equals("-")) {
                     score++;
                     System.out.println("Awesome!"+"    "+score+"/6");
                  }
               }
               else if (inputsign.equals("-")) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
               }
               else {
                  System.out.println("Sorry, the correct answer is: -"+"    "+score+"/6");
               }
               System.out.println();
            }
       
         }
         if (score>=4) {
            System.out.println("You've got "+score+"/6, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5){
               System.out.println("Oops, you need to review the session.");
            }
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            System.out.println();
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }
   
   public static int ProblemG1 () {
      int op1, op2, score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 4 - Problem (You have 5 chances to try)\n");
      while (count<=5) {
      
         op1 = randomnum.nextInt(10);
         op2 = randomnum2.nextInt(10);
         System.out.println("1) Your mom bought "+op1+" candies from the market, your dad bought "+op2+" candies from the superstore, so how many candies in your family right now?" );
         String inputsum = ""+ kb.next();
         String op=""+(op1+op2);
         if (inputsum.equals(op)) {
            score++;
            System.out.println("Good Job!"+"    "+score+"/2");
         }
         else  {
            System.out.println("Sorry, the correct answer is: "+(op1+op2)+"    "+score+"/2");
         }
         op1 = randomnum.nextInt(10);
         op2 = randomnum2.nextInt(10);
         
         System.out.println();
         System.out.println("2) Your mom made "+Math.max(op1,op2)+" cookies, your dad ate "+Math.min(op1,op2)+" cookies after he coming back, so how many cookies in your family right now?" );
         inputsum = ""+ kb.next();
         op=""+(Math.max(op1,op2)-Math.min(op1,op2));
         if (inputsum.equals(op)){
            score++;
            System.out.println("Good Job!"+"    "+score+"/2");
         }
         else {  
            System.out.println("Sorry, the correct answer is: "+(Math.max(op1,op2)-Math.min(op1,op2))+"    "+score+"/2");
         }
         if (score>=2) {
            System.out.println("You've got "+score+"/2, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5){
               System.out.println("Oops, you need to review the session.");
            }
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            System.out.println();
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }
      }
      System.out.println();
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }

   
   public static int AdditionG2 () {
      int op1, op2, score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 1 - Addition (You have 5 chances to try)\n");
      while (count<=5) {
         for (int i=1;i<=10;i++) {
            
            op1 = randomnum.nextInt(20);
            op2 = randomnum2.nextInt(20);
            System.out.print(i+") "+op1+" + "+op2+" = ");
            String inputsum = ""+ kb.next();
            String op=(op1+op2)+"";
            if (inputsum.equals(op)) {
               score++;
               System.out.println("Brilliant!"+"    "+score+"/10");
            }
            else  {
               System.out.println("Sorry, the correct answer is: "+(op1+op2)+"    "+score+"/10");
            }
            System.out.println();
         }
         if (score>=6) {
            System.out.println("You've got "+score+"/10, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5)
               System.out.println("Oops, you need to review the session.");
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }
   
   public static int SubtractionG2 () {
      int op1, op2, score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 2 - Subtraction (You have 5 chances to try)\n");
      while (count<=5) {
         for (int i=1;i<=10;i++) {
            
            op1 = randomnum.nextInt(20);
            op2 = randomnum2.nextInt(20);
            System.out.print(i+") "+Math.max(op1,op2)+" - "+Math.min(op1,op2)+" = ");
            String inputsum = ""+ kb.next();
            String op=(Math.max(op1,op2)-Math.min(op1,op2))+"";
            if (inputsum.equals(op)) {
               score++;
               System.out.println("Brilliant!"+"    "+score+"/10");
            }
            else  {
               System.out.println("Sorry, the correct answer is: "+(Math.max(op1,op2)-Math.min(op1,op2))+"    "+score+"/10");
            }
            System.out.println();

         }
         if (score>=6) {
            System.out.println("You've got "+score+"/10, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5)
               System.out.println("Oops, you need to review the session.");
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }

   
   public static int OperatorG2 () {
      int op1, op2,order, minus1, minus2, count=0, score=0,levelscore=0,t=1;
      String plus="+", inputsign="", minus="-";
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Random randomnum3 = new Random();

      Scanner kb = new Scanner(System.in);
      System.out.println("Level 3 - Operator (You have 5 chances to try)\n");
      while (count<=5) {
         order = randomnum3.nextInt(2);
         for (int i=0;i<=6;i++) {
            if (order==0){

               op1 = randomnum.nextInt(20);
               op2 = randomnum2.nextInt(20);
               System.out.print(t+") "+op1+" _ "+op2+" = "+(op1+op2)+" ");
               inputsign=kb.next();
               t++;
               if (inputsign.equals("+")) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
               }
               else {
                  System.out.println("Sorry, the correct answer is: +"+"    "+score+"/6");
               }
               System.out.println();
            }
            else {
               op1 = randomnum.nextInt(10);
               op2 = randomnum2.nextInt(10);
               System.out.print(t+") "+Math.max(op1,op2)+" _ "+Math.min(op1,op2)+" = "+(Math.max(op1,op2)-Math.min(op1,op2))+" ");
               inputsign=kb.next();
               t++;
               if (inputsign.equals("-")) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
               }
               else {
                  System.out.println("Sorry, the correct answer is: -"+"    "+score+"/6");
               }
               System.out.println();
            }
         }
         if (score>=4) {
            System.out.println("You've got "+score+"/6, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5)
               System.out.println("Oops, you need to review the session.");
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }
   
   public static int ProblemG2 () {
      int op1, op2, op3,score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Random randomnum3 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 4 - Problem (You have 5 chances to try)\n");
      while (count<=5) {
         op1 = randomnum.nextInt(20);
         op2 = randomnum2.nextInt(20);
         System.out.println("1) Your mom bought "+op1+" apples from the market, your dad bought "+op2+" apples from the superstore, and your brother took a apple from school, so how many apples in your family right now?" );
         String inputsum = ""+ kb.next();
         String op=""+(op1+op2+1);
         if (inputsum.equals(op)) {
            score++;
            System.out.println("Good Job!"+"    "+score+"/2");
         }
         else  {
            System.out.println("Sorry, the correct answer is: "+(op1+op2+1)+"    "+score+"/2");
         }
         op1 = randomnum.nextInt(20);
         op2 = randomnum2.nextInt(20);
         op3 = randomnum3.nextInt(20);
         while (op1<=(op2+op3)) {            
            op1 = randomnum.nextInt(20);
            op2 = randomnum2.nextInt(20);
            op3 = randomnum3.nextInt(20);
         }
         System.out.println();
         System.out.println("2) Your mom bought "+op1+" apples from the market, your dad ate "+op2+" apples after he coming back, and your brother also ate "+op3+" apples, so how many apples in your family right now?" );
         inputsum = ""+ kb.next();
         op=""+(op1-(op2+op3));
         if (inputsum.equals(op)){
            score++;
            System.out.println("Good Job!"+"    "+score+"/2");
         }
         else {  
            System.out.println("Sorry, the correct answer is: "+(op1-(op2+op3))+"    "+score+"/2");
         }
         if (score>=2) {
            System.out.println("You've got "+score+"/2, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5)
               System.out.println("Oops, you need to review the session.");
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }
 
   public static int MultiplicationG3 () {
      int op1, op2,score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 1 - Multiplication (You have 5 chances to try)\n");
      while (count<=5) {
         for (int i=1;i<=10;i++) {
            
            op1 = randomnum.nextInt(10);
            op2 = randomnum2.nextInt(10);
            System.out.print(i+") "+op1+" * "+op2+" = ");
            String inputsum = ""+ kb.next();
            String op=(op1*op2)+"";
            if (inputsum.equals(op)) {
               score++;
               System.out.println("Good Job!"+"    "+score+"/10");
            }
            else  {
               System.out.println("Sorry, the correct answer is: "+(op1*op2)+"    "+score+"/10");
            }
            System.out.println();

         }
         if (score>=6) {
            System.out.println("You've got "+score+"/10, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5)
               System.out.println("Oops, you need to review the session.");
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }

   
   public static int DivisionG3 () {
      int op1, op2,score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 2 - Division (You have 5 chances to try)\n");
      while (count<=5) {
         for (int i=1;i<=10;i++) {
            op1 = randomnum.nextInt(10);
            op2 = randomnum2.nextInt(9)+1;
                           
            while(op1%op2!=0) {
               
               op1 = randomnum.nextInt(10);
               op2 = randomnum2.nextInt(9)+1;
            }
            
            System.out.print(i+") "+op1+" / "+op2+" = ");
            String inputsum = ""+ kb.next();
            String op=(op1/op2)+"";

            
            if (inputsum.equals(op)) {
               score++;
               System.out.println("Good Job!"+"    "+score+"/10");
            }
            else  {
               System.out.println("Sorry, the correct answer is: "+(op1/op2)+"    "+score+"/10");
            }
            System.out.println();

         }
         if (score>=6) {
            System.out.println("You've got "+score+"/10, good job! Level up!");
            count = 6;
         }
         else {
           count++;
            if (count == 5) {
               System.out.println("Oops, you need to review the session.");
            }
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }
   
   public static int OperatorG3 () {
      int op1, op2,order, count=0, score=0,levelscore=0,t=1;
      String multiple="*", inputsign="", divide="/";
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Random randomnum3 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 3 - Operator (You have 5 chances to try)\n");
      
      while (count<=5) {
         order = randomnum3.nextInt(2);
         for (int i=0;i<=6;i++) {
            if (order==0){
               op1 = randomnum.nextInt(10);
               op2 = randomnum2.nextInt(10);
               System.out.print(t+") "+op1+" _ "+op2+" = "+(op1*op2)+" ");
               inputsign=kb.next();
               t++;
               if(op2==1 || op1==0){
                  if(inputsign.equals("*")||inputsign.equals("/")){
                     score++;
                     System.out.println("Awesome!"+"    "+score+"/6");
                  }
                  else {
                     System.out.println("Sorry, the correct answer is: * or /"+"    "+score+"/6");
                  }
               }   
               else if (inputsign.equals("*")) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
               }
               else {
                  System.out.println("Sorry, the correct answer is: *"+"    "+score+"/6");
               }
               System.out.println();
            }
            else {
               op1 = randomnum.nextInt(10);
               op2 = randomnum2.nextInt(9)+1;
               while(op1%op2!=0) {
                  op1 = randomnum.nextInt(10);
                  op2 = randomnum2.nextInt(9)+1;
               }
            
               System.out.print(t+") "+op1+" _ "+op2+" = "+op1/op2+" ");
               inputsign=kb.next();
               t++;
               if(op2==1 || op1==0){
                  if(inputsign.equals("*")||inputsign.equals("/")){
                     score++;
                     System.out.println("Awesome!"+"    "+score+"/6");
                  }
                  else {
                     System.out.println("Sorry, the correct answer is: * or /"+"    "+score+"/6");
                  }
               }
               else if (inputsign.equals("/")) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
               }
               else {
                  System.out.println("Sorry, the correct answer is: /"+"    "+score+"/6");
               }
               System.out.println();
            }
         }
         if (score>=4) {
            System.out.println("You've got "+score+"/6, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5) {
               System.out.println("Oops, you need to review the session.");
            }
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }
   
   public static int ProblemG3 () {
      int op1, op2,score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 4 - Problem (You have 5 chances to try)\n");
      while (count<=5) {         
         op1 = randomnum.nextInt(10);
         op2 = randomnum2.nextInt(10);
         while(op1==0||op2==0) {       //to make problems more reasonable        
            op1 = randomnum.nextInt(10);
            op2 = randomnum2.nextInt(10);
         }
         System.out.println("1) If Tom earns "+op1+" points in the weekly magic exam every week, how many points will he got after "+op2+" weeks?");
         String inputsum = /*""+*/kb.next();
         String op=""+(op1*op2);

         if(inputsum.equals(op)){               
            score++;
            System.out.println("Awesome!"+"    "+score+"/2");
         }
         else {
            System.out.println("Sorry, the correct answer is: "+op1*op2+"    "+score+"/2");
         }         
         op1 = randomnum.nextInt(10);
         op2 = randomnum2.nextInt(9)+1;
         while(op1%op2!=0||op1==0) {      //||op1==0 is to make problems more reasonable         
            op1 = randomnum.nextInt(10);
            op2 = randomnum2.nextInt(9)+1;
         }            
         System.out.println();
         System.out.println("2) If there are "+op1+" potions and you need to divide these potions to "+op2+" wizards, how many will you give to each of them?");
         inputsum = ""+ kb.next();
         op=""+(op1/op2);

         if(inputsum.equals(op)){               
            score++;
            System.out.println("Awesome!"+"    "+score+"/2");
         }
         else {
            System.out.println("Sorry, the correct answer is: "+(op1/op2)+"    "+score+"/2");
         }
         if (score>=2) {
            System.out.println("You've got "+score+"/2, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5) {
               System.out.println("Oops, you need to review the session.");
            }
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }
   
   public static int MultiplicationG4 () {
      int op1, op2,score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 1 - Multiplication (You have 5 chances to try)\n");
      while (count<=5) {
         for (int i=1;i<=10;i++) {
            op1 = randomnum.nextInt(10)+10;
            op2 = randomnum2.nextInt(10);
            System.out.print(i+") "+op1+" * "+op2+" = ");
            String inputsum = ""+ kb.next();
            String op=(op1*op2)+"";

            
            if (inputsum.equals(op)) {
               score++;
               System.out.println("Good Job!"+"    "+score+"/10");
            }
            else  {
               System.out.println("Sorry, the correct answer is: "+(op1*op2)+"    "+score+"/10");
            }
         System.out.println();
         }
         if (score>=4) {
            System.out.println("You've got "+score+"/10, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5) {
               System.out.println("Oops, you need to review the session.");
            }
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }

   public static int DivisionG4 () {
      int op1, op2,score=0, count=0,levelscore=0;
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 2 - Division (You have 5 chances to try)\n");
      while (count<=5) {
         for (int i=1;i<=10;i++) {
            op1 = randomnum.nextInt(10)+10;
            op2 = randomnum2.nextInt(9)+1;
                           
            while(op1%op2!=0) {
               
               op1 = randomnum.nextInt(90)+1;
               op2 = randomnum2.nextInt(9)+1;
            }
            
            System.out.print(i+") "+op1+" / "+op2+" = ");
            String inputsum = ""+ kb.next();
            String op=(op1/op2)+"";
            if (inputsum.equals(op)) {
               score++;
               System.out.println("Good Job!"+"    "+score+"/10");
            }
            else  {
               System.out.println("Sorry, the correct answer is: "+(op1/op2)+"    "+score+"/10");
            }
         System.out.println();
         }
         if (score>=4) {
            System.out.println("You've got "+score+"/10, good job! Level up!");
            count = 6;
         }
         else {
            count++;
            if (count == 5) {
               System.out.println("Oops, you need to review the session.");
            }
            else {
               System.out.print("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }
   
   public static int OperatorG4 () {
      int op1, op2, minus1, minus2, count=0, score=0,t=1,levelscore=0;
      String multiplication="*", inputsign="", division="/";
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 3 - operators (You have 5 chances to try)\n");
         
      while (count<5) {
         t=1;
         for (int i=1;i<=3;i++) {
            op1 = randomnum.nextInt(10)+10;
            op2 = randomnum2.nextInt(10);
            
            if (op2==1){
               System.out.print(t+")"+op1+" _ "+op2+" = "+op1+" ");
               t++;
               inputsign=kb.next();
               if ((inputsign.equals("/"))||(inputsign.equals("*"))) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
                  System.out.println();
               }
               else {
                  System.out.println("Sorry, the correct answer is: / or x"+"    "+score+"/6");
                  System.out.println();
               }
            }
            else {
               System.out.print(t+")"+op1+" _ "+op2+" = "+(op1*op2)+" ");
               t++;
               inputsign=kb.next();
               if (inputsign.equals("*")) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
               
               }
               else {
                  System.out.println("Sorry, the correct answer is: *"+"    "+score+"/6");
               }
               System.out.println();
            }
            op1 = randomnum.nextInt(10)+10;
            op2 = randomnum2.nextInt(9)+1;
            
            while(op1%op2!=0) {
               op1 = randomnum.nextInt(10)+10;
               op2 = randomnum2.nextInt(9)+1;
            }
            if (op2!=1){
               System.out.print(t+")"+op1+" _ "+op2+" = "+(op1/op2)+" ");
               t++;
               inputsign=kb.next();
               if (inputsign.equals("/")) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
               }
               else {
                  System.out.println("Sorry, the correct answer is: /"+"    "+score+"/6");
               }
               System.out.println();    
            }
            else {
               System.out.print(t+")"+op1+" _ "+op2+" = "+op1+" ");
               t++;
               inputsign=kb.next();
               if ((inputsign.equals("/"))||(inputsign.equals("*"))) {
                  score++;
                  System.out.println("Awesome!"+"    "+score+"/6");
               
               }
               else {
                  System.out.println("Sorry, the correct answer is: / or x"+"    "+score+"/6");
               }
               System.out.println();
            }
        
         }

        
         if (score>=6) {
            System.out.println("You've got "+score+"/6"+", good job! Level up!");
            count=6 ;
         }
         else {
            System.out.println("Try again.");
            count++;
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
   }
   

  
  public static int ProblemG4 () {
      int op1, op2, score=0, count=0,levelscore=0;
      
      Random randomnum = new Random();
      Random randomnum2 = new Random();
      Scanner kb = new Scanner(System.in);
      System.out.println("Level 4 - Problem (You have 5 chances to try)\n");
      while (count<=5) {
         op1 = randomnum.nextInt(10)+10;
         op2 = randomnum2.nextInt(10);
         System.out.println("1) Brett drove "+ op1+" miles every hour.How many miles would he drive in "+op2+" hours ?");
         String inputsum = ""+ kb.next();
         String op=""+(op1*op2);

         if (inputsum.equals(op)) {
            score++;
            System.out.println("Awesome!"+"    "+score+"/2");
         }
         else {
            System.out.println("Sorry, the correct answer is: "+(op1*op2)+"    "+score+"/2");
         }
         op1 = randomnum.nextInt(10)+10;
         op2 = randomnum2.nextInt(9)+1;
               
         while(op1%op2!=0) {
            op1 = randomnum.nextInt(10)+10;
            op2 = randomnum2.nextInt(9)+1;
         }
         System.out.println();
         System.out.println("2) David has "+ op1+" cupcakes.He wants to give those cupcakes for "+op2+" friend. How many cupcakes can each person has ?");
         inputsum = ""+ kb.next();
         op=""+(op1/op2);

         if (inputsum.equals(op)) {
            score++;
            System.out.println("Awesome!"+"    "+score+"/2");
         }
         else {
            System.out.println("Sorry, the correct answer is: "+(op1/op2)+"    "+score+"/2");
         }
            
         if (score>=2) {
            System.out.println("You've got "+score+"/2"+", good job! Level up!");
            count = 6 ;
         }
         else {
            count++;
            if (count == 5) {
               System.out.println("Oops, you need to review the session.");
            }
            else {
               System.out.println("Don't give up, try again! You still have ");
               System.out.println((5-count)+" chances");
            }
            
            levelscore=Math.max(score,levelscore);
            System.out.println("You highest level score is: "+levelscore);
            System.out.print("\n");
            score = 0;
         }

      }
      
      levelscore=Math.max(score,levelscore);
      System.out.println("You highest level score is: "+levelscore);
      System.out.print("\n");
      return levelscore;
    }


}
         