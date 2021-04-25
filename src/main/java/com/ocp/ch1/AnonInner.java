package com.ocp.ch1;

public class AnonInner {
    interface SaleTodayOnly {
        int dollarsOff();
    }

/*public int pay() {
    return admission(5, new SaleTodayOnly() {
        public int dollarsOff() { return 3; }
    });
}*/

    public int pay() {
        return admission(5, () -> 3);
    }

        public int admission(int basePrice, SaleTodayOnly sale) {
         System.out.println("result:"+(basePrice - sale.dollarsOff()));
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        AnonInner anonInner = new AnonInner();
        anonInner.pay();
    }

}
