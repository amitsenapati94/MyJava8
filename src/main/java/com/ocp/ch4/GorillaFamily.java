package com.ocp.ch4;

@FunctionalInterface
interface Gorilla {
    String move();
}
class GorillaFamily {

    public static void main(String[] args) {
        GorillaFamily gorillaFamily = new GorillaFamily();
        boolean flag = false;
        gorillaFamily.everyonePlay(flag);
    }
        private String walk = "walk";

        void everyonePlay(boolean baby) {
            String approach = "amble";
             //approach = "run";
            walk = "run";

             play(() -> walk);
             play(() -> baby ? "hitch a ride": "run");
             play(() -> approach);
         }
        void play(Gorilla g) {
           System.out.println(g.move());
        }
 }