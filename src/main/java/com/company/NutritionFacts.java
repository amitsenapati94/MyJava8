package main.java.com.company;

/**
 * Created by amitsenapati on 8/24/17.
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;




    private NutritionFacts(Builder builder)
    {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;

    }

    public static class Builder {
        // Required parameters         
        private final int servingSize;
        private final int servings;
        // Optional parameters - initialized to default values         
        private int calories = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val)
        {
            calories = val;
            return this;
        }

        public NutritionFacts build()
        {
            return new NutritionFacts(this);
        }

    }


}
