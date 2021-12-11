class Main {
    public static void main(String[] args) {
      GUI.introduction();
      String URL = GUI.downloadURL();
      System.out.println(URL);
      GUI.downloadOptions();
      GUI.resultCommand(URL);
    }
  }