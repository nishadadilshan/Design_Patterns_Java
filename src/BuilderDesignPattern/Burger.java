package BuilderDesignPattern;

public class Burger {

    private String size;
    private boolean egg;
    private boolean cheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    private Burger(BurgerBuilder burgerBuilder){
        //initialize the all feilds and also can add validations.
    }

    public static class BurgerBuilder{
        private String size;
        private boolean egg;
        private boolean cheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder size(String size){
            this.size = size;
            return this;
        }
        public BurgerBuilder egg(boolean egg){
            this.egg = egg;
            return this;
        }
        public BurgerBuilder cheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }
        public BurgerBuilder mayonese(boolean mayonese){
            this.mayonese = mayonese;
            return this;
        }
        public BurgerBuilder onion(boolean onion){
            this.onion = onion;
            return this;
        }
        public BurgerBuilder lettuce(boolean lettuce){
            this.lettuce = lettuce;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }


    }

}
