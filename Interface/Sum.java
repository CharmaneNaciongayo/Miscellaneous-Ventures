public class Sum implements Operation {

    @Override
    public void operate(Integer[] a) {
      int sum = 0;
  
      for(int i = 0; i < a.length; i++) {
        sum += a[i];
      }
  
      System.out.println("The sum is " + sum + ".");
    }
  
    @Override
    public String getOperationName() {
      return " Sum";
    }
  
  }
  