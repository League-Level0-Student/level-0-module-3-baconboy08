
int bottles = 99;

for (int n = 99; n > -1; n--){
 
  if (n == 2){
  
     System.out.println(bottles + " bottles of beer on the wall, " + bottles
  + " bottles of beer! take 1 down, pass it around, " + (bottles - 1) + " bottle of beer on the wall!");  
    
  } else if (n == 1) {
    
    System.out.println(bottles + " bottle of beer on the wall, " + bottles
  + " bottle of beer! take 1 down, pass it around, no more bottles of beer on the wall!");  
    
  } else if (n == 0) {
    
    System.out.println("no more bottles of beer on the wall, no more bottles of beer! go to the store to spy some more, bottles of beer on the wall!");  
    
  } else {
  
  System.out.println(bottles + " bottles of beer on the wall, " + bottles
  + " bottles of beer! take 1 down, pass it around, " + (bottles - 1) + " bottles of beer on the wall!");  
  
  }
  
  bottles = bottles - 1;
  
}
