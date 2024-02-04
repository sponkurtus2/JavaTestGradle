package gradle.tutorial;

public class Conditionals {

  public void IfStatement() {
    boolean currentlyHappy = true;
    if (currentlyHappy) {
      System.out.println("Yei, you're happy :D");
    }
  }

  public void ElseIfStatement() {
    boolean currentlyHappy = true;
    if (currentlyHappy) {
      System.out.println("Yei, you're happy :D");
    } else if (!currentlyHappy) {
      System.out.println("Ey, why are you not happy:(?");
    }
  }

  public void Else() {
    boolean currentlyHappy = false;
    if (currentlyHappy) {
      System.out.println("Yei, you're happy :D");
    } else {
      System.out.println("Mmm, you should be happy...");
      currentlyHappy = true;
    }
  }

  public void SwitchStatement() {
    String currentMood = "Happy";

    switch (currentMood) {
      case "happy":
        System.out.println("Glad you're happy");
        break;
      case "Sad":
        System.out.println("Why :(?");
        break;
      case "Angry":
        System.out.println("What's goin on >:(");
        break;

      default:
        System.out.println("You may be a robot");
        break;
    }

  }

}
