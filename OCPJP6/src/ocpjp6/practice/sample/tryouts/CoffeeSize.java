package ocpjp6.practice.sample.tryouts;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 4/8/14
 * Time: 1:00 PM
 * To change this template use File | Settings | File Templates.
 */
public enum CoffeeSize {

    BIG(10),
    SMALL(8),
    LARGE (6){

        public String getDefaultValue(){
            return "overloaded default value";
        }

        public String getValueOnlyForLarge(){
            return "onlyForLarge";
        }
    };
    private final int i;

    private CoffeeSize(int i){
      this.i = i;
    }

    public int getSize(){
        return this.i;
    }

    public String getDefaultValue(){
        return "default";
    }

}
 class UseEnum{
    public static void main(String[] args) {
        System.out.println(CoffeeSize.BIG);
        System.out.println(CoffeeSize.BIG.equals("BIG"));
        System.out.println(CoffeeSize.BIG.name().equals("BIG"));
        System.out.println(CoffeeSize.BIG.compareTo(CoffeeSize.BIG));
        System.out.println(CoffeeSize.BIG.name());
        System.out.println(CoffeeSize.BIG.getSize());
        System.out.println(CoffeeSize.SMALL.getSize());
        System.out.println(CoffeeSize.LARGE.getSize());
        System.out.println(CoffeeSize.BIG.getDefaultValue());
        System.out.println(CoffeeSize.SMALL.getDefaultValue());
        System.out.println(CoffeeSize.LARGE.getDefaultValue());
        System.out.println(CoffeeSize.LARGE.toString().compareTo("LARGE"));
        System.out.println(CoffeeSize.LARGE.name().compareTo("LARGE"));
    }
}
