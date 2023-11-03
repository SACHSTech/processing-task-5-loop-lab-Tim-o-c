import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Prints 8 different designs in 8 square regions
   *  @author: Timothy Chhor
   */

  public void settings() {
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {
   
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
    draw_section_outlines();
 
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    
    int intX = 0;
    int intY = 0;

    // nested for loop to draw all required  lines
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 10 * intColumn;
        intY = 300 + 10 * intRow;

        stroke(45, 150, 207);
        strokeWeight(5);
        line(intX, 300, intX, 600);
        line(0, intY, 300, intY);
      }
    }
  }

  /**
   * draws the bottom, 2nd from left section
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;
    
    // draws all vertical lines
    for (int intColumn = 0; intColumn < 60; intColumn++) {
        strokeWeight(5);
        intX = 300 + (5 * intColumn);
        if (intColumn % 4 == 0) {
          stroke(0, 0, 0);
        }
        else if (intColumn % 2 == 0) {
          stroke(255, 255, 255);
        }
        else if (intColumn % 2 == 1) {
          stroke(45, 150, 207);
        }
        line(intX, 300, intX, 600);
    }

    // draws the horizontal lines
    for (int intRow = 0; intRow < 30; intRow++) {
        stroke(45, 150, 207);
        intY = 300 + (10 * intRow);
        line(300, intY, 600, intY);
    }
  }

  /**
   * draws the bottom, 3rd from left section
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;
    
    for (int intRow = 0; intRow < 60; intRow++) {
        strokeWeight(5);
        intY = 300 + (5 * intRow);
        if (intRow % 4 == 0) {
          stroke(0, 0, 0);
        }
        else if (intRow % 2 == 0) {
          stroke(255, 255, 255);
        }
        else if (intRow % 2 == 1) {
          stroke(45, 150, 207);
        }
        line(600, intY, 900, intY);
    }
    for (int intColumn = 0; intColumn < 30; intColumn++) {
        stroke(45, 150, 207);
        intX = 600 + (10 * intColumn);
        line(intX, 300, intX, 600);
    }
    
  }

  /**
   * draws the bottom, 4th from left section
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;
    
    for (int intRow = 0; intRow < 60; intRow++) {
      for (int intColumn = 0; intColumn < 60; intColumn++) { 
        strokeWeight(5);
          intY = 300 + (5 * intRow);
          intX = 900 + (5 * intColumn);

          // horizontal lines
          if(intRow % 4 == 0) {
            stroke(0, 0, 0);
          }
          else if (intRow % 2 == 0) {
            noStroke();
          }
          else if (intRow % 2 == 1) {
            stroke(45, 150, 207);
          }
          line(900, intY, 1200, intY);

          // vertical lines
          if (intColumn % 4 == 0) {
            stroke(0, 0, 0);
          }
          else if (intColumn % 2 == 0) {
            noStroke();
          }
          else if (intColumn % 2 == 1) {
            stroke(45, 150, 207);
          }
          line(intX, 300, intX, 600);
      }
    }

    // making sure the correct lines are on top to match the design
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 905 + 10 * intColumn;
        intY = 305 + 10 * intRow;

        stroke(45, 150, 207);
        line(intX, 300, intX, 600);
        line(900, intY, 1200, intY);  
      }
    }
  }
  /**
   * draws the top left section
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 10 * intRow;
        intY = 10 * intColumn;

        stroke(45, 150, 207);
        strokeWeight(5);
        line(intX, 0, intX, 300);
        line(0, intY, 300, intY);
        line(intX, 0, 0, intY);
      }
    }
  }

  /**
   * draws the top, 2nd from left section
   */
  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 300 + 10 * intRow;
        intY = 10 * intColumn;

        stroke(45, 150, 207);
        strokeWeight(5);
        line(intX, 0, intX, 300);
        line(300, intY, 600, intY);
        line(intX, 0, 600, intY);
      }
    }
  }

  /**
   * draws the top 3rd from left section
   */
  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 600 + 10 * intRow;
        intY = 10 * intColumn;

        stroke(45, 150, 207);
        strokeWeight(5);
        line(intX, 0, intX, 300);
        line(600, intY, 900, intY);
        line(intX, 300, 900, intY);
      }
    }
  }
  
  /**
   * draws the top right section
   */
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 900 + 10 * intRow;
        intY = 10 * intColumn;

        stroke(45, 150, 207);
        strokeWeight(5);
        line(intX, 0, intX, 300);
        line(900, intY, 1200, intY);
        line(intX, 300, 900, intY);
      }
    }
  }
}