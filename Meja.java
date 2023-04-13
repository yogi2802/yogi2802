public class Meja {
  public int kaki_meja() {
    return 70;
  }
  public int alas_meja() {
    return 120;
  }
  public static void main (String[] args){
    Meja nama =new Meja();
    int kaki = nama.kaki_meja();
    int alas_meja = nama.alas_meja();
    System.out.println(kaki*alas_meja);
  }
}
