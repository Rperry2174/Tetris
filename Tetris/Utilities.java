import java.awt.*; 

class Utilities {
  static SetOfBlocks makeSquare() {
    SetOfBlocks a = new SetOfBlocks(); 
    a.add(new Block( 0,  0, Color.GREEN)); 
    a.add(new Block( 0,  1, Color.GREEN)); 
    a.add(new Block( 1,  0, Color.GREEN)); 
    a.add(new Block( 1,  1, Color.GREEN));
    return a;
  }
  
  static SetOfBlocks makeL(){
	  SetOfBlocks a = new SetOfBlocks();
	  a.add(new Block( 0,  0, Color.BLUE)); 
	    a.add(new Block( 0,  1, Color.BLUE)); 
	    a.add(new Block( 1,  0, Color.BLUE)); 
	    a.add(new Block( 0,  2, Color.BLUE));
	    return a;
  }
}