package generics;

public class Pair<T,S> {
    private  T first;
    private S second;
    public Pair(){}

    public  Pair(T first,S second){
        this.first=first;
        this.second=second;
    }

    public void setFirst(T first){
        this.first=first;
    }
    public  T getFirst(){
        return first;
    }

    public void setSecond(S second){
        this.second=second;
    }
    public S getSecond(){
        return second;
    }

    public  static  void main (String []args ){
      Pair<String,Integer> pinner=new Pair<>("Pranjal",3);
      Pair<Pair<String,Integer>,String> p=new Pair<>();
      p.setFirst(pinner);
      p.setSecond("abcd");
      System.out.println(p.getFirst()+" "+p.getSecond());
      System.out.println(p.getFirst().getFirst());
      System.out.println(p.getFirst().getSecond());



 //       Pair<String,Integer> psi=new Pair<>("xyz",25);
//        System.out.println(psi.getFirst()+" "+psi.getSecond());
//        Pair<String> p=new Pair<>();
//        p.setFirst("xyz");
//        System.out.println(p.getFirst()+" "+p.getSecond());
    //    Pair p = new Pair(10,20);
    //    System.out.println(p.getFirst()+" "+p.getSecond());
    //    Pair ps = new Pair("pranjal","pawar ");

//        Pair<String> ps=new Pair<String>("aa","bb");
//        System.out.println(ps.getFirst()+" "+ps.getSecond());
//        ps.setFirst("10");
//        Pair<Integer>pi=new Pair<Integer>(10,20);
//        System.out.println(pi.getFirst()+" "+pi.getSecond());
//        Pair<Double>pd=new Pair<Double>(10.33,20.33);
//        System.out.println(pd.getFirst()+" "+pd.getSecond());


    }
}
