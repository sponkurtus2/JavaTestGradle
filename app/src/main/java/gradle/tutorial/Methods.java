package gradle.tutorial;

public class Methods {
  // METHODS SYNTAX
  // <access_modifier> <return_type> <method_name>(list_of_parameters)

  // Java has 3 types of access_modifier,
  // public -> Accesible for all classes in the app
  // protected -> It's available in the class in which it's defined and subclasses
  // private -> Only available for the same class where it's defined

  // The return type can be void, String, int, etc...

  // Method name will be the name of the method

  public String sayMyName(String name) {
    return ("Hey" + name);
  }

  public void sayHi() {
    System.out.println("Hi");
  }
}
