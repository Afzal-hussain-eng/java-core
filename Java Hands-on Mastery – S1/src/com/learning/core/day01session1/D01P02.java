package com.learning.core.day01session1;

public class D01P02 {

	public static void main(String[] args) {
		 // Declare Medicine instances
        MedicineInfo tablet = new Tablet();
        MedicineInfo syrup = new Syrup();
        MedicineInfo ointment = new Ointment();

        // Check the polymorphic behavior of the displayLabel method
        tablet.displayLabel();
        syrup.displayLabel();
        ointment.displayLabel();
    }
}
