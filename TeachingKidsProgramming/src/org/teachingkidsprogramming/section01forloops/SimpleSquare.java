package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    //  Show the tortoise --#1
    Tortoise.show();
    for (int i = 0; i < 4; i++)
    {
      //  Make the tortoise move as fast as possible --#6
      //  Do the following 4 times --#5.1
      //      Change the pen color of the line the tortoise draws to blue --#4
      Tortoise.setPenColor(PenColors.Blues.Blue);
      //      Move the tortoise 50 pixels --#2
      Tortoise.move(50);
      //      Turn the tortoise to the right (90 degrees) --#3
      Tortoise.turn(90);
      //  Repeat --#5.2
      //
      //  (Optional): Sign your work using the Virtual Proctor 
      //  See your work at http://virtualproctor.tkpjava.org
      // a tiny change
    }
  }
}
