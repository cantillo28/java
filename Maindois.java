 class Maindois {
  String idiomas;
  
  Maindois(String falado){
      idiomas = falado;
      System.out.println(idiomas + " É falado no mundo");
  }

  public static void main(String[] args){
    Maindois obj1 = new Maindois("Alemão");
    Maindois obj2 = new Maindois("Inglês");
    Maindois obj3 = new Maindois("Português");  
    System.out.println(obj1.idiomas);
}
  }

