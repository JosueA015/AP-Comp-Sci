/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test pictureDisplay */
  public static void pictureDisplay()
  {
    Picture beach = new Picture("femaleLionAndHall.jpg");
    beach.explore();

  }
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("femaleLionAndHall.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
   /** Method to test zeroRed */
  public static void testZeroRed()
  {
    Picture beach = new Picture("femaleLionAndHall.jpg");
    beach.zeroRed();
    beach.explore();
  }
  
   /** Method to test zeroGreen */
  public static void testZeroGreen()
  {
    Picture beach = new Picture("femaleLionAndHall.jpg");
    beach.zeroGreen();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void keepOnlyBlue()
  {
    Picture beach = new Picture("femaleLionAndHall.jpg");
    beach.keepOnlyBlue();
    beach.explore();
  }
  
   /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("femaleLionAndHall.jpg");
    beach.negate();
    beach.explore();
  }
  
   /** Method to test grayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("femaleLionAndHall.jpg");
    beach.grayscale();
    beach.explore();
  }
  
   /** Method to test mirrorVertical */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture beach = new Picture("beach.jpg");
    beach.mirrorVerticalRightToLeft();
    beach.explore();
  }
  
  public static void testMirrorVertical()
  {
    Picture beach = new Picture("beach.jpg");
    beach.mirrorVertical();
    beach.explore();
  }

  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture beach = new Picture("beach.jpg");
    beach.mirrorHorizontal();
    beach.explore();
  }
  
  /** Method to test mirrorHorizontalBottomToTop */
  public static void testMirrorHorizontalBottomToTop()
  {
    Picture beach = new Picture("beach.jpg");
    beach.mirrorHorizontalBottomToTop();
    beach.explore();
  }
  
  /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("beach.jpg");
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  //Main method for testing. 
  public static void main(String[] args)
  { 
     pictureDisplay();
     testZeroRed();
     testZeroBlue();
     testZeroGreen();
     testNegate();
     testGrayscale();
     testMirrorVerticalRightToLeft();
     testMirrorVertical();
     testMirrorHorizontalBottomToTop();
     testMirrorHorizontal();
     testMirrorDiagonal();
  }
  
}